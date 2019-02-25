/ Author: Atharv Damle
// Print all the numbers with the smallest absolute difference between them
// Full Question: https://www.hackerrank.com/challenges/countingsort2/problem

static int[] closestNumbers(int[] arr) {
    ArrayList<Integer> close = new ArrayList<>(2 * arr.length);
    
    // Sort the array
    Arrays.sort(arr);
    
    // The initial minimum value.
    int min = Math.abs(arr[0] - arr[1]);
    for (int i = 0; i < arr.length - 1; i++)
    {
        int x = Math.abs(arr[i] - arr[i + 1]);

        // If the absolute difference is less,
        if (x < min)
        {
            // Discard the current list and create a new one.
            close = new ArrayList<>();
            min = x;
        }
        
        // If the absolute difference is equal to the minimum
        if (x == min)
        {
            // Add both numbers to the list.
            close.add(arr[i]);
            close.add(arr[i + 1]); 
        }
    }
    
    // Since ArrayList contains Integer objects and not int data, convert the data.
    int[] ret = new int[close.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = close.get(i).intValue();
    }
    return ret;
}
