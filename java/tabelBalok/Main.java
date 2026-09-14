import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.print("Masukkan jumlah balok: ");
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
            return;
        }
        
        Balok[] balokArray = new Balok[n];

        int i = 0, p = 0, l = 0, t = 0;
        for (i = 0; i < n; i++) {
            System.out.print("Masukkan panjang, lebar, dan tinggi balok ke-" + (i + 1) + ": \n");
            p = scanner.nextInt();
            l = scanner.nextInt();
            t = scanner.nextInt();
            balokArray[i] = new Balok(p, l, t);
        }

        Tabel tab = new Tabel(n, 5);
        for (i = 0; i < n; i++) {
            String[] data = new String[5];
            data[0] = "" + balokArray[i].getPanjang();
            data[1] = "" + balokArray[i].getLebar();
            data[2] = "" + balokArray[i].getTinggi();
            data[3] = "" + balokArray[i].getVolume();
            data[4] = "" + balokArray[i].getLuasPermukaan();
            tab.cetakTabel(data);
        }
    }
}
