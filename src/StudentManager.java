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
}
