import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Prompt user input for the month 
        System.out.println("Please enter the month: ");
        int month = input.nextInt();
        System.out.println("Please enter the year: " );
        int year = input.nextInt();
        boolean leap = false;
        
        // Condition for leapyear: year/4 == 0, year/100 == 0, year/400 == 0
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0)
                    leap=true;
                else
                    leap = false;
            }
            leap = true;
        }
        else
            leap = false;

        // Number of days in the month
        switch (month)
        {
            case 1: System.out.println( " January " + year + " had 31 days " ); break;
            case 2: System.out.println( " Febuary " + year + " had " + ((leap) ? " 29 days " : " 28 days ")); break;
            case 3: System.out.println( " March " + year + " had 31 days " ); break;
            case 4: System.out.println( " April " + year + " had 31 days " ); break;
            case 5: System.out.println( " May " + year + " had 31 days " ); break;
            case 6: System.out.println( " June " + year + " had 31 days " ); break;
            case 7: System.out.println( " July " + year + " had 31 days " ); break;
            case 8: System.out.println( " August " + year + " had 31 days " ); break;
            case 9: System.out.println( " September " + year + " had 31 days " ); break;
            case 10: System.out.println( " October " + year + " had 31 days " ); break;
            case 11: System.out.println( " November " + year + " had 31 days " ); break;
            case 12: System.out.println( " December " + year + " had 31 days " ); break;
    
        
        }
    }
}

