// Student.java
// Defines a Student class with attributes and getters/setters

public class Student {
    private String prn;   // 11-digit PRN
    private String name;
    private String dob;   // Date of Birth (DD/MM/YYYY)
    private double marks;

    // Constructor
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Getters
    public String getPrn() { return prn; }
    public String getName() { return name; }
    public String getDob() { return dob; }
    public double getMarks() { return marks; }
}
