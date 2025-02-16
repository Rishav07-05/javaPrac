import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        if (cnt == 1) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not A Prime");
        }
        sc.close();
    }
}
