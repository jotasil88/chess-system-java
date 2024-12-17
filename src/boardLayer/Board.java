package boardLayer;

public class Board {
	
	private int rows;
	private int columns;
	
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		return piece(position.getRow(), position.getColumn());
	}
//	
//
//	public void placePiece(Piece piece, Position position) {
//		
//	}
//
//	public Piece removePiece(Position position) {
//		
//	}
//
//	public boolean positionExists(Position position) {
//		
//	}
//
//	public boolean thereIsAPiece(Position position) {
//		
//	}

	@Override
	public String toString() {
		return "Board [rows=" + rows + ", columns=" + columns + "]";
	}
}
