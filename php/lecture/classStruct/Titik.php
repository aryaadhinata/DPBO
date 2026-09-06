<?php
class Titik{
    private $x;
    private $y;

    public function __construct(){
        $this->x = 0;
        $this->y = 0;
    }

    public function setX($xp){
        $this->x = $xp;
    }

    public function getX(){
        return $this->x;
    }

    public function setY($yp){
        $this->y = $yp;
    }

    public function getY(){
        return $this->y;
    }

    function __destruct(){
    }
}
?>