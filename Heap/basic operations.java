/* HACKERRANK QHEAP1 
https://www.hackerrank.com/challenges/qheap1/problem

This question is designed to help you get a better understanding of basic heap operations.
You will be given queries of  types:

"1 v" - Add an v element  to the heap.
"2 v" - Delete the element  from the heap.
"3" - Print the minimum of all the elements in the heap.*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> heap=new PriorityQueue<Integer>(); // implementing heap variable
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        while(n-->0)
            {
            int k=ab.nextInt();
             int data;
            switch(k)
                {
                case 1:
                 data=ab.nextInt();
                heap.offer(data); // add data
                break;
                case 2:
                 data=ab.nextInt();
                heap.remove(data);
                break;
                case 3:
                System.out.println(heap.peek());
                break;
            }
        }
    }
}
