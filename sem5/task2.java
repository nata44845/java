import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. 
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. 
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)  n:c, o:o, t:d, e:e
// Пример 1:
// Input: s = "foo", t = "bar"   f: b, o:a,  -- false
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"  p:t, a:i, e:l, r:e
// Output: true

public class task2 {

    public static boolean checkIsomorf(String word1, String word2) {
        if (word1.length()!=word2.length()) return false;

        Map<Character, Character> db = new HashMap<>();
        for (int i=0; i<word1.length(); i++)  {
            if (db.containsKey(word1.charAt(i))) {
                if (word2.charAt(i)!=db.get(word1.charAt(i))) {
                    System.out.println(db);
                    return false;
                }
            } else {
                db.put(word1.charAt(i), word2.charAt(i)); 
            }
        }
        System.out.println(db);
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkIsomorf("add","egg"));
        System.out.println(checkIsomorf("note","code"));
        System.out.println(checkIsomorf("foo","bar"));
        System.out.println(checkIsomorf("paper","title"));
    }
    
}
