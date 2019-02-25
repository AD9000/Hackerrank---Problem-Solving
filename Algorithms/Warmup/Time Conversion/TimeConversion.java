// Author: Atharv Damle
// Function to convert time from the 12 hr format to the 24 hr format.
// Full Question: https://www.hackerrank.com/challenges/time-conversion/problem

// There are a few methods to convert time. Here are two: 
// 1. Using the SimpleDateFormat class in java. 
// Documentation: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
// 2. +12 hrs for PM

static String timeConversion(String s) throws ParseException
{
    // SimpleDateFormat class
    SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat pf = new SimpleDateFormat("hh:mm:ssa");
    Date d = pf.parse(s);
    return df.format(d);
    
    /*
    // Crude method. +12 Hours.
    String t = "";
    int hours = Integer.parseInt(s.substring(0, 2));
    if (s.charAt(s.length() - 2) == 'P')
    {
        if (hours != 12)
        {
            hours += 12;
        }
        t += hours;
        t += s.substring(2, s.length() - 2);
    }
    else
    {
        if (hours == 12)
        {
            hours = 0;
            t += 0;
            t += hours;
            t += s.substring(2, s.length() - 2);
        }
        else
        {
            t += s.substring(0, s.length() - 2);
        }
    }

    return t;
    */
}
