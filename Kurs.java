package basitotomasyon;

public class Kurs {
    Teacher kursteacher;
    int kod;
    int sozlu;
    int not=0;
    String ad;
    String derskodu;
    

    public Kurs(String ad, int kod, String derskodu, Teacher kursteacher) {
        this.ad = ad;
        this.kod = kod;
        this.derskodu = derskodu;
        this.kursteacher = kursteacher;
    }
    
   void control(){
      if(kursteacher.branch.equals(derskodu)){
          System.out.println("evet bu ogretmen bu dersi verebilir.");
      }
      else{
          System.out.println("yanlis giris yapildi.");
      }
       
   }
    
}
