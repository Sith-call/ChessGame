package objects;
import states.Survival;

import java.util.HashMap;

public abstract class Piece {
    //Prototype for all pieces

    // Current Position
    private HashMap<Integer,Integer> position;
    private final Player player;
    private final Survival survival;

    Piece(Player player, Survival survival){
        this.player = player;
        this.survival = survival;
    }

    // Getter
    public HashMap<Integer,Integer> getPosition(){
        return this.position;
    }
    public Player getPlayer(){ return this.player;}
    public Survival getSurvival(){ return this.survival;}

    // Setter
    public abstract boolean setPosition(int x, int y);

    // Validation
    // Check if position entered is valid.
    abstract boolean validation(int x, int y);
}