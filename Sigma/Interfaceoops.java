package Sigma;

public class Interfaceoops {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        q.donothing();
        
    }
    ;
    
}
interface Chessplayer{
    void moves();
}
class Queen {
    void donothing(){
        System.out.println("nothing");
    }
    void moves(){
        System.out.println("up,down,left,right,diagonal(all 4 sides)");
    }
}
class Rook{
    void moves(){
        System.out.println("up,down,left,right");

    }
}
