#include <iostream>
#include "Balok.cpp"
using namespace std;

class Tabel{
    private :
        Balok balok;
    public :
        void setBalok(Balok b){
            balok = b;
        }

        Balok getBalok(){
            return balok;
        }

        void TampilTabel(){
            cout << "Panjang\tLebar\tTinggi\tVolume\tLuas Permukaan" << endl;
            cout << balok.getPanjang() << "\t" << balok.getLebar() << "\t" << balok.getTinggi() << "\t" << balok.volume() << "\t" << balok.luasPermukaan() << endl;
        }
};