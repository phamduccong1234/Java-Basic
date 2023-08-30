package homeworkjava;

public class MagicSum_Method_Ex3 {
	public static boolean checkNumber(int number) {
		boolean result = true;
		String numberString = String.valueOf(number);
		for(int i = 0; i < numberString.length(); i++) {
			if(numberString.charAt(i) == '8') {
				result = true;
			} else if (numberString.charAt(i) == '-'){
				result = false;
			} else {
				result = false;
			}
		}
		
		return result;
	}
}
