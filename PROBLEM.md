## Problem Statement: Check whether a number is palindrome

**Given a number find whether it is a palindrome using do-while loop and BigInteger**

**This exercise contains a class named Palindrome with the following methods:**

    +palindromeValidator(BigInteger) : String  
             - Should take a BigInteger value as input and return a string
             - All operations should be done as BigInteger do not cast to primitive datatypes
             - Should return error string when value is single digit or negative value
--------------------------------------------------------
    +getValue() : void
             - Should get input from the console
             - Should return error string when input has decimal,character or empty
             - Should pass the input as BigInteger to method palindromeValidator   
--------------------------------------------------------
    +outputPrinter(String) : void
             - Should pass the input to inputValidator and print error string when return value from inputValidator is true
             - Should pass the input as BigInteger to method palindromeValidator and print the return value       
--------------------------------------------------------
    +inputValidator(String) : boolean
             - Should check whether input has decimal,character or isEmpty and return a boolean value


## Example
    Sample Input:
    Enter the Number:
    99999999999523989457200275498932599999999999
    
    Expected Output:
    99999999999523989457200275498932599999999999 is a palindrome
--------------------------------------------------------
    Sample Input:
    Enter the Number:
    -121
    
    Expected Output:
    Wrong input, give proper positive integer
--------------------------------------------------------
    Sample Input:
    Enter the Number:
    a1111
    
    Expected Output:
    Wrong input, give proper positive integer
--------------------------------------------------------
    Sample Input:
    Enter the Number:
    1
    
    Expected Output:
    The integer have to be at least a two digit positive integer

## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding