import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Menampilkan data contoh dan mencari usaha beserta seluruh data relasinya.
 */
public class Main {
    /** Menyiapkan data, menampilkan seluruhnya, lalu mencari berdasarkan kode usaha. */
    public static void main(String[] args) {
        Kota bandung = new Kota("Bandung", "Jawa Barat");
        Kota garut = new Kota("Garut", "Jawa Barat");
        Kota bogor = new Kota("Bogor", "Jawa Barat");

        Ikan nila = new Ikan("IK01", "Nila", "Konsumsi", 0.5, 6);
        Ikan koi = new Ikan("IK02", "Koi", "Hias", 0, 8);
        TernakBahanPangan ayam = new TernakBahanPangan("TR01", "Ayam", 2.0, 5);
        TernakBahanPangan kambing = new TernakBahanPangan("TR02", "Kambing", 25.0, 12);
        Ikan leleRumah = new Ikan("IK03", "Lele", "Konsumsi", 0.4, 5);
        TernakBahanPangan bebekRumah = new TernakBahanPangan("TR03", "Bebek", 2.5, 6);
        SayurRempah bayam = new SayurRempah("SR01", "Bayam", "Sayur");
        SayurRempah jahe = new SayurRempah("SR02", "Jahe", "Rempah");

        PemilikPerikananKomersil pemilikPerikanan =
                new PemilikPerikananKomersil("327301000001", "Dewi Lestari",
                        "Jl. Melati 10, Bandung", Arrays.asList());
        PemilikPertenakanKomersil pemilikPertenakan =
                new PemilikPertenakanKomersil("327301000002", "Budi Santoso",
                        "Jl. Mawar 5, Garut", Arrays.asList());
        PemilikRumahSwasembada pemilikRumah =
                new PemilikRumahSwasembada("327301000003", "Siti Aminah",
                        "Jl. Kenanga 2, Bogor", Arrays.asList());

        PerikananKomersil kolamNila = new PerikananKomersil(
                "PK001", "Kolam Nila Lestari", bandung, 1200, 8, pemilikPerikanan,
                Arrays.asList(nila, koi));
        PertenakanKomersil ternakSejahtera = new PertenakanKomersil(
                "PT001", "Peternakan Sejahtera", garut, 2500, 12, pemilikPertenakan,
                Arrays.asList(ayam, kambing));
        RumahSwasembadaPangan rumahSiti = new RumahSwasembadaPangan(
                "RS001", "Siti Aminah", bogor, 350, pemilikRumah,
                Arrays.asList(bebekRumah), Arrays.asList(leleRumah),
                Arrays.asList(bayam, jahe));

        pemilikPerikanan.setDaftarPerikananKomersil(Arrays.asList(kolamNila));
        pemilikPertenakan.setDaftarPertenakanKomersil(Arrays.asList(ternakSejahtera));
        pemilikRumah.setDaftarRumahSwasembada(Arrays.asList(rumahSiti));

        // Array polimorfik ini memuat lebih dari dua data utama dari turunan Usaha.
        Usaha[] dataUtama = {kolamNila, ternakSejahtera, rumahSiti};

        System.out.println("=== SEMUA DATA USAHA ===");
        for (Usaha usaha : dataUtama) {
            tampilkanDetail(usaha);
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nMasukkan kode usaha yang dicari: ");
            String kodePencarian = scanner.nextLine().trim();
            Usaha hasil = cariUsaha(dataUtama, kodePencarian);

            if (hasil == null) {
                System.out.println("Usaha dengan kode " + kodePencarian + " tidak ditemukan.");
            } else {
                System.out.println("\n=== HASIL PENCARIAN ===");
                tampilkanDetail(hasil);
            }
        }
    }

    /** Mencari satu usaha berdasarkan kode tanpa membedakan huruf besar dan kecil. */
    public static Usaha cariUsaha(Usaha[] dataUtama, String kode) {
        for (Usaha usaha : dataUtama) {
            if (usaha.getKode() != null && usaha.getKode().equalsIgnoreCase(kode)) {
                return usaha;
            }
        }
        return null;
    }

    /** Menampilkan atribut usaha dan seluruh objek yang berelasi dengannya. */
    public static void tampilkanDetail(Usaha usaha) {
        System.out.println("\n" + usaha.getDeskripsi());
        if (usaha.getKota() != null) {
            System.out.println("  Kota: " + usaha.getKota().getDeskripsi());
        }

        if (usaha instanceof PerikananKomersil) {
            PerikananKomersil perikanan = (PerikananKomersil) usaha;
            System.out.println("  Pemilik: " + perikanan.getPemilik().getDeskripsi());
            System.out.println("  Jumlah karyawan: " + perikanan.getJumlahKaryawan());
            tampilkanDaftar("Ikan", perikanan.getDaftarIkan());
        } else if (usaha instanceof PertenakanKomersil) {
            PertenakanKomersil peternakan = (PertenakanKomersil) usaha;
            System.out.println("  Pemilik: " + peternakan.getPemilik().getDeskripsi());
            System.out.println("  Jumlah karyawan: " + peternakan.getJumlahKaryawan());
            System.out.println("  Luas peternakan: " + peternakan.getLuasPertenakan() + " m2");
            tampilkanDaftar("Ternak", peternakan.getDaftarTernak());
        } else if (usaha instanceof RumahSwasembadaPangan) {
            RumahSwasembadaPangan rumah = (RumahSwasembadaPangan) usaha;
            System.out.println("  Pemilik: " + rumah.getPemilik().getDeskripsi());
            tampilkanDaftar("Ternak", rumah.getDaftarTernak());
            tampilkanDaftar("Ikan", rumah.getDaftarIkan());
            tampilkanDaftar("Sayur/rempah", rumah.getDaftarSayurRempah());
        }
    }

    /** Mencetak semua elemen dari satu daftar komoditas. */
    private static void tampilkanDaftar(String judul, List<? extends DapatDitampilkan> daftar) {
        System.out.println("  " + judul + ":");
        if (daftar.isEmpty()) {
            System.out.println("    (belum ada data)");
            return;
        }
        for (DapatDitampilkan item : daftar) {
            System.out.println("    - " + item.getDeskripsi());
        }
    }
}
