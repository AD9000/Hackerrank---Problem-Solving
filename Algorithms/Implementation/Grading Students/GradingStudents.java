// Author: Atharv Damle
// Function to round off and calculate the final grades
// Full Question: https://www.hackerrank.com/challenges/grading/problem

// Logic: Round off to a multiple of 5 unless grade < 37
static int[] gradingStudents(int[] grades) {

    for (int i = 0; i < grades.length; i++)
    {
        if (grades[i] > 37)
        {
            if ((grades[i] + 1) % 5 == 0)
            {
                grades[i]++;
            }
            else if ((grades[i] + 2) % 5 == 0)
            {
                grades[i] += 2;
            }
        }
    }

    return grades;
}
