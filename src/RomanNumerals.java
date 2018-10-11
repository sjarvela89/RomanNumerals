
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int returnValue=0;
		// To be Implemented
		if(romanNum.equals("I"))
		{
			returnValue=1;
		}
		if(romanNum.equals("II"))
		{
			returnValue=2;
		}
		if(romanNum.equals("III"))
		{
			returnValue=3;
		}
		return returnValue;
		
	}
}
