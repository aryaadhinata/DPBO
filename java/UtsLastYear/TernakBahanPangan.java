/**
 * Data ternak yang menghasilkan bahan pangan.
 */
public class TernakBahanPangan implements DapatDitampilkan {
    private String kode;
    private String nama;
    private double beratKonsumsi;
    private int lamaPemeliharaan;

    /** Membuat ternak kosong untuk diisi melalui setter. */
    public TernakBahanPangan() {
    }

    /** Membuat ternak dengan atribut identitas dan pemeliharaan. */
    public TernakBahanPangan(String kode, String nama, double beratKonsumsi,
                             int lamaPemeliharaan) {
        this.kode = kode;
        this.nama = nama;
        this.beratKonsumsi = beratKonsumsi;
        this.lamaPemeliharaan = lamaPemeliharaan;
    }

    /** Mengambil kode ternak. */
    public String getKode() {
        return kode;
    }

    /** Mengubah kode ternak. */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /** Mengambil nama ternak. */
    public String getNama() {
        return nama;
    }

    /** Mengubah nama ternak. */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** Mengambil berat konsumsi dalam kilogram. */
    public double getBeratKonsumsi() {
        return beratKonsumsi;
    }

    /** Mengubah berat konsumsi dalam kilogram. */
    public void setBeratKonsumsi(double beratKonsumsi) {
        this.beratKonsumsi = beratKonsumsi;
    }

    /** Mengambil lama pemeliharaan dalam bulan. */
    public int getLamaPemeliharaan() {
        return lamaPemeliharaan;
    }

    /** Mengubah lama pemeliharaan dalam bulan. */
    public void setLamaPemeliharaan(int lamaPemeliharaan) {
        this.lamaPemeliharaan = lamaPemeliharaan;
    }

    /** Menghasilkan ringkasan data ternak. */
    @Override
    public String getDeskripsi() {
        return "TernakBahanPangan [kode=" + kode + ", nama=" + nama
                + ", berat konsumsi=" + beratKonsumsi + " kg, lama pemeliharaan="
                + lamaPemeliharaan + " bulan]";
    }
}
