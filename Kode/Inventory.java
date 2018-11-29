import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {


        InputHandler input = new InputHandler();
        //laver inventory med arraylist!


    int valg = 0;
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
            item.add("Guldmønter");
            System.out.println("Du har nu samlet " + item + " op!");
    }
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