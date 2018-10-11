
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int returnValue=0;
		// To be Implemented
		if(romanNum.equals("I")||romanNum.equals("II")||romanNum.equals("III"))
		{
			returnValue=oneToThree(romanNum);
		}
		if(romanNum.equals("IV")||romanNum.equals("V")||romanNum.equals("VI")||romanNum.equals("VII")||romanNum.equals("VIII"))
		{
			returnValue=fourToEight(romanNum);
		}
		return returnValue;
		
	}
	private int oneToThree(String romanNumOneToThree){
		int returnOneToThree=0;
		if(romanNumOneToThree.equals("I"))
		{
			returnOneToThree=1;
		}
		if(romanNumOneToThree.equals("II"))
		{
			returnOneToThree=2;
		}
		if(romanNumOneToThree.equals("III"))
		{
			returnOneToThree=3;
		}
		return returnOneToThree;
	}
	private int fourToEight(String romanNFTE){
		return 1;
	}
}
