package prototype;
import java.util.HashMap;

public abstract class Piece {
    //Prototype for all pieces

    // Current Position
    private HashMap<Integer,Integer> position;

    // Operation(Setter)
    abstract void move(int x, int y);

    // Getter
    public HashMap<Integer,Integer> getPosition(void){
        return this.position;
    }

    // Validation
    /**
     * Check if position entered is valid.
     * **/
    abstract boolean validation(int x, int y);
}