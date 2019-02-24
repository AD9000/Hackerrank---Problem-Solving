// Author: Atharv Damle
// To encrypt an input using a matrix. Size of matrix = square root of the size of input.
// Full Question: https://www.hackerrank.com/challenges/encryption/problem

import java.io.*;
import java.util.*;

public class Solution {

    static String encryption(String s) {
        s = s.replaceAll("\\s", "");
        
        int l = s.length();
        // x represents the number of rows.
        int x = (int) Math.sqrt(l);
        
        // The matrix
        char a[][];
        
        // Number of columns in matrix.
        int c = 0;
        
        // If the size is a perfect square...
        if (x * x == l) 
        {
            a = new char[x][x];
            c = x;
        }
        else 
        {
            c = x + 1;
            // If the input does not fit in
            // a matrix of size x * c...
            if (c * x < l) {
                x++;
            }
            a = new char[x][c];
        }

        // Creating the transpose of the matrix without 
        // storing the input in the original order by
        // inputting columnwise (ie vertically into the matrix)
        int p = 0;
        int q = 0;
        for (int i = 0; i < l; i++) 
        {
            a[p][q] = s.charAt(i);
            q++;
            
            if (q == c) 
            {
                q = 0;
                p++;
            }
        }
        
        // Make the matrix into a string with
        // equal size words.
        s = "";
        for (int i = 0; i < c; i++) 
        {
            for (int j = 0; j < x; j++) 
            {
                // In case any empty element has a garbage value...
                if (Character.isLetter(a[j][i]))
                {
                    s += a[j][i];
                }
            }
            s += " ";
        }

        return s;
    }
    
    public static void main(String[] args) throws IOException 
    {
        BufferedWriter b = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // Measuring time.
        long t = System.nanoTime();
        
        // Calling the function
        String result = encryption(s);
        
        // Elapsed time...
        System.out.println("Elapsed: " + (System.nanoTime() - t) + "ns");// * Math.pow(10, -9) + "s");
        
        b.write(result);
        b.newLine();

        b.close();

        sc.close();
    }
}
