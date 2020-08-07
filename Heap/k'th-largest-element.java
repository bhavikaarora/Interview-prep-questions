/*  GFG  https://practice.geeksforgeeks.org/problems/k-largest-elements/0

Given an array of N positive integers, print k largest elements from the array.  The output elements should be printed in decreasing order.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N and k, N is the size of array and K is the largest elements to be returned. The second line of each test case contains N input C[i].

Output:
Print the k largest element in descending order. */




import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t>0){
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }  
	  PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());// By default Priority Queue defines a Min Heap so for creating a Max Heap use Collections.reverseOrder()
	     for(int i=0;i<n;i++) //Add the elements of array to Max Heap
	         maxheap.add(arr[i]);
	     for(int i=0;i<k;i++)
	        System.out.print(maxheap.poll()+" "); 
	     System.out.println();
	     t--; 
	}
	}
}
