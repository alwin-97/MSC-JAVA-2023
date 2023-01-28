import java.util.*;

public class ads {
    public static void main(String[] args) {
        // Array List
        ArrayList<String> alArr = new ArrayList<String>();

        // adding an item
        alArr.add("First Element");
        alArr.add("One");
        alArr.add("Five");
        alArr.add("Last");

        System.out.print(alArr);

        // getting value based on index
        System.out.println(alArr.get(1));

        // setting new value for an index
        alArr.set(0,"First");
        
        // removing an item from a pos
        alArr.remove(0);

        // size of an array list
        System.out.println(alArr.size());

        for(String i : alArr){
            System.out.println(i);
        }

        // sorting an arrayList
        Collections.sort(alArr);

        for(String i : alArr){
            System.out.println(i);
        }

        // clear items in an arraylist
        alArr.clear();

        
    }
}
