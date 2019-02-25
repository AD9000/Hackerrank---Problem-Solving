// Author: Atharv Damle
// To convert the time in number format to words according to given constraints...
// Full Question: https://www.hackerrank.com/challenges/the-time-in-words/problem

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

// Macros to measure time.
#define TICK(X) clock_t X = clock()
#define TOCK(X)                                                                \
  printf("elapsed time %s: %g sec.\n", (#X),                                   \
         (double)(clock() - (X)) / CLOCKS_PER_SEC)

// Function that accepts the hours and minutes in numbers and prints the 
// word version of the time to FILE represented by fptr
void timeInWords(int h, int m, FILE *fptr) {

    // Array containing all the possible strings to be used in time.
    char* time[] = {
        "o' clock", 
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "quarter",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine",
        "half"
    };
    
    // Convert to words by accessing different elements of the array as required.
    // If minutes = 0...
    if (m == 0)
    {
      fprintf(fptr, "%s", time[h]);
      fprintf(fptr, " ");
      fprintf(fptr, "%s\n", time[0]);
    }
    // If minutes > 30....
    else if (m > 30)
    {
        fprintf(fptr, "%s", time[60 - m]);
        if (m != 45)
        {
          if (m == 59) {
            fprintf(fptr, " minute");
            }
            else
            {

              fprintf(fptr, " minutes");
            }
        }
        fprintf(fptr, " to ");
        fprintf(fptr, "%s\n", time[h + 1]);
    }
    else
    {
        fprintf(fptr, "%s", time[m]);
        if (m != 15 && m != 30)
        {
            if (m == 1)
            {
              fprintf(fptr, " minute");
            }
            else
            {
              fprintf(fptr, " minutes");
            }
        }
        fprintf(fptr, " past ");
        fprintf(fptr, "%s\n", time[h]);
    }
}

int main()
{
    FILE* fptr = fopen(getenv("OUTPUT_PATH"), "w");

    // Accept input.

    // Call function
    timeInWords(h, m, fptr);

    fclose(fptr);

    return 0;
}
