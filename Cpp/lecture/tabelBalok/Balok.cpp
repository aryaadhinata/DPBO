#include <iostream>
using namespace std;

class Balok{
    private :
        int panjang;
        int lebar;
        int tinggi;
    public :
        void setPanjang(int p){
            panjang = p;
        }
        
        void setLebar(int l){
            lebar = l;
        }

        void setTinggi(int t){
            tinggi = t;
        }

        int getPanjang(){
            return panjang;
        }

        int getLebar(){
            return lebar;
        }

        int getTinggi(){
            return tinggi;
        }

        int volume(){
            return panjang * lebar * tinggi;
        }

        int luasPermukaan(){
            return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        }
};