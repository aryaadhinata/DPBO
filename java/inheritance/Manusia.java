class Manusia{
    private String nama;
    private String alamat;
    private String no_ktp;
    private String no_telp;

    Manusia(){}

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNoKtp(String no_ktp){
        this.no_ktp = no_ktp;
    }

    public String getNoKtp(){
        return no_ktp;
    }

    public void setNoTelp(String no_telp){
        this.no_telp = no_telp;
    }

    public String getNoTelp(){
        return no_telp;
    }
}