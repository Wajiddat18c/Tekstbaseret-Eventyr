import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lokation {
    String name = "";
    int valg = 0;
    boolean koer = true;

    Infomation fil = new Infomation();
    InputHandler input = new InputHandler();
    Inventory inventory = new Inventory();
    Currency currency = new Currency();
    Npc npc = new Npc();
    Spiller spiller = new Spiller();


    public void print() throws IOException {

        //Denne loop kører forhistorien igennem.
        for (int i = 0; i <8 ; i++) {
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

        for (int i = 9; i <14 ; i++) {
            fil.historie(i);
            System.out.println("Tryk Enter for at fortætte");
            input.readString();
        }
        while (koer) {
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
                    } else if (valg == 2) {
                        System.out.println("Du Blev spidst af Rundetårn Hunde!");
                        break;

                    }
                    inventory.fyrtoej();

                    System.out.println("vil du genstarte? \nTast 1: Ja\nTast 2: Nej");
                    int genstart = input.readInt();
                    if (genstart == 1) {
                        System.out.println("Ok");
                    } else if (genstart == 2) {
                        koer = false;
                        System.out.println("Du har tabt");

                    }


            }
        }
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















//        fil.historie(0);
//        name = input.readString();
//        System.out.println("Dit navn er: " + name);
//        inventory.items();
//        System.out.println("Tast 1 for at begynde spillet.");
//
//            switch (input.readInt()) {
//                case 1:
//                    fil.historie(1);
//                    fil.historie(2);
//                    break;
//            }
//            switch (input.readInt()) {
//                case 1:
//                    fil.historie(3);
//                    inventory.money();
//                    inventory.showInv();
//                    break;
//                case 2:
//                    fil.historie(4);
//                    fil.historie(5);
//
//                    switch (input.readString()) {
//                        case "ja":
//                            fil.historie(6);
//                            fil.historie(7);
//                            printNpc();
//                            break;
//                    }
//
//            }
//
//        }




