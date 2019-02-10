
import java.util.*;
public class Solution {

    static void extraLongFactorials(int n) {
        long t = System.nanoTime();
        BigInteger fact = new BigInteger(Integer.toString(n));
        while (n != 1)
        {
            fact = fact.multiply(BigInteger.valueOf(--n));   
        }
        System.out.println(fact);
        System.out.println(System.nanoTime() - t);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        
        //long t = System.nanoTime();
        
        // Calling f
        extraLongFactorials(n);
        
        //System.out.println("Elapsed: " + (System.nanoTime() - t));
        scanner.close();
    }
}  
