import java.util.*;
import java.lang.*;
import java.io.*;
class Trianglesum
{
	public static void main (String[] args)
	{
		
		System.out.println("Program to find the largest sum of the numbers formed by the triangled by traversing with in the given path");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of testcases:: ");
		   int t = sc.nextInt();
		   while(t-->0)
		   {
		      System.out.println("Enter the height of the triangle:: ");
			  int height = sc.nextInt();
		      int arr[][] = new int[height][height];
			  System.out.println("Enter the numbers to make the triangle:: ");
			  //For first line one number for second two and for third three numbers and so on........
		      for(int row = 0;row<height;row++)
		      {
		          for(int col = 0;col<row+1;col++)
		          {
		              arr[row][col] = sc.nextInt();
		          }
		      }
		       for(int row = height-2;row>=0;row--)
		      {
		          for(int col = 0;col<row+1;col++)
		          {
		              arr[row][col] += Collections.max(Arrays.asList(arr[row+1][col],arr[row+1][col+1]));
		          }
		      }
			  System.out.println("The largest sum of the path is :: ");
		      System.out.println(arr[0][0]);
		   }
	}
}
