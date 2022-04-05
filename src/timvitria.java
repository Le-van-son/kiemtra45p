import java.util.Scanner;

public class timvitria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.println("Nhập a:");
        int a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if(a ==arr[i]){
                System.out.println("Vị trí của a là " +i);
                count = count +1;
            }
        }if (count==0){
            System.out.println("a không thuộc mảng");
        }

    }
}
