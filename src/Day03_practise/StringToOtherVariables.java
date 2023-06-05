package Day03_practise;

public class StringToOtherVariables {
	public static void main(String[] args) {
		String number = "12";
		int num = Integer.parseInt(number);
		
		String number1 = "12.0";
		float num1 = Float.parseFloat(number);


		String double1 = "1.47";
		double num2 = Double.parseDouble(double1);

		String falseString = "False";
		boolean falseBool = Boolean.parseBoolean(falseString);   // falseBool = false 
		    
		String trueString = "True";
		boolean trueBool = Boolean.parseBoolean(trueString);     // trueBool = true


		String number3 = "47";
		long num3 = Long.parseLong(number);
		
		String number4 = "47";
		double num4 = Double.parseDouble(number);
	}

}
