import java.io.IOException;
import java.nio.file.*;

public class Infomation {

    public Infomation(){}

    public static void historie(int linje)throws IOException {
        String read = Files.readAllLines(Paths.get("Game.txt")).get(linje);
        System.out.println(read);
    }
}
