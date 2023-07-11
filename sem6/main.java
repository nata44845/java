import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Барсик";
        cat.sex = Sex.F;
        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        cat.birthDate= calendar.getTime(); 
        cat.sterialized = false;
        cat.poroda = Poroda.SIBIRSKIY;

        cat.setTreatment((new GregorianCalendar(2023, 5 , 23)).getTime(), null, Treatment.CHUMKA);

        System.out.println(cat.toString());

        cat.setTreatment(null, (new GregorianCalendar(2023, 5 , 23)).getTime(), null);

        System.out.println(cat.toString());

        cat.Meow(6);
    }
}
