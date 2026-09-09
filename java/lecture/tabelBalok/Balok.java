public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    // Constructor default
    public Balok() {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }

    // Constructor dengan parameter
    public Balok(int panjang, int lebar, int tinggi) {
        setPanjang(panjang);
        setLebar(lebar);
        setTinggi(tinggi);
    }

    // Getter & Setter
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        if (panjang > 0) {
            this.panjang = panjang;
        } else {
            this.panjang = 1; // nilai default jika masukan invalid
        }
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        if (lebar > 0) {
            this.lebar = lebar;
        } else {
            this.lebar = 1;
        }
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            this.tinggi = 1;
        }
    }

    // Method Perhitungan
    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public int getLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}