package Sigma;

public class Methodoverloadingpolymorphism {
    public static void main(String a[]){
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(23.8793,45.9874));
    }

    
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b ){
        return a+b;
    } 
    double sum(double a,double b){
        return a+b;

    }
}