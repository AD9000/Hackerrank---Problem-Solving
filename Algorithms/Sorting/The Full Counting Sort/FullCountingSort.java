// Author: Atharv Damle
// To sort the input using counting sort
// Full Question: https://www.hackerrank.com/challenges/countingsort4/problem

import java.io.*;
import java.util.*;

public class FullCountingSort {

    // Helper function to print the list to the screen
    static void printList(List<List<String>> l)
    {
        for (int i = 0; i < l.size(); i++)
        {
            for (int j = 0; j < l.get(i).size(); j++)
            {
                System.out.print(l.get(i).get(j) + " ");
            }
        }
    }
public static void main(String[] args) throws IOException {

        // BufferedReader is faster than Scanner. So it is the best choice.
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        //Scanner b = new Scanner(System.in);

        int n = Integer.parseInt(b.readLine().trim());
        
        // Using StringBuilder instead of String makes a big
        // difference as to append a String to StringBuilder requires only
        // updating values in an array whereas adding/concatenating
        // two Strings requires memory allocation. (Which is slow).
        // Thus, a StringBuilder array implementation is used.
        StringBuilder list[] = new StringBuilder[n];
        
        for (int i = 0; i < n; i++)
        {
            list[i] = new StringBuilder();
        }
        
        // For the first half append only "- " to the respective StringBuilder 
        int m = n/2;
        for (int i = 0; i < m; i++)
        {
            // Accepting a String and splitting it into an
            // Array is much faster than Scanner
            // (Could also use StringTokenizer which is even faster)
            String[] s = b.readLine().split(" ");
            
            list[Integer.parseInt(s[0])].append("- ");
        }
        
        // For the other half, append the String entered.
        for (int i = m; i < n; i++)
        {
            String[] s = b.readLine().split(" ");
            list[Integer.parseInt(s[0])].append(s[1] + " ");
        }
        
        // Print the final solution to stdout
        for (int i = 0; i < n; i++)
        {
            System.out.print(list[i]);
        }

        b.close();
    }
    
    
//                              OTHER IMPLEMENTATIONS AND WHY THEY DID NOT WORK
/*
    // The first implementation which did not work
    // It is correct, but slow
    // Why? At first, I thought that it could be because
    // get() method might be too slow. Instead I would like
    // To use the input directly. (Thats what I tried)
    static void countSort(List<List<String>> arr) {
        int len = arr.size();
        List<List<String>> count = new ArrayList<>(len);

        for (int i = 0; i < len; i++)
        {   
            List<String> tempList = new ArrayList<>();
            count.add(tempList);
        }

        for (int i = 0; i < len/2; i++)
        {
            count.get(Integer.parseInt(arr.get(i).get(0))).add("-");
        }

        for (int i = len/2; i < len; i++)
        {
            List<String> temp = arr.get(i);
            count.get(Integer.parseInt(temp.get(0))).add(temp.get(1));
        }
        printList(count);        
    }
*/

/*
// Second Implementation - Using input directly (int the main() method)
// Made me realize that the main problem was not the ArrayList implementation
// but the ArrayList<String> implementation. Also, Scanner.

        //long l = System.nanoTime();
        Scanner b = new Scanner(System.in);
        int n = b.nextInt();

        List<List<String>> arr = new ArrayList<>();

        // create the list.

        int len = n;
        List<List<String>> count = new ArrayList<>(len);

        for (int i = 0; i < len; i++)
        {   
            List<String> tempList = new ArrayList<>();
            count.add(tempList);
        }

        for (int i = 0; i < len/2; i++)
        {
            count.get(b.nextInt()).add("-");
            b.next();
        }

        for (int i = len/2; i < len; i++)
        {
            //List<String> temp = arr.get(i);
            //String s 
            count.get(b.nextInt()).add(b.next());
        }
        //System.out.println(System.nanoTime() - l);
        printList(count);
*/
    
}
