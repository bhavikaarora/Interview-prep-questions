/*
https://practice.geeksforgeeks.org/problems/find-median-in-a-stream/0
Given an input stream of N integers. The task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of X to the new stream.

Input:
The first line of input contains an integer N denoting the number of elements in the stream. Then the next N lines contains integer x denoting the number to be inserted into the stream.
Output:
For each element added to the stream print the floor of the new median in a new line.
 
Constraints:
1 <= N <= 106
1 <= x <= 106
 
Example:
Input:
4
5
15
1 
3
Output:
5
10
5
4
*/




import java.util.*;
import java.lang.*;
import java.io.*;
class main
 {
	public static void main (String[] args)
	 {
	 
	 Scanner sc=new Scanner(System.in);
	
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     for(int i=0;i<n;i++)
	        a[i] = sc.nextInt();
	    
	     PriorityQueue<Integer> minheap=new PriorityQueue<>(); //minheap for upper part of numbers (bigger numbers)
	                                                            //as we need the minimum number from this set
	     PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());//maxheap for lower part of numbers (lesser numbers)
	                                                                            //as we need the maximum number from this set for the median
	     int median[] = new int[n];
	     for(int i=0;i<n;i++){
	         int x = a[i];
	         
	         //adding numbers in the heaps
	         minheap.add(x);
             maxheap.add(minheap.remove());

            if (minheap.size() < maxheap.size()) {
                minheap.add(maxheap.remove());
            }
	  
	         //calculating median 
	         if(minheap.size()>maxheap.size()) 
	            median[i] = minheap.peek();
	         else 
	            median[i] = (minheap.peek()+maxheap.peek())/2;
	            
	        System.out.println(median[i]);
	     }
	 }
 }
 
 
