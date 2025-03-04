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
}
