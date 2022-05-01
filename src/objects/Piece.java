package objects;
import states.Color;
import states.Survival;
import states.Position;
import java.util.HashMap;

public abstract class Piece {
    //Prototype for all pieces

    // Current Position
    protected Position position;
    protected Color color;
    protected Survival survival;
    protected final Board board = new Board();

    protected Piece(){}

    Piece(Color color, Survival survival){
        this.color = color;
        this.survival = survival;
    }

    // Getter
    public Position getPosition(){return this.position;}
    public Color getColor(){ return this.color;}
    public Survival getSurvival(){ return this.survival;}

    // Setter
    public abstract boolean setPosition(int x, int y);

    // Validation
    // Check if position entered is valid.
    public abstract boolean validation(int x, int y);
}