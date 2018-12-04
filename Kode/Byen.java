import java.io.IOException;

public class Byen extends Lokation {
    private int penge = 20;
    private int tab = penge;

    public void printByen() throws IOException {
        koer = true;
        while (koer){

            System.out.println(stien);
            fil.historie(14);
            System.out.println("Tast Enter for at forsætte");
            input.readString();
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
                            penge += inventory.getTotal();
                        } else if (valg == 2) {
                            System.out.println("Du har ikke valgt at tilbringe aften på kroen\n" +
                                    "og derfor belv du nød til at tilbringe aftenen ude på gaden\nhvor du blev frarøvet: " + (tab = (int) (Math.random() * 20) + 1) + " Guldmønter");
                            System.out.println("Nu har du kun: " + (penge - tab) + " tilbage");
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
                        System.out.println("Her møder du: ");
                        npc.printMedarbejder();
                        System.out.println("Tryk Enter for at forsætte");
                        input.readString();
                        System.out.println("Velkommen til min Butik, Her kan du købe en Guldsværd, en Hat, en Jakkesæt og en Cykel");

                        while (shop) {
                            System.out.println("Du har: " + beløb + " Guldmønter i din pung");
                            System.out.println(
                                    "Tast 1: Køb en Guldsværd til 20 Guldmønter\n" +
                                            "Tast 2: Køb en Hat til 2 Guldmønter\n" +
                                            "Tast 3: Køb et Jakkesæt til 5 Guldmønter\n" +
                                            "Tast 4: Køb en Cykel til 14 Guldmønter\n" +
                                            "Tast 9: Gå ud af Butikken");
                            valg = input.readInt();
                            if (valg == 1) {
                                if (beløb >= 20) {
                                    System.out.println("Du har betalt 20 Guldmønter for Guldsværdet");
                                    inventory.item.add(butik.getGuldsværd());
                                    beløb = beløb - 20;

                                } else {
                                    System.out.println("Du har ikke penge nok.");
                                }
                                System.out.println("Nu har du kun " + beløb + " Guldmønter tilbage");
                            } else if (valg == 2) {
                                if (beløb >= 2) {
                                    System.out.println("Du har betalt 2 Guldmønter for en Hat");
                                    inventory.item.add(butik.getHat());
                                    beløb = beløb - 2;
                                } else {
                                    System.out.println("Du har ikke penge nok.");
                                }
                                System.out.println("Nu har du kun " + beløb + " Guldmønter tilbage");
                            } else if (valg == 3) {
                                if (beløb >= 5) {
                                    System.out.println("Du har betalt 5 Guldmønter for et Jakkesæt");
                                    inventory.item.add(butik.getJakkesæt());
                                    beløb = beløb - 5;
                                } else {
                                    System.out.println("Du har ikke penge nok!");
                                }
                                System.out.println("Nu har du kun " + beløb + " Guldmønter tilbage");
                            } else if (valg == 4) {
                                if (beløb >= 14) {
                                    System.out.println("Du har betalt 14 Guldmønter for en cykel");
                                    inventory.item.add(butik.getCykkel());
                                    beløb = beløb - 14;
                                } else {
                                    System.out.println("Du har ikke penge nok!");
                                }
                                System.out.println("Nu har du kun " + beløb + " Guldmønter tilbage");
                            }else if (valg == 9){
                                shop = false;
                                break;
                            }
                        }
                    }
                        inventory.showInv();
                        System.out.println("Du er nu klar til at tage til slottet!");
                        koer = false;
                        break;



                case 2:
                    System.out.println("Du bevæger dig mod Øst");
                    System.out.println("Vagterne ved slottet dræber dig\nVælg vendlist en anden vej!");
                    break;

            }
        }
    }

}
