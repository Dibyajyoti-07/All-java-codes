import java.util.Scanner;

public class tech2 {

    // User-defined function to check if a number is a Tech number
    public static boolean isTechNumber(int n) {
        String s = Integer.toString(n);
        int l = s.length();

        if (l % 2 == 0) {
            String fst_half = s.substring(0, l / 2);
            String scnd_half = s.substring(l / 2);

            int sum = Integer.parseInt(fst_half) + Integer.parseInt(scnd_half);
            int square_sum = sum * sum;

            return n == square_sum;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        // Call the user-defined function
        if (isTechNumber(n)) {
            System.out.println(n + " is a Tech number");
        } else {
            System.out.println(n + " is not a Tech number");
        }

        sc.close();
    }
}
