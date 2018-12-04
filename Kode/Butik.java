public class Butik {
    private String guldsværd;
    private String hat;
    private String jakkesæt;
    private String cykkel;



    public Butik(){
        this.guldsværd ="Guldsværd";
        this.hat ="Hat";
        this.jakkesæt="Jakkesæt";
        this.cykkel="Cykkel";

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



}
