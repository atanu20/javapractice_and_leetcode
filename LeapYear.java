import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = sc.nextInt();
        System.out.println(year % 400 == 0);
        System.out.println(year % 100 == 0);
        System.out.println(year % 4 == 0);
        if (year % 400 == 0) {
            System.out.println("leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not leap year");
        } else if (year % 4 == 0) {
            System.out.println("leap year");
        }

        else {
            System.out.println("not leap year");
        }

    }
}
