using namespace std;

class Manusia {
    private:
        string nama;
        string alamat;
        string no_ktp;
        string no_telp;

    public:

    Manusia(){
    }

    void setNama(string nama){
        this->nama = nama;
    }

    string getNama(){
        return nama;
    }

    void setAlamat(string alamat){
        this->alamat = alamat;
    }

    string getAlamat(){
        return alamat;
    }

    void setNoKtp(string no_ktp){
        this->no_ktp = no_ktp;
    }

    string getNoKtp(){
        return no_ktp;
    }

    void setNoTelp(string no_telp){
        this->no_telp = no_telp;
    }

    string getNoTelp(){
        return no_telp;
    }

    ~Manusia(){
    }
};

    