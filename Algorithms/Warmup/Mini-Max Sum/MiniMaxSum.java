// Author: Atharv Damle
// Function to calculate the minimum and maximum sum of an array of n elements by adding only n - 1 elements 
// Full Question: https://www.hackerrank.com/challenges/encryption/problem

static void miniMaxSum(int[] arr) {

    // Logic: Find the maximum and minimum number in the array.
    // The min cannot be in the max sum and the max number cannot be in the min sum
    long maxsum = 0;
    long minsum = 0;
    int max = 0;
    int min = 0;

    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] > arr[max])
        {
            max = i;
        }
        if (arr[i] < arr[min])
        {
            min = i;
        }
    }

    for (int i = 0; i < arr.length; i++)
    {
        if (i != min)
        {
            maxsum += arr[i];
        }
        if (i != max)
        {
            minsum += arr[i];
        }
    }

    System.out.println(minsum + " " + maxsum);
}
