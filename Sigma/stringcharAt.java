package Sigma;

public class stringcharAt {
    //by this loop all the index value is printing
    public static void printstr(String c){
        for(int i =0;i<c.length();i++){
            System.out.print(c.charAt(i)+" ");
        }
    } 
    public static void main(String args[]){
        String a = "Nitish ";
        String b = "Kumar";
        String c = a+" "+b;
        //charAt() is used for printing index value of the string
        System.out.println(c.charAt(0));
        printstr(c);
        }
    
}
