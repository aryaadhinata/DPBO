#include "Buku.cpp"
using namespace std;

int main(){
    Buku b1;
    b1.setJudul("J2ME");
    b1.setPengarang("orang_1");

    cout << b1.getJudul() << endl;
    cout << b1.getPengarang() << endl;
    
    Buku b2("J2mE", "orang_2");
    cout << b1.getJudul() << endl;
    cout << b1.getPengarang() << endl;

    return 0;
}