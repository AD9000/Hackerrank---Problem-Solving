// Author: Atharv Damle
// To sum an array of large numbers.
// Full Question: https://www.hackerrank.com/challenges/a-very-big-sum/problem

static long aVeryBigSum(long[] ar) {

    long sum = 0;
    //Extract and add
    for (int i = 0; i < ar.length; i++)
    {
        sum += ar[i];
    }

    return sum;
}
