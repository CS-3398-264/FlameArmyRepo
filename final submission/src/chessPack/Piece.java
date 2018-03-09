package chessPack;

public abstract class Piece 
{
	private boolean taken;
	private String image;
	

	
	public Piece(boolean taken2, String image2) {
		// TODO Auto-generated constructor stub
		taken = taken2;
		image = image2;
	}

	public void setTaken(boolean taken)
	{
		this.taken = taken;
	}
	
	public void setImage(String image)
	{
		this.image = image;
	}
	
	public String rtnImage()
	{
		return image;
	}
	
	
}

