import java.util.Scanner;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRomanNumerals {

	private Scanner scanString;

	@Test
	public void testNumbersToThree() {
		RomanNumerals testNumerals = new RomanNumerals();
		scanString = new Scanner(System.in);
		String numberString=scanString.nextLine();
		int i = testNumerals.convertToInteger(numberString);
		System.out.print("The value of the i is: "+i);
		switch(i)
		{
			case 1:
			{
				if(numberString=="I")
				{
					break;
				}
				else
				{
					fail("Number incorrect");
				}
			}
			case 2:
			{
				if(numberString=="II")
				{
					break;
				}
				else
				{
					fail("Number incorrect");
				}
			}
			case 3:
			{
				if(numberString=="III")
				{
					break;
				}
				else
				{
					fail("Number incorrect");
				}
			}
			default:
				fail("Unexpexted something");
			break;
		}
	}

}
