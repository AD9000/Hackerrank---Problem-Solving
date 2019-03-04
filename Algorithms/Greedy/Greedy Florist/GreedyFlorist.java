// Author: Atharv Damle
// Calculate the minimum cost to buy all the flowers.
// Full Question: https://www.hackerrank.com/challenges/greedy-florist/problem

static int getMinimumCost(int k, int[] c) {
    Arrays.sort(c);
    int sum = 0;
    int count[] = new int[k];
    int p = 0;
    for (int i = c.length - 1; i >= 0; i--)
    {
        sum += (count[p] + 1) * c[i];
        count[p]++;
        p++;
        if (p == k)
        {
            p = 0;
        }
    }
    return sum;
}
