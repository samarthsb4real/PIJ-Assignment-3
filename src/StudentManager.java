// StudentManager.java
// Manages student operations like Add, Display, Search, Update, and Delete.

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students; // Dynamic storage for students
    private Scanner scanner;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Function to validate PRN (must be exactly 11 digits)
    private boolean isValidPrn(String prn) {
        return prn.matches("\\d{11}");
    }

    // Function to add a student
    public void addStudent() {
        String prn;
        while (true) {
            System.out.print("Enter 11-digit PRN: ");
            prn = scanner.next();
            if (isValidPrn(prn)) break;
            System.out.println("Invalid PRN! PRN must be exactly 11 numeric digits.");
        }

        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        String dob = scanner.next();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        students.add(new Student(prn, name, dob, marks));
        System.out.println("✅ Student added successfully!");
    }

    // Function to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    // Function to search student by PRN
    public void searchByPrn() {
        System.out.print("Enter 11-digit PRN to search: ");
        String prn = scanner.next();

        if (!isValidPrn(prn)) {
            System.out.println("Invalid PRN format! Must be 11 numeric digits.");
            return;
        }

        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                student.display();
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }

    // Function to search student by Name
    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.next();

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        System.out.println("❌ No student found with that name.");
    }

    // Function to update student details
    public void updateStudent() {
        System.out.print("Enter 11-digit PRN to update: ");
        String prn = scanner.next();

        if (!isValidPrn(prn)) {
            System.out.println("Invalid PRN format! Must be 11 numeric digits.");
            return;
        }

        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.print("Enter new Name: ");
                student.setName(scanner.next());
                System.out.print("Enter new DOB: ");
                student.setDob(scanner.next());
                System.out.print("Enter new Marks: ");
                student.setMarks(scanner.nextDouble());
                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }

    // Function to delete a student
    public void deleteStudent() {
        System.out.print("Enter 11-digit PRN to delete: ");
        String prn = scanner.next();

        if (!isValidPrn(prn)) {
            System.out.println("Invalid PRN format! Must be 11 numeric digits.");
            return;
        }

        if (students.removeIf(student -> student.getPrn().equals(prn))) {
            System.out.println("✅ Student deleted successfully!");
        } else {
            System.out.println("❌ Student not found.");
        }
    }
}