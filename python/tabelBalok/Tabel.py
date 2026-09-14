import Balok as balok

class Tabel:
    def __init__(self, baris):
        self.baris = baris
        self.kolom = 1  # Set kolom to 1 since we only have one column for each balok
        self.data = [[0 for _ in range(self.kolom)] for _ in range(self.baris)]

    def set_data(self, baris, panjang, lebar, tinggi):
        if baris < self.baris:
            balok_obj = balok.Balok(panjang, lebar, tinggi)
            self.data[baris][0] = balok_obj
        else:
            print("Indeks baris di luar batas tabel.")
    
    def get_data(self, baris):
        if baris < self.baris:
            return self.data[baris][0]
        else:
            print("Indeks baris di luar batas tabel.")
            return None
    
    def display(self):
        print("Tabel Balok:")
        print("-------------------------------------------------------------")
        for i in range(self.baris):
            for j in range(self.kolom):
                balok_obj = self.data[i][j]
                if isinstance(balok_obj, balok.Balok):
                    print(f"|| {balok_obj.panjang} || {balok_obj.lebar} || {balok_obj.tinggi} || Volume: {balok_obj.volume()} || Luas Permukaan: {balok_obj.luas_permukaan()} ||")
                else:
                    print(f"Tidak ada data balok.")
        print("-------------------------------------------------------------")