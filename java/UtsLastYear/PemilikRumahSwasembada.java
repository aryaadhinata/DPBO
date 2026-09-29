import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pemilik rumah swasembada pangan dengan data identitas dan daftar rumahnya.
 */
public class PemilikRumahSwasembada extends PemilikUsaha {
    private List<RumahSwasembadaPangan> daftarRumahSwasembada = new ArrayList<>();

    /** Membuat pemilik rumah swasembada kosong. */
    public PemilikRumahSwasembada() {
    }

    /** Membuat pemilik dengan identitas dan daftar rumah swasembada. */
    public PemilikRumahSwasembada(String noKTP, String nama, String alamat,
                                  List<RumahSwasembadaPangan> daftarRumahSwasembada) {
        super(noKTP, nama, alamat);
        this.daftarRumahSwasembada = new ArrayList<>(daftarRumahSwasembada);
    }

    /** Mengambil daftar rumah sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<RumahSwasembadaPangan> getDaftarRumahSwasembada() {
        return Collections.unmodifiableList(daftarRumahSwasembada);
    }

    /** Mengganti daftar rumah swasembada yang dimiliki. */
    public void setDaftarRumahSwasembada(List<RumahSwasembadaPangan> daftarRumahSwasembada) {
        this.daftarRumahSwasembada = new ArrayList<>(daftarRumahSwasembada);
    }
}
