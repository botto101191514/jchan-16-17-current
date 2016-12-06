package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	int inputNums = 1;
    	while (inputNums < inputNums + 1)
    	{
    		System.out.println("please enter an equation in the form of: x + y");
    		Scanner input = new Scanner(System.in);
    		String inputAns = input.next();
    		String inputAnswer = inputAns.trim();
    		if (inputAnswer.indexOf(" ") < 0)
    		{
    			System.out.println("thats an invalid equation");
    		}
    		produceAnswer(inputAnswer);
    		if (inputAns == "quit")
    		{
    			input.close();
    			System.exit(0);
    		}
    	}
    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] values = input.split(" ");
        String values1 = values[0].toString();
        String values2 = values[2].toString();
        String frac1 = parseFrac(values1);
        String frac2 = parseFrac(values2);
        if (values[1] == "+")
        {
        	sum(frac1, frac2);
        	
        }
        else if (values[1] == "-")
        {
        	 diff(frac1, frac2);
        	
        }
        else if (values[1] == "*")
        {
        	 product(frac1, frac2);
        	
        }
        else if (values[1] == "/")
        {
        	divide(frac1, frac2);
        	
        }
        else 
        {
        	System.out.println("invalid input");
        }
        return "";
    }
   
    // TODO: Fill in the space below with any helper methods that you think you will need
   
    public static String sum(String x, String y)
    {
    	int denom1 = getDenom(x);
    	int numer1 = getNumer(x);
    	int denom2 = getDenom(y);
    	int numer2 = getNumer(y);
    	if (denom1 != denom2)
    	{
    		numer1 = numer1 * denom2;
    		numer2 = numer2 * denom2;
    		int denom = denom1 * denom2;
    		int numer = numer1 + numer2;
    		String sum = numer + "/" + denom;
    		String negSum = "-" + absValue(numer) + "/" + absValue(denom);
    		if (numer > 0 && denom > 0)
    		{
    			return sum;
    		}
    		else if (numer < 0 && denom > 0)
    		{
    			return negSum;
    		}
    		else if (numer > 0 && denom < 0)
    		{
    			return negSum;
    		}
    		else
    		{
    			return sum;
    		}
    	}
    	else
    	{
    		int numer = numer1 + numer2;
    		String sum = numer + "/" + denom1;
    		String negSum = "-" + absValue(numer) + "/" + absValue(denom1);
    		if (numer > 0 && denom1 > 0)
    		{
    			return sum;
    		}
    		else if (numer < 0 && denom1 > 0)
    		{
    			return negSum;
    		}
    		else if (numer > 0 && denom1 < 0)
    		{
    			return negSum;
    		}
    		else
    		{
    			return sum;
    		}
    	}
    }
 
    public static String diff(String x, String y)
    {
    	int denom1 = getDenom(x);
    	int numer1 = getNumer(x);
    	int denom2 = getDenom(y);
    	int numer2 = getNumer(y);
    	if (denom1 != denom2)
    	{
    		numer1 = numer1 * denom2;
    		numer2 = numer2 * denom2;
    		int denom = denom1 * denom2;
    		int numer = numer1 - numer2;
    		String diff = numer + "/" + denom;
    		String negDiff = "-" + absValue(numer) + "/" + absValue(denom);
    		if (numer > 0 && denom > 0)
    		{
    			return diff;
    		}
    		else if (numer < 0 && denom > 0)
    		{
    			return negDiff;
    		}
    		else if (numer > 0 && denom < 0)
    		{
    			return negDiff;
    		}
    		else
    		{
    			return diff;
    		}
    	}
    	else
    	{
    		int numer = numer1 - numer2;
    		String diff = numer + "/" + denom1;
    		String negDiff = "-" + absValue(numer) + "/" + absValue(denom1);
    		if (numer > 0 && denom1 > 0)
    		{
    			return diff;
    		}
    		else if (numer < 0 && denom1 > 0)
    		{
    			return negDiff;
    		}
    		else if (numer > 0 && denom1 < 0)
    		{
    			return negDiff;
    		}
    		else
    		{
    			return diff;
    		}
    	}
    }
    
    public static String product(String x, String y)
    {
    	int denom1 = getDenom(x);
    	int numer1 = getNumer(x);
    	int denom2 = getDenom(y);
    	int numer2 = getNumer(y);
    	int denom = denom1 * denom2;
    	int numer = numer1 * numer2;
    	String negProduct = "-" + numer + "/" + denom;
    	String posProduct = numer + "/" + denom;
    	if (denom > 0 && numer < 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		return negProduct;
    	}
    	else if (denom < 0 && numer > 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		return negProduct;
    	}
    	else if (denom1 < 0 && numer1 < 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		
    		return posProduct;
    	}
    	else
    	{
    		return posProduct;
    	}
    	
    }
    
    public static String divide(String x, String y)
    {
    	int denom1 = getDenom(x);
    	int numer1 = getNumer(x);
    	int denom2 = getDenom(y);
    	int numer2 = getNumer(y);
    	int placeholder = numer2;
    	numer2 = denom2;
    	denom2 = placeholder;
    	int denom = denom1 * denom2;
    	int numer = numer1 * numer2;
    	String negDiv = "-" + numer + "/" + denom;
    	String posDiv = numer + "/" + denom;
    	if (denom > 0 && numer < 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		return negDiv;
    	}
    	else if (denom < 0 && numer > 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		return negDiv;
    	}
    	else if (denom1 < 0 && numer1 < 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		
    		return posDiv;
    	}
    	else
    	{
    		return posDiv;
    	}
    	
    }
    
    
    public static String parseFrac(String fraction)
    {
    	int denominator = getDenom(fraction);
    	int numerator = getNumer(fraction);
    	int whole = getNumer(fraction);
    	if (denominator == 0)
    	{
    		System.out.println("ERROR: denominators != 0");
    	}
    	else if (denominator == 1)
    	{
    		numerator = whole + numerator;
    	}
    	else if (whole > 0)
    	{
    		String newImproperFrac = toImproperfraction(whole, numerator, denominator);
    		parseFrac(newImproperFrac);
    	}
    	return (numerator + "/" + denominator);
    }
    
    public static int absValue (int x){
		if (x > 0)
		{
			return x;
		}
		else 
		{
			return  x * (-1);
		}
	}
	public static int getWhole(String fraction)
	{
		int whole = Integer.valueOf(fraction.substring(fraction.indexOf("_") - 1));
		return whole;
	}
	public static int getNumer(String fraction)
	{
		int numerator = Integer.valueOf(fraction.substring(fraction.indexOf("/") - 1));
		return numerator;
	}
	public static int getDenom(String fraction)
	{
		int denominator = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
		return denominator;
	}
	public static String toMixedNum(int x, int y){
		if (x % y != 0 && x > y)
		{
			return ((x / y) + "_" + (x % y) + "/" + y );
		}
		else
		{
			int divide = x / y;
			String ans = String.valueOf(divide);
			return ans;
		}
	}
    
    public static String toImproperfraction(int x, int y, int z) 
    {
		return ((z * x) + y) + "/" + z;
    }
}
