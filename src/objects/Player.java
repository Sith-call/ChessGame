package objects;

import states.Side;

import java.util.HashMap;

public class Player {
    private Side side;
    public Side setSide(Side side){
        this.side = side;
        return side;
    }
    public Side getSide(){
        return this.side;
    }
}
