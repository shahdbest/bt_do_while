package com.stackroute.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import java.math.BigInteger;

public class PalindromeTests {
    private Palindrome palindrome;
    private String message ="Check the logic in the method palindromeValidator, do not typecast BigInteger to primitive datatypes";

    @BeforeEach
    public void setUp() {
        palindrome = new Palindrome();
    }

    @AfterEach
    public void tearDown() {
        palindrome = null;
    }

    @Test
    public void givenPalindromeBigIntegerThenReturnAStringResult() {
        assertEquals("99999999999523989457200275498932599999999999 is a palindrome", palindrome.palindromeValidator(new BigInteger("99999999999523989457200275498932599999999999")), message);
    }

    @Test
    public void givenNonPalindromeBigIntegerThenReturnAStringResult() {
        assertEquals("99999999999523989457223275498932599999999999 is not a palindrome", palindrome.palindromeValidator(new BigInteger("99999999999523989457223275498932599999999999")), message);
    }

    @Test
    public void givenNegativeBigIntegerThenReturnAStringError() {
        assertEquals("The integer have to be at least a two digit positive integer", palindrome.palindromeValidator(new BigInteger("-123456")), "Check the logic in the method palindromeValidator, negative value should not be accepted");
    }

    @Test
    public void givenSingleDigitBigIntegerThenReturnAStringError() {
        assertEquals("The integer have to be at least a two digit positive integer", palindrome.palindromeValidator(new BigInteger("2")), "Check the logic in the method palindromeValidator, 1-digit value should not be accepted");
    }

}
