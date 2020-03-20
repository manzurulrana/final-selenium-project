package javaCodes.HomeworkCodes.Dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Homework:
 * 1. Convert this date into string format "Friday, June 7 2013"
 * 2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"
 */

public class Dates {
    public static void main(String[] args) throws ParseException {


        String date1 = "Fri, June 7 2013";
        DateFormat date1Format = new SimpleDateFormat("E, MMM dd yyyy");
        Date newDate1 = date1Format.parse(date1);
        System.out.println(date1Format.format(newDate1));

        String date2 = "Friday, Jun 7, 2013 12:10:56 PM";
        DateFormat date2Format = new SimpleDateFormat("E, MMM dd, yyyy HH:mm:ss z");
        Date newDate2 = date2Format.parse(date2);
        System.out.println(date2Format.format(newDate2));


    }
}
