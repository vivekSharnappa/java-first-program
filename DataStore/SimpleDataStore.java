package DataStore; 
import java.util.ArrayList;
import java.util.Scanner;

class storedata {
    String name;
    int age;

    storedata(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SimpleDataStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<storedata> people = new ArrayList<>();

        while (true) {
            System.out.println("\n---- Data Store Menu ----");
            System.out.println("1. Add Person");
            System.out.println("2. View All");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    people.add(new storedata(name, age));
                    System.out.println("✔ Person added!");
                    break;

                case 2:
                    System.out.println("\nStored People:");
                    for (storedata p : people) {
                        System.out.println("Name: " + p.name + ", Age: " + p.age);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}

