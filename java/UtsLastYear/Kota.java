/**
 * Data kota yang dapat dirujuk oleh beberapa usaha sebagai agregasi.
 */
public class Kota implements DapatDitampilkan {
    private String nama;
    private String provinsi;

    /** Membuat kota kosong yang dapat diisi melalui setter. */
    public Kota() {
    }

    /** Membuat kota dengan nama dan provinsi. */
    public Kota(String nama, String provinsi) {
        this.nama = nama;
        this.provinsi = provinsi;
    }

    /** Mengambil nama kota. */
    public String getNama() {
        return nama;
    }

    /** Mengubah nama kota. */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** Mengambil nama provinsi. */
    public String getProvinsi() {
        return provinsi;
    }

    /** Mengubah nama provinsi. */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /** Menghasilkan ringkasan lokasi. */
    @Override
    public String getDeskripsi() {
        return nama + ", " + provinsi;
    }
}
