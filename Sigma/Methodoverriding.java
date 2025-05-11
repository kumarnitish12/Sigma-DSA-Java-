package Sigma;
//run it in online compiler
public class Methodoverriding {
    public static void main(String args[]){
        Animal a1 = new Animal();
        a1.eat();
        Deer d = new Deer();
        d.eat();
        
        
    }
    
}
class Animal{
    void eat(){
        System.out.print("eats anything");
    }

}
class Deer extends Animal{
     void eat(){
         System.out.println("eats only grass");
    }
}
