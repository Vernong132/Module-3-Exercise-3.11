import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Prompt user input for the month 
        System.out.println("Please enter the month: ");
        int month = input.nextInt();
        System.out.println("Please enter the year: ");
        int year = input.nextInt();
        boolean leap = false;
        
        // Deciding if it is a leap year
        // Leap Year = Divisible by 4, but not Divisible by 100 unless it can be divided by 400
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        // Number of days in the month
        switch (month) {
            case 1: 
                System.out.println("January " + year + " had 31 days.");
                break;
            case 2: 
                System.out.println("February " + year + " had " + (leap ? "29 days." : "28 days."));
                break;
            case 3: 
                System.out.println("March " + year + " had 31 days.");
                break;
            case 4: 
                System.out.println("April " + year + " had 30 days.");
                break;
            case 5: 
                System.out.println("May " + year + " had 31 days.");
                break;
            case 6: 
                System.out.println("June " + year + " had 30 days.");
                break;
            case 7: 
                System.out.println("July " + year + " had 31 days.");
                break;
            case 8: 
                System.out.println("August " + year + " had 31 days.");
                break;
            case 9: 
                System.out.println("September " + year + " had 30 days.");
                break;
            case 10: 
                System.out.println("October " + year + " had 31 days.");
                break;
            case 11: 
                System.out.println("November " + year + " had 30 days.");
                break;
            case 12: 
                System.out.println("December " + year + " had 31 days.");
                break;
            default:
                System.out.println("Invalid month input.");
        }
    }
}

// BEGIN
    // PROMPT the user to input the month (between 1 and 12)
    // READ the month

    // PROMPT the user to input the year
    // READ the year

    // SET leapYear to false

    // IF the year is divisible by 4 THEN
        // IF the year is divisible by 100 THEN
            // IF the year is divisible by 400 THEN
                // SET leapYear to true
            // ELSE
                // SET leapYear to false
            // END IF
        // ELSE
            // SET leapYear to true
        // END IF
    // END IF

    // SWITCH based on the month
        // CASE 1:
            // PRINT "January" followed by the number of days (31)
        // CASE 2:
            // IF leapYear is true THEN
                // PRINT "February" followed by the number of days (29)
            // ELSE
                // PRINT "February" followed by the number of days (28)
            // END IF
        // CASE 3:
            // PRINT "March" followed by the number of days (31)
        // CASE 4:
            // PRINT "April" followed by the number of days (30)
        // CASE 5:
            // PRINT "May" followed by the number of days (31)
        // CASE 6:
            // PRINT "June" followed by the number of days (30)
        // CASE 7:
            // PRINT "July" followed by the number of days (31)
        // CASE 8:
            // PRINT "August" followed by the number of days (31)
        // CASE 9:
            // PRINT "September" followed by the number of days (30)
        // CASE 10:
            // PRINT "October" followed by the number of days (31)
        // CASE 11:
            // PRINT "November" followed by the number of days (30)
        // CASE 12:
            // PRINT "December" followed by the number of days (31)
        // DEFAULT:
            // PRINT "Invalid month input"
    // END SWITCH
// END
