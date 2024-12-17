package boardLayer;

public abstract class Piece {
	
	protected Position position;
	
	private Board board;

	public Piece(Position position, Board board) {
		this.position = position;
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

//	public boolean[][] possibleMoves() {
//	
//	}
	
//	public boolean possibleMove(Position position)S {
//		
//	}
	
//	public boolean isThereAnyPossibleMove() {
//		
//	}
}
