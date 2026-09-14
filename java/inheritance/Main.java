public class Main {
    public static void main(String[] args) {
        Manusia kmanusia = new Manusia();
        kmanusia.setNama("John Doe");
        kmanusia.setAlamat("Jl. Contoh No. 123");
        kmanusia.setNoKtp("1234567890");
        kmanusia.setNoTelp("081234567890");

        System.out.println("Nama: " + kmanusia.getNama());
        System.out.println("Alamat: " + kmanusia.getAlamat());
        System.out.println("No KTP: " + kmanusia.getNoKtp());
        System.out.println("No Telp: " + kmanusia.getNoTelp());

        Karyawan karyawan = new Karyawan();
        karyawan.setNama("John Doe");
        karyawan.setAlamat("Jl. Contoh No. 123");
        karyawan.setNoKtp("1234567890");
        karyawan.setNoTelp("081234567890");
        karyawan.setNomorPegawai("EMP001");
        karyawan.setJabatan("Manager");
        karyawan.setDepartemen("HRD");

        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Alamat: " + karyawan.getAlamat());
        System.out.println("No KTP: " + karyawan.getNoKtp());
        System.out.println("No Telp: " + karyawan.getNoTelp());
        System.out.println("Nomor Pegawai: " + karyawan.getNomorPegawai());
        System.out.println("Jabatan: " + karyawan.getJabatan());
        System.out.println("Departemen: " + karyawan.getDepartemen());
    }
}
