/* Brief calculator example using 
 * if/else if block
 * also with a switch
 *
 * The calculator function takes 3 arguments -  
 * the operator and 2 integers.
 *
 * It is currently not configured to take user input.
 *
 * This is a basic illustration of how to create and 
 * call a function and pass it arguments. 
 *
 *
 *
 */

public class Calculator
{
	public static void main (String[] args) 
	{
        // call the function
        // pass it the arguments
        // print it to the console
		System.out.println(calculator("*", 5, 10));
	}
	
	public static int calculator(String op, int x, int y)
    {	    
	    if(op == "+"){
	        return x + y;
	    }else if(op == "-"){
	        return x - y;
	    }else if (op == "*"){
	        return x * y;
	    }else if(op =="/"){
	        return x / y;
	    }else {
	        return 0;
	    }
	}
    
/* 
switchCalc is not functional right now. 

public static int switchCalc(String op, int x, int y)
    {
        switch (op) {
            case "+":
                return x + y;
            break;
            case "-":
                return x - y;
            break;
            case "*":
                return x * y;
            break;
            case "/":
                return x / y;
            break;
            default: System.out.println("No math for you!");
        }
    }*/
}
