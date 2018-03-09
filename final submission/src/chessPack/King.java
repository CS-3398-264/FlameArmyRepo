package chessPack;

public class King extends Piece 
{
	private String moveType;
	private boolean inCheckmate = false;
	
	public King(boolean taken, String image)
	{
		super(taken, image);
		// TODO Auto-generated constructor stub
		moveType = "King";
	}
	
	public void setCheckmate(boolean status)
	{
		inCheckmate = status;
	}
	
	public boolean rtnCheckmate()
	{
		return inCheckmate;
	}

}

