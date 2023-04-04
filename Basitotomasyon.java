package basitotomasyon;

public class Basitotomasyon {
    public static void main(String[] args) {
   
        Teacher t1= new Teacher("özge", "FZK", 7577);
        Teacher t2= new Teacher("sima", "KMY", 8653);
        Teacher t3= new Teacher("alcın", "TRH", 94003);
        
        
        Kurs k1=new Kurs("fizik", 50, "FZK", t1);
        Kurs k2= new Kurs("kimya", 100, "KMY", t2);
        Kurs k3=new Kurs("tarih", 0, "TRH", t3);
      
       Student st1=new Student("mehmet", "3", 839, k1, k2, k3);
       st1.hesapla(32, 40, 05, 06, 30, 320);
       st1.isPass();
        
       
    }
    
}
