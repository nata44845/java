import java.util.logging.Level; 
import java.util.logging.Logger;
import java.io.IOException;
import java.util.Random;
import java.util.logging.*; 

public class lg {
    public static void main(String[] args) throws IOException{

        Logger ll = Logger.getLogger(lg.class.getName());

        String logsPath = "log.txt";
        FileHandler fh = new FileHandler(logsPath, false);
        FileHandler fh1 = new FileHandler("logsPath.txt", true);
        ll.addHandler(fh);
        ll.addHandler(fh1);
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter formatter = new XMLFormatter();
        fh.setFormatter(formatter);
        fh1.setFormatter(formatter);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            ll.log(Level.INFO,"element: " + a);
        }
        ll.log(Level.WARNING, "logger off" );
        ll.info("test");
        ll.warning("logsPath");
    }
}

