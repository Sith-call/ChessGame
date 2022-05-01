package objects;

public class Board {
    private int[][] positions;
    private Piece[] whites;
    private Piece[] blacks;

    Board(Piece[] whites, Piece[] blacks){
        positions = new int[8][8];
        this.whites = whites;
        this.blacks = blacks;
    }
}
