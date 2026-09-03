<?php
    include "Buku.php";

    $b2 = new buku("J2EE", "orang_1");
    echo $b2->getJudul();
    echo $b2->getPengarang();
?>