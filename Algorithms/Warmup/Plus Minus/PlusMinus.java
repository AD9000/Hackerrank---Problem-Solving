// Author: Atharv Damle
// Function to calculate the fraction of elements of an array that are positive, negative and zero
// Full Question: https://www.hackerrank.com/challenges/plus-minus/problem

static void plusMinus(int[] arr) {
    int p = 0;
    int n = 0;
    int z = 0;

    for (int i = 0; i < arr.length; i++)
    {
        if (arr[i] < 0)
        {
            n++;
        }
        else if (arr[i] == 0)
        {
            z++;
        }
        else
        {
            p++;
        }
    }

    // Formatting: .06f means float value with 6 decimals after the decimal point.
    // * 1.0 is done to convert p, n and z into double values. (otherwise the answer will be zero)
    System.out.printf("%.06f\n", p * 1.0 / arr.length);
    System.out.printf("%.06f\n", n * 1.0 / arr.length);
    System.out.printf("%.06f\n", z * 1.0 / arr.length);

}
