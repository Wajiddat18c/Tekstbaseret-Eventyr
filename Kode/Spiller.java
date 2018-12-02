public class Spiller
{
   private String navn;
   private String køn;
   private String race;
   
   public Spiller()
   {
   this.navn = "";
   this.køn = "";
   this.race = "";
   }
      InputHandler scan = new InputHandler();
   
   
   public void setNavn(String navn){
         this.navn = navn;
      }
      
      public String getNavn(){
         return this.navn;
      }
        public void setKøn(String køn){
         this.køn = køn;
      }
      
      public String getKøn(){
         return this.køn;
      }
      
      public void setRace(String race){
         this.race = race;
      }
      
      public String getRace(){
         return this.race;
      }

   public void name(){
      System.out.print("Skriv dit navn: ");
      setNavn(scan.readString());
      System.out.println("Dit navn er: " + getNavn());
   }

   public void gender() {
      System.out.println("Vælg køn.");
      int valg = 0;
      String mand = "Mand";
      String pige = "Kvinde";
      System.out.println("Tast 1: Mand");
      System.out.println("Tast 2: Kvinde");
      valg = scan.readInt();

      if (valg == 1){
         setKøn("Mand");
         System.out.println("Dit køn er: " + getKøn());
      }
      else if (valg == 2){
         setKøn("Kvinde");
         System.out.println("Dit køn er: " + getKøn());
      }

   }

}
