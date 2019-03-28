// Author: Atharv Damle
// Create functions to calculate the factorial of a number. The factorial will be larger than a 64 bit integer.
// Full Question: https://www.hackerrank.com/challenges/extra-long-factorials/problem

#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

// The TICK and TOCK macros are to measure time. A simple comparison between the functions in java and c
// reveals that C is much faster than java. C takes around 9.5 x 10^-5 seconds whereas java takes around 0.001 seconds
// (And the C program is longer!! I know that is not a category to measure efficiency but it is just really amazing how much
// faster C is)
#define TICK(X) clock_t X = clock()
#define TOCK(X)                                                                \
  printf("elapsed time %s: %g sec.\n", (#X), (double)(clock() - (X)) / CLOCKS_PER_SEC)

// Multiply fact with n. Since fact represents a very large number, it is implemented as an array.
int* multiply(int *fact, int n, int size, int *len)
{
    int i = 0;
    
    // Skip extra zeroes
    while (fact[i] == 0)
    {
        i++;
    }
    int check = 1;
    
    // Multiply each digit of fact with n.
    while (check)
    {
        fact[i] *= n;
        i++;
        check = 0;
        for (int p = i; p < size; p++)
        {
            if (fact[p] != 0)
            {
                i = p;
                check = 1;
                break;
            }
        }
    }

    // Make each element (digit) of the fact variable single digit.
    int j = 0;
    while (j < i + 1) {
      if (fact[j] > 9)
      {
          fact[j + 1] += fact[j] / 10;
          fact[j] %= 10;
      }
      j++;
    }
    *len = i + 1; 
    return &fact[0];
}

// Print the factorial
void printFact(int *fact, int len)
{
    int check = 0;
    for (int i = len + 1; i >= 0; i--)
    {
        if (!check)
        {
            check = fact[i - 1] != 0;
            continue;
        }
        printf("%d", fact[i]);
    }
    printf("\n");
}

// Create an array to store and calculate the factorial.
void extraLongFactorials(int n) {
  //TICK(TIME_A);
  int *fact = malloc (168 * sizeof(int));
  for (int i = 0; i < 168; i++)
  {
      fact[i] = 0;
  }
  fact[0] = 1;
  int len = 0;
  while (n != 1)
  {
    fact = multiply(fact, n, 168, &len);
    //printFact(fact, len);
    n--;
  }
  printFact(fact, len);
  free(fact);

  //TOCK(TIME_A);
}
