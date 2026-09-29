import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Rumah swasembada pangan dengan daftar ternak, ikan, dan tanaman.
 */
public class RumahSwasembadaPangan extends Usaha {
    private String namaPemilik;
    private List<TernakBahanPangan> daftarTernak = new ArrayList<>();
    private List<Ikan> daftarIkan = new ArrayList<>();
    private List<SayurRempah> daftarSayurRempah = new ArrayList<>();
    private PemilikRumahSwasembada pemilik;

    /** Membuat rumah swasembada pangan kosong. */
    public RumahSwasembadaPangan() {
    }

    /** Membuat rumah swasembada beserta data komoditas dan pemilik. */
    public RumahSwasembadaPangan(String kode, String namaPemilik, Kota kota, double luas,
                                 PemilikRumahSwasembada pemilik,
                                 List<TernakBahanPangan> daftarTernak,
                                 List<Ikan> daftarIkan,
                                 List<SayurRempah> daftarSayurRempah) {
        super(kode, "Rumah Swasembada " + namaPemilik, kota, luas);
        this.namaPemilik = namaPemilik;
        this.pemilik = pemilik;
        this.daftarTernak = new ArrayList<>(daftarTernak);
        this.daftarIkan = new ArrayList<>(daftarIkan);
        this.daftarSayurRempah = new ArrayList<>(daftarSayurRempah);
    }

    /** Mengambil nama pemilik yang tercatat pada rumah. */
    public String getNamaPemilik() {
        return namaPemilik;
    }

    /** Mengubah nama pemilik yang tercatat pada rumah. */
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        setNama("Rumah Swasembada " + namaPemilik);
    }

    /** Mengambil daftar ternak sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<TernakBahanPangan> getDaftarTernak() {
        return Collections.unmodifiableList(daftarTernak);
    }

    /** Mengganti daftar ternak yang dipelihara. */
    public void setDaftarTernak(List<TernakBahanPangan> daftarTernak) {
        this.daftarTernak = new ArrayList<>(daftarTernak);
    }

    /** Menambahkan ternak ke komposisi rumah swasembada. */
    public void addTernak(TernakBahanPangan ternak) {
        daftarTernak.add(ternak);
    }

    /** Mengambil daftar ikan sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<Ikan> getDaftarIkan() {
        return Collections.unmodifiableList(daftarIkan);
    }

    /** Mengganti daftar ikan yang dipelihara. */
    public void setDaftarIkan(List<Ikan> daftarIkan) {
        this.daftarIkan = new ArrayList<>(daftarIkan);
    }

    /** Menambahkan ikan ke komposisi rumah swasembada. */
    public void addIkan(Ikan ikan) {
        daftarIkan.add(ikan);
    }

    /** Mengambil daftar sayur dan rempah sebagai tampilan yang tidak dapat dimodifikasi langsung. */
    public List<SayurRempah> getDaftarSayurRempah() {
        return Collections.unmodifiableList(daftarSayurRempah);
    }

    /** Mengganti daftar sayur dan rempah yang ditanam. */
    public void setDaftarSayurRempah(List<SayurRempah> daftarSayurRempah) {
        this.daftarSayurRempah = new ArrayList<>(daftarSayurRempah);
    }

    /** Menambahkan tanaman ke komposisi rumah swasembada. */
    public void addSayurRempah(SayurRempah sayurRempah) {
        daftarSayurRempah.add(sayurRempah);
    }

    /** Mengambil pemilik rumah swasembada. */
    public PemilikRumahSwasembada getPemilik() {
        return pemilik;
    }

    /** Mengubah pemilik rumah swasembada. */
    public void setPemilik(PemilikRumahSwasembada pemilik) {
        this.pemilik = pemilik;
    }
}
