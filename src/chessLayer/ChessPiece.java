package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;
import boardLayer.Position;

public class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Position position, Board board, Color color) {
		super(position, board);
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
