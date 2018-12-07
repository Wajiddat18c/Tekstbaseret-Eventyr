/**
 * @author Wajid Ahmad
 */
import java.io.IOException;

public class Lokation{
    //Variabler
    String name = "";
    int valg = 0;
    boolean koer = true;
    boolean endGame = false;
    boolean shop = true;
    String stien = "Jeg står nu midt på en skillevej, hvor jeg har mulighed for at vælge følgene retninger:";

    //Intitalisereing af objekter
    Infomation fil = new Infomation();
    InputHandler input = new InputHandler();
    Inventory inventory = new Inventory();
    Npc npc = new Npc();
    Spiller spiller = new Spiller();
    Butik butik = new Butik();

    /**
     * Denne printForhistorie metode printer forhistorien ud via en for loop
     *
     * @throws IOException
     */

    public void printForhistoie() throws IOException {


        //Denne loop kører forhistorien igennem.
        for (int i = 0; i < 8; i++) {
            fil.historie(i);
            System.out.println("Tryk Enter for at fortætte");
            input.readString();
        }

        spiller.name();
        spiller.gender();
        System.out.println("------------------------------------");
        System.out.println("|                                  |");
        System.out.println("|         Tryk Enter for at        |");
        System.out.println("|          Spille Fyrtøjet         |");
        System.out.println("|                                  |");
        System.out.println("------------------------------------");
               input.readString();

        for (int i = 9; i < 14; i++) {
            fil.historie(i);
            System.out.println("Tryk Enter for at fortætte");
            input.readString();
        }
    }

    /**
     * PrintTree bliver overridet i Tree klassen
     * @throws IOException
     */
    public void printTree() throws IOException {
    }
    /**
     * PrintByen bliver overridet i Byen klassen
     * @throws IOException
     */
    public void printByen() throws IOException {
    }
}

