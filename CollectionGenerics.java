import java.util.ArrayList;
import java.util.List;

public class CollectionGenerics {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        
        System.out.println("Elements in the list:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}


/*
The provided Java code demonstrates the use of collections and generics, specifically using the ArrayList class to store a list of strings. Hereâ€™s a breakdown of the code:

Class Declaration

public class CollectionGenerics {
This line declares a public class named CollectionGenerics.
Main Method

public static void main(String[] args) {
This is the entry point of the program. The main method is where the execution starts.
Creating a List

List<String> stringList = new ArrayList<>();
This line declares a variable stringList of type List<String>, which means it will hold a list of strings.
ArrayList<> is a specific implementation of the List interface that uses a dynamic array to store elements.
The angle brackets (<>) indicate that the list is parameterized with the type String, making it a generic collection. This enforces type safety, ensuring that only strings can be added to stringList.
Adding Elements

stringList.add("Apple");
stringList.add("Banana");
stringList.add("Orange");
These lines add three string elements ("Apple", "Banana", and "Orange") to the stringList.
Printing Elements

System.out.println("Elements in the list:");
for (String fruit : stringList) {
    System.out.println(fruit);
}
First, it prints a message indicating that the program will display the elements in the list.
The for-each loop iterates over each element in stringList. For each iteration, it assigns the current string to the variable fruit and prints it.*/
