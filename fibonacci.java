//import java.util.Scanner;

import java.util.*;

class fib1{
	
	public static void main(String args[])
	{
		int s;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter the number for calculating its Fibonacci output: \n");
	      s = in.nextInt();
		
		System.out.printf("Fibonacci result for %d is %d",s,calc_fib(s));
		
	}
	
	public static int calc_fib(int n)
	{
		
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else 
		{
			return calc_fib(n-1) + calc_fib(n-2);
			
			
		}
		
		
	}
	
}