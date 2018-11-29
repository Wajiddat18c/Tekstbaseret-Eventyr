import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lokation {
    String name = "";


    Infomation fil = new Infomation();
    InputHandler input = new InputHandler();
    Inventory inventory = new Inventory();
    Currency currency = new Currency();
    Npc npc = new Npc();




    public void print() throws IOException {

        //Denne loop kører forhistorien igennem.
        for (int i = 0; i <8 ; i++) {
            fil.historie(i);
//            input.readString();
        }


        npc.printHeks();
        npc.printTjener();
        npc.printDroning();
        npc.printPrincesse();
        npc.printSkomager();
        npc.printKonge();
        npc.printHund1();
        npc.printHund2();
        npc.printHund3();
        npc.printMedarbejder();
        inventory.money();
        inventory.fyrtoej();
        inventory.guld();
        inventory.showInv();








    }
}










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




