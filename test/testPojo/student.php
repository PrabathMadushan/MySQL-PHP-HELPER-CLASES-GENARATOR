<?php

 class Student{

	private $student_id;
	private $full_name;
	private $nic;
	private $dob;
	private $address;
	private $email;
	private $tell_mobile;
	private $tell_home;
	private $tell_em;
	private $studentcol;
	private $reg_date;
	private $reg_time;
	private $last_up_date;
	private $last_up_time;
	private $group_id;

	public function setStudent_id($student_id){
		$this->student_id= $student_id;
	}

	public function getStudent_id(){
		return $this->student_id;
	}

	public function setFull_name($full_name){
		$this->full_name= $full_name;
	}

	public function getFull_name(){
		return $this->full_name;
	}

	public function setNic($nic){
		$this->nic= $nic;
	}

	public function getNic(){
		return $this->nic;
	}

	public function setDob($dob){
		$this->dob= $dob;
	}

	public function getDob(){
		return $this->dob;
	}

	public function setAddress($address){
		$this->address= $address;
	}

	public function getAddress(){
		return $this->address;
	}

	public function setEmail($email){
		$this->email= $email;
	}

	public function getEmail(){
		return $this->email;
	}

	public function setTell_mobile($tell_mobile){
		$this->tell_mobile= $tell_mobile;
	}

	public function getTell_mobile(){
		return $this->tell_mobile;
	}

	public function setTell_home($tell_home){
		$this->tell_home= $tell_home;
	}

	public function getTell_home(){
		return $this->tell_home;
	}

	public function setTell_em($tell_em){
		$this->tell_em= $tell_em;
	}

	public function getTell_em(){
		return $this->tell_em;
	}

	public function setStudentcol($studentcol){
		$this->studentcol= $studentcol;
	}

	public function getStudentcol(){
		return $this->studentcol;
	}

	public function setReg_date($reg_date){
		$this->reg_date= $reg_date;
	}

	public function getReg_date(){
		return $this->reg_date;
	}

	public function setReg_time($reg_time){
		$this->reg_time= $reg_time;
	}

	public function getReg_time(){
		return $this->reg_time;
	}

	public function setLast_up_date($last_up_date){
		$this->last_up_date= $last_up_date;
	}

	public function getLast_up_date(){
		return $this->last_up_date;
	}

	public function setLast_up_time($last_up_time){
		$this->last_up_time= $last_up_time;
	}

	public function getLast_up_time(){
		return $this->last_up_time;
	}

	public function setGroup_id($group_id){
		$this->group_id= $group_id;
	}

	public function getGroup_id(){
		return $this->group_id;
	}

}

?> 