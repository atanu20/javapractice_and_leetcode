import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, num, c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }

    }
}
