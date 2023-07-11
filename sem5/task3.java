import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class task3 {
    /**
     * @return
     */
    public static boolean checkSkobki(String word) {
        Map<Character, Character> dict = new HashMap<>(); 
        dict.put('}','{');
        dict.put(')','(');
        dict.put(']','[');
        dict.put('>','<');

        Stack<Character> stack = new Stack<>();
            for (int i=0; i< word.length(); i++) {

                if (dict.containsValue(word.charAt(i))) {
                    stack.push(word.charAt(i));
                } else if (dict.containsKey(word.charAt(i)))
                {
                    if (stack.isEmpty() || stack.pop()!= dict.get(word.charAt(i))) 
                    return false;
                }

            }
        return (stack.isEmpty());

    }
    public static void main(String[] args) {
        System.out.println(checkSkobki("a+(d*3)"));
        System.out.println(checkSkobki("[a+(1*3)"));
        System.out.println(checkSkobki("[6+(3*3)]"));
        System.out.println(checkSkobki("{a}[+]{(d*3)}"));
        System.out.println(checkSkobki("<{a}+{(d*3)}>"));
        System.out.println(checkSkobki("{a+]}{(d*3)}"));
    }
}
