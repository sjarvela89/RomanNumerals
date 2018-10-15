import java.util.Scanner;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRomanNumerals {

	private Scanner scanString;

	@Test
	public void testNumbersToThree() {
		RomanNumerals testNumerals = new RomanNumerals();
		scanString = new Scanner(System.in);
		String numberString=scanString.next();
		int i=0;
		i = testNumerals.convertToInteger(numberString);
		System.out.print("The value of the i is: "+i);
		switch(i)
		{
			case 1:
			{
				if(numberString.equals("I"))
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
				if(numberString.equals("II"))
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
				if(numberString.equals("III"))
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
	@Test
	public void testNumbersToEight() {
		RomanNumerals testNumerals = new RomanNumerals();
		scanString = new Scanner(System.in);
		String numberString=scanString.next();
		int i=0;
		i = testNumerals.convertToInteger(numberString);
		System.out.print("The value of the i is: "+i);
		switch(i)
		{
			case 4:
			{
				if(numberString.equals("IV"))
				{
					break;
				}
				else
				{
					fail("Number incorrect");
				}
			}
			case 5:
			{
				if(numberString.equals("V"))
				{
					break;
				}
				else
				{
					fail("Number incorrect");
				}
			}
			case 6:
			{
				if(numberString.equals("VI"))
				{
					break;
				}
				else
				{
					fail("Number incorrect");
				}
			}
			case 7:
			{
				if(numberString.equals("VII"))
				{
					break;
				}
				else
				{
					fail("Number incorrect");
				}
			}
			case 8:
			{
				if(numberString.equals("VIII"))
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
			//This is what I got done until the deadline.
		}
	}

}
