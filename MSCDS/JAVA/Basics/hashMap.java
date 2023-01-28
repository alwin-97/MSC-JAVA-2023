import java.util.ArrayList;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> obj = new HashMap<String,String>();

        obj.put("Name", "Alwin");
        obj.put("Reg No", "1847207");
        obj.put("Email", "alwin.joseph@christuniversity.in");
        obj.put("Place", "value");

        System.out.println(obj);

        for(String i : obj.keySet()){
            System.out.println(i + "\t:\t" + obj.get(i));
        }

        // HashMap<String,ArrayList<String>> obj1 = new HashMap<String,ArrayList<String>>();

        // obj.put("Name", "Alwin Joseph");

        // ArrayList<String> tmp = new ArrayList<String>();
        // tmp.add("Apple");
        // tmp.add("Orange");
        // tmp.add("Mango");

        // obj1.put("Fruits", tmp);

        // System.out.println(obj);
        // System.out.println(obj1);
        // System.out.println(obj1.get("Fruits"));
        // System.out.println(obj1.get("Fruits").get(1));
        // obj1.remove("Fruits");
        // System.out.println(obj1);
        // obj1.clear();
        // System.out.println(obj1);
    }
}
