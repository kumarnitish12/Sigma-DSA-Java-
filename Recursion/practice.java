package Recursion;

public class practice {
    public static String remdup(String Str){
        StringBuffer str1 = new StringBuffer();
        for(int i =0; i<Str.length();i++){
            boolean found = false;
            for(int j =0;j<str1.length();j++){
                if((Str.charAt(i))== (str1.charAt(j))){
                    found = true;
                    break;
                    
                }
            }
            if(!found){
                str1.append(Str.charAt(i));
            }
            
        }
        return str1.toString();
    }
    public static void main(String args[]){
        String Str = "appnnacollege";
        System.out.println(remdup(Str));

    }
    
}
