package chessPack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
This class test all the function sin the ChessmateTest class
The Function displays if all tests are successful or the number of failed tests.abstract
@author FlameArmy.
*/
public class ChessmateTestRunner
{
	/**
	 * This is the main method of the TestRunner call and implements Result
	 * to run all tests in a class.
	 * @param args
	 */
	public static void main(String args[])
	{
		Result result = JUnitCore.runnClasses(ChessMateTests.class);
		if (result.getFailures().size() == 0)
		{
			System.out.println("All tests are successfull!");
		}
		else
		{
			System.out.println("No. of failed test cases = " +
			result.getFailures().size());
			for (Failure failure : result.getFailures())
				System.out.println(failure.toString());
		}
	}
}