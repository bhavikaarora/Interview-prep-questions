
/*
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included. Write a program to find Nth Ugly Number.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. For each testcase there is one line of input that contains the number N.

Output:
Print the Nth Ugly Number.

Constraints:
1 ≤ T ≤ 104
1 ≤ N ≤ 104

Example:
Input:
2
10
4
Output:
12
4
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    long ans[] = new long[10001];
    ans[0] = 1;
    int v2=0, v3=0, v5=0;
    long n2, n3, n5;
    for(int i=1;i<10001;i++){
        
       n2 = (long)(ans[v2]*2);
       n3 = (long)(ans[v3]*3);
       n5 = (long)(ans[v5]*5);
        
        ans[i] = Math.min(n2,Math.min(n3,n5));
             
        if(ans[i]==n2) v2++;
        if(ans[i]==n3) v3++;
        if(ans[i]==n5) v5++;
    }
    
    while(t>0){
         int n = sc.nextInt();
         System.out.println(ans[n-1]);
         t--;
     }
	}
}
    
