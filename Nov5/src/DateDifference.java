 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {


    // Function to print difference in
    // time start_date and end_date
    static void
    findDifference(String start_date,
                   String end_date)
    {
 
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "dd-MM-yyyy");
 
        // Try Block
        try {
 
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
 
            // Calculate time difference
            // in milliseconds
            long difference_In_Time
                = d2.getTime() - d1.getTime();
 
            // Calculate time difference in
            // seconds, minutes, hours, years,
            // and days
            
 
            long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
            
            long difference_In_Months
            = (difference_In_Time
               / (1000l * 60 * 60 * 24 * 30)%12);
 
            long difference_In_Days
                = (difference_In_Time
                   / (1000 * 60 * 60 * 24))
                  % 365 % 30;
 
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
 
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Months
                + " Months , "
                + difference_In_Days
                + " days");
        }
 
        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Given start Date
        String start_date
            = "10-01-2018";
 
        // Given end Date
        String end_date
            = "10-06-2020";
 
        // Function Call
        findDifference(start_date, end_date);
    }
}