package Sigma;

public class Staticky4properties {
    public static void main(String a[]){
        student s1=new student();
        s1.calcpercentage(90, 100, 90);
        System.out.println(s1.calcpercentage(90,100,90));
        student s=new student();
        s.calcpercentage(99,99,99);
        System.out.print(s.calcpercentage(99,99,99));
        
        
        




    }

    
}
class student{
    String name;
    //if we r using static means function/properties will be same 4 all constructors
    static float calcpercentage(float phy,float chem,float math){
        return (phy+chem+math)/3;
    }
    int rollno;
    static String Schoolname;
    void setname(String name){
        this.name=name;

    }
    String getname(String name){
        return this.name;
    }

    

}
