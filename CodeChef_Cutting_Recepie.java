import java.util.*;
class Codechef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t-->0)
		{
		int n = sc.nextInt();
		int gcd = 1;
		Integer arr[] = new Integer[n];
		Integer arr2[] = new Integer[arr.length];
		for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
		for(int i = 0;i < n;i++) arr2[i] = arr[i];
		for(int i = 0;i < n-1;i++)
		{
			int min = Collections.min(Arrays.asList(arr[i],arr[i+1]));
			for(int j = 1;j<=min;j++)
			{
				if(arr2[i] % j ==0 && arr2[i+1] % j ==0)
				{
					gcd = j;
				}
			}
			arr2[i+1] = gcd;
		}
		for(int i = 0 ;i<n;i++)
		{
			System.out.print(arr[i]/gcd+" ");
		}
		System.out.println();
		}
	}
}
		
		