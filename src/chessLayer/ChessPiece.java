package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;
import boardLayer.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}

//	public ChessPosition getChessPosition() {
//		
//	}
//	
//	protected boolean isThereOpponentPiece(Position position) {
//		
//	}

	protected void increaseMoveCount() {
		moveCount++;
	}

	protected void decreaseMoveCount() {
		moveCount--;
	}
}
