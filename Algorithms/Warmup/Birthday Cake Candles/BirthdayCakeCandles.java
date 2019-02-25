// Author: Atharv Damle
// Function to calculate how many candles can your niece blow out
// Full Question: https://www.hackerrank.com/challenges/birthday-cake-candles/problem

static int birthdayCakeCandles(int[] ar) {

    // Logic: Count the number of candles of maximum height. 
    // If maximum height changes, reset the count

    int count = 0;
    int max = 0;

    for (int i = 0; i < ar.length; i++)
    {
        if (ar[i] > max)
        {
            max = ar[i];
            count = 1;
        }
        else if (ar[i] == max)
        {
            count++;
        }
    }
    return count;
}
