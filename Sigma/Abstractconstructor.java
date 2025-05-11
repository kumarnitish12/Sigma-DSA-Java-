package Sigma;
//run in online compiler

public class Abstractconstructor {
    public static void main(String args[]){
        horsebreed h =new horsebreed();
        
    }
    
}
abstract class Animal{
    Animal(){
        System.out.println("Animals constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void eat(){
        System.out.println("Horse eats");
    }
}
class horsebreed extends Horse{
    horsebreed(){
        System.out.println("horsebreed constructor called");
    }
    void eat(){
        System.out.print("horse breeds eat");
    }
}
//output 
 //Animal constructor called
 //Horse constructor called
 //horsebreed constructor called
