package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;
import boardLayer.Position;
import chessLayer.pieces.King;
import chessLayer.pieces.Rook;

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
		currentPlayer = Color.WHITE;
		initialSetup();
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
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 7));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 1));
		board.placePiece(new Rook(board, Color.WHITE),new Position(0, 1));
		
	}
	
//	private void newPlacePiece()
}
