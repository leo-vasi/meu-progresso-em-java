import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Record record = new Record();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Veterinary Care System ---");
            System.out.println("1. Register new consultation");
            System.out.println("2. Show all consultations");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int option = readIntInput();

            switch (option) {
                case 1:
                    registerConsultation();
                    break;
                case 2:
                    record.showConsultations();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void registerConsultation() {
        System.out.println("\n--- Register New Consultation ---");

        System.out.println("\nPlease enter the owner's details:");
        Owner owner = createOwner();

        System.out.println("\nPlease enter the animal's details:");
        Animal animal = createAnimal();

        System.out.println("\nPlease enter the doctor's details:");
        Doctor doctor = createDoctor();

        String diagnosis = readStringInput("\nEnter the animal's diagnosis:");
        LocalDate date = readDateInput("Enter the consultation date (YYYY-MM-DD):");
        LocalDate returnDate = readOptionalDateInput("Will there be a return appointment? (yes/no):", "Enter the return date (YYYY-MM-DD):");
        double consultationPrice = readDoubleInput("Enter the consultation price:");
        Prescription prescription = createPrescription();
        Priority priority = readPriorityInput();

        Consultation consultation = new Consultation.ConsultationBuilder()
                .animal(animal)
                .owner(owner)
                .doctor(doctor)
                .diagnosis(diagnosis)
                .date(date)
                .returnDate(returnDate)
                .consultationPrice(consultationPrice)
                .prescription(prescription)
                .priority(priority)
                .build();

        record.addConsultation(consultation);
        System.out.println("\nRegistration completed successfully!");
    }

    private static Owner createOwner() {
        String ownerName = readStringInput("Owner's name:");
        String ownerPhone = readStringInput("Owner's phone number:");
        return new Owner(ownerName, ownerPhone);
    }

    private static Animal createAnimal() {
        int age = readIntInput("Animal's age:");
        String name = readStringInput("Animal's name:");
        double weight = readDoubleInput("Animal's weight:");

        System.out.println("Is your animal a cat, a dog, or another species? (1. Cat, 2. Dog, 3. Other)");
        int choice = readIntInput();

        if (choice == 1) {
            String color = readStringInput("Enter the cat's color:");
            return new Cat.CatBuilder()
                    .age(age)
                    .name(name)
                    .weight(weight)
                    .color(color)
                    .build();
        } else if (choice == 2) {
            String breed = readStringInput("Enter the dog's breed:");
            return new Dog.DogBuilder()
                    .age(age)
                    .name(name)
                    .weight(weight)
                    .breed(breed)
                    .build();
        } else {
            String species = readStringInput("Enter the species:");
            return new Animal.AnimalBuilder<>()
                    .age(age)
                    .name(name)
                    .weight(weight)
                    .addAttribute("Species", species)
                    .build();
        }
    }

    private static Doctor createDoctor() {
        String doctorName = readStringInput("Doctor's name:");
        int crm = readIntInput("Doctor's CRM:");
        String specialty = readStringInput("Doctor's specialty:");
        return new Doctor.DoctorBuilder()
                .name(doctorName)
                .crm(crm)
                .specialty(specialty)
                .build();
    }

    private static Prescription createPrescription() {
        System.out.println("Will a medication be prescribed? (yes/no):");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            String medicationName = readStringInput("Enter the medication name:");
            String dosage = readStringInput("Enter the medication dosage:");
            double medicationPrice = readDoubleInput("Enter the medication price:");
            String instructions = readStringInput("Enter the medication instructions:");
            Medication medication = new Medication(medicationName, dosage);
            return new Prescription(medication, instructions, medicationPrice);
        }
        return null;
    }

    private static Priority readPriorityInput() {
        while (true) {
            System.out.println("Enter the priority level (LOW, MEDIUM, HIGH):");
            String input = scanner.nextLine().toUpperCase();
            try {
                return Priority.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid priority level. Please enter LOW, MEDIUM, or HIGH.");
            }
        }
    }

    private static int readIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static int readIntInput(String prompt) {
        System.out.println(prompt);
        return readIntInput();
    }

    private static double readDoubleInput(String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static String readStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private static LocalDate readDateInput(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return LocalDate.parse(scanner.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }
    }

    private static LocalDate readOptionalDateInput(String prompt, String datePrompt) {
        System.out.println(prompt);
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            return readDateInput(datePrompt);
        }
        return null;
    }
}