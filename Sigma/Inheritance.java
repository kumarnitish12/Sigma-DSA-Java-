package Sigma;

public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eats="eaats";
        System.out.println(shark.eats);
        shark.swim();
        

    }
    
}
class Animal{
    String eats;
    void eat(String neweats){
        eats=neweats;
        
    }
    void breathe(){
        System.out.println("breathes");

    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
