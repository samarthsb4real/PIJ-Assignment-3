# Student Management System

This is a simple Java-based Student Management System that allows you to add, display, search, update, and delete student records.

## Project Structure

## Classes

### `Student`

Defines a `Student` class with the following attributes:
- `prn`: 11-digit PRN
- `name`: Name of the student
- `dob`: Date of Birth (DD/MM/YYYY)
- `marks`: Marks obtained by the student

Methods:
- Getters and setters for all attributes
- `display()`: Displays student details

### `StudentManager`

Manages student operations like Add, Display, Search, Update, and Delete.

Methods:
- `addStudent()`: Adds a new student
- `displayStudents()`: Displays all students
- `searchByPrn()`: Searches for a student by PRN
- `searchByName()`: Searches for a student by name
- `updateStudent()`: Updates student details
- `deleteStudent()`: Deletes a student

### `Main`

Contains the main method to run the application. It provides a menu-driven interface to interact with the `StudentManager`.

## Usage

1. Clone the repository.
2. Compile the Java files:
    ```sh
    javac src/*.java
    ```
3. Run the application:
    ```sh
    java src/Main
    ```

## Menu Options

1. Add Student
2. Display All Students
3. Search Student by PRN
4. Search Student by Name
5. Update Student
6. Delete Student
7. Exit

## Author

- **Samarth Sandesh Bhadane**
- **PRN**: 24070126503
- **Batch**: A2
