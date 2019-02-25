// Author: Atharv Damle
// Search for a number in the array.
// Full Question: https://www.hackerrank.com/challenges/tutorial-intro/problem

// Logic: Since the array is sorted, binary search can be used to solve the problem in O(log n) complexity.
static int introTutorial(int V, int[] arr) {
    // Divide the array into two and check which side V could exist in.
    int low = 0;
    int high = arr.length;

    while (low <= high)
    {
        int mid = (low + high)/2;
        if (arr[mid] == V)
        {
            return 1;
        }
        else if (V < arr[mid])
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    }
    return -1;
}
      

/*
    // Linear Search: O(n) complexity.
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] == V)
        {
            return i;
        }
    }
    return -1;
*/
}
