package chessPack;

public class Pawn extends Piece 
{
	private boolean promoted;
	
	private String moveType;
	
	public Pawn(boolean taken, String image)
	{
		super(taken, image);
		moveType = "Pawn";
		promoted = false;
	}
	
	public void setProm(boolean status)
	{
		promoted = status;
	}
	
}
