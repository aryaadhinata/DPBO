public class Karyawan extends Manusia{
    private String nomor_pegawai;
    private String jabatan;
    private String departemen;

    Karyawan(){}

    public void setNomorPegawai(String nomor_pegawai){
        this.nomor_pegawai = nomor_pegawai;
    }

    public String getNomorPegawai(){
        return nomor_pegawai;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public String getDepartemen(){
        return departemen;
    }
    
}
