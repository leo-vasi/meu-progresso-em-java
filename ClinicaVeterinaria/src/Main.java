import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Record record = new Record();
        Appointment appointment;

        while (true) {

            System.out.println("\nVeterinary Care System:");
            System.out.println("1. Register new animal");
            System.out.println("2. Show all animals");
            System.out.println("3. Exit");
            System.out.print("Choose an option: \n");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {

                System.out.println("Enter the animal's age:");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the animal's name:");
                String name = scanner.nextLine();

                System.out.println("Enter the animal's weight:");
                double weight = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Is your animal a cat, a dog, or another species? (1. Cat, 2. Dog, 3. Other)");
                int choice = scanner.nextInt();
                scanner.nextLine();

                Animal animal;
                if (choice == 1) {
                    System.out.println("Enter the cat's color:");
                    String color = scanner.nextLine();
                    animal = new Cat.BuilderCat()
                            .age(age)
                            .name(name)
                            .weight(weight)
                            .color(color)
                            .build();

                } else if (choice == 2) {
                    System.out.println("Enter the dog's breed:");
                    String breed = scanner.nextLine();

                    animal = new Dog.BuilderDog()
                            .age(age)
                            .name(name)
                            .weight(weight)
                            .breed(breed)
                            .build();

                } else if (choice == 3) {
                    System.out.println("Enter the species:");
                    String species = scanner.nextLine();
                    animal = new OtherAnimal.BuilderOtherAnimal()
                            .age(age)
                            .name(name)
                            .weight(weight)
                            .species(species)
                            .build();

                } else {
                    System.out.println("Invalid option!");
                    continue;
                }

                System.out.println("Enter the doctor's name:");
                String doctorName = scanner.nextLine();
                System.out.println("Enter the doctor's CRM:");
                int crm = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the doctor's specialty:");
                String specialty = scanner.nextLine();

                Doctor doctor = new Doctor.BuilderDoctor()
                        .name(doctorName)
                        .crm(crm)
                        .specialty(specialty)
                        .build();

                System.out.println("Enter the animal's diagnosis:");
                String diagnosis = scanner.nextLine();

                appointment = new Appointment.BuilderAppointment()
                        .animal(animal)
                        .doctor(doctor)
                        .diagnosis(diagnosis)
                        .build();
                
                record.addAppointment(appointment);

                System.out.println("Registration completed successfully!");

            } else if (option == 2) {
                record.showAppointments();

            } else if (option == 3) {
                System.out.println("Exiting the program...");
                break;

            } else {
                System.out.println("Invalid option, please choose another.");
            }
        }

        scanner.close();
    }
}