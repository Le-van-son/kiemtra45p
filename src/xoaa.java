import java.util.Scanner;

public class xoaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập a:");
        int a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (a == arr[i]) {
                arr[i] = arr[i + 1];
                arr[n - 1] = 0;
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
