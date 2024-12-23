package chessLayer.pieces;

import boardLayer.Board;
import chessLayer.ChessPiece;
import chessLayer.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

	@Override
	public String toString() {
		return "R";
	}
}
