import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void convertToInteger_I() {
		//Arrange
		String romanNum= "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 1;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_V() {
		//Arrange
		String romanNum= "V";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 5;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_X() {
		//Arrange
		String romanNum= "X";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 10;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_L() {
		//Arrange
		String romanNum= "L";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 50;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_C() {
		//Arrange
		String romanNum= "C";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 100;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_D() {
		//Arrange
		String romanNum= "D";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 500;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_M() {
		//Arrange
		String romanNum= "M";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 1000;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_II() {
		//Arrange
		String romanNum= "II";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 2;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_III() {
		//Arrange
		String romanNum= "III";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 3;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_IIII() {
		//Arrange
		String romanNum= "IIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XX() {
		//Arrange
		String romanNum= "XX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 20;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XXX() {
		//Arrange
		String romanNum= "XXX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 30;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XXXX() {
		//Arrange
		String romanNum= "XXXX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_CC() {
		//Arrange
		String romanNum= "CC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 200;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_CCC() {
		//Arrange
		String romanNum= "CCC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 300;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_CCCC() {
		//Arrange
		String romanNum= "CCCC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_MM() {
		//Arrange
		String romanNum= "MM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 2000;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_MMM() {
		//Arrange
		String romanNum= "MMM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 3000;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_MMMM() {
		//Arrange
		String romanNum= "MMMM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_VV() {
		//Arrange
		String romanNum= "VV";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_LL() {
		//Arrange
		String romanNum= "LL";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_DD() {
		//Arrange
		String romanNum= "DD";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_IV() {
		//Arrange
		String romanNum= "IV";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 4;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_IX() {
		//Arrange
		String romanNum= "IX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 9;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XL() {
		//Arrange
		String romanNum= "XL";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 40;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XC() {
		//Arrange
		String romanNum= "XC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 90;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	
	@Test
	public void convertToInteger_CD() {
		//Arrange
		String romanNum= "CD";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 400;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	
	@Test
	public void convertToInteger_CM() {
		//Arrange
		String romanNum= "CM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 900;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	
	@Test
	public void convertToInteger_MCMLXXXIV() {
		//Arrange
		String romanNum= "MCMLXXXIV";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 1984;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_MMXIV() {
		//Arrange
		String romanNum= "MMXIV";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 2014;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XXC() {
		//Arrange
		String romanNum= "XXC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_VI() {
		//Arrange
		String romanNum= "VI";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 6;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_VII() {
		//Arrange
		String romanNum= "VII";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 7;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_VIII() {
		//Arrange
		String romanNum= "VIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 8;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XI() {
		//Arrange
		String romanNum= "XI";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 11;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XII() {
		//Arrange
		String romanNum= "XII";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 12;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XIII() {
		//Arrange
		String romanNum= "XIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 13;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}

	@Test
	public void convertToInteger_XIV() {
		//Arrange
		String romanNum= "XIV";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 14;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_XV() {
		//Arrange
		String romanNum= "XV";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 15;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	
	@Test
	public void convertToInteger_VX() {
		//Arrange
		String romanNum= "VX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_LX() {
		//Arrange
		String romanNum= "LX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 60;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_LXX() {
		//Arrange
		String romanNum= "LXX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 70;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_LXXX() {
		//Arrange
		String romanNum= "LXXX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 80;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_LD() {
		//Arrange
		String romanNum= "LD";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_DM() {
		//Arrange
		String romanNum= "DM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_DC() {
		//Arrange
		String romanNum= "DC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 600;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_DCC() {
		//Arrange
		String romanNum= "DCC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 700;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_DCCC() {
		//Arrange
		String romanNum= "DCCC";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 800;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	// random roman numeral test numbers
	
	@Test
	public void convertToInteger_CCLXXXIX() {
		//Arrange
		String romanNum= "CCLXXXIX";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 289;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_MMMDXLVIII() {
		//Arrange
		String romanNum= "MMMDXLVIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 3548;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_MMMDCCCLXXVIII() {
		//Arrange
		String romanNum= "MMMDCCCLXXVIII";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 3878;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}

}
