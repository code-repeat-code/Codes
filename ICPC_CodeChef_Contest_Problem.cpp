/* Chef is participating in an ICPC regional contest, in which there is a total of N problems (numbered 1 through N) with varying difficulties. 
For each valid i, the i-th easiest problem is problem Ai.
After a team solves a problem, a balloon with a colour representing that problem is tied next to their desk. Chef is fond of colours in VIBGYOR, 
which are representative of the problems with numbers 1 through 7. The remaining problems have their own representative colours too.
Find the minimum number of problems which Chef's team needs to solve in order to get all the balloons for problems 1 through 7 
(and possibly some other balloons too) tied next to their desk, if you know that Chef's team knows the difficulties of all 
problems and solves the problems in increasing order of difficulty.*/
#include <iostream>
using namespace std;
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n,last;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    for(int i = 0;i<n;i++)
	    {
	        if(arr[i]<=7)
	        {
	            last = i;
	        }
	    }
	    cout<<last+1<<endl;
	}
	return 0;
}
