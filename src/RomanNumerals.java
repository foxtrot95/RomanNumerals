
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		int result = 0; 
		char lastRomanDigit = 0;
		int repetitions = 0; 
		int lastRepetations = 0; 
		
		for(int i = 0; i < romanNum.length(); i++) {
			
			char currentRomanDigit = romanNum.charAt(i);
			
			//check repetitions
			if(currentRomanDigit == lastRomanDigit) {
				if(currentRomanDigit == 'V' || currentRomanDigit == 'L' || currentRomanDigit == 'D')
					return 0;
				
				repetitions++; 
				if(repetitions >= 3)
					return 0; 
			}else{
				lastRepetations = repetitions; 
				repetitions = 0; 
			}
			
			//check if in valid order
			if(checkInValidOrder(lastRomanDigit, currentRomanDigit))
				return 0; 
			
			//add to result
			result += convertRomanDigit(romanNum.charAt(i));
			
			//substract again if necessary 
			if(checkIfSubtract(lastRomanDigit, currentRomanDigit)) {
				
				//invalid number if repetition of number before is greater than 0 
				if(lastRepetations > 0)
					return 0; 
				
				result -= (2 * convertRomanDigit(lastRomanDigit));
			}
			
			lastRomanDigit = currentRomanDigit; 
		}
		
		return result;
	}
	
	public boolean checkInValidOrder(char lastRomanDigit, char currentRomanDigit) {
		
		if(lastRomanDigit == 'V' && currentRomanDigit == 'X') {
			return true;
		}else if(lastRomanDigit == 'L' && currentRomanDigit == 'D') {
			return true;
		}else if(lastRomanDigit == 'D' && currentRomanDigit == 'M') {
			return true;
		}
		
		return false; 
	}
	
	public boolean checkIfSubtract(char lastRomanDigit, char currentRomanDigit) {
		
		if(lastRomanDigit == 'I' && currentRomanDigit == 'V') {
			return true; 
		}else if(lastRomanDigit == 'I' && currentRomanDigit == 'X') {
			return true;
		}else if(lastRomanDigit == 'X' && currentRomanDigit == 'C') {
			return true;
		}else if(lastRomanDigit == 'X' && currentRomanDigit == 'L') {
			return true;
		}else if(lastRomanDigit == 'C' && currentRomanDigit == 'D') {
			return true;
		}else if(lastRomanDigit == 'C' && currentRomanDigit == 'M') {
			return true;
		}
		
		return false; 
	}
	
	public int convertRomanDigit(char romanDigit) {
		
		switch (romanDigit) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000; 
			default: 
				return 0; 
		}
		
	}
}
