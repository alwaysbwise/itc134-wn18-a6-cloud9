/* Quickly written calculator example using if/else if 

*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//Scanner console = new Scanner(System.in);
		int z = calculator("*", 5, 10);
		System.out.println(z);
		
	}
	
	public static int calculator(String op, int x, int y){
	    int z = 0;
	    
	    if(op == "+"){
	        z = x + y;
	        return z;
	    }else if(op == "-"){
	        z = x - y;
	        return z;
	    }else if (op == "*"){
	        z = x * y;
	        return z;
	    }else if(op =="/"){
	        z = x / y;
	        return z;
	    }else {
	        return 0;
	    }
	   }
}
