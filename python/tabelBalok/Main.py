import Tabel as tabel

def main():
    # Membuat tabel dengan 3 baris dan 3 kolom
    print("Masukkan jumlah balok:")
    n = int(input())
    tbl = tabel.Tabel(n)

    # Mengisi data balok pada beberapa sel tabel
    for i in range(n):
        print(f"Masukkan data balok ke-{i+1}:")
        panjang = float(input("Panjang:\t"))
        lebar = float(input("Lebar : \t"))
        tinggi = float(input("Tinggi: \t"))
        tbl.set_data(i, panjang, lebar, tinggi)

    # Menampilkan isi tabel
    tbl.display()

main()