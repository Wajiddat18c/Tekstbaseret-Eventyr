/**
 * @author Wajid Ahmad
 */
import java.io.IOException;

public class Byen extends Lokation {
    private int penge = 20;
    private int tab = penge;

    /**
     * Denne printByen bliver brugt til at printe historien
     * Vi overrider denne metode fra Lokationsklassen via extend
     *
     * @throws IOException
     */
    public void printByen() throws IOException {
        koer = true;
        //Laver en whileløkke der kører indtil "koer" bliver sat til false.
        while (koer){

            System.out.println(stien);
            fil.historie(14);
            System.out.println("Tast Enter for at forsætte");
            input.readString();
            System.out.println("Tast 1 for Nord.\nTast 2 for Øst.\nJeg kan ikke tage tilbage til Vest");

            //Laver switch statement som læser vores Scanner fra inputhandler klassen.

            switch (input.readInt()){
                case 1:
                    System.out.println("Jeg bevæger mig mod Nord");
                    System.out.println("Jeg vælger at tage hen til Byen\n" +
                            "Her ser jeg en Kro og en Butik.");
                    fil.historie(58);
                    System.out.println("Tast 1 for at gå ind i Kroen\nTast 2 for at gå ind i Butikken");
                    valg = input.readInt();
                    if (valg == 1){

                            System.out.println("Vil du tilbringe natten i Kroen?");
                            System.out.println("Tast 1: Ja\nTast 2: Nej");
                            valg = input.readInt();
                            if (valg == 1) {
                                System.out.println(inventory.spendMoney(penge, 5));
                                penge += inventory.getTotal(); //Lægger penge sammen med Total.
                            } else if (valg == 2) {
                                System.out.println("Du har ikke valgt at tilbringe aften på kroen\n" +
                                        "og derfor blev du nød til at tilbringe natten ude på gaden\n" +
                                        "hvor du blev røvet: " + (tab = (int) (Math.random() * 20) + 1) + " Guldmønter");
                                System.out.println("Nu har du kun: " + (penge - tab) + " tilbage"); //Trækker tab fra penge(total)

                            }
                            }

                    else if (valg == 2){
                        System.out.println("Butikken er lukket om natten!");
                        break;
                    }
                    int beløb = penge - tab;
                    System.out.println("Nu er butikken åben igen!");
                    System.out.println("Tast 1 for at gå ind i butikken");
                    valg = input.readInt();
                    if (valg == 1) {
                        System.out.println("Her møder jeg: ");
                        npc.printMedarbejder();
                        System.out.println("Tryk Enter for at forsætte");
                        input.readString();
                        System.out.println("Velkommen til min Butik, Her kan du købe et Guldsværd, en Hat, et Jakkesæt og en Cykel");

                        while (shop) {
                            System.out.println("Du har: " + beløb + " Guldmønter i din pung");
                            System.out.println(
                                    "Tast 1: Køb et Guldsværd til 20 Guldmønter\n" +
                                            "Tast 2: Køb en Hat til 2 Guldmønter\n" +
                                            "Tast 3: Køb et Jakkesæt til 5 Guldmønter\n" +
                                            "Tast 4: Køb en Cykel til 14 Guldmønter\n" +
                                            "Tast 9: Gå ud af Butikken");
                            valg = input.readInt();
                            if (valg == 1) {
                                if (beløb >= 20) {
                                    System.out.println("Jeg har betalt 20 Guldmønter for Guldsværdet");
                                    inventory.item.add(butik.getGuldsværd());
                                    beløb = beløb - 20;

                                } else {
                                    System.out.println("Du har ikke penge nok.");
                                }
                                System.out.println("Nu har Jeg kun " + beløb + " Guldmønter tilbage");
                            } else if (valg == 2) {
                                if (beløb >= 2) {
                                    System.out.println("Du har betalt 2 Guldmønter for en Hat");
                                    inventory.item.add(butik.getHat());
                                    beløb = beløb - 2;
                                } else {
                                    System.out.println("Du har ikke penge nok.");
                                }
                                System.out.println("Nu har Jeg kun " + beløb + " Guldmønter tilbage");
                            } else if (valg == 3) {
                                if (beløb >= 5) {
                                    System.out.println("Du har betalt 5 Guldmønter for et Jakkesæt");
                                    inventory.item.add(butik.getJakkesæt());
                                    beløb = beløb - 5;
                                } else {
                                    System.out.println("Jeg har ikke penge nok!");
                                }
                                System.out.println("Nu har Jeg kun " + beløb + " Guldmønter tilbage");
                            } else if (valg == 4) {
                                if (beløb >= 14) {
                                    System.out.println("Du har betalt 14 Guldmønter for en cykel");
                                    inventory.item.add(butik.getCykkel());
                                    beløb = beløb - 14;
                                } else {
                                    System.out.println("Jeg har ikke penge nok!");
                                }
                                System.out.println("Nu har Jeg kun " + beløb + " Guldmønter tilbage");
                            }else if (valg == 9){
                                shop = false;
                                break;
                            }
                        }
                    }
                        inventory.showInv();
                        System.out.println("Jeg er nu klar til at tage til slottet!");
                        System.out.println("Tak fordi du spillede vores demo version af Fyrtøjet.");
                        koer = false;
                        break;



                case 2:
                    System.out.println("Jeg bevæger dig mod Øst");
                    System.out.println("Vagterne ved slottet smider mig ud\nVælg venligst en anden vej!");
                    break;

            }
        }
    }

}
