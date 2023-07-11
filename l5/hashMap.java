import java.util.HashMap;
import java.util.Map;

/**
 * hashMap
 */
public class hashMap {

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один"); System.out.println(db);
        db.putIfAbsent(2, "два"); System.out.println(db);
        db.put(3, "три"); System.out.println(db);
        db.put(31, "три один"); System.out.println(db);
        db.put(13, "один три"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);
        System.out.println(db.containsValue("один"));
        System.out.println(db.keySet());
        System.out.println(db.values());
    }
}