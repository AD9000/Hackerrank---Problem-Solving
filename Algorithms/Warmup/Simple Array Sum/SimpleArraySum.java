// Author: Atharv Damle
// Function to calculate the sum of an array
// Full Question: https://www.hackerrank.com/challenges/simple-array-sum/problem

static int simpleArraySum(int[] ar) {

    int sum = 0;
    for (int i = 0; i < ar.length; i++)
    {
        sum += ar[i];
    }
    return sum;

}
