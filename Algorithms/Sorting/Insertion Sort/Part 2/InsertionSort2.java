// Author: Atharv Damle
// Function to sort an array using insertion sort.
// Full Question: https://www.hackerrank.com/challenges/insertionsort2/problem

// Helper function to print an array
static void printArray(int[] arr)
{
    for (int i = 0; i < arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

// Sort an array using insertion sort, and print array at every pass
// (once an element is inserted)
static void insertionSort2(int n, int[] arr) {
    for (int i = 0; i < n - 1; i++)
    {
        int j = i;
        if (arr[j + 1] < arr[j])
        {
            int x = arr[j + 1];
            while (j >= 0 && x < arr[j])
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }
        printArray(arr);
    }
}
