/**
 * @author Thomas Alder Broe
 */

import java.util.Arrays;

public class Npc {
    private String navn;
    private String race;
    private String formål;

    //Vi har lavet dummy contructors, uden parametre
    public Npc(){

        this.navn = "";
        this.race = "";
        this.formål = "";

    }
    //Vi har lavet contructors med parametre
    public Npc(String navn, String race, String formål){

        this.navn = navn;
        this.race = race;
        this.formål = formål;
    }
    //Gettes og Setters
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFormål() {
        return formål;
    }

    public void setFormål(String formål) {
        this.formål = formål;
    }

    /**
     * Printer toString ud.
     * @return
     */
    public  String toString(){
        String s = "";

        s+="Name:\t" + getNavn();
        s+="\n Race:\t" + getRace();
        s+="\n Formål:" + getFormål();

        return s;
    }

    /**
     * Sættter Hesk i en array
     * Printer Hesk ud via toString
     */
    public void printHeks() {

        Npc[] heks = new Npc[1];
        heks[0] = new Npc("Gertrud", "Heks", "Hun vil gerne have fyrtøjet");
        System.out.println(Arrays.toString(heks));
    }
    /**
     * Sættter Tjener i en array
     * Printer Tjener ud via toString
     */
    public void printTjener(){
        Npc[] tjener = new Npc[1];
        tjener[0] = new Npc("Tjener", "Menneske", "Hjælper");
        System.out.println(Arrays.toString(tjener));
    }
    /**
     * Sættter Droning i en array
     * Printer Droning ud via toString
     */
    public void printDroning(){
        Npc[] droning = new Npc[1];
        droning[0] = new Npc("Droning", "Menneske", "Kongelig");
        System.out.println(Arrays.toString(droning));
    }
    /**
     * Sættter Konge i en array
     * Printer Konge ud via toString
     */
    public void printKonge(){
        Npc[] konge = new Npc[1];
        konge[0] = new Npc("Konge", "Menneske", "Kongelig");
        System.out.println(Arrays.toString(konge));
    }
    /**
     * Sættter Princesse i en array
     * Printer Princesse ud via toString
     */
    public void printPrincesse(){
        Npc[] princesse = new Npc[1];
        princesse[0] = new Npc("Prinsesse", "Menneske", "Kongelig");
        System.out.println(Arrays.toString(princesse));
    }
    /**
     * Sættter hund1 i en array
     * Printer hund1 ud via toString
     */
    public void printHund1(){
        Npc[] hund1 = new Npc[1];
        hund1[0] = new Npc("Tekoppen", "Hund", "Adlyder fyrtøjet");
        System.out.println(Arrays.toString(hund1));
    }
    /**
     * Sættter hund2 i en array
     * Printer hund2 ud via toString
     */
    public void printHund2(){
        Npc[] hund2 = new Npc[1];
        hund2[0] = new Npc("Møllehjulet", "Hund", "Adlyder fyrtøjet");
        System.out.println(Arrays.toString(hund2));
    }
    /**
     * Sættter hund3 i en array
     * Printer hund3 ud via toString
     */
    public void printHund3(){
        Npc[] hund3 = new Npc[1];
        hund3[0] = new Npc("Rundetårn", "Hund", "Adlyder fyrtøjet");
        System.out.println(Arrays.toString(hund3));
    }
    /**
     * Sættter SkomagerDrengen i en array
     * Printer SkomagerDrengen ud via toString
     */
    public void printSkomagerDrengen(){
        Npc[] skomager = new Npc[1];
        skomager[0] = new Npc("Skomager", "Menneske", "Gøre folks sko regne");
        System.out.println(Arrays.toString(skomager));
    }
    /**
     * Sættter Medareberjer i en array
     * Printer Medareberjer ud via toString
     */
    public void printMedarbejder() {
        Npc[] medarbejder = new Npc[1];
        medarbejder[0] = new Npc("Jon", "Menneske", "Butiks ejer");
        System.out.println(Arrays.toString(medarbejder));
    }

}
