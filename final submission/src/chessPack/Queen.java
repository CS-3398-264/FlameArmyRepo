package chessPack;

public class Queen extends Piece {
	
	private String moveType;
	public Queen(boolean taken2, String image2) {
		super(taken2, image2);
		// TODO Auto-generated constructor stub
		moveType = "Queen";
	}
	
	public String rtnMoveType()
	{
		return moveType;
	}
}
