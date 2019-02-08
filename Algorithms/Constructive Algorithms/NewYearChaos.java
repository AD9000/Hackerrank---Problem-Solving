// Author: Atharv Damle
// Calculate the number of bribes exchanged in order to switch places and for the queue to reach the current position.
// Full Question: https://www.hackerrank.com/challenges/new-year-chaos/problem

import java.util.*;
public class NewYearChaos {

    static void swap(int q[], int a, int b)
    {
        int temp = q[a];
        q[a] = q[b];
        q[b] = temp;
    }
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        // Logic: No person can be more than 2 positions ahead of their
        // position as they can only bribe 2 people at max
        // So look for the people in two positions ahead of their current one!
        int bribes = 0;
        int check = 0;
        for (int i = q.length - 1; i >= 0; i--)
        {
            // Say q[4] != 5
            if (q[i] != (i+1))
            {
                if ((i - 1) >= 0 && q[i - 1] == (i+1))
                {
                    int temp = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = temp;
                    
                    bribes++;
                }
                else if ((i - 2) >= 0 && q[i - 2] == (i+1))
                {
                    // move it forward!
                    int temp = q[i - 2];
                    q[i - 2] = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = i+1;
                    
                    bribes += 2;
                }
                else
                {
                    check = 1;
                }
            }
        }
        
        if (check == 0)
        {
            System.out.println(bribes);
        }
        else
        {
            System.out.println("Too chaotic");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            int[] q = new int[n];
            
            scanner.nextLine();
            String[] qItems = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
