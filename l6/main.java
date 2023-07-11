import java.util.Arrays;
import java.util.HashSet;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.id = 100;
        w1.salary = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.id = 100;
        w4.salary = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_1";
        w2.lastName = "Фамилия_1";
        w2.id = 200;
        w2.salary = 1000;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w4);

        System.out.println(w1==w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1,w2));
        System.out.println(workers.contains(w4));
    }
}