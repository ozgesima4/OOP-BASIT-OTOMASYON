package basitotomasyon;

public class Student {
    Kurs d1;
    Kurs d2;
    Kurs d3;
    String isim;
    String kodu;
    int numara;
    double avarage=0,favarage=0,kavarage=0,gavarage;
    

    public Student(String isim, String kodu, int numara,Kurs d1, Kurs d2, Kurs d3 ) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.isim = isim;
        this.kodu = kodu;
        this.numara = numara;
     
    }
    void hesapla(int n1,int n2,int n3,int dd1,int dd2, int dd3){
         this.d1.not=n1;
         this.d2.not=n2;
         this.d3.not=n3;
         this.d1.sozlu=dd1;
         this.d2.sozlu=dd2;
         this.d3.sozlu=dd3;
         
      if(d1.ad.equals("fizik")){
          this.favarage=(n1*0.2)+(dd1*0.8);
          this.kavarage=(n2+dd2)/2;
          this.avarage=(n3+dd3)/2;
          System.out.println("fizik ort: "+this.avarage);
          System.out.println("kimya ort: "+this.kavarage);
          System.out.println("matematik ort: "+this.avarage);
      }
          else if(d2.ad.equals("fizik")){
          this.favarage=(n2*0.2)+(dd2*0.8);
          this.kavarage=(n1+dd1)/2;
          this.avarage=(n3+dd3)/2;
          System.out.println("kimya ort: "+this.kavarage);
          System.out.println("fizik ort: "+this.favarage);
          System.out.println("matematik ort: "+this.avarage);
      }else{
          this.favarage=(n3*0.2)+(dd3*0.8);
          this.kavarage=(n1+dd1)/2;
          this.avarage=(n2+dd2)/2;
       System.out.println("kimya ort: "+this.kavarage);
       System.out.println("fizik ort: "+this.favarage);
       System.out.println("matematik ort: "+this.avarage);}
    
    }
    void isPass(){
        if(d1.not==0||d1.sozlu==0||d3.not==0||d3.sozlu==0||d3.not==0||d3.sozlu==0){
            System.out.println("eksik not girdiniz.");
        }else{
            this.gavarage=(this.avarage+this.favarage+this.kavarage)/3;
            if(this.gavarage>=50){
                System.out.println("gectiniz...");
            }
            else{
                System.out.println("kaldiniz..");
            }
        }
    }
    
  
    
}
