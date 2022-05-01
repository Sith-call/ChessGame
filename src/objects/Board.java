package objects;

import interfaces.ShowBoard;

public class Board implements ShowBoard {
    private int[][] positions;
    private Piece[] whites;
    private Piece[] blacks;

    Board(){

    }

    Board(Piece[] whites, Piece[] blacks){
        positions = new int[8][8];
        this.whites = whites;
        this.blacks = blacks;
    }

    public void ShowBoard(){

    }

}
