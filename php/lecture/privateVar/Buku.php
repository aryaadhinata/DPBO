<?php

class Buku{
    private $judul = "";
    private $pengarang = "";

    function __construct($j = "", $p = ""){
        $this->judul = $j;
        $this->pengarang = $p;
    }

    function setJudul($j = ""){
        $this->judul = $j;
    }
    
    function setPengarang($p = ""){
        $this->pengarang = $p;
    }

    function getJudul(){
        return $this->judul;
    }

    function getPengarang(){
        return $this->judul;
    }
}
?>