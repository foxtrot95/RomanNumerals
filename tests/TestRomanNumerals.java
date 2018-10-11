import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	//Easy test cases
	
	@Test
	public void convertToInteger_I_1() {
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
	public void convertToInteger_V_5() {
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
	public void convertToInteger_X_10() {
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
	public void convertToInteger_L_50() {
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
	public void convertToInteger_C_100() {
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
	public void convertToInteger_D_500() {
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
	public void convertToInteger_M_1000() {
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
	
	// Repeated numerals test cases 
	
	@Test
	public void convertToInteger_II_2() {
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
	public void convertToInteger_III_3() {
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
	public void convertToInteger_IIII_Invalid() {
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
	public void convertToInteger_XX_20() {
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
	public void convertToInteger_XXX_30() {
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
	public void convertToInteger_XXXX_Invalid() {
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
	public void convertToInteger_CC_200() {
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
	public void convertToInteger_CCC_300() {
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
	public void convertToInteger_CCCC_Invalid() {
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
	public void convertToInteger_MM_2000() {
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
	public void convertToInteger_MMM_3000() {
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
	public void convertToInteger_MMMM_Invalid() {
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
	public void convertToInteger_VV_Invalid() {
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
	public void convertToInteger_LL_Invalid() {
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
	public void convertToInteger_DD_Invalid() {
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
	
	//Substracted numerals test cases
	
	@Test
	public void convertToInteger_IV_4() {
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
	public void convertToInteger_IX_9() {
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
	public void convertToInteger_XL_40() {
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
	public void convertToInteger_XC_90() {
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
	public void convertToInteger_CD_400() {
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
	public void convertToInteger_CM_900() {
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
	public void convertToInteger_XXC_Invalid() {
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
	
	//Combined numerals test cases 
	
	@Test
	public void convertToInteger_VI_6() {
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
	public void convertToInteger_VII_7() {
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
	public void convertToInteger_VIII_8() {
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
	public void convertToInteger_XI_11() {
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
	public void convertToInteger_XII_12() {
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
	public void convertToInteger_XIII_13() {
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
	public void convertToInteger_XIV_14() {
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
	public void convertToInteger_XV_15() {
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
	public void convertToInteger_VX_Invalid() {
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
	public void convertToInteger_LX_60() {
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
	public void convertToInteger_LXX_70() {
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
	public void convertToInteger_LXXX_80() {
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
	public void convertToInteger_DC_600() {
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
	public void convertToInteger_DCC_700() {
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
	public void convertToInteger_DCCC_800() {
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
	
	//Invalid test cases  
	
	@Test
	public void convertToInteger_LD_Invalid() {
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
	public void convertToInteger_VM_Invalid() {
		//Arrange
		String romanNum= "VM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_DM_Invalid() {
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
	public void convertToInteger_LM_Invalid() {
		//Arrange
		String romanNum= "LM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_VL_Invalid() {
		//Arrange
		String romanNum= "VL";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_VD_Invalid() {
		//Arrange
		String romanNum= "VD";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	
	//random roman numerals test cases  
	
	@Test
	public void convertToInteger_CCLXXXIX_289() {
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
	public void convertToInteger_MMMDXLVIII_3548() {
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
	public void convertToInteger_MMMDCCCLXXVIII_3878() {
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
	
	@Test
	public void convertToInteger_XIVMM_Invalid() {
		//Arrange
		String romanNum= "XIVMM";
		RomanNumerals romanNumeral = new RomanNumerals();
		int result; 
		int expectedResult = 0;
		
		//Act
		result = romanNumeral.convertToInteger(romanNum); 
		
		//Assert
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void convertToInteger_MCMLXXXIV_1984() {
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
	public void convertToInteger_MMXIV_2014() {
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

}
