import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int j = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] newarr = new int[size];

        System.out.println("Enter the array elements:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {
            if(arr[i] != 0) {
                newarr[j] = arr[i];
                j++;
            }
        }

        while(j < size) {
            newarr[j] = 0;
            j++;
        }

        System.out.println("Array after moving zeros to end:");

        for(int k = 0; k < newarr.length; k++) {
            System.out.print(newarr[k] + " ");
        }

        sc.close();
    }
}