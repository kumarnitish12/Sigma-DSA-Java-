package Sigma;

public class substring {
    //without inbuilt function
    public static void getsubstring(String str,int si,int ei){
        String  substr="";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
            
            
        }System.out.print(substr);

    }
    public static void main(String args[]){
        String str = "Helloworld";
        // inbuilt function
        System.out.println(str.substring(0,9));
        getsubstring(str,0,9);
    }
    
}
