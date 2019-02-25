// Author: Atharv Damle
// Function to count the number of times each element occurs in the array - Step 1 of counting sort.
// Full Question: https://www.hackerrank.com/challenges/countingsort1/problem

static int[] countingSort(int[] arr) {
    int count[] = new int[100];
    for (int i = 0; i < arr.length; i++)
    {
        count[arr[i]]++;
    }

    return count;
}
