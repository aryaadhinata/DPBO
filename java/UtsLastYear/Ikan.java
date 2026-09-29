/**
 * Data ikan yang dipelihara sebagai bagian dari satu atau lebih usaha.
 */
public class Ikan implements DapatDitampilkan {
    private String kode;
    private String nama;
    private String jenis;
    private double beratKonsumsi;
    private int lamaPemeliharaan;

    /** Membuat ikan kosong untuk diisi melalui setter. */
    public Ikan() {
    }

    /** Membuat ikan dengan seluruh atribut pada diagram kelas. */
    public Ikan(String kode, String nama, String jenis, double beratKonsumsi,
                int lamaPemeliharaan) {
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
        this.beratKonsumsi = beratKonsumsi;
        this.lamaPemeliharaan = lamaPemeliharaan;
    }

    /** Mengambil kode ikan. */
    public String getKode() {
        return kode;
    }

    /** Mengubah kode ikan. */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /** Mengambil nama ikan. */
    public String getNama() {
        return nama;
    }

    /** Mengubah nama ikan. */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** Mengambil jenis ikan, misalnya konsumsi atau hias. */
    public String getJenis() {
        return jenis;
    }

    /** Mengubah jenis ikan. */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /** Mengambil berat konsumsi ikan dalam kilogram. */
    public double getBeratKonsumsi() {
        return beratKonsumsi;
    }

    /** Mengubah berat konsumsi ikan dalam kilogram. */
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

    /** Menghasilkan ringkasan data ikan. */
    @Override
    public String getDeskripsi() {
        return "Ikan [kode=" + kode + ", nama=" + nama + ", jenis=" + jenis
                + ", berat konsumsi=" + beratKonsumsi + " kg, lama pemeliharaan="
                + lamaPemeliharaan + " bulan]";
    }
}
