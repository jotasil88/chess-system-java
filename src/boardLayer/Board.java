package boardLayer;

public class Board {

	private int rows;
	private int columns;

	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if (rows < 1 && columns < 1) {
			throw new BoardException("Failed to create a board, boards must have at least 1 column and 1 row! (input: " + rows + ", " + columns + ")");
		}
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
		Position p = new Position(row, column);
		if (!positionExists(p)) {
			throw new BoardException("failed to return the piece: position informed doesnt exist on the board! (input: " + p + ")");
		}

		return pieces[row][column];
	}

	public Piece piece(Position position) {
		return piece(position.getRow(), position.getColumn());
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("failed to place the piece: target position is occupied! (input: " + position + ")");
		}

		piece.position = position;
		pieces[position.getRow()][position.getColumn()] = piece;
	}

//	public Piece removePiece(Position position) {
//		
//	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("failed to verify if there is a piece: position doesnt exist on the board! (input: " + position + ")");
		}
		
		return piece(position) != null;
	}

	@Override
	public String toString() {
		return "Board [rows=" + rows + ", columns=" + columns + "]";
	}
}
