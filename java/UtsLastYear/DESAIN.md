# Desain Relasi Kelas Usaha Pangan

## Struktur dan hubungan

```text
                         <<interface>> DapatDitampilkan
                           ^             ^             ^
                           |             |             |
                      Usaha (abstract)   PemilikUsaha (abstract)   Kota
                       /       |      \       /       |       \
                      /        |       \      /        |        \
 PerikananKomersil  RumahSwasembadaPangan  PertenakanKomersil
          |                  |                   |
          |                  +-- TernakBahanPangan
          |                  +-- Ikan
          |                  +-- SayurRempah
          +-- Ikan
          +-- PemilikPerikananKomersil
                             +-- PemilikRumahSwasembada
                                                 +-- PemilikPertenakanKomersil
```

Keterangan relasi:

- **Inheritance:** `PerikananKomersil`, `RumahSwasembadaPangan`, dan
  `PertenakanKomersil` mewarisi atribut umum dari `Usaha`. Tiga kelas pemilik juga
  mewarisi data identitas dari `PemilikUsaha`. `Usaha` dan `PemilikUsaha` abstrak
  karena keduanya mewakili konsep umum, bukan jenis objek yang dibuat langsung.
- **Interface:** `DapatDitampilkan` menetapkan kontrak `getDeskripsi()` untuk
  usaha, pemilik, kota, ikan, ternak, serta sayur/rempah. `Main` memanfaatkan
  polimorfisme interface tersebut untuk menampilkan daftar komoditas.
- **Asosiasi:** Setiap usaha menyimpan objek pemilik yang sesuai. Pemilik juga
  menyimpan daftar usaha yang dimilikinya. Objek pemilik tetap dapat hidup tanpa
  objek usaha.
- **Agregasi:** `Usaha` merujuk objek `Kota`; kota dibuat terpisah dan dapat
  digunakan bersama oleh beberapa usaha. Menghapus satu usaha tidak menghapus
  data kota.
- **Komposisi:** Daftar ikan, ternak, dan sayur/rempah merupakan komponen data
  usaha. Metode `add...` dan setter daftar disediakan oleh kelas usaha terkait.
- **Inner class:** Tidak digunakan karena kelas komoditas dan relasi antarusaha
  perlu dapat dipakai langsung oleh beberapa jenis usaha; kelas terpisah membuat
  hubungan tersebut lebih jelas.

## Pencarian pada Main

`Main` menyimpan tiga objek hardcode (lebih dari minimum dua) dalam array
`Usaha[] dataUtama`. Setiap objek memiliki kode usaha yang unik. Pengguna
memasukkan kode, lalu `cariUsaha` mencari kecocokan kode tanpa membedakan huruf
besar/kecil. Apabila ditemukan, `tampilkanDetail` menampilkan seluruh data yang
berhubungan: kota, pemilik, jumlah karyawan bila ada, dan setiap komoditas yang
dimiliki usaha tersebut. Contoh masukan: `PK001`, `PT001`, atau `RS001`.
