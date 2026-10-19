import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList with initial capacity 5
        ArrayList<Integer> list = new ArrayList<>(5);

        // Through .add we add an element to the list
        list.add(67);
        list.add(20);
        list.add(30);

        // Print the entire ArrayList
        System.out.println(list);

        // Check if the list contains a particular value
        System.out.println(list.contains(20)); // Returns true or false

        // Set an element at a particular index
        list.set(0, 99); // Set element 99 at index 0

        // Remove an element at index 2
        list.remove(2);

        // Print the updated ArrayList
        System.out.println(list);

        // Get the number of elements present in the list
        System.out.println(list.size());

        // Check whether the list is empty or not
        System.out.println(list.isEmpty()); // Returns true or false

        // Find the index of a particular element
        System.out.println(list.indexOf(20)); // Returns -1 if not found

        // Insert an element at a particular index
        list.add(1, 50); // Insert 50 at index 1

        // Take 5 integers as input from the user
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        // Get an item at any index
        // list[index] syntax will not work with ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Print the final ArrayList
        System.out.println(list);

        // Remove an element by its value instead of its index
        list.remove(Integer.valueOf(20));

        // Print the list after removing the value 20
        System.out.println(list);

        // Iterate through the list using an enhanced for loop
        for (int element : list) {
            System.out.println(element);
        }

        // Remove all elements from the ArrayList
        // list.clear();

        // Check whether the list is empty after clearing
        // System.out.println(list.isEmpty());

        scanner.close();
    }
}
