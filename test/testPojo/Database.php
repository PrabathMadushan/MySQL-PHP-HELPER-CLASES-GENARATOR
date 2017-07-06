<?php

class Database {

    public static function getConnection() {
        return mysqli_connect('localhost', 'root', '', 'studentinformationsystem', '3306');
    }

    public static function saveBatch($batch) {
        $sql = "INSERT INTO batch(group_id,name,taget_student_count,total_fee,reg_date,reg_time,last_up_date,last_up_time,couse_id) VALUES("
                . $batch->getGroup_id() . ","
                . $batch->getName() . ","
                . $batch->getTaget_student_count() . ","
                . $batch->getTotal_fee() . ","
                . $batch->getReg_date() . ","
                . $batch->getReg_time() . ","
                . $batch->getLast_up_date() . ","
                . $batch->getLast_up_time() . ","
                . $batch->getCouse_id() . ")";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function updateBatch(Batch $batch) {
        $sql = "UPDATE batch SET "
                . "name='" . $batch->getName() . "',"
                . "taget_student_count='" . $batch->getTaget_student_count() . "',"
                . "total_fee='" . $batch->getTotal_fee() . "',"
                . "reg_date='" . $batch->getReg_date() . "',"
                . "reg_time='" . $batch->getReg_time() . "',"
                . "last_up_date='" . $batch->getLast_up_date() . "',"
                . "last_up_time='" . $batch->getLast_up_time() . "',"
                . "couse_id='" . $batch->getCouse_id() . "'WHERE group_id='" . $batch->getGroup_id() . "'";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function getBatch($where) {
        $sql = "SELECT * FROM batch " . $where;
        $result = mysqli_query(Database::getConnection(), $sql);
        if (mysqli_num_rows($result) > 0) {
            $results = array();
            $i = 0;
            while ($row = mysqli_fetch_assoc($result)) {
                $table = new Batch();
                $table->setGroup_id($row['group_id']);
                $table->setName($row['name']);
                $table->setTaget_student_count($row['taget_student_count']);
                $table->setTotal_fee($row['total_fee']);
                $table->setReg_date($row['reg_date']);
                $table->setReg_time($row['reg_time']);
                $table->setLast_up_date($row['last_up_date']);
                $table->setLast_up_time($row['last_up_time']);
                $table->setCouse_id($row['couse_id']);
                $results[$i++] = $table;
            }
            return $results;
        } else {
            return null;
        }
    }

    public static function getBatchBygroup_id($group_id) {
        return Database::getBatch("WHERE group_id=" . $group_id);
    }

    public static function getBatchByname($name) {
        return Database::getBatch("WHERE name=" . $name);
    }

    public static function getBatchBytaget_student_count($taget_student_count) {
        return Database::getBatch("WHERE taget_student_count=" . $taget_student_count);
    }

    public static function getBatchBytotal_fee($total_fee) {
        return Database::getBatch("WHERE total_fee=" . $total_fee);
    }

    public static function getBatchByreg_date($reg_date) {
        return Database::getBatch("WHERE reg_date=" . $reg_date);
    }

    public static function getBatchByreg_time($reg_time) {
        return Database::getBatch("WHERE reg_time=" . $reg_time);
    }

    public static function getBatchBylast_up_date($last_up_date) {
        return Database::getBatch("WHERE last_up_date=" . $last_up_date);
    }

    public static function getBatchBylast_up_time($last_up_time) {
        return Database::getBatch("WHERE last_up_time=" . $last_up_time);
    }

    public static function getBatchBycouse_id($couse_id) {
        return Database::getBatch("WHERE couse_id=" . $couse_id);
    }

    public static function saveCouses($couses) {
        $sql = "INSERT INTO couses(couse_id,name,description,period,reg_date,reg_time,last_up_date,last_up_time,created_by) VALUES("
                . $couses->getCouse_id() . ","
                . $couses->getName() . ","
                . $couses->getDescription() . ","
                . $couses->getPeriod() . ","
                . $couses->getReg_date() . ","
                . $couses->getReg_time() . ","
                . $couses->getLast_up_date() . ","
                . $couses->getLast_up_time() . ","
                . $couses->getCreated_by() . ")";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function updateCouses(Couses $couses) {
        $sql = "UPDATE couses SET "
                . "name='" . $couses->getName() . "',"
                . "description='" . $couses->getDescription() . "',"
                . "period='" . $couses->getPeriod() . "',"
                . "reg_date='" . $couses->getReg_date() . "',"
                . "reg_time='" . $couses->getReg_time() . "',"
                . "last_up_date='" . $couses->getLast_up_date() . "',"
                . "last_up_time='" . $couses->getLast_up_time() . "',"
                . "created_by='" . $couses->getCreated_by() . "'WHERE couse_id='" . $couses->getCouse_id() . "'";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function getCouses($where) {
        $sql = "SELECT * FROM couses " . $where;
        $result = mysqli_query(Database::getConnection(), $sql);
        if (mysqli_num_rows($result) > 0) {
            $results = array();
            $i = 0;
            while ($row = mysqli_fetch_assoc($result)) {
                $table = new Couses();
                $table->setCouse_id($row['couse_id']);
                $table->setName($row['name']);
                $table->setDescription($row['description']);
                $table->setPeriod($row['period']);
                $table->setReg_date($row['reg_date']);
                $table->setReg_time($row['reg_time']);
                $table->setLast_up_date($row['last_up_date']);
                $table->setLast_up_time($row['last_up_time']);
                $table->setCreated_by($row['created_by']);
                $results[$i++] = $table;
            }
            return $results;
        } else {
            return null;
        }
    }

    public static function getCousesBycouse_id($couse_id) {
        return Database::getCouses("WHERE couse_id=" . $couse_id);
    }

    public static function getCousesByname($name) {
        return Database::getCouses("WHERE name=" . $name);
    }

    public static function getCousesBydescription($description) {
        return Database::getCouses("WHERE description=" . $description);
    }

    public static function getCousesByperiod($period) {
        return Database::getCouses("WHERE period=" . $period);
    }

    public static function getCousesByreg_date($reg_date) {
        return Database::getCouses("WHERE reg_date=" . $reg_date);
    }

    public static function getCousesByreg_time($reg_time) {
        return Database::getCouses("WHERE reg_time=" . $reg_time);
    }

    public static function getCousesBylast_up_date($last_up_date) {
        return Database::getCouses("WHERE last_up_date=" . $last_up_date);
    }

    public static function getCousesBylast_up_time($last_up_time) {
        return Database::getCouses("WHERE last_up_time=" . $last_up_time);
    }

    public static function getCousesBycreated_by($created_by) {
        return Database::getCouses("WHERE created_by=" . $created_by);
    }

    public static function savePayments($payments) {
        $sql = "INSERT INTO payments(payment_id,date,time,installment,status,student_id) VALUES("
                . $payments->getPayment_id() . ","
                . $payments->getDate() . ","
                . $payments->getTime() . ","
                . $payments->getInstallment() . ","
                . $payments->getStatus() . ","
                . $payments->getStudent_id() . ")";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function updatePayments(Payments $payments) {
        $sql = "UPDATE payments SET "
                . "date='" . $payments->getDate() . "',"
                . "time='" . $payments->getTime() . "',"
                . "installment='" . $payments->getInstallment() . "',"
                . "status='" . $payments->getStatus() . "',"
                . "student_id='" . $payments->getStudent_id() . "'WHERE payment_id='" . $payments->getPayment_id() . "'";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function getPayments($where) {
        $sql = "SELECT * FROM payments " . $where;
        $result = mysqli_query(Database::getConnection(), $sql);
        if (mysqli_num_rows($result) > 0) {
            $results = array();
            $i = 0;
            while ($row = mysqli_fetch_assoc($result)) {
                $table = new Payments();
                $table->setPayment_id($row['payment_id']);
                $table->setDate($row['date']);
                $table->setTime($row['time']);
                $table->setInstallment($row['installment']);
                $table->setStatus($row['status']);
                $table->setStudent_id($row['student_id']);
                $results[$i++] = $table;
            }
            return $results;
        } else {
            return null;
        }
    }

    public static function getPaymentsBypayment_id($payment_id) {
        return Database::getPayments("WHERE payment_id=" . $payment_id);
    }

    public static function getPaymentsBydate($date) {
        return Database::getPayments("WHERE date=" . $date);
    }

    public static function getPaymentsBytime($time) {
        return Database::getPayments("WHERE time=" . $time);
    }

    public static function getPaymentsByinstallment($installment) {
        return Database::getPayments("WHERE installment=" . $installment);
    }

    public static function getPaymentsBystatus($status) {
        return Database::getPayments("WHERE status=" . $status);
    }

    public static function getPaymentsBystudent_id($student_id) {
        return Database::getPayments("WHERE student_id=" . $student_id);
    }

    public static function saveStudent($student) {
        $sql = "INSERT INTO student(student_id,full_name,nic,dob,address,email,tell_mobile,tell_home,tell_em,studentcol,reg_date,reg_time,last_up_date,last_up_time,group_id) VALUES("
                . $student->getStudent_id() . ","
                . $student->getFull_name() . ","
                . $student->getNic() . ","
                . $student->getDob() . ","
                . $student->getAddress() . ","
                . $student->getEmail() . ","
                . $student->getTell_mobile() . ","
                . $student->getTell_home() . ","
                . $student->getTell_em() . ","
                . $student->getStudentcol() . ","
                . $student->getReg_date() . ","
                . $student->getReg_time() . ","
                . $student->getLast_up_date() . ","
                . $student->getLast_up_time() . ","
                . $student->getGroup_id() . ")";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function updateStudent(Student $student) {
        $sql = "UPDATE student SET "
                . "full_name='" . $student->getFull_name() . "',"
                . "nic='" . $student->getNic() . "',"
                . "dob='" . $student->getDob() . "',"
                . "address='" . $student->getAddress() . "',"
                . "email='" . $student->getEmail() . "',"
                . "tell_mobile='" . $student->getTell_mobile() . "',"
                . "tell_home='" . $student->getTell_home() . "',"
                . "tell_em='" . $student->getTell_em() . "',"
                . "studentcol='" . $student->getStudentcol() . "',"
                . "reg_date='" . $student->getReg_date() . "',"
                . "reg_time='" . $student->getReg_time() . "',"
                . "last_up_date='" . $student->getLast_up_date() . "',"
                . "last_up_time='" . $student->getLast_up_time() . "',"
                . "group_id='" . $student->getGroup_id() . "'WHERE student_id='" . $student->getStudent_id() . "'";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function getStudent($where) {
        $sql = "SELECT * FROM student " . $where;
        $result = mysqli_query(Database::getConnection(), $sql);
        if (mysqli_num_rows($result) > 0) {
            $results = array();
            $i = 0;
            while ($row = mysqli_fetch_assoc($result)) {
                $table = new Student();
                $table->setStudent_id($row['student_id']);
                $table->setFull_name($row['full_name']);
                $table->setNic($row['nic']);
                $table->setDob($row['dob']);
                $table->setAddress($row['address']);
                $table->setEmail($row['email']);
                $table->setTell_mobile($row['tell_mobile']);
                $table->setTell_home($row['tell_home']);
                $table->setTell_em($row['tell_em']);
                $table->setStudentcol($row['studentcol']);
                $table->setReg_date($row['reg_date']);
                $table->setReg_time($row['reg_time']);
                $table->setLast_up_date($row['last_up_date']);
                $table->setLast_up_time($row['last_up_time']);
                $table->setGroup_id($row['group_id']);
                $results[$i++] = $table;
            }
            return $results;
        } else {
            return null;
        }
    }

    public static function getStudentBystudent_id($student_id) {
        return Database::getStudent("WHERE student_id=" . $student_id);
    }

    public static function getStudentByfull_name($full_name) {
        return Database::getStudent("WHERE full_name=" . $full_name);
    }

    public static function getStudentBynic($nic) {
        return Database::getStudent("WHERE nic=" . $nic);
    }

    public static function getStudentBydob($dob) {
        return Database::getStudent("WHERE dob=" . $dob);
    }

    public static function getStudentByaddress($address) {
        return Database::getStudent("WHERE address=" . $address);
    }

    public static function getStudentByemail($email) {
        return Database::getStudent("WHERE email=" . $email);
    }

    public static function getStudentBytell_mobile($tell_mobile) {
        return Database::getStudent("WHERE tell_mobile=" . $tell_mobile);
    }

    public static function getStudentBytell_home($tell_home) {
        return Database::getStudent("WHERE tell_home=" . $tell_home);
    }

    public static function getStudentBytell_em($tell_em) {
        return Database::getStudent("WHERE tell_em=" . $tell_em);
    }

    public static function getStudentBystudentcol($studentcol) {
        return Database::getStudent("WHERE studentcol=" . $studentcol);
    }

    public static function getStudentByreg_date($reg_date) {
        return Database::getStudent("WHERE reg_date=" . $reg_date);
    }

    public static function getStudentByreg_time($reg_time) {
        return Database::getStudent("WHERE reg_time=" . $reg_time);
    }

    public static function getStudentBylast_up_date($last_up_date) {
        return Database::getStudent("WHERE last_up_date=" . $last_up_date);
    }

    public static function getStudentBylast_up_time($last_up_time) {
        return Database::getStudent("WHERE last_up_time=" . $last_up_time);
    }

    public static function getStudentBygroup_id($group_id) {
        return Database::getStudent("WHERE group_id=" . $group_id);
    }

    public static function saveUsers($users) {
        $sql = "INSERT INTO users(userid,nick_name,full_name,email,address,image,type,password,reg_date,reg_time,last_up_date,last_up_time,is_online,coo_value,status) VALUES("
                . $users->getUserid() . ","
                . $users->getNick_name() . ","
                . $users->getFull_name() . ","
                . $users->getEmail() . ","
                . $users->getAddress() . ","
                . $users->getImage() . ","
                . $users->getType() . ","
                . $users->getPassword() . ","
                . $users->getReg_date() . ","
                . $users->getReg_time() . ","
                . $users->getLast_up_date() . ","
                . $users->getLast_up_time() . ","
                . $users->getIs_online() . ","
                . $users->getCoo_value() . ","
                . $users->getStatus() . ")";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function updateUsers(Users $users) {
        $sql = "UPDATE users SET "
                . "nick_name='" . $users->getNick_name() . "',"
                . "full_name='" . $users->getFull_name() . "',"
                . "email='" . $users->getEmail() . "',"
                . "address='" . $users->getAddress() . "',"
                . "image='" . $users->getImage() . "',"
                . "type='" . $users->getType() . "',"
                . "password='" . $users->getPassword() . "',"
                . "reg_date='" . $users->getReg_date() . "',"
                . "reg_time='" . $users->getReg_time() . "',"
                . "last_up_date='" . $users->getLast_up_date() . "',"
                . "last_up_time='" . $users->getLast_up_time() . "',"
                . "is_online='" . $users->getIs_online() . "',"
                . "coo_value='" . $users->getCoo_value() . "',"
                . "status='" . $users->getStatus() . "'WHERE userid='" . $users->getUserid() . "'";
        mysqli_query(Database::getConnection(), $sql);
    }

    public static function getUsers($where) {
        $sql = "SELECT * FROM users " . $where;
        $result = mysqli_query(Database::getConnection(), $sql);
        if (mysqli_num_rows($result) > 0) {
            $results = array();
            $i = 0;
            while ($row = mysqli_fetch_assoc($result)) {
                $table = new Users();
                $table->setUserid($row['userid']);
                $table->setNick_name($row['nick_name']);
                $table->setFull_name($row['full_name']);
                $table->setEmail($row['email']);
                $table->setAddress($row['address']);
                $table->setImage($row['image']);
                $table->setType($row['type']);
                $table->setPassword($row['password']);
                $table->setReg_date($row['reg_date']);
                $table->setReg_time($row['reg_time']);
                $table->setLast_up_date($row['last_up_date']);
                $table->setLast_up_time($row['last_up_time']);
                $table->setIs_online($row['is_online']);
                $table->setCoo_value($row['coo_value']);
                $table->setStatus($row['status']);
                $results[$i++] = $table;
            }
            return $results;
        } else {
            return null;
        }
    }

    public static function getUsersByuserid($userid) {
        return Database::getUsers("WHERE userid=" . $userid);
    }

    public static function getUsersBynick_name($nick_name) {
        return Database::getUsers("WHERE nick_name=" . $nick_name);
    }

    public static function getUsersByfull_name($full_name) {
        return Database::getUsers("WHERE full_name=" . $full_name);
    }

    public static function getUsersByemail($email) {
        return Database::getUsers("WHERE email=" . $email);
    }

    public static function getUsersByaddress($address) {
        return Database::getUsers("WHERE address=" . $address);
    }

    public static function getUsersByimage($image) {
        return Database::getUsers("WHERE image=" . $image);
    }

    public static function getUsersBytype($type) {
        return Database::getUsers("WHERE type=" . $type);
    }

    public static function getUsersBypassword($password) {
        return Database::getUsers("WHERE password=" . $password);
    }

    public static function getUsersByreg_date($reg_date) {
        return Database::getUsers("WHERE reg_date=" . $reg_date);
    }

    public static function getUsersByreg_time($reg_time) {
        return Database::getUsers("WHERE reg_time=" . $reg_time);
    }

    public static function getUsersBylast_up_date($last_up_date) {
        return Database::getUsers("WHERE last_up_date=" . $last_up_date);
    }

    public static function getUsersBylast_up_time($last_up_time) {
        return Database::getUsers("WHERE last_up_time=" . $last_up_time);
    }

    public static function getUsersByis_online($is_online) {
        return Database::getUsers("WHERE is_online=" . $is_online);
    }

    public static function getUsersBycoo_value($coo_value) {
        return Database::getUsers("WHERE coo_value=" . $coo_value);
    }

    public static function getUsersBystatus($status) {
        return Database::getUsers("WHERE status=" . $status);
    }

}

?>