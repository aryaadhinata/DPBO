import java.util.Scanner;

public class TryArrayString {
    public static void main(String[] args) {
        String arr[] = new String[5];
        arr[0] = "satu";

        System.out.println("isi array ke-0 " + arr[0]);

        int i;

        Scanner scan = new Scanner(System.in);

        for(i = 0; i < 5; i++){
            arr[i] = scan.next();
            System.out.println("isi array ke:" + i + " adalah " + arr[i]);
        }
    }
}