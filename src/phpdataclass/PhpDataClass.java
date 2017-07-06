package phpdataclass;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PhpDataClass {

    public static void main(String[] args) throws SQLException, Exception {
        DBConnection dbc = new DBConnection("studentinformationsystem", "3307", "root", "1234");
        dbc.createConnection();
        ResultSet rs = dbc.getData("Show databases");
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        //createDataTable(dbc);
        
    }

//    public static void createDataTable(DBConnection dbc) throws SQLException, Exception {
//        ResultSet rs = dbc.getData("SHOW TABLES");
//        
//        ArrayList<String> classes=new ArrayList();
//       
//        while (rs.next()) {
//            String classString="<?php\n";
//            String tableName=rs.getString(1);
//            
//            classString+="class "+setUFirst(tableName)+"{\n";
//            
//            ResultSet rs2 = dbc.getData("DESCRIBE "+tableName);
//            ArrayList<String> cNames=new ArrayList<>();
//            while(rs2.next()){
//                String cName = rs2.getString(1);
//                classString+="private $"+cName+";\n";
//                cNames.add(cName);
//            }
//            //create Gettes and settes
//            for (String cName:cNames) {
//                classString+="public function get"+setUFirst(cName)+"(){\n"
//                        + "return $this->"+cName+";\n"
//                        + "}\n";
//                 classString+="public function set"+setUFirst(cName)+"($"+cName+"){\n"
//                        + "$this->"+cName+"=$"+cName+";\n"
//                        + "}\n";
//                 
//            }
//            
//            classString+="}\n?>";
//            classes.add(classString);
//           
//        }
//        System.out.println(classes.size());
//        classes.forEach(System.out::println);
//               
//    }
//    
    public static String setUFirst(String world){
        char fl = world.charAt(0);
        String tl = world.substring(1, world.length());
        fl=Character.toUpperCase(fl);
        return fl+tl;
    }

    public static void main2(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Create MySQL Connection");

        System.out.println("Enter username:");
        String username = scn.next();
        System.out.println("Enter password:");
        String password = scn.next();
        if ("no".equals(password.toLowerCase())) {
            password = "";
            System.out.println("Password set as empty");
        }

        System.out.println("Enter port:");
        String port = scn.next();
        System.out.println("Enter database name:");
        String databasename = scn.next();

        DBConnection dbc = new DBConnection(databasename, port, username, password);
        boolean isCreated = dbc.createConnection();
        while (isCreated) {
            System.out.println("Enter username:");
            username = scn.next();
            System.out.println("Enter password:");
            password = scn.next();
            if ("no".equals(password.toLowerCase())) {
                password = "";
                System.out.println("Password set as empty");
            }
            System.out.println("Enter port:");
            port = scn.next();
            System.out.println("Enter database name:");
            databasename = scn.next();
            dbc = new DBConnection(databasename, port, username, password);
            isCreated = dbc.createConnection();
        }

        System.out.println("Database Connection created");
        System.out.println("Enter folder to genarate files");
        String folder = scn.next();
        File file = new File(folder);
        boolean isValidFolder;
        isValidFolder = file.exists() && file.isDirectory();
        if (!isValidFolder) {
            System.out.println("Invalid folder try again");
        }
        while (!isValidFolder) {
            System.out.println("Enter folder to genarate files");
            folder = scn.next();
            file = new File(folder);
            isValidFolder = file.exists() && file.isDirectory();
            if (!isValidFolder) {
                System.out.println("Invalid folder try again");
            }
        }

    }

}
