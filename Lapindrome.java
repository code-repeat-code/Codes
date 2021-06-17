import java.util.*;
import java.lang.*;
class Lapindrome
{
	public static void main (String[] args)
	{
		    
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of test cases:: ");
			int t = sc.nextInt();
			while(t!=0)
			{
		    System.out.print("Enter the string to check it is lapindrome or not:: ");
		    String str = sc.next();
		    String substr1,substr2;
			boolean islapin = true;
		    int length = str.length();
			if(length%2==0)
			{
		    substr1 = str.substring(0,length/2);
		    substr2 = str.substring(length/2,length);
			}
			else
		    {
			  substr1 = str.substring(0,length/2);
		      substr2 = str.substring(length/2+1,length);
			}	
			char ch1[] = substr1.toCharArray();
			char ch2[] = substr2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
	        for(int i = 0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
						islapin = true;
				}
				else
				{
					islapin = false;
					break;
				}
			}
			if(islapin==true)
			{
				System.out.println("YES! String is Lapindrome");
			}
			else
			{
				System.out.println("NO! String is not Lapindrome");
			}
			t--;
			}    
	}
}
