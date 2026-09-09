public class Tabel {
    private int baris;
    private int kolom;

    // Constructor default
    public Tabel() {
        this.baris = 1;
        this.kolom = 1;
    }

    // Constructor dengan parameter
    public Tabel(int baris, int kolom) {
        setBaris(baris);
        setKolom(kolom);
    }

    // Setter (menggunakan public void)
    public void setBaris(int baris) {
        if (baris > 0) {
            this.baris = baris;
        } else {
            this.baris = 1;
        }
    }

    public void setKolom(int kolom) {
        if (kolom > 0) {
            this.kolom = kolom;
        } else {
            this.kolom = 1;
        }
    }

    // Getter (menggunakan public int)
    public int getBaris() {
        return baris;
    }

    public int getKolom() {
        return kolom;
    }

    // Method untuk menampilkan isi tabel
    public void cetakTabel(String[] isi) {
        int index = 0;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (index < isi.length) {
                    System.out.print(isi[index] + "\t");
                    index++;
                }
            }
            System.out.println();
        }
    }
}