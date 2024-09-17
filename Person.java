import java.time.LocalDate;
import java.time.Period;

// Base class Person
class Person {
    protected String name;
    protected LocalDate birthDate;
    protected double height;  // in meters
    protected double weight;  // in kilograms
    protected String address;

    // Constructor
    public Person(String name, LocalDate birthDate, double height, double weight, String address) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    // Method to calculate age
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kilograms");
        System.out.println("Address: " + address);
        System.out.println("Age: " + calculateAge() + " years");
    }
}

// Derived class Student
class Student extends Person {
    private String rollNo;
    private double marks[];

    // Constructor
    public Student(String name, LocalDate birthDate, double height, double weight, String address, String rollNo, double[] marks) {
        super(name, birthDate, height, weight, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate average marks
    public double calculateAvg() {
        if (marks.length == 0) return 0;
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to display student details
    public void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average Marks: " + calculateAvg());
    }
}

// Derived class Employee
class Employee extends Person {
    private String empId;
    private double salary;

    // Constructor
    public Employee(String name, LocalDate birthDate, double height, double weight, String address, String empId, double salary) {
        super(name, birthDate, height, weight, address);
        this.empId = empId;
        this.salary = salary;
    }

    // Method to calculate tax
    public double calculateTax() {
        // Example tax calculation: 10% of salary
        return salary * 0.10;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
        System.out.println("Tax: $" + calculateTax());
    }
}

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(
            "Alice Johnson",
            LocalDate.of(2002, 5, 14),
            1.65,
            55,
            "123 Maple St, Springfield",
            "S123456",
            new double[] {85.5, 90.0, 78.0, 88.0}
        );

        // Create an Employee object
        Employee employee = new Employee(
            "Bob Smith",
            LocalDate.of(1985, 11, 20),
            1.80,
            80,
            "456 Oak St, Springfield",
            "E789012",
            75000
        );

        // Display details
        System.out.println("Student Information:");
        student.displayStudentInfo();
        System.out.println("\nEmployee Information:");
        employee.displayEmployeeInfo();
    }
}
