// Author: Atharv Damle
// Function to count the number of times each element occurs in the array - Step 1 of counting sort.
// Full Question: https://www.hackerrank.com/challenges/countingsort1/problem


int* countingSort(int arr_count, int* arr, int* result_count) {

    // Create new array and set it to zero (could have used memset)
    int *result = malloc (MAX_NUMBER * sizeof(int));
    for (int i = 0; i < MAX_NUMBER; i++)
    {
        result[i] = 0;
    }
    
    // Count the frequency of each element
    for (int i = 0; i < arr_count; i++)
    {
        result[arr[i]]++;
    }
    
    // Set the size of the new array
    *result_count = MAX_NUMBER;
    return result;
}
