//First and last occurance in 
import java.lang.*;
class BinaryFirstLastOccurance
{
	static int firstOccur(int arr[],int target,int start,int end)
	{
		int res = -1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid] == target)
			{
				res = mid;
				end = mid-1;
			}
			else if (target>arr[mid])
			{
				start = mid+1;
			}
			else {end = mid-1;}	
		}
		if(res>=0)
		return res;
		else
		return res;
	}
	static int lastOccur(int arr[],int target,int start,int end)
	{
		int res = -1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid] == target)
			{
				res = mid;
				start = mid+1;
			}
			else if (target>arr[mid])
			{
				start = mid+1;
			}
			else {end = mid-1;}	
		}
		
		if(res>=0)
		return res;
		else
		return res;
	}
	
	public static void main(String args[])
	{
	    int arr[] = {1,2,2,2,3,4,5,6};
		int target =7;
		int start =0;
		int end = arr.length-1;
		int arr2[] = {-1,-1};
		arr2[0] = firstOccur(arr,target,start,end);		
		arr2[1] = lastOccur(arr,target,start,end);		
		System.out.println(arr2[0]+" "+arr2[1]);

	}
}