// Author: Atharv Damle
// Function to implement step 1 of quicksort - partitioning the array into 3 parts - choosing a middle element (pivot),
// A part smaller than pivot, one part equal and the last part greater than pivot.
// Full Question: https://www.hackerrank.com/challenges/quicksort1/problem

static int[] quickSort(int[] arr) {
    //partition
    int pivot = arr[0];

    // Put pivot at the end.
    arr[0] = arr[arr.length - 1];
    arr[arr.length - 1] = pivot;

    int low = 0;
    
    // Arrange - swap if the element is less than pivot.
    for (int i = 0; i < arr.length; i++)
    {
        // swap
        if (arr[i] < pivot)
        {
            int temp = arr[i];
            arr[i] = arr[low];
            arr[low] = temp;
            low++;
        }
    }
    arr[arr.length - 1] = arr[low];
    arr[low] = pivot;

    return arr;
}
