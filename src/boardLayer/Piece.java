package boardLayer;

public abstract class Piece {
	
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
//	public boolean possibleMove(Position position)S {
//		
//	}
	
//	public boolean isThereAnyPossibleMove() {
//		
//	}
}
