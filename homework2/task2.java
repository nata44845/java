import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {

    public static void bubbleSort(int[] array) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
		logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("task2.log", true);
		logger.addHandler(fh);
		SimpleFormatter sFormat = new SimpleFormatter ();
		fh.setFormatter(sFormat);
        logger.info("Начальное значение "+Arrays.toString(array));

        int len=array.length;
        int temp;
        boolean finish;
        do {
            finish = true;
            for(int i=0; i<len-1; i++){
                if (array[i]>array[i+1])
                {
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    finish = false;
                }
            }
            logger.info(Arrays.toString(array));
        }
        while (!finish);
    }

    public static void main(String[] args) throws IOException{
        int[] arr = new int[20];
        Random rnd = new Random();

        for (int i=0; i<20; i++) {
            arr[i] = rnd.nextInt(100);
        }

        bubbleSort(arr);
    }
}
