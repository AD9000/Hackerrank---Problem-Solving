// Author: Atharv Damle
// Function to calculate the absolute difference between the sums of diagonals of a matrix.
// Full Question: https://www.hackerrank.com/challenges/diagonal-difference/problem

static int diagonalDifference(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
    {
        // Add the left diagonal
        sum += arr[i][i];
        
        // Subtract the right diagonal
        sum -= arr[i][arr.length - 1 - i];
    }
    return Math.abs(sum);
}
