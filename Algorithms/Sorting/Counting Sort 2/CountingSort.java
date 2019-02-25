/ Author: Atharv Damle
// Function to sort input using counting sort
// Full Question: https://www.hackerrank.com/challenges/countingsort2/problem

static int[] countingSort(int[] arr) {
        
        // Count the frequency of each element.
        int count[] = new int[100];
        for (int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }
        
        // Rearrange the numbers based on their frequency array. (Lowest number * frequency times and so on)
        int p = 0;
        for (int i = 0; i < 100;)
        {
            if (count[i] == 0)
            {
                i++;
            }
            else
            {
                arr[p] = i;
                p++;
                count[i]--;
            }
        }
        return arr;
    }
