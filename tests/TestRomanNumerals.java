import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_CreateRomanNumeral() {
		RomanNumerals converter = new RomanNumerals();
		
		assertNotNull(converter);
	}
	
	@Test
	public void test_RomanI() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("I");
		
		assertEquals(1, arabicInteger);
	}
	
	@Test
	public void test_RomanV() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("V");
		
		assertEquals(5, arabicInteger);
	}
	
	@Test
	public void test_RomanII() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("II");
		
		assertEquals(2, arabicInteger);
	}
	
	@Test
	public void test_RomanX() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("X");
		
		assertEquals(10, arabicInteger);
		
	}
	
	@Test
	public void test_RomanL() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("L");
		
		assertEquals(50, arabicInteger);
		
	}

	@Test
	public void test_RomanC() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("C");
		
		assertEquals(100, arabicInteger);
		
	}

	@Test
	public void test_RomanD() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("D");
		
		assertEquals(500, arabicInteger);
	}
	
	@Test
	public void test_RomanM() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("M");
		
		assertEquals(1000, arabicInteger);
		
	}
	
	@Test
	public void test_RomanIV() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("IV");
		
		assertEquals(4, arabicInteger);
	}
	
	@Test
	public void test_RomanIX(){
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("IX");
		
		assertEquals(9, arabicInteger);
	}
	
	@Test
	public void test_RomanMCMLXXXIV() {
		RomanNumerals converter = new RomanNumerals();
		
		int arabicInteger = converter.convertToInteger("MCMLXXXIV");
		
		assertEquals(1984, arabicInteger);
	}
	

}
