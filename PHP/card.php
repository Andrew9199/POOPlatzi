<?php
require_once('payment.php');

class cash extends payment{ 
    public $number;
    public $CVV;
    public $date;
    
    public function __construct($number, $CVV,$date){
        parent::__construct();
        $this -> number = $number;
        $this -> CVV = $CVV;
        $this -> date = $date;
    }   
}
?>