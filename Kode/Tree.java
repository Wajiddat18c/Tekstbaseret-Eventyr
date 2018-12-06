/**
 * @author Wajid Ahmad
 */
import java.io.IOException;

public class Tree extends Lokation{

    //Override.
    /**
     *Vi har lavet en metode, i Tree, som overrider metoden printTree() fra Lokation
     */
    public void printTree() throws IOException {
        //Vi har lavet en while, der tager højde: så længe "koer" er true.
        while (koer) {
            System.out.println(stien);
            fil.historie(14);
            System.out.println("Tast 1 for Nord.\nTast 2 for Øst.\nTast 3 for Vest.");
            /*Vi har lavet en switch statement, så længe input kan læsen en int fra spilleren, så sker en af mange scenarier.
            Hvis koer = false, så stopper spillet.
            Den skal sikre dig, at du kan bevæge dig mod Nord/Syd/Øst/Vest, og
             du skal have mulighed for at genstarte spillet, hvis du ikke følger historien.*/


            switch (input.readInt()) {
                case 1:
                    System.out.println("Du bevæger dig mod Nord");
                    System.out.println("Du kan ikke tage til byen uden Penge!\nVælg vendlist en anden vej!");
                    break;
                case 2:
                    System.out.println("Du bevæger dig mod Øst");
                    System.out.println("Vagterne ved slottet dræber dig\nVælg vendlist en anden vej!");
                    break;
                case 3:
                    System.out.println("Du bevæger dig mod Vest");
                    System.out.println("Her møder du: ");
                    npc.printHeks();
                    System.out.println("Vil du føre dialog med Heksen? \nTast 1 for dialog \nTast 2 for at kravle ned i træet.");
                    valg = input.readInt();
                    if (valg == 1) {
                        for (int i = 15; i < 32; i++) {
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
                    fil.historie(33);
                    fil.historie(34);
                    System.out.println("Vil du tænde faklen fra din taske?");
                    System.out.println("Tast 1: Ja\nTast 2: nej");
                    valg = input.readInt();
                    if (valg == 1) {
                        fil.historie(36);
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
                        fil.historie(37);
                    } else if (valg == 2) {
                        System.out.println("Du Blev spidst af tekop Hunde!");
                        break;
                    }
                    fil.historie(39);
                    System.out.println("Her møder du: ");
                    npc.printHund2();
                    System.out.println("Vil du flyte Møllehuls hunden og tage indeholdet af kisten?");
                    System.out.println("Tast 1: Ja\nTast 2: nej");
                    valg = input.readInt();
                    if (valg == 1) {
                        System.out.println("Du blev spist af Møllehulshuden!");
                        System.out.println("Hint: Læs teksten igennem næste gang!");
                        break;
                    } else if (valg == 2) {
                        fil.historie(40);
                    }
                    fil.historie(42);
                    System.out.println("Her møder du: ");
                    npc.printHund3();
                    System.out.println("Vil du flyte Rundetårn hunden og tage indeholdet af kisten?");
                    System.out.println("Tast 1: Ja\nTast 2: nej");
                    valg = input.readInt();
                    if (valg == 1) {
                        fil.historie(44);
                        fil.historie(45);
                        inventory.guld();
                        inventory.fyrtoej();
                        for (int i = 68; i <72 ; i++) {
                            fil.historie(i);
                            System.out.println("Tast enter for at forsætte");
                            input.readString();
                        }
                        done = true;
                    } else if (valg == 2) {
                        System.out.println("Du Blev spidst af Rundetårn Hunde!");
                        break;

                    }
            }
            if (done == true){
                break;
            }
            else {
            System.out.println("vil du genstarte? \nTast 1: Ja\nTast 2: Nej");
            int genstart = input.readInt();
            if (genstart == 1) {
                System.out.println("Ok");
            } else if (genstart == 2) {
                koer = false;
                System.out.println("Du har tabt");
                //System.exit(0); lukker programmet når du taster 2.
                System.exit(0);
            }

            }
        }
    }
}
