
public class OrdinalNumbers {

	public static String numberToOrdinal(Integer number) {

		// if it is 0 , will return 0
		if (number == 0)
			return "0";

		// find the last digit that will be passed to the getSuffix() method
		int lastDigit = Integer.remainderUnsigned(number, 10);

		// find the last two digits to handle the exception case of numbers between 10
		// and 20
		int lastTwoDigits = Integer.remainderUnsigned(number, 100);

		if (lastTwoDigits > 10 && lastTwoDigits < 20)
			return number + "th";
		else {
			return number + getSuffix(lastDigit);
		}
	}

	/*
	 * Method returns the suffix of the number
	 * 
	 * @Param number
	 * 
	 * @return String
	 */

	static String getSuffix(Integer number) {

		switch (number) {
		case 1:
			return "st";
		case 2:
			return "nd";
		case 3:
			return "rd";
		default:
			return "th";
		}
	}

	public static void main(String args[]) {
		System.out.println(1552%10);
		System.out.println(1552%100);
		System.out.println("Using integer class");
		System.out.println(Integer.remainderUnsigned(1552, 10));
		System.out.println(Integer.remainderUnsigned(1552, 100));




		
	}

}
