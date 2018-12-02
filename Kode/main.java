import java.io.IOException;

public class main {

    /**
     * This is the main method which makes use of print method.
     *
     * @param args Unused.
     * @return Nothing.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {

        Lokation menu = new Lokation();
        Tree tree = new Tree();
        menu.printForhistoie();
        tree.printTree();
    }
}
