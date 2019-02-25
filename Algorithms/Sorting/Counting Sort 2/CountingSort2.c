// Author: Atharv Damle
// Function to sort input using counting sort
// Full Question: https://www.hackerrank.com/challenges/countingsort2/problem

#define MAX_NUMBER 100

int* countingSort(int arr_count, int* arr, int* result_count) {

    // Create array of size 100 and set it to zero
    int *result = malloc (MAX_NUMBER * sizeof(int));
    for (int i = 0; i < MAX_NUMBER; i++)
    {
        result[i] = 0;
    }
    
    // Count frequency of each of the numbers
    for (int i = 0; i < arr_count; i++)
    {
        result[arr[i]]++;
    }
    
    // Rearrange the numbers in the increasing order of their
    // existence in the frequency array.
    int x = 0;
    for (int i = 0; i < MAX_NUMBER; i++)
    {
        while (result[i] != 0)
        {
            arr[x] = i;
            result[i]--;
            x++;
        }
    }
    
    // Set the size of the array
    *result_count = x;
    return arr;
}
