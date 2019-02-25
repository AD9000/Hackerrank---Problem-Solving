// Author: Atharv Damle
// To use the loop invariant to prove correctness of the insertion sort algorithm
// Full Question: https://www.hackerrank.com/challenges/correctness-invariant/problem

import java.io.*;
import java.util.*;

// The Insertion sort, albeit slow, works. But how does one know that it will always work?
// Using the loop invariant. or basically, what remains constant throughout the algorithm.
// The invariant for insertion sort is actually a subarray to the left of the current element.
// This array is of length zero for i = 1 and of length n - 1 for i = n.
// If you check each pass of the insertion sort, you would be able to confirm this.
// Since this subarray exists for each pass ie each time i is incremented, Insertion sort is correct.

public class Solution {

    // Sort the array using insertion sort
    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }

    // Helper function to print an array
    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
   
    // Accept input and call function.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}

