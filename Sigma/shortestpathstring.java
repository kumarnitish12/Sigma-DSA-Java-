package Sigma;

public class shortestpathstring {
    public static float getshortestpath(String str){
        int x =0;int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            if(str.charAt(i)=='W'){
                x--;
            }
            if(str.charAt(i)=='S'){
                y--;
            }else{
                y++;

            }
            
        
        
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt (X2+Y2) ;
            
    }
    public static void main(String[] args) {
        String str = "WEWESNNEWSEN";
        System.out.print(getshortestpath(str));
    }
    
}
