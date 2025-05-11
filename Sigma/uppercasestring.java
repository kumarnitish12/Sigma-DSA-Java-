package Sigma;
public class uppercasestring{
    public static String upcase(String str){
        StringBuilder sb = new StringBuilder("");
        // char ch = Character.toUpperCase(str.charAt(0));
        // sb.append(ch);
        for(int i = 0;i<str.length();i++){
            sb.append(Character.toUpperCase(str.charAt(i)));

        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "hii i am nitiSH";
        System.out.println(upcase(str));
    }

}