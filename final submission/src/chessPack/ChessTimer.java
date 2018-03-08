package chessPack;

import java.util.concurrent.TimeUnit;

public class ChessTimer 
{
	private long startTime;
	
	
	public void startTime()
	{
		startTime = System.currentTimeMillis();
	}
	
	public long estimateTime()
	{
		long estimatedTime = System.currentTimeMillis() - startTime;
		return estimatedTime;
	}
	
	public void restartTime()
	{
		startTime = System.currentTimeMillis();
	}
	
	public long returnInMin()
	{
		return TimeUnit.MILLISECONDS.toMinutes(estimateTime());
	}
	public long toMinutes(long millis)
	{
		return TimeUnit.MILLISECONDS.toMinutes(millis);
	}
}
