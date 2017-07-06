<?php

 class Payments{

	private $payment_id;
	private $date;
	private $time;
	private $installment;
	private $status;
	private $student_id;

	public function setPayment_id($payment_id){
		$this->payment_id= $payment_id;
	}

	public function getPayment_id(){
		return $this->payment_id;
	}

	public function setDate($date){
		$this->date= $date;
	}

	public function getDate(){
		return $this->date;
	}

	public function setTime($time){
		$this->time= $time;
	}

	public function getTime(){
		return $this->time;
	}

	public function setInstallment($installment){
		$this->installment= $installment;
	}

	public function getInstallment(){
		return $this->installment;
	}

	public function setStatus($status){
		$this->status= $status;
	}

	public function getStatus(){
		return $this->status;
	}

	public function setStudent_id($student_id){
		$this->student_id= $student_id;
	}

	public function getStudent_id(){
		return $this->student_id;
	}

}

?> 