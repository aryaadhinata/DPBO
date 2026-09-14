<?php
    class Karyawan extends Manusia {
        private $nomor_pegawai;
        private $jabatan;
        private $departemen;

        public function __construct() {
            parent::__construct();
        }

        public function setNomorPegawai($nomor_pegawai) {
            $this->nomor_pegawai = $nomor_pegawai;
        }

        public function getNomorPegawai() {
            return $this->nomor_pegawai;
        }

        public function setJabatan($jabatan) {
            $this->jabatan = $jabatan;
        }

        public function getJabatan() {
            return $this->jabatan;
        }

        public function setDepartemen($departemen) {
            $this->departemen = $departemen;
        }

        public function getDepartemen() {
            return $this->departemen;
        }

        function __destruct() {
        }
    }
?>