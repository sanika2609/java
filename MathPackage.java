public class MathPackage {

    // Nested static class for Arithmetic Operations
    public static class Arithmetic {
        public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        }
    }

    // Nested static class for Statistical Operations
    public static class Statistical {
        public static double mean(double[] numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Array cannot be empty");
            }
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }

        public static double median(double[] numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Array cannot be empty");
            }
            double[] sorted = numbers.clone();
            java.util.Arrays.sort(sorted);
            int middle = sorted.length / 2;
            if (sorted.length % 2 == 0) {
                return (sorted[middle - 1] + sorted[middle]) / 2.0;
            } else {
                return sorted[middle];
            }
        }

        public static double standardDeviation(double[] numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Array cannot be empty");
            }
            double mean = mean(numbers);
            double sum = 0;
            for (double num : numbers) {
                sum += Math.pow(num - mean, 2);
            }
            return Math.sqrt(sum / numbers.length);
        }
    }

    // Nested static class for Trigonometric Operations
    public static class Trigonometric {
        public static double sin(double angleInDegrees) {
            return Math.sin(Math.toRadians(angleInDegrees));
        }

        public static double cos(double angleInDegrees) {
            return Math.cos(Math.toRadians(angleInDegrees));
        }

        public static double tan(double angleInDegrees) {
            return Math.tan(Math.toRadians(angleInDegrees));
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Demonstrate Arithmetic Operations
        System.out.println("Arithmetic Operations:");
        System.out.println("Add: " + Arithmetic.add(10, 5));
        System.out.println("Subtract: " + Arithmetic.subtract(10, 5));
        System.out.println("Multiply: " + Arithmetic.multiply(10, 5));
        System.out.println("Divide: " + Arithmetic.divide(10, 5));

        // Demonstrate Statistical Operations
        double[] data = {1, 2, 3, 4, 5};
        System.out.println("\nStatistical Operations:");
        System.out.println("Mean: " + Statistical.mean(data));
        System.out.println("Median: " + Statistical.median(data));
        System.out.println("Standard Deviation: " + Statistical.standardDeviation(data));

        // Demonstrate Trigonometric Operations
        System.out.println("\nTrigonometric Operations:");
        System.out.println("Sin(30 degrees): " + Trigonometric.sin(30));
        System.out.println("Cos(30 degrees): " + Trigonometric.cos(30));
        System.out.println("Tan(30 degrees): " + Trigonometric.tan(30));
    }
}
