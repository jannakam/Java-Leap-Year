import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isLeapYear = false;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int inputYear = myScanner.nextInt();

        if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) {
            isLeapYear = true;
            System.out.println(inputYear + " IS a leap year");
        }
        else {
            System.out.println(inputYear + " IS NOT a leap year");
        }

        }
    }
