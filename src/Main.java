
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static int age;
    static String email;
    static String address;
    static String phone;
    // Tegen de omschrijving in heb ik voor de height en weight variabelen voor het datatype float gekozen.
    // Het double datatypen heeft namelijk een hogere precisie die niet nodig is, geheugen technisch is dat efficiënter.
    static float height;
    static float weight;

    public static void main(String[] args) {
        printMenu();

        setName();
        setAge();
        setEmail();
        setAddress();
        setPhone();
        setHeight();
        setWeight();

        printProfile();
        System.out.println("Afsluiten. Tot ziens!");
    }

    private static void printMenu() {
        System.out.println("======================================");
        System.out.println("Welkom bij de profiel app");
        System.out.println("Deze app zal het volgende uitvoeren:");
        System.out.println(" 1  - Vul naam in");
        System.out.println(" 2  - Vul leeftijd in");
        System.out.println(" 3  - Vul e-mail in");
        System.out.println(" 4  - Vul adres in");
        System.out.println(" 5  - Vul telefoonnummer in");
        System.out.println(" 6  - Vul lengte in (cm)");
        System.out.println(" 7  - Vul gewicht in (kg)");
    }

    private static void printProfile() {
        System.out.println();
        System.out.println("----- PROFIEL -----");
        System.out.println("Naam: " + name);
//        Print hier de andere variabelen

//        Roep de calculateBMI() methode aan.
        System.out.println("-------------------");
    }

    private static void setName() {
        System.out.print("Voer je volledige naam in: ");
        name = scanner.nextLine().trim();
        System.out.println("Naam opgeslagen: " + name);
    }

    private static void setAge() {
        System.out.print("Voer je leeftijd in: ");
        age = scanner.nextInt();
        System.out.println("Leeftijd opgeslagen: " + age);
    }

    private static void setEmail() {
        System.out.print("Voer je e-mail in: ");
        email = scanner.nextLine();
        System.out.println("E-mail opgeslagen: " + email);
    }

    private static void setPhone() {
        System.out.print("Voer je telefoonnummer in: ");
        phone = scanner.nextLine();
        System.out.println("Telefoonnummer opgeslagen: " + phone);
    }

    private static void setAddress() {
        System.out.print("Voer je adres in: ");
        address = scanner.nextLine();
        System.out.println("Adres opgeslagen: " + address);
    }

    private static void setHeight() {
        System.out.print("Voer je lengte in: ");
        height = scanner.nextFloat();
        System.out.println("Lengte opgeslagen: " + height + "cm");
    }

    private static void setWeight() {
        System.out.print("Voer je gewicht in: ");
        weight = scanner.nextFloat();
        System.out.println("Gewicht opgeslagen: " + weight + "kg");
    }
}
