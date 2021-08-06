/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static long gcd(long x,long y)
	{
	    if(x==0)
	    return y;
	    else
	    return gcd(y%x,x);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    long a = sc.nextInt();
		    long b = sc.nextInt();
		    //gcd lcm
		    long gc = gcd(a,b);
		    long lcm = (a*b)/gc;
		    System.out.println(gc+" "+lcm);
		    
		    
		}
	}
}
