<?php
    include "Titik.php";

    $t1 = new Titik();

    $t1->setX(18);
    $t1->setY(28);

    echo "t1 : nilai x".$t1->getX()."<br/>";
    echo "t1 : nilai y".$t1->getY()."<br/>";
?>