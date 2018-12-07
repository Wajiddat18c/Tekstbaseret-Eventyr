/**
 * @author Wajid Ahmad
 */
import java.io.IOException;
import java.nio.file.*;

public class Infomation {

    public Infomation(){}
    /**
     * Denne metode går ind i vores txt fil og læser 1 specefikt linje.
     *Så bruger vi println til at udskrive den linje.
     *
     * @throws IOException
     */


    public static void historie(int linje)throws IOException {
        String read = Files.readAllLines(Paths.get("Game.txt")).get(linje);
        System.out.println(read);
    }
}
