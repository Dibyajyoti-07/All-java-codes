import java.util.Scanner;

public class tech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        String s = Integer.toString(n);
        int l = s.length();

        if (l % 2 == 0) {
            String fst_half = s.substring(0, l / 2);
            String scnd_half = s.substring(l / 2);

            int sum = Integer.parseInt(fst_half) + Integer.parseInt(scnd_half);
            int square_sum = sum * sum;

            if (n == square_sum) {
                System.out.println(n + " is a Tech number");
            } else {
                System.out.println(n + " is not a Tech number");
            }
        } else {
            System.out.println(n + " is not a Tech number");
        }

        sc.close();
    }
}
