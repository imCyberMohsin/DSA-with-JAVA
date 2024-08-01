//! ArrayList 
// The ArrayList class is a dynamic array, which can be found in the java.util package.
// ArrayLists are non-continuous
// We can store objects in ArrayLists
/* 
    Operations with ArrayLists:
        - 1. add()
        - 2. get()
        - 3. modify()
        - 4. delete()
        - 5. Iterate
 */

import java.util.ArrayList;
import java.util.Collections;

public class B_ArrayList {
    public static void main(String[] args) {
        // ? 1. Declare an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // ? 2. Add Elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // ? 3. Get Elements
        int element = list.get(2);
        System.out.println(element);

        // ? 4. Add item in between
        list.add(1, 11);
        System.out.println(list);

        // ? 5. Replace element
        list.set(3, 33);
        System.out.println(list);

        //? 6. Remove element
        list.remove(3);
        System.out.println(list); 

        //? 7. Count size of list
        int size = list.size();
        System.out.println("Size = " + size);

        //? 8. Looping
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        //? 9. Sorting
        Collections.sort(list);
        System.out.println("\n"+ list);
    }
}
