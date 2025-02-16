import java.util.*;
public class Array {
    public static void main(String[] args) {
        System.out.println("Size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("input of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }


        sc.close();
    }
}
