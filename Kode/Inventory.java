import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {


        InputHandler input = new InputHandler();
        //laver inventory med arraylist!


    int valg = 0;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    int total = 0;
    String oben = "";
    ArrayList<String> item= new ArrayList<String>();
    ArrayList<Integer> money= new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        //Denne metode holder styr på items.
        public void fyrtoej(){
        System.out.println("Her i rummet finder du et fyrtæj");
        System.out.println("Tast 1: for at samle fyrtøjet op");
        valg = scan.nextInt();

    if (valg == 1){
        item.add("Fyrtøjet");
        System.out.println("Du har nu samlet " + item + " op!");
    }
        else {
        System.out.println("Du valgte ikke at samle noget op.");
    }
    }
    public void guld() {
            this.money.add(20);
            System.out.println("Du har nu fået " + this.money + " Guldmønter!");
    }

        public int spendMoney(int amount, int fee){

            System.out.println("Du har ligenu " + amount + " Guldmønter");
            System.out.println("Det koster: " + fee + " Guldmønter");
            System.out.println("Vil bruge dine guldmønter her?\nTast 1 for Ja\nTast 2 for Nej");
            valg = scan.nextInt();
                if (valg == 1){
                    setTotal(amount-fee);
                    System.out.println("Du har valgt at bruge: " + fee + " Guldmønter");
                }
                else{
                    System.out.println("Du valgte ikke at bruge dine Guldmønter her");
                    setTotal(amount);
            }

            System.out.println("Antal Penge tilbage: ");
            return getTotal();
        }
            //Denne metode viser alle ting i din inventory.
        public void showInv(){
            System.out.println("tast 9 for at åbne din takse");
            valg = scan.nextInt();
            if (valg == 9) {

                System.out.println("Her er hvad der ligger i din Inventory");
                for (String str : item) {
                    System.out.println("Item: " + str);

                }
                for (int i : money) {
                    System.out.println("Penge: " + i);
                }
            }
        }

}

/*
//Denne metode holder styr på Penge.
        public void money(){
            System.out.println("Vil du åbne kisten? ");
            System.out.println("Tast ja eller nej.");
            oben = input.readString();
            if (oben.equals("ja")){
                int penge = (int)(Math.random()*20)+5;
                money.add(penge);
                System.out.println("Du fandt " + penge +"Kr!");
            }
            else {
                System.out.println("Du valgte at ikke åbne kisten!");
            }


            public void spendMoney(){
            this.money.add(20);
            System.out.println("Du har i din pung: " + this.money + " Guldmønter");
            System.out.println("Vil bruge dine penge på her?\nTast 1 for JA\nTast 2 for Nej");
            valg = scan.nextInt();
            if(valg == 1){
                this.money.remove(5);
                System.out.println("Du valgte at bruge 5 Guldmønter");
                System.out.println("Nu har du kun" + money + " tilbage");
            }
 */