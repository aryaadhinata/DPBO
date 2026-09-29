import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pemilik usaha perikanan komersial beserta daftar usaha yang dimilikinya.
 */
public class PemilikPerikananKomersil extends PemilikUsaha {
    private List<PerikananKomersil> daftarPerikananKomersil = new ArrayList<>();

    /** Membuat pemilik perikanan kosong. */
    public PemilikPerikananKomersil() {
    }

    /** Membuat pemilik perikanan dengan identitas dan daftar usaha. */
    public PemilikPerikananKomersil(String noKTP, String nama, String alamat,
                                    List<PerikananKomersil> daftarPerikananKomersil) {
        super(noKTP, nama, alamat);
        this.daftarPerikananKomersil = new ArrayList<>(daftarPerikananKomersil);
    }

    /** Mengambil daftar usaha sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<PerikananKomersil> getDaftarPerikananKomersil() {
        return Collections.unmodifiableList(daftarPerikananKomersil);
    }

    /** Mengganti daftar usaha yang dimiliki. */
    public void setDaftarPerikananKomersil(List<PerikananKomersil> daftarPerikananKomersil) {
        this.daftarPerikananKomersil = new ArrayList<>(daftarPerikananKomersil);
    }
}
