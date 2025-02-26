import java.util.*;

public class sortChars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        String sortedStr = new String(charArray);
        
        System.out.println("Sorted string: " + sortedStr);

        sc.close();
    }
}
