
public class Maskify {
	private static String maskString(String cardNumber) {

		if (cardNumber == null || cardNumber.equals(""))
			return "";

		// if card length is less than or equal 6 digits , it will not be masked
		if (cardNumber.length() < 6)
			return cardNumber;

		// formating the new value of the card number
		StringBuilder maskedCard = new StringBuilder(cardNumber);

		for (int i = 1; i < maskedCard.length() - 4; i++) {
			if (Character.isDigit(maskedCard.charAt(i))) {
				maskedCard.setCharAt(i, '#');

			}
		}
		return maskedCard.toString();
	}

	public static void main(String[] args) {
		System.out.print(maskString(""));
	}

}
