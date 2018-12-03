public class Butik extends Inventory {
    private String guldsværd;
    private String hat;
    private String jakkesæt;
    private String cykkel;

    private int guldsværdPris;
    private int hatPris;
    private int jakkeSætPris;
    private int cykelPris;


    public Butik(){
        this.guldsværd ="Guldsværd";
        this.hat ="Hat";
        this.jakkesæt="Jakkesæt";
        this.cykkel="Cykkel";

        this.guldsværdPris = 20;
        this.hatPris = 1;
        this.jakkeSætPris = 5;
        this.cykelPris = 14;
    }
    public Butik(String guldsværd, String hat, String jakkesæt, String cykkel){
        this.guldsværd = guldsværd;
        this.hat = hat;
        this.jakkesæt=jakkesæt;
        this.cykkel=cykkel;
    }
    public String getGuldsværd() {
        return guldsværd;
    }

    public void setGuldsværd(String guldsværd) {
        this.guldsværd = guldsværd;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getJakkesæt() {
        return jakkesæt;
    }

    public void setJakkesæt(String jakkesæt) {
        this.jakkesæt = jakkesæt;
    }

    public String getCykkel() {
        return cykkel;
    }

    public void setCykkel(String cykkel) {
        this.cykkel = cykkel;
    }

    public int getGuldsværdPris() {
        return guldsværdPris;
    }

    public void setGuldsværdPris(int guldsværdPris) {
        this.guldsværdPris = guldsværdPris;
    }

    public int getHatPris() {
        return hatPris;
    }

    public void setHatPris(int hatPris) {
        this.hatPris = hatPris;
    }

    public int getJakkeSætPris() {
        return jakkeSætPris;
    }

    public void setJakkeSætPris(int jakkeSætPris) {
        this.jakkeSætPris = jakkeSætPris;
    }

    public int getCykelPris() {
        return cykelPris;
    }

    public void setCykelPris(int cykelPris) {
        this.cykelPris = cykelPris;
    }

    public void printButik(){

        System.out.println("Her er hvad du kan købe:\n" +
                "Tast 1: En " + getGuldsværd() + " til "+ getGuldsværdPris() + " mønter.\n" +
                "Tast 2: En " + getHat() + " til " + getHatPris() + " mønt.\n" +
                "Tast 3: En " + getJakkesæt() + " til " + getJakkeSætPris() + " mønter.\n" +
                "Tast 4: En " + getCykkel() +  " til " +getCykelPris() + " Mønter.");
    }


}
