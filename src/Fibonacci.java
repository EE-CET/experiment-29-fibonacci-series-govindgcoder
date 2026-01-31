import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if (N == 0) {
            System.out.print(0);
            return;
        } else if (N == 1) {
            System.out.print(0);
            return;
        } else if (N == 2) {
            System.out.print(1);
            return;
        }

        int a = 0;
        int b = 1;

        for (int i = 3; i <= N; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.print(b);
    }
}
