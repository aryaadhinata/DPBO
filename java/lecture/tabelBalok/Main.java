import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk Tabel
        System.out.print("Masukkan jumlah baris tabel: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom tabel: ");
        int kolom = scanner.nextInt();

        Tabel tabel = new Tabel(baris, kolom);
        String[] isiTabel = new String[baris * kolom];

        System.out.println("Masukkan isi tabel:");
        for (int i = 0; i < isiTabel.length; i++) {
            System.out.print("Isi sel " + (i + 1) + ": ");
            isiTabel[i] = scanner.next();
        }

        System.out.println("\nIsi Tabel:");
        tabel.cetakTabel(isiTabel);

        // Input untuk Balok
        System.out.print("\nMasukkan panjang balok: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int tinggi = scanner.nextInt();

        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Volume Balok: " + balok.getVolume());
    }
}
