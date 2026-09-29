import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Peternakan komersial beserta pemilik, ternak, luas, dan karyawannya.
 */
public class PertenakanKomersil extends Usaha {
    private List<TernakBahanPangan> daftarTernak = new ArrayList<>();
    private int jumlahKaryawan;
    private PemilikPertenakanKomersil pemilik;

    /** Membuat peternakan komersial kosong. */
    public PertenakanKomersil() {
    }

    /** Membuat peternakan komersial beserta atribut dan relasinya. */
    public PertenakanKomersil(String kode, String nama, Kota kota, double luasPertenakan,
                              int jumlahKaryawan, PemilikPertenakanKomersil pemilik,
                              List<TernakBahanPangan> daftarTernak) {
        super(kode, nama, kota, luasPertenakan);
        this.jumlahKaryawan = jumlahKaryawan;
        this.pemilik = pemilik;
        this.daftarTernak = new ArrayList<>(daftarTernak);
    }

    /** Mengambil luas peternakan dalam meter persegi. */
    public double getLuasPertenakan() {
        return getLuas();
    }

    /** Mengubah luas peternakan dalam meter persegi. */
    public void setLuasPertenakan(double luasPertenakan) {
        setLuas(luasPertenakan);
    }

    /** Mengambil daftar ternak sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<TernakBahanPangan> getDaftarTernak() {
        return Collections.unmodifiableList(daftarTernak);
    }

    /** Mengganti daftar ternak di peternakan. */
    public void setDaftarTernak(List<TernakBahanPangan> daftarTernak) {
        this.daftarTernak = new ArrayList<>(daftarTernak);
    }

    /** Menambahkan ternak ke komposisi peternakan. */
    public void addTernak(TernakBahanPangan ternak) {
        daftarTernak.add(ternak);
    }

    /** Mengambil jumlah karyawan. */
    public int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    /** Mengubah jumlah karyawan. */
    public void setJumlahKaryawan(int jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
    }

    /** Mengambil pemilik peternakan. */
    public PemilikPertenakanKomersil getPemilik() {
        return pemilik;
    }

    /** Mengubah pemilik peternakan. */
    public void setPemilik(PemilikPertenakanKomersil pemilik) {
        this.pemilik = pemilik;
    }
}
