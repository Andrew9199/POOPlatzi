<?php
require_once('payment.php');

class payPal extends payment{ 
    public $email;

    public function __construct($email){
        parent::__construct();
        $this->email = $email;
    }   
}
?>