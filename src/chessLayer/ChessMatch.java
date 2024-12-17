package chessLayer;

import boardLayer.Board;

public class ChessMatch {

	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVunerable;
	private ChessPiece promoted;
	
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		turn = 0;
		currentPlayer = Color.WHITE;
	}

	public int getTurn() {
		return turn;
	}

	public Color getCurrentPlayer() {
		return currentPlayer;
	}

	public boolean isCheck() {
		return check;
	}

	public boolean isCheckMate() {
		return checkMate;
	}

	public Board getBoard() {
		return board;
	}
	
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				ChessPiece p = ((ChessPiece) board.piece(i, j));
				mat[i][j] = ((ChessPiece) board.piece(i, j));
			}
		}
		
		return mat;
	}
	
//	public boolean[][] possibleMoves(ChessPosition sourcePosition) {
//		
//	}
//	
//	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
//		
//	}
//	
//	public ChessPiece replacePromotedPiece(String type) {
//		
//	}
}
