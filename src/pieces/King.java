package pieces;

import objects.Piece;
import states.Color;
import states.Position;

import java.util.HashMap;

public class King extends Piece {

    King(Color color){
        this.color = color;
        if(color.equals(Color.WHITE)){
            this.position = new Position(5,1);
        } else if(color.equals(Color.BLACK)){
            this.position = new Position(5,8);
        }
    }

    public boolean setPosition(int x, int y){
        if(validation(x,y)){
            this.position.setXY(x,y);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean validation(int x, int y){
        if((x<=8 && x>=1) && (y<=8 && y>=1)){
            return true;
        }
        else{
            return false;
        }
    }
}
