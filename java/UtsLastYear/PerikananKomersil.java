import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Usaha perikanan komersial dengan pemilik dan daftar ikan yang dipelihara.
 */
public class PerikananKomersil extends Usaha {
    private List<Ikan> daftarIkan = new ArrayList<>();
    private int jumlahKaryawan;
    private PemilikPerikananKomersil pemilik;

    /** Membuat perikanan komersial kosong. */
    public PerikananKomersil() {
    }

    /** Membuat perikanan komersial dengan atribut usaha dan relasinya. */
    public PerikananKomersil(String kode, String nama, Kota kota, double luas,
                             int jumlahKaryawan, PemilikPerikananKomersil pemilik,
                             List<Ikan> daftarIkan) {
        super(kode, nama, kota, luas);
        this.jumlahKaryawan = jumlahKaryawan;
        this.pemilik = pemilik;
        this.daftarIkan = new ArrayList<>(daftarIkan);
    }

    /** Mengambil daftar ikan sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<Ikan> getDaftarIkan() {
        return Collections.unmodifiableList(daftarIkan);
    }

    /** Mengganti daftar ikan yang dipelihara usaha. */
    public void setDaftarIkan(List<Ikan> daftarIkan) {
        this.daftarIkan = new ArrayList<>(daftarIkan);
    }

    /** Menambahkan ikan ke komposisi usaha. */
    public void addIkan(Ikan ikan) {
        daftarIkan.add(ikan);
    }

    /** Mengambil jumlah karyawan. */
    public int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    /** Mengubah jumlah karyawan. */
    public void setJumlahKaryawan(int jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
    }

    /** Mengambil pemilik usaha. */
    public PemilikPerikananKomersil getPemilik() {
        return pemilik;
    }

    /** Mengubah pemilik usaha. */
    public void setPemilik(PemilikPerikananKomersil pemilik) {
        this.pemilik = pemilik;
    }
}
