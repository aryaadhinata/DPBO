/**
 * Data sayur atau rempah yang ditanam di rumah swasembada pangan.
 */
public class SayurRempah implements DapatDitampilkan {
    private String kode;
    private String nama;
    private String jenis;

    /** Membuat sayur atau rempah kosong untuk diisi melalui setter. */
    public SayurRempah() {
    }

    /** Membuat sayur atau rempah dengan identitas dan jenis. */
    public SayurRempah(String kode, String nama, String jenis) {
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
    }

    /** Mengambil kode sayur atau rempah. */
    public String getKode() {
        return kode;
    }

    /** Mengubah kode sayur atau rempah. */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /** Mengambil nama sayur atau rempah. */
    public String getNama() {
        return nama;
    }

    /** Mengubah nama sayur atau rempah. */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** Mengambil jenis komoditas, yaitu sayur atau rempah. */
    public String getJenis() {
        return jenis;
    }

    /** Mengubah jenis komoditas. */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /** Menghasilkan ringkasan data tanaman. */
    @Override
    public String getDeskripsi() {
        return "SayurRempah [kode=" + kode + ", nama=" + nama + ", jenis=" + jenis + "]";
    }
}
