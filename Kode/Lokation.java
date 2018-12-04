import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lokation{
    String name = "";
    int valg = 0;
    boolean koer = true;
    boolean done = false;
    boolean shop = true;
    String stien = "Du står nu midt i en skillevej, hvor du har mulighed for at vælge fælgene retinger:";

    Infomation fil = new Infomation();
    InputHandler input = new InputHandler();
    Inventory inventory = new Inventory();
    Npc npc = new Npc();
    Spiller spiller = new Spiller();
    Butik butik = new Butik();


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
        //PrintTree metoden har vi Nedarvet fra Tree klassen.
    public void printTree() throws IOException {
    }
    public void printByen() throws IOException {
    }
}


//        npc.printHeks();
//        npc.printTjener();
//        npc.printDroning();
//        npc.printPrincesse();
//        npc.printSkomager();
//        npc.printKonge();
//        npc.printHund1();
//        npc.printHund2();
//        npc.printHund3();
//        npc.printMedarbejder();
//        inventory.money();
//        inventory.fyrtoej();
//        inventory.guld();
//        inventory.showInv();
//
/*while (koer) {
            fil.historie(14);
            System.out.println("Tast 1 for Nord.\nTast 2 for Øst.\nTast 3 for Vest.");

            switch (input.readInt()) {
                case 1:
                    System.out.println("Du bevæger dig mod Nord");
                    break;
                case 2:
                    System.out.println("Du bevæger dig mod Øst");
                    break;
                case 3:
                    System.out.println("Du bevæger dig mod Vest");
                    System.out.println("Her møder du: ");
                    npc.printHeks();
                    System.out.println("Vil du føre dialog med Heksen? \nTast 1 for dialog \nTast 2 for at kravle ned i træet.");
                    valg = input.readInt();
                    if (valg == 1) {
                        for (int i = 15; i < 28; i++) {
                            fil.historie(i);
                            System.out.println("Tryk Enter for at fortætte");
                            input.readString();
                        }
                    } else if (valg == 2) {
                        System.out.println("Du valgte at kravle ned i træet");
                        System.out.println("Du finder ud af at du ikke kan komme vidre, ");
                        System.out.println("fordi du ikke valgte at snakke med heksen!");
                        break;
                    }
                    System.out.println("Du går nu ind i træet!");
                    fil.historie(29);
                    fil.historie(30);
                    System.out.println("Vil du tænde faklen fra din taske?");
                    System.out.println("Tast 1: Ja\nTast 2: nej");
                    valg = input.readInt();
                    if (valg == 1) {
                        fil.historie(32);
                    } else if (valg == 2) {
                        System.out.println("Du blev spist af hunden!");
                        break;
                    }
                    System.out.println("Her møder du: ");
                    npc.printHund1();
                    System.out.println("Vil du flyte tekop hunden og tage indeholdet af kisten?");
                    System.out.println("Tast 1: Ja\nTast 2: nej");
                    valg = input.readInt();
                    if (valg == 1) {
                        fil.historie(33);
                    } else if (valg == 2) {
                        System.out.println("Du Blev spidst af tekop Hunde!");
                        break;
                    }
                    System.out.println("Her møder du: ");
                    npc.printHund2();
                    fil.historie(35);
                    System.out.println("Vil du flyte Møllehuls hunden og tage indeholdet af kisten?");
                    System.out.println("Tast 1: Ja\nTast 2: nej");
                    valg = input.readInt();
                    if (valg == 1) {
                        System.out.println("Du blev spist af Møllehulshuden!");
                        System.out.println("Hint: Læs teksten igennem næste gang!");
                        break;
                    } else if (valg == 2) {
                        fil.historie(38);
                    }
                    System.out.println("Her møder du: ");
                    npc.printHund3();
                    System.out.println("Vil du flyte Rundetårn hunden og tage indeholdet af kisten?");
                    System.out.println("Tast 1: Ja\nTast 2: nej");
                    valg = input.readInt();
                    if (valg == 1) {
                        fil.historie(39);
                        inventory.guld();
                        inventory.fyrtoej();
                    } else if (valg == 2) {
                        System.out.println("Du Blev spidst af Rundetårn Hunde!");
                        break;

                    }
            }
            */