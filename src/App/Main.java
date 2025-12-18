package App;

import Model.Student;
import Service.StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentSystem system = new StudentSystem();
        Scanner scanner = new Scanner(System.in);

        int option = -1;

        while (option != 0) {
            System.out.println("\n=== STUDENT SYSTEM ===");
            System.out.println("1 - Add student");
            System.out.println("2 - Remove student");
            System.out.println("3 - List students");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (option) {

                case 1:
                    System.out.print("Student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Student age: ");
                    int age = scanner.nextInt();

                    System.out.print("Student registration: ");
                    int registration = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer

                    Student student = new Student(name, age, registration);
                    system.addItem(student);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter registration to remove: ");
                    int reg = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer

                    boolean removed = system.removeByRegistration(reg);

                    if (removed) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    system.listItem();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}