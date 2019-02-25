// Author: Atharv Damle
// Function to perform the first step in insertion sort - Inserting an element into a sorted list.
// (The list remains sorted to the left of the element to be inserted)
// Full Question: https://www.hackerrank.com/challenges/insertionsort1/problem

// Helper function to print the array.
static void printArray(int[] arr)
{
    for (int i = 0; i < arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

// Add the element and print the array at each step.
static void insertionSort1(int n, int[] arr) {
    for (int i = n - 2; i >= 0; i--)
    {
        int j = i;
        if (arr[j + 1] < arr[j])
        {
            int x = arr[j + 1];
            while (j >= 0 && x < arr[j])
            {
                arr[j + 1] = arr[j];
                printArray(arr);
                j--;
            }
            arr[j + 1] = x;
        }
        i--;
    }
    printArray(arr);
}
