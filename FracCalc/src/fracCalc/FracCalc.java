
package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner input = new Scanner(System.in);
    	String inputAns = input.next();
    	String inputAnswer = inputAns.trim();
    	produceAnswer(inputAnswer);
    	if (inputAnswer == "quit")
    	{
    		
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
        for (int i = 0; i < 4; i+=2)
        {
        }
        if (values[1] == "+")
        {
        	sum();
        }
        else if (values[1] == "-")
        {
        	subtract();
        }
        else if (values[1] == "*")
        {
        	product();
        }
        else
        {
        	divide();
        }	
        return "";
    }
   
    // TODO: Fill in the space below with any helper methods that you think you will need
    public static void sum(int x, int y)
    {
     
    }
    public static void subtract(int x, int y)
    {
    	
    }
    public static void product(int x, int y)
    {
    	
    }
    public static void divide(int x, int y)
    {
    	
    }
    public static String toImproperFrac(int x, int y, int z) {
		return ((z * x) + y) + "/" + z;
    }
    public static String toMixedNum(int x, int y){
		if (x % y != 0)
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
}
