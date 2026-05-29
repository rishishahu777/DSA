import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for(int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        int formula = n * (n + 1) / 2;

        int result = formula - sum;

        System.out.println("The missing number is: " + result);

        sc.close();
    }
}