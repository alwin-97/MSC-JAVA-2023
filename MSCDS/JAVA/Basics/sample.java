import java.util.*;

public class sample {
    public static void main(String[] args) {
        HashMap<String,ArrayList<Integer>> ob = new HashMap<String,ArrayList<Integer>>();

        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(100);
        obj.add(200);

        ob.put("Key",obj);
        System.out.println(ob);

        ob.get("Key").remove(0);
        ob.get("Key").add(0, 1200);
        
        System.out.println(ob);
    }
}
