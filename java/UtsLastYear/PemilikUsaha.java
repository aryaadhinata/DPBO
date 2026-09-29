/**
 * Dasar abstrak bagi pemilik usaha dengan data identitas yang sama.
 */
public abstract class PemilikUsaha implements DapatDitampilkan {
    private String noKTP;
    private String nama;
    private String alamat;

    /** Membuat pemilik kosong untuk diisi melalui setter. */
    protected PemilikUsaha() {
    }

    /** Membuat pemilik dengan identitas dan alamat. */
    protected PemilikUsaha(String noKTP, String nama, String alamat) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
    }

    /** Mengambil nomor KTP pemilik. */
    public String getNoKTP() {
        return noKTP;
    }

    /** Mengubah nomor KTP pemilik. */
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    /** Mengambil nama pemilik. */
    public String getNama() {
        return nama;
    }

    /** Mengubah nama pemilik. */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** Mengambil alamat pemilik. */
    public String getAlamat() {
        return alamat;
    }

    /** Mengubah alamat pemilik. */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /** Menghasilkan ringkasan identitas pemilik. */
    @Override
    public String getDeskripsi() {
        return getClass().getSimpleName() + " [noKTP=" + noKTP
                + ", nama=" + nama + ", alamat=" + alamat + "]";
    }
}
