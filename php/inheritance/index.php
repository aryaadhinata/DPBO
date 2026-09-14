<?php
    include 'Manusia.php';
    include 'Karyawan.php';

    $kmanusia = new Manusia();
    $kmanusia->setNama("John Doe");
    $kmanusia->setAlamat("123 Main St");
    $kmanusia->setNoKtp("123456789");
    $kmanusia->setNoTelepon("555-1234");

    echo "Nama: " . $kmanusia->getNama() . "<br>";
    echo "Alamat: " . $kmanusia->getAlamat() . "<br>";
    echo "No KTP: " . $kmanusia->getNoKtp() . "<br>";
    echo "No Telepon: " . $kmanusia->getNoTelepon(). "<br><br>";

    $kkaryawan = new Karyawan();
    $kkaryawan->setNama("John Doe");
    $kkaryawan->setAlamat("123 Main St");
    $kkaryawan->setNoKtp("123456789");
    $kkaryawan->setNoTelepon("555-1234");
    $kkaryawan->setNomorPegawai("EMP001");
    $kkaryawan->setJabatan("-");
    $kkaryawan->setDepartemen("-");

    echo "Nama: " . $kkaryawan->getNama() . "<br>";
    echo "Alamat: " . $kkaryawan->getAlamat() . "<br>";
    echo "No KTP: " . $kkaryawan->getNoKtp() . "<br>";
    echo "No Telepon: " . $kkaryawan->getNoTelepon() . "<br>";
    echo "Nomor Pegawai: " . $kkaryawan->getNomorPegawai() . "<br>";
    echo "Jabatan: " . $kkaryawan->getJabatan() . "<br>";
    echo "Departemen: " . $kkaryawan->getDepartemen() . "<br>";
?>