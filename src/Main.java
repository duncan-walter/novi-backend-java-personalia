
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

//        Roep hier de andere methodes aan

        printProfile();
        System.out.println("Afsluiten. Tot ziens!");
    }

    private static void printMenu() {
        System.out.println("======================================");
        System.out.println("Welkom bij de profiel app");
        System.out.println("Deze app zal het volgende uitvoeren:");
        System.out.println(" 1  - Vul naam in");
//        Vul hier het menu aan

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
        String input = scanner.nextLine().trim();
        name = input;
        System.out.println("Naam opgeslagen: " + name);
    }


//        Schrijf hier de andere methodes






}
