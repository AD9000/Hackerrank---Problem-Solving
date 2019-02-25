import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeInWords {

    // Function that converts time in number format to 
    // words and returns the converted time.
    static String timeInWords(int h, int m) {
    
        String time[] = {
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

    String w = "";
    if (m == 0)
    {
        w += time[h] + " " + time[0];
    }
    else if (m > 30)
    {
        w += time[60 - m];
        if (m != 45)
        {
            if (m == 59)
            {
                w += " minute";
            }
            else
            {
                w += " minutes";
            }
        }
        w += " to " + time[h + 1];
    }
    else
    {
        w += time[m];
        if (m != 15 && m != 30)
        {
            if (m == 1)
            {
                w += " minute";
            }
            else
            {
                w += " minutes";
            }
        }
        w += " past " + time[h];
    }
    return w;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        
        // Timestamp 1
        long t = System.nanoTime();
        
        String result = timeInWords(h, m);
        
        // Timestamp 2. Calculate elapsed time.
        System.out.println(System.nanoTime() - t);

        b.write(result);
        b.newLine();

        b.close();

        sc.close();
    }
}
