package Sigma;

public class compareTostring {
    //compareto used to comapre the strings and lso used in find largest string
    public static void main(String args[]){
        String fruits[] = {"zangow","zango","z"};
        String largest = fruits[0];
        for(int i =1;i<fruits.length;i++){
            if(largest.compareToIgnorecase (fruits[i])<0){
                largest = fruits[i];


            }
            
        }System.out.println(largest);
    }
    
}
