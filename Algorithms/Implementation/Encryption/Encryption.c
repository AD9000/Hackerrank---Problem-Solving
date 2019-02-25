// Author: Atharv Damle
// To encrypt an input using a matrix. Size of matrix = square root of the size of input.
// Full Question: https://www.hackerrank.com/challenges/encryption/problem

#include <math.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <time.h>

// Macros to measure time.
#define TICK(X) clock_t X = clock()
#define TOCK(X)                                                                \
  printf("elapsed time %s: %g sec.\n", (#X),                                   \
         (double)(clock() - (X)) / CLOCKS_PER_SEC)

int min(int a, int b)
{
    if (a > b)
    {
        return a;
    }
    return b;
}

char* encryption(char* s) {

  // Remove spaces from string
  int l = strlen(s);
  int p = 0;
  for (int i = 0; i < l; i++)
  {
      if (s[i] != ' ')
      {
          s[p] = s[i];
          p++;
      }
  }
  s[p] = '\0';
  l = p;

  // x must be initialized.
  int x = 0;
  x = (int)sqrt(l);

  // Decide the size of the matrix. x = number of rows
  // c = number of columns
  int c = 0;
  if (x * x == l) 
  {
    c = x;
  } 
  else 
  {
    c = x + 1;
    if (c * x < l) 
    {
      x++;
    }
  }
  
  // Create the matrix.
  char a[x][c];
  int m = min(p + c, l);
  // including the spaces.
  s = realloc(s, m);

  // Add the string into the matrix.
  p = 0;
  int q = 0;
  for (int i = 0; i < l; i++) {
    a[p][q] = s[i];
    q++;

    if (q == c) {
      // System.out.println(a[p][q]);
      q = 0;
      p++;
    }
  }

  // Create new string from the matrix (with equally sized words)
  p = 0;
  for (int i = 0; i < c; i++) {
    for (int j = 0; j < x; j++) {
      if (isalpha(a[j][i])) {
        s[p] = a[j][i];
        p++;
      }
    }
    s[p] = ' ';
    p++;
  }
  s[m - 1] = '\0';

  return s;
}

int main()
{
    // Open file
    FILE* fptr = fopen(getenv("OUTPUT_PATH"), "w");

    // Accept input
    
    // Optional - Start the clock (To measure speed)
    TICK(TIME_A);
    
    // Call the function
    char* result = encryption(s);
    
    // If clock was started, stop the clock and print the elapsed time to stdout
    //TOCK(TIME_A);

    // Write output of the function to the file
    fprintf(fptr, "%s\n", result);

    fclose(fptr);

    return 0;
}
