#include <iostream>
#include "Tabel.cpp"
using namespace std;

int main() {
    Balok balok[100]; // Assuming a maximum of 100 balok
    Tabel tabel;

    int banyakBalok, panjang, lebar, tinggi;
    cout << "Masukkan banyak balok: \n";
    cin >> banyakBalok; 

    for(int i = 0; i < banyakBalok; i++){
    cout << "Masukkan panjang, lebar, dan tinggi balok: \n";
    cin >> panjang >> lebar >> tinggi;
    balok[i].setPanjang(panjang);
    balok[i].setLebar(lebar);
    balok[i].setTinggi(tinggi);
    
    tabel.setBalok(balok[i]);
    }

    for(int i = 0; i < banyakBalok; i++){
        tabel.setBalok(balok[i]);
        tabel.TampilTabel();
    }
}