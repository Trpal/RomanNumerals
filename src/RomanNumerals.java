
public class RomanNumerals {
	
	private int arabicNumeral = 0;
	private int lastNumber = 0;
	
	public int convertToInteger(String romanNum) {
		
		for (int i = romanNum.length() - 1; i >= 0 ; i--){
			char convertable = romanNum.charAt(i);
			switch(convertable){
				case 'I':
					arabicNumeral = handleMultiples(1, lastNumber, arabicNumeral);
					lastNumber = 1;
					break;
				case 'V':
					arabicNumeral = handleMultiples(5, lastNumber, arabicNumeral);
					lastNumber = 5;
					break;
				case 'X':
					arabicNumeral = handleMultiples(10, lastNumber, arabicNumeral);
					lastNumber = 10;
					break;
				case 'L':
					arabicNumeral = handleMultiples(50, lastNumber, arabicNumeral);
					lastNumber = 50;
					break;
				case 'C': 
					arabicNumeral = handleMultiples(100, lastNumber, arabicNumeral);
					lastNumber = 100;
					break;
				case 'D':
					arabicNumeral = handleMultiples(500, lastNumber, arabicNumeral);
					lastNumber = 500;
					break;
				case 'M':
					arabicNumeral = handleMultiples(1000, lastNumber, arabicNumeral);
					lastNumber = 1000;
					break;
			}
		}
		
		return arabicNumeral;
	}
	
	public static int handleMultiples(int currentNum, int lastNumber, int lastDecimal ){
		if(lastNumber > currentNum){
			return lastDecimal - currentNum;
		}else{
			return lastDecimal + currentNum;
		}
	}
}
