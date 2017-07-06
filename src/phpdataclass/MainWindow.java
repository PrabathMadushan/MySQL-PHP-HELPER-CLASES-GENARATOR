package phpdataclass;

import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends javax.swing.JFrame {

    private DBConnection conn;

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSetConection = new javax.swing.JButton();
        lblConnectionStatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lstDatabases = new javax.swing.JComboBox<>();
        btnConnectToDatabase = new javax.swing.JButton();
        lbldatabaseStatus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTableList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        lblPath = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnGenerate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFileList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phpdataclass/logo.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Username");

        txtUsername.setText("root");

        jLabel3.setText("Password");

        txtPort.setText("3306");

        jLabel4.setText("Port");

        btnSetConection.setText("Set Connection");
        btnSetConection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetConectionActionPerformed(evt);
            }
        });

        lblConnectionStatus.setText("[*]");

        jLabel6.setText("Database");

        btnConnectToDatabase.setText("Connect");
        btnConnectToDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectToDatabaseActionPerformed(evt);
            }
        });

        lbldatabaseStatus.setText("[*]");

        tblTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tables"
            }
        ));
        jScrollPane1.setViewportView(tblTableList);

        jLabel8.setText("Genarate path");

        lblPath.setBackground(new java.awt.Color(204, 204, 204));
        lblPath.setText("E:\\Big Software Projects\\Student Information System\\phpDataClass\\test\\testPojo");
        lblPath.setOpaque(true);

        jButton3.setText("set");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnGenerate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerate.setText("Genarate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        tblFileList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Files"
            }
        ));
        jScrollPane2.setViewportView(tblFileList);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtUsername)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(btnSetConection)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lblConnectionStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lstDatabases, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lbldatabaseStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnConnectToDatabase))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 166, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(btnGenerate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabel8)
                                        .add(18, 18, 18)
                                        .add(lblPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jButton3))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4)
                    .add(txtPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnSetConection)
                    .add(lblConnectionStatus))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lstDatabases)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel6)
                        .add(btnConnectToDatabase)
                        .add(lbldatabaseStatus)))
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8)
                            .add(lblPath))
                        .add(5, 5, 5)
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnGenerate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 226, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetConectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetConectionActionPerformed

        conn = new DBConnection("", txtPort.getText(), txtUsername.getText(), new String(txtPassword.getPassword()));
        boolean b = conn.createConnection();
        if (b) {
            lblConnectionStatus.setText("[*Not Connected..!]");
            lstDatabases.removeAllItems();
        } else {
            lblConnectionStatus.setText("[*Connected]");
            lstDatabases.removeAllItems();
            try {
                String sql = "SHOW DATABASES";
                ResultSet result = conn.getData(sql);
                while (result.next()) {
                    String database = result.getString(1);
                    lstDatabases.addItem(database);
                }

            } catch (Exception ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnSetConectionActionPerformed

    private String setUFirst(String world) {
        if (!world.isEmpty()) {
            char fl = world.charAt(0);
            String tl = world.substring(1, world.length());
            fl = Character.toUpperCase(fl);
            return fl + tl;
        } else {
            return "";
        }

    }

    private void genarateFiles() throws Exception {
        //Create pojo classes
        String sql = "SHOW TABLES";
        ResultSet rs = conn.getData(sql);
        while (rs.next()) {
            String tableName = rs.getString(1);
            File f = new File(lblPath.getText() + "/" + tableName + ".php");
            //create class
            String classString = "<?php\n\n ";
            classString += "class " + setUFirst(tableName) + "{\n\n";
            //create fields
            ResultSet rs2 = conn.getData("DESCRIBE " + tableName);
            ArrayList<String> fList = new ArrayList();
            while (rs2.next()) {
                String fieldName = rs2.getString(1);
                fList.add(fieldName);
                classString += "\tprivate $" + fieldName + ";\n";
            }

            classString += "\n";
            //create getters and settes
            for (String field : fList) {
                classString += "\tpublic function set" + setUFirst(field) + "($" + field + "){\n";
                classString += "\t\t$this->" + field + "= $" + field + ";\n";
                classString += "\t}\n\n";
                classString += "\tpublic function get" + setUFirst(field) + "(){\n";
                classString += "\t\treturn $this->" + field + ";\n";
                classString += "\t}\n\n";
            }
            classString += "}\n\n";

            classString += "?> ";
            f.createNewFile();
            try (FileWriter fw = new FileWriter(f)) {
                fw.write(classString);
            }
        }

        //create database class
        String dClassString = "<?php \n\n class Database{\n";
        //Create Connection
        dClassString += "\tpublic static function getConnection(){\n"
                //return mysqli_connect($servername, $username, $db_password, $dbname, $port);
                + "\t\treturn mysqli_connect("
                + "'localhost',"
                + "'" + conn.getUsername() + "',"
                + "'" + conn.getPassword() + "',"
                + "'" + conn.getDatabaseName() + "',"
                + "'" + conn.getPort() + "');\n"
                + "\t}\n";

        ResultSet rs2 = conn.getData("SHOW TABLES");
        while (rs2.next()) {
            String tableName = rs2.getString(1);
            //Save table data
            dClassString += createSaveFunction(tableName);
            //updata table data
            dClassString += createUpdateFunction(tableName);
            //read table data
            dClassString += getDataFunction(tableName);
            //read by columns
            dClassString += getDataByColomn(tableName);
        }

        dClassString += "}\n?>";
        File f = new File(lblPath.getText() + "/Database.php");
        f.createNewFile();
        try (FileWriter fw = new FileWriter(f)) {
            fw.write(dClassString);
        }
    }

    private String createSaveFunction(String tableName) throws Exception {

        String fString = "\tpublic static function save" + setUFirst(tableName) + "($" + tableName + "){\n";
        fString += "\t\t$sql=\"INSERT INTO " + tableName;
        String sub01 = "(";
        String sub02 = "(\"";
        ResultSet rs3 = conn.getData("DESCRIBE " + tableName);
        while (rs3.next()) {
            String fieldName = rs3.getString(1);
            if (rs3.isLast()) {
                sub01 += fieldName;
                sub02 += "\n\t\t\t.$" + tableName + "->get" + setUFirst(fieldName) + "().\"";
            } else {
                sub01 += fieldName + ",";
                sub02 += "\n\t\t\t.$" + tableName + "->get" + setUFirst(fieldName) + "().\",\"";
            }
        }
        sub01 += ")";
        sub02 += ")\"";
        fString += sub01 + " VALUES" + sub02 + ";\n";
        fString += "\t\tmysqli_query(Database::getConnection(), $sql);";
        fString += "\t}\n\n";
        return fString;
    }

    private String createUpdateFunction(String tableName) throws Exception {
        String fString = "\tpublic static function update" + setUFirst(tableName) + "(" + setUFirst(tableName) + " $" + tableName + "){\n";
        fString += "\t\t$sql=\"UPDATE " + tableName + " SET \"\n";
        ResultSet rs = conn.getData("DESCRIBE " + tableName);
        String pk = "";
        while (rs.next()) {
            String fname = rs.getString(1);
            String s = rs.getString("Key");
            if (s.equalsIgnoreCase("PRI")) {
                pk = fname;
            }
            if (!rs.isLast()) {
                fString += "\t\t\t.\"" + fname + "='\".$" + tableName + "->get" + setUFirst(fname) + "().\"',\"\n";
            } else {
                fString += "\t\t\t.\"" + fname + "='\".$" + tableName + "->get" + setUFirst(fname) + "().\"'WHERE " + pk + "='\".$" + tableName + "->get" + setUFirst(pk) + "().\"'\";\n";
            }
        }

        fString += "\t\tmysqli_query(Database::getConnection(), $sql);\n";
        fString += "\t}\n\n";
        return fString;
    }

    private String getDataByColomn(String tableName) throws Exception {
        String functions = "";
        ResultSet rs = conn.getData("DESCRIBE " + tableName);
        while (rs.next()) {
            String fName = rs.getString(1);
            String fString = "\tpublic static function get" + setUFirst(tableName) + "By" + fName + "($" + fName + "){\n"
                    + "\t\treturn Database::get" + setUFirst(tableName) + "(\"WHERE " + fName + "=\".$" + fName + ");\n"
                    + "\t}\n\n";
            functions += fString;
        }
        return functions;
    }

    private String getDataFunction(String tableName) throws Exception {
        String fString = "\tpublic static function get" + setUFirst(tableName) + "($where){\n";
        fString += "\t\t$sql=\"SELECT * FROM " + tableName + " \".$where;\n";
        fString += "\t\t$result = mysqli_query(Database::getConnection(), $sql);\n";
        fString += "\t\tif (mysqli_num_rows($result) > 0) {\n";
        fString += "\t\t$results=array();\n\t\t$i=0;\n";
        fString += "\t\twhile($row = mysqli_fetch_assoc($result)){\n";
        fString += "\t\t\t\t$table=new " + setUFirst(tableName) + "();\n";
        ResultSet rs = conn.getData("DESCRIBE " + tableName);
        while (rs.next()) {
            String fName = rs.getString(1);
            fString += "\t\t\t\t$table->set" + setUFirst(fName) + "($row['" + fName + "']);\n";
        }

        fString += "\t\t\t $results[$i++]=$table;\n";
        fString += "\t\t\t}\n";
        fString += "\t\t\treturn $results;\n";
        fString += "\t\t}else{\n\t\t\treturn null;\n\t\t}\n";
        fString += "\t}\n\n";
        return fString;
    }

    private void btnConnectToDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectToDatabaseActionPerformed
        String database = lstDatabases.getSelectedItem().toString();

        if (!(database == null || database.isEmpty())) {

        }
        if (conn.setDatabaseName(database)) {
            lbldatabaseStatus.setText("[*Connected to database]");

            try {
                DefaultTableModel model_1 = (DefaultTableModel) tblTableList.getModel();
                DefaultTableModel model_2 = (DefaultTableModel) tblFileList.getModel();
                model_1.setRowCount(0);
                model_2.setRowCount(0);
                String sql = "SHOW TABLES";
                ResultSet rs = conn.getData(sql);
                while (rs.next()) {
                    Vector rd_1 = new Vector();
                    String tableName = rs.getString(1);
                    rd_1.add(tableName);
                    model_1.addRow(rd_1);
                    Vector rd_2 = new Vector();
                    rd_2.add(setUFirst(tableName) + ".php");
                    model_2.addRow(rd_2);
                }
                Vector rd = new Vector();
                rd.add("Databse.php");
                model_2.addRow(rd);

            } catch (Exception ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lbldatabaseStatus.setText("[*Not Connected to database..!]");

        }

    }//GEN-LAST:event_btnConnectToDatabaseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);
        fc.setDialogTitle("Open folder as main folder");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            lblPath.setText(fc.getSelectedFile().getPath());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed

        try {
            genarateFiles();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnGenerateActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnectToDatabase;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnSetConection;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConnectionStatus;
    private javax.swing.JLabel lblPath;
    private javax.swing.JLabel lbldatabaseStatus;
    private javax.swing.JComboBox<String> lstDatabases;
    private javax.swing.JTable tblFileList;
    private javax.swing.JTable tblTableList;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
