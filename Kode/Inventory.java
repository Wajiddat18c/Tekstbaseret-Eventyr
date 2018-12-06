/**
 * @author Wajid Ahamd
 */
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

    /**
     * Denne metode giver mulighed for at tilføje items til vores
     * arraylist
     */
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
    /**
     * Denne metode giver mulighed for at tilføje penge til vores
     * arraylist
     */
    public void guld() {
            this.money.add(20);
            System.out.println("Du har nu fået " + this.money + " Guldmønter!");
    }

    /**
     * Denne metode tager i 2 parameter og returner Int.
     * metoden bliver brugt til at betale penge i vores program.
     * @param amount
     * @param fee
     * @return
     */
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

    /**
     * Denne motede ShowInv, kørere igeenm en arraylist og viser de ting vi sætter ind
     * i arraylisten.
     */
    //Denne metode viser alle ting i din inventory.
        public void showInv(){
            System.out.println("Tast 3 for at åbne din takse");
            valg = scan.nextInt();
            if (valg == 3) {

                System.out.println("Her er hvad der ligger i din Inventory:");
                for (String str : item) {
                    System.out.println("Item: " + str);

                }
            }

        }

}

