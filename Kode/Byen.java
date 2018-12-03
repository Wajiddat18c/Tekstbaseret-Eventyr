import java.io.IOException;

public class Byen extends Lokation {
    private int penge = 20;
    private int tab = penge;
    public void printByen() throws IOException {
        while (koer = true){

            System.out.println(stien);
            fil.historie(14);
            System.out.println("Tast 1 for Nord.\nTast 2 for Øst.\nDu kan ikke tage tilbage til Vest");

            switch (input.readInt()){
                case 1:
                    System.out.println("Du bevæger dig mod Nord");
                    System.out.println("Du har valgt at tage hen til Byen");
                    fil.historie(54);
                    fil.historie(55);
                    System.out.println("Tast 1 for at gå ind i Kroen\nTast 2 for at gå ind i Butikken");
                    valg = input.readInt();
                    if (valg == 1){
                        for (int i = 57; i <= 59 ; i++) {
                            fil.historie(i);
                        }
                        System.out.println("Vil du tilbringe Natten i Kroen?");
                        System.out.println("Tast 1: Ja\nTast 2: Nej");
                        valg = input.readInt();
                        if (valg == 1) {
                            System.out.println(inventory.spendMoney(penge, 10));
                        } else if (valg == 2) {
                            System.out.println("Du har ikke valgt at tilbringe aften på kroen\n" +
                                    "og derfor belv du nød til at tilbringe aftenen ude på gaden\nhvor du blev frarøvet: " + (tab = (int)(Math.random()*20)+1) + " Guldmønter");
                            int beløb = penge - tab;
                            System.out.println("Nu har du kun: " + beløb + " tilbage");
                            break;
                        }
                        break;
                    }
                    else if (valg == 2){
                        fil.historie(60);
                        fil.historie(61);
                        System.out.println("Her møder du: ");
                        npc.printMedarbejder();
                        System.out.println("Tryk Enter for at forsætte");
                        input.readString();
                        System.out.println("Velkommen til min Butik, hvad kan jeg hælpe med.");
                        butik.printButik();
                        break;
                    }

                case 2:
                    System.out.println("Du bevæger dig mod Øst");
                    System.out.println("Vagterne ved slottet dræber dig\nVælg vendlist en anden vej!");
                    break;

            }
        }
    }

}
