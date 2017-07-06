<?php

 class Couses{

	private $couse_id;
	private $name;
	private $description;
	private $period;
	private $reg_date;
	private $reg_time;
	private $last_up_date;
	private $last_up_time;
	private $created_by;

	public function setCouse_id($couse_id){
		$this->couse_id= $couse_id;
	}

	public function getCouse_id(){
		return $this->couse_id;
	}

	public function setName($name){
		$this->name= $name;
	}

	public function getName(){
		return $this->name;
	}

	public function setDescription($description){
		$this->description= $description;
	}

	public function getDescription(){
		return $this->description;
	}

	public function setPeriod($period){
		$this->period= $period;
	}

	public function getPeriod(){
		return $this->period;
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

	public function setCreated_by($created_by){
		$this->created_by= $created_by;
	}

	public function getCreated_by(){
		return $this->created_by;
	}

}

?> 