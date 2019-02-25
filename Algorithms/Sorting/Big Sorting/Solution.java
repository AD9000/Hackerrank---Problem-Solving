// Author: Atharv Damle
// To sort big numbers that do not fit in the long (or even unsigned long long for c) data type.
// Full Question: https://www.hackerrank.com/challenges/big-sorting/problem

import java.io.*;
import java.util.*;

// Before Starting, lets note one thing. There is no point in actually implementing a sorting
// algorithm because the one used in the standard libraries is way more efficient than anything
// that can be implemented by us.
// Unless that is what you want to practice.
// Here I have used Arrays.sort()

// Logic: Sort the array using a custom Comparator for Strings and the Arrays.sort() method.

public class Solution {

    static String[] bigSorting(String[] unsorted) {
        /*
        // Here I was trying to use BigInteger class to do the same
        // Job. It worked, but was too slow and caused a timeout.
        BigInteger b[] = new BigInteger[unsorted.length];
        for (int i = 0; i < unsorted.length; i++)
        {
            b[i] = new BigInteger(unsorted[i]);
        }
        Arrays.sort(b, new Comparator<BigInteger>() {
            public int compare(BigInteger a, BigInteger b)
            {
                return a.compareTo(b);
            }
        });
        return b;
        */
        
        // Sort the numbers as String. For comparison, use the function compareStrings()
        Arrays.sort(unsorted, new Comparator<String>(){
            public int compare(String a, String b)
            {
                return compareStrings(a, b);
            }
        });
        return unsorted;
        
    }
    
    // Function is used to compare large numbers. (which have to be stored as Strings)
    static int compareStrings(String a, String b)
    {
        // If the lengths of the strings are same than
        // the numbers behave like strings and can be 
        // compared the same way
        if (a.length() == b.length())
        {          
            return a.compareTo(b);
        }
        // If the lengths of the numbers differ, the number
        // with the greater length is greater.
        else
        {
            return (a.length() > b.length()) ? 1 : -1;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // BufferedReader is used as it is faster than Scanner
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int n = Integer.parseInt(in.readLine());

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = in.readLine();
        }
        
        // Call the function.
        String[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }
/*
        // Helper code for the BigInteger implementation.
        BigInteger[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i].toString());

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }
*/
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
