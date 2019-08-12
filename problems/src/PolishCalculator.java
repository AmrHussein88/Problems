import java.util.Stack;

public class PolishCalculator {
	/*
	 * I tried to implement the Postfix evaluation algorithm mentioned in the
	 * attached wiki page below is the code representing the pesudecode in the page
	 */
	public static double evaluate(String expr) {

		// return 0 if the input is empty
		if (expr.isEmpty() || expr == null)
			return 0;

		Stack<Double> valuesStack = new Stack<Double>();
		Stack<String> operatorsStack = new Stack<String>();
		double value1 = 0, value2 = 0;
		String operator = null;
		String[] valuesAndOperations = expr.split(" ");

		for (String str : valuesAndOperations) {

			// regex for the arithmetic operators
			if (str.matches("[\\/\\+\\-\\*]"))
				operatorsStack.push(str);
			else
				valuesStack.push(Double.valueOf(str));

			// when 2 values and their operator is found
			if (valuesStack.size() >= 2 && !operatorsStack.isEmpty()) {
				value1 = valuesStack.pop();
				value2 = valuesStack.pop();
				operator = operatorsStack.pop();
				valuesStack.push(getEvaluatedResult(value1, value2, operator));
			}

		}

		return valuesStack.pop();
	}

	/**
	 * Evaluating the values against the operator
	 * 
	 * @param value1
	 * @param value2
	 * @param operator the arithmetic operator that will be used with value1 and
	 *                 value2
	 */
	private static double getEvaluatedResult(double value1, double value2, String operator) {

		double result = 0;
		switch(operator) {
		case "/" :
			result = value2 / value1;
			break;
		case "+" :
			result = value2 + value1;
			break;
		case "-" :
			result = value2 - value1;
			break;
		case "*" :
			result = value2 * value1;
			break;
		}
		
		return result;
	}

	public static void main(String[] args) {

		System.out.print(evaluate("10000 123 +"));
	}

}
