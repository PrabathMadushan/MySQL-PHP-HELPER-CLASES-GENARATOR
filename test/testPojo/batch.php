<?php

 class Batch{

	private $group_id;
	private $name;
	private $taget_student_count;
	private $total_fee;
	private $reg_date;
	private $reg_time;
	private $last_up_date;
	private $last_up_time;
	private $couse_id;

	public function setGroup_id($group_id){
		$this->group_id= $group_id;
	}

	public function getGroup_id(){
		return $this->group_id;
	}

	public function setName($name){
		$this->name= $name;
	}

	public function getName(){
		return $this->name;
	}

	public function setTaget_student_count($taget_student_count){
		$this->taget_student_count= $taget_student_count;
	}

	public function getTaget_student_count(){
		return $this->taget_student_count;
	}

	public function setTotal_fee($total_fee){
		$this->total_fee= $total_fee;
	}

	public function getTotal_fee(){
		return $this->total_fee;
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

	public function setCouse_id($couse_id){
		$this->couse_id= $couse_id;
	}

	public function getCouse_id(){
		return $this->couse_id;
	}

}

?> 