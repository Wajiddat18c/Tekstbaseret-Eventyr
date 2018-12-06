/**
 * @author Ali Al-Sharefi
 * @author Thomas Alder Broe
 * @author Wajid Ahmad
 */
import java.io.IOException;

public class KoerSpil {

    /**
     * This is the main method which makes use of print method.
     *
     * @param args Unused.
     * @return Nothing.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {

        Lokation lokation = new Lokation();
        Byen byen = new Byen();
        Tree tree = new Tree();

        //lokation.printForhistoie();
        //tree.printTree();
        byen.printByen();

    }
}
