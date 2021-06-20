import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try 
		{
		    int t = sc.nextInt();
		    while(t-->0)
		    {
		        int x1,x2,y1,y2,z1,z2;
		        x1 = sc.nextInt();
		        x2 = sc.nextInt();
		        y1 = sc.nextInt();
		        y2 = sc.nextInt();
		        z1 = sc.nextInt();
		        z2 = sc.nextInt();
		        if(x2>=x1 && y2>=y1 && z1>=z2)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    
		} catch(Exception e) {
		    return;
		}
	}
}
