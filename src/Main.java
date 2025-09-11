import java.time.LocalDate;
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
    static LocalDate dateOfBirth;

    public static void main(String[] args) {
        printMenu();

        setName();
        setAge();
        setEmail();
        setAddress();
        setPhone();
        setHeight();
        setWeight();
        setDateOfBirth();

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
        System.out.println(" 8  - Vul geboortedatum in (jjjj-mm-dd)");
        System.out.println(" 9  - Toon profiel");
    }

    private static void printProfile() {
        System.out.println();
        System.out.println("----- PROFIEL -----");
        System.out.println("Naam: " + name);
        System.out.println("Leeftijd: " + age);
        System.out.println("E-mail: " + email);
        System.out.println("Adres: " + address);
        System.out.println("Telefoonnummer: " + phone);
        System.out.println("Lengte: " + height + "cm");
        System.out.println("Gewicht: " + weight + "kg");
        calculateAndDisplayBMI(height, weight);
        System.out.println("Geboortedatum: " + dateOfBirth);
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
        // Ik had problemen bij het inlezen van een int waarbij ik daarna weer een string wou inlezen.
        // Wat blijkt? Stel dat ik 42 input en op enter druk, dan leest de nextInt() 4 en 2 uit de stream.
        // De enter heeft ook een \n in de stream neergezet, maar deze neemt nextInt() niet mee.
        // De volgende keer dat nextLine() in deze situatie wordt aangeroepen wordt de \n gelijk uitgelezen en als waarde teruggegeven.
        // Deze situatie doet zich niet voor bij het uitlezen van een nextLine() na een nextLine() omdat nextLine() de \n (enter) wel oppakt.
        // De oplossing is om de \n die is achtergebleven direct te consumeren met een nextLine() nadat er een nextInt()/nextFloat() plaatsvindt.
        scanner.nextLine();
        System.out.println("Leeftijd opgeslagen: " + age);
    }

    private static void setEmail() {
        System.out.print("Voer je e-mail in: ");
        email = scanner.nextLine().trim();
        System.out.println("E-mail opgeslagen: " + email);
    }

    private static void setAddress() {
        System.out.print("Voer je adres in: ");
        address = scanner.nextLine().trim();
        System.out.println("Adres opgeslagen: " + address);
    }

    private static void setPhone() {
        System.out.print("Voer je telefoonnummer in: ");
        phone = scanner.nextLine().trim();
        System.out.println("Telefoonnummer opgeslagen: " + phone);
    }

    private static void setHeight() {
        System.out.print("Voer je lengte in: ");
        height = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Lengte opgeslagen: " + height + "cm");
    }

    private static void setWeight() {
        System.out.print("Voer je gewicht in: ");
        weight = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Gewicht opgeslagen: " + weight + "kg");
    }

    private static void setDateOfBirth() {
        System.out.print("Voer je geboortedatum in: ");
        dateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.println("Geboortedatum opgeslagen: " + dateOfBirth);
    }

    private static void calculateAndDisplayBMI(float height, float weight) {
        height /= 100; // Is in centimeters opgegeven dus we maken er hier meters van.
        float bmi = weight / (height * height);
        System.out.println("Je BMI is " + bmi + "%");
    }
}
