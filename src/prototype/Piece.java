package prototype;
import java.util.HashMap;

public abstract class Piece {
    //Prototype for all pieces

    // Current Position
    private HashMap<Integer,Integer> position;

    // Getter
    public HashMap<Integer,Integer> getPosition(void){
        return this.position;
    }
}