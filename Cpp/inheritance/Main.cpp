#include <string>
#include <iostream>
using namespace std;
#include "Manusia.cpp"
#include "Karyawan.cpp"

int main(){
    Manusia kmanusia;
    Karyawan kkaryawan;

    kmanusia.setNama("Gina");
    kmanusia.setAlamat("Bandung");
    kmanusia.setNoKtp("320.110.1234.567");
    kmanusia.setNoTelp("08123456789");

    cout << kmanusia.getNama() << endl;
    cout << kmanusia.getAlamat() << endl;
    cout << kmanusia.getNoKtp() << endl;
    cout << kmanusia.getNoTelp() << endl;

    kkaryawan.setNama("Gina");
    kkaryawan.setAlamat("Bandung");
    kkaryawan.setNoKtp("320.110.1234.567");
    kkaryawan.setNoTelp("08123456789");
    kkaryawan.setNomorPegawai("5355452");
    kkaryawan.setJabatan("-");
    kkaryawan.setDepartemen("-");

    cout << kkaryawan.getNama() << endl;
    cout << kkaryawan.getAlamat() << endl;
    cout << kkaryawan.getNoKtp() << endl;
    cout << kkaryawan.getNoTelp() << endl;
    cout << kkaryawan.getNomorPegawai() << endl;
    cout << kkaryawan.getJabatan() << endl;
    cout << kkaryawan.getDepartemen() << endl;

    return 0;
}