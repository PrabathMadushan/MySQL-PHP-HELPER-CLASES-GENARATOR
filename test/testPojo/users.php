<?php

 class Users{

	private $userid;
	private $nick_name;
	private $full_name;
	private $email;
	private $address;
	private $image;
	private $type;
	private $password;
	private $reg_date;
	private $reg_time;
	private $last_up_date;
	private $last_up_time;
	private $is_online;
	private $coo_value;
	private $status;

	public function setUserid($userid){
		$this->userid= $userid;
	}

	public function getUserid(){
		return $this->userid;
	}

	public function setNick_name($nick_name){
		$this->nick_name= $nick_name;
	}

	public function getNick_name(){
		return $this->nick_name;
	}

	public function setFull_name($full_name){
		$this->full_name= $full_name;
	}

	public function getFull_name(){
		return $this->full_name;
	}

	public function setEmail($email){
		$this->email= $email;
	}

	public function getEmail(){
		return $this->email;
	}

	public function setAddress($address){
		$this->address= $address;
	}

	public function getAddress(){
		return $this->address;
	}

	public function setImage($image){
		$this->image= $image;
	}

	public function getImage(){
		return $this->image;
	}

	public function setType($type){
		$this->type= $type;
	}

	public function getType(){
		return $this->type;
	}

	public function setPassword($password){
		$this->password= $password;
	}

	public function getPassword(){
		return $this->password;
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

	public function setIs_online($is_online){
		$this->is_online= $is_online;
	}

	public function getIs_online(){
		return $this->is_online;
	}

	public function setCoo_value($coo_value){
		$this->coo_value= $coo_value;
	}

	public function getCoo_value(){
		return $this->coo_value;
	}

	public function setStatus($status){
		$this->status= $status;
	}

	public function getStatus(){
		return $this->status;
	}

}

?> 