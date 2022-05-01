package objects;

public class Board {
    private int[][] positions;
    private Piece[] white;
    private Piece[] black;

    Board(Piece[] white, Piece[] black){
        positions = new int[8][8];
        this.white = white;
        this.black = black;
    }
}
