public class PointerExample {

    // A simple class to demonstrate pointer-like behavior
    static class Person {
        String name;

        // Constructor to initialize the name
        Person(String name) {
            this.name = name;
        }

        // Method to print name
        void printName() {
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {

        // Create a new Person object
        Person person1 = new Person("John");

        // 'person2' is a reference (pointer) to the same object as 'person1'
        Person person2 = person1;

        // Print the names using both references
        person1.printName();  // Output: Name: John
        person2.printName();  // Output: Name: John

        // Modify the object through person2
        person2.name = "Jane";

        // Both person1 and person2 refer to the same object, so both see the change
        person1.printName();  // Output: Name: Jane
        person2.printName();  // Output: Name: Jane
    }
}
