
import java.util.*;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int a, r;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        a = s.nextInt();
        int sum = 0, i = 0;
        while (a > 0) {

            r = a % 10;
            sum += (r * Math.pow(2, i++));

            a = a / 10;

        }
        System.out.println(sum);
    }
}
