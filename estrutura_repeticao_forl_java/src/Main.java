import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String project1 = "Computer";
        String project2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'f';
        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;
        System.out.printf("%s, which price is %.2f%n%s, which price is $ %.2f%n Record: %d years old, code %d and gender: %c%n Measue with eight decimal places: %.8f%n Rounded (three decimal places): %.3f%n US decimal point: %.2f", project1, price1, project2, price2, age, code, gender, measure, measure, measure);
        Locale.setDefault(Locale.US);

    }

}
