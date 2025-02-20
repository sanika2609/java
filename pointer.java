public class PointerExample {

    // Class representing a simple object
    static class Box {
        int value;

        public Box(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // Create a new object
        Box box1 = new Box(10);

        // box2 is a reference to the same Box object as box1
        Box box2 = box1;

        // Modify the value using box2
        box2.value = 20;

        // Both box1 and box2 refer to the same object
        System.out.println("box1 value: " + box1.value); // Output: 20
        System.out.println("box2 value: " + box2.value); // Output: 20
    }
}
