// Author: Atharv Damle
// Function to create a staircase pattern of size n
// Full Question: https://www.hackerrank.com/challenges/staircase/problem

static void staircase(int n) {

    // hahahaha O(n) implementation
    // Note: O(n) implementation is when only the order of n (size of the input)
    // operations are used to solve a solution. ie the time taken to solve the 
    // problem is directly proportional to the size of the input (n)
    // A traditional solution to making a pattern would be using two loops, one
    // for the rows and one for the columns which would be an O(n^2) solution
    // O(rows * columns) = O(n*n) = O(n^2)
    
    // StringBuilder is a mutable form of String ie each element can be changed.
    StringBuilder sb = new StringBuilder();
    
    // Fill with spaces and last one with hash (making the first row)
    for (int i = 0; i < n - 1; i++)
    {
        sb.append(' ');
    }
    sb.append('#');

    System.out.println(sb);
    
    // All the other rows are made by changing only one element, thus making creation
    // of each line an O(1) operation (constant steps). So overall implementation is O(n)
    for (int i = 0; i < n - 1; i++)
    {
        // Set character at index (n - 2 - i) to be '#'
        sb.setCharAt(n - 2 - i, '#');
        
        System.out.println(sb);
    }
}
