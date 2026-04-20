package linkedlistprograms;

import java.util.*;

public class LinkedListPrograms {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Initial elements
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // 1. Iterate from 2nd position
        System.out.println("1. Elements from 2nd position:");
        ListIterator<String> it = list.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Reverse iteration
        System.out.println("\n2. Reverse order:");
        Iterator<String> rev = list.descendingIterator();
        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        // 3. Insert element at end
        list.offerLast("Pink");
        System.out.println("\n3. After inserting at end:");
        System.out.println(list);

        // 4. Display elements with positions
        System.out.println("\n4. Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }

        // 5. Swap first and third elements
        System.out.println("\n5. Before swapping:");
        System.out.println(list);

        Collections.swap(list, 0, 2);

        System.out.println("After swapping:");
        System.out.println(list);
    }
}
