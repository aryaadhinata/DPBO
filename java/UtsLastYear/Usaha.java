/**
 * Dasar abstrak untuk semua jenis usaha pada sistem swasembada pangan.
 */
public abstract class Usaha implements DapatDitampilkan {
    private String kode;
    private String nama;
    private Kota kota;
    private double luas;

    /** Membuat usaha kosong untuk diisi melalui setter. */
    protected Usaha() {
    }

    /** Membuat usaha dengan data identitas dan lokasi. */
    protected Usaha(String kode, String nama, Kota kota, double luas) {
        this.kode = kode;
        this.nama = nama;
        this.kota = kota;
        this.luas = luas;
    }

    /** Mengambil kode unik usaha yang juga digunakan dalam pencarian. */
    public String getKode() {
        return kode;
    }

    /** Mengubah kode usaha. */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /** Mengambil nama usaha. */
    public String getNama() {
        return nama;
    }

    /** Mengubah nama usaha. */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** Mengambil kota usaha. */
    public Kota getKota() {
        return kota;
    }

    /** Mengubah kota usaha. */
    public void setKota(Kota kota) {
        this.kota = kota;
    }

    /** Mengambil luas lahan dalam meter persegi. */
    public double getLuas() {
        return luas;
    }

    /** Mengubah luas lahan dalam meter persegi. */
    public void setLuas(double luas) {
        this.luas = luas;
    }

    /** Menghasilkan ringkasan atribut umum usaha. */
    @Override
    public String getDeskripsi() {
        String deskripsiKota = kota == null ? "Belum ditentukan" : kota.getDeskripsi();
        return getClass().getSimpleName() + " [kode=" + kode
                + ", nama=" + nama + ", kota=" + deskripsiKota
                + ", luas=" + luas + " m2]";
    }
}
