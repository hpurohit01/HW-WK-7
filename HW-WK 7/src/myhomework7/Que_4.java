package myhomework7;
/*Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
● isLeapYear(1600); should return true since 1600 is a leap year
● isLeapYear(2017); should return false since 2017 is not a leap year
● isLeapYear(2000);should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years
they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.*/
public class Que_4 {
    public static boolean isLeapYear(int year) {
        int y = year;
        boolean trueValue, falseValue, outcome;
        trueValue = true;
        falseValue = false;

        if (y >= 1 && y <= 9999) {

            if (((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))) {
                outcome = trueValue;
                System.out.println(outcome);
                System.out.println(y + "is a leap year");
                System.out.println("==");

            } else {
                outcome = falseValue;
                System.out.println(outcome);
                System.out.println(y + "is a not leap year");
            }
        } else {
            outcome = falseValue;
            System.out.println(outcome);
            System.out.println("out of range");
        }
        return outcome;
    }

        }











