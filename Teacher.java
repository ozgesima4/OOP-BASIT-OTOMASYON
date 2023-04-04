package basitotomasyon;

public class Teacher {
    String ad;
    String branch;
    int no;

    public Teacher(String ad, String branch, int no) {
        this.ad = ad;
        this.branch = branch;
        this.no = no;
    }
    
   void Teachershow(){
        System.out.println("adi \t:"+this.ad);
        System.out.println("bransi \t:"+this.branch);
        System.out.println("numarasi\t:"+this.no);
    }
    
}
