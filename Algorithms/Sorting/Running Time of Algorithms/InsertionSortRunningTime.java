// Author: Atharv Damle
// Function to measure the number of numbers shifted while sorting using insertion sort.
// Full Question: https://www.hackerrank.com/challenges/encryption/problem

static int runningTime(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length - 1; i++) {
        int j = i;
        if (arr[j + 1] < arr[j]) {
            int x = arr[j + 1];
            while (j >= 0 && x < arr[j]) {
                arr[j + 1] = arr[j];
                count++;
                j--;
            }
            arr[j + 1] = x;
        }
    }
    return count;
}
