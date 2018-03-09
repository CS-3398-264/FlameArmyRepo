package chessPack;

public class Bishop extends Piece{

	private String moveType;
	
	public Bishop(boolean taken2, String image2) {
		super(taken2, image2);
		// TODO Auto-generated constructor stub
		
		moveType = "Bishop";
	}
	
	public String rtnMoveType()
	{
		return moveType;
	}
	

}
