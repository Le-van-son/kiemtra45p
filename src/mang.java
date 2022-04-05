import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            arr[i] = scanner.nextInt();
        }
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum = sum +arr[i];
            }
        }
        System.out.println("Tổng các pt chẵn là :" +sum);
    }
}
