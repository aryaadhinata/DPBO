<?php
    class Manusia {
        private $nama;
        private $alamat;
        private $no_ktp;
        private $no_telepon;

        public function __construct() {
        }

        public function setNama($nama) {
            $this->nama = $nama;
        }

        public function getNama() {
            return $this->nama;
        }

        public function setAlamat($alamat) {
            $this->alamat = $alamat;
        }

        public function getAlamat() {
            return $this->alamat;
        }

        public function setNoKtp($no_ktp) {
            $this->no_ktp = $no_ktp;
        }

        public function getNoKtp() {
            return $this->no_ktp;
        }

        public function setNoTelepon($no_telepon) {
            $this->no_telepon = $no_telepon;
        }

        public function getNoTelepon() {
            return $this->no_telepon;
        }

        function __destruct() {
            // Destructor logic if needed
        }
    }
?>