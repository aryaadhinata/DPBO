import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pemilik peternakan komersial beserta daftar peternakan yang dimilikinya.
 */
public class PemilikPertenakanKomersil extends PemilikUsaha {
    private List<PertenakanKomersil> daftarPertenakanKomersil = new ArrayList<>();

    /** Membuat pemilik peternakan kosong. */
    public PemilikPertenakanKomersil() {
    }

    /** Membuat pemilik peternakan dengan identitas dan daftar usaha. */
    public PemilikPertenakanKomersil(String noKTP, String nama, String alamat,
                                     List<PertenakanKomersil> daftarPertenakanKomersil) {
        super(noKTP, nama, alamat);
        this.daftarPertenakanKomersil = new ArrayList<>(daftarPertenakanKomersil);
    }

    /** Mengambil daftar peternakan sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<PertenakanKomersil> getDaftarPertenakanKomersil() {
        return Collections.unmodifiableList(daftarPertenakanKomersil);
    }

    /** Mengganti daftar peternakan yang dimiliki. */
    public void setDaftarPertenakanKomersil(List<PertenakanKomersil> daftarPertenakanKomersil) {
        this.daftarPertenakanKomersil = new ArrayList<>(daftarPertenakanKomersil);
    }
}
