/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

public class ExternalCred {

    private boolean basicBool;
    public String data;
    private boolean proBool;
    private boolean premBool;
    public String user;
    private String pass;
    private String list;
    private String basic;
    private String pro;
    private String perm;
    private String type;
    private String accountType;
    String time;
    Connection con = null;
    ResultSet resultSet = null;
    ResultSet resultSet1 = null;
    java.sql.Statement st = null;
    java.sql.Statement st1 = null;

    private String patientsName;

    public String getPatientsName() {
        return patientsName;
    }

    public void setPatientsName(String patientsName) {
        this.patientsName = patientsName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBasicBool() {
        return basicBool;
    }

    public void setBasicBool(boolean basicBool) {
        this.basicBool = basicBool;
    }

    public boolean isProBool() {
        return proBool;
    }

    public void setProBool(boolean proBool) {
        this.proBool = proBool;
    }

    public boolean isPremBool() {
        return premBool;
    }

    public void setPremBool(boolean premBool) {
        this.premBool = premBool;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    public ExternalCred() {
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String connectionString = "jdbc:sqlserver://bbbgroup.database.windows.net:1433;database=BBBgroup;user=bbbgroup@bbbgroup;"
                    + "password=Anam!123;encrypt=true;trustServerCertificate=false"
                    + ";hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            con = DriverManager.getConnection(connectionString);
        } catch (SQLException ex) {
            Logger.getLogger(Credential.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isValid() throws SQLException 
    {
        String selectSql = "select * from dbo.ExternalSystem where Username = '" + user + "' and Password = '" +pass+"'";
        st = con.createStatement(); 
        resultSet = st.executeQuery(selectSql);
        if (resultSet.next())   
        {  
        	return true;
        }
        else
        	return false;
    }

    public String getList() {
        String output = null;

        try {
            output = "<table style='width:20%' align = 'center'> ";

            String selectSql = selectSql = "SELECT * FROM dbo.Patient where username = '" + user + "'";
            st = con.createStatement();
            resultSet = st.executeQuery(selectSql);

            while (resultSet.next()) {
                output = output + ("<tr><td><center><b> NAME: </td><td><center>" + resultSet.getString(1) + "</td></tr>"
                        + "<tr><td><center><b> PHONE: </td><td><center>" + resultSet.getString(3) + "</td></tr>"
                        + "<tr><td><center><b>  ADDRESS: </td><td><center>" + resultSet.getString(4) + "</td></tr>"
                        + "<tr><td><center><b>  EMAIL: </td><td><center>" + resultSet.getString(5) + "</td></tr>"
                        + "<tr><td><center><b>  SUGAR: </td><td><center>" + resultSet.getString(6) + "</td></tr>"
                        + "<tr><td><center><b>  RBC: </td><td><center>" + resultSet.getString(7) + "</td></tr>"
                        + "<tr><td><center><b>  HEART RATE: </td><td><center>" + resultSet.getString(8) + "</td></tr>"
                        + "<tr><td><center><b>  BLOOD PREASSURE: </td><td><center>" + resultSet.getString(9) + "</td></tr>"
                        + "<tr><td><center><b>  HEMOGLOBIN: </td><td><center>" + resultSet.getString(10) + "</td></tr>"
                        + "<tr><td><center><b> WBC: </td><td><center>" + resultSet.getString(11) + "</td></tr>"
                        + "<tr><td><center><b>  WEIGHT: </td><td><center>" + resultSet.getString(12) + "</td></tr>"
                        + "<tr><td><center><b>  AGE: </td><td><center>" + resultSet.getString(13) + "</td></tr>"
                        + "<tr><td><center><b>  HEIGHT: </td><td><center>" + resultSet.getString(14) + "</td></tr>"
                        + "<tr><td><center><b>  GENDER: </td><td><center>" + resultSet.getString(15) + "</td></tr>"
                        + "<tr><td><center><b>  BLODD: </td><td><center>" + resultSet.getString(16) + "</td></tr>"
                        + "<tr><td><center><b>  FAMILY DETAILS: </td><td><center>" + resultSet.getString(17) + "</td></tr>");
            }

            output = output + "</table></body></html>";

        } catch (SQLException ex) {
            Logger.getLogger(ViewPatients.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    public void setList(String list) {
        this.list = list;
    }

    public void print() {
        System.out.println(time);
        System.out.println(user);
        System.out.println(pass);

    }

    public String getPro() {
        String output = null;

        try {
            output = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email"
                    + "</th><th>Sugar Level</th>"
                    + "<th>Heart Rate</th> "
                    + "<th>Blood Pressure</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + " </tr>";

            String selectSql = selectSql = "SELECT * FROM dbo.Patient";
            st = con.createStatement();
            resultSet = st.executeQuery(selectSql);

            while (resultSet.next()) {
                output = output + ("<tr><td><center>" + resultSet.getString(1) + "</td>"
                        + "<td><center>" + resultSet.getString(3) + "</td>"
                        + "<td><center>" + resultSet.getString(4) + "</td>"
                        + "<td><center>" + resultSet.getString(5) + "</td>"
                        + "<td><center>" + resultSet.getString(6) + "</td>"
                        + "<td><center>" + resultSet.getString(8) + "</td>"
                        + "<td><center>" + resultSet.getString(9) + "</td>"
                        + "<td><center>" + resultSet.getString(15) + "</td>"
                        + "<td><center>" + resultSet.getString(16) + "</td>"
                        + "</tr>");
            }

            output = output + "</table></body></html>";

        } catch (SQLException ex) {
            Logger.getLogger(ViewPatients.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    public String getBasic() {
        String output = null;

        try {
            output = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email"
                    + "</th><th>Sugar Level</th>"
                    + "<th>Heart Rate</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + " </tr>";

            String selectSql = selectSql = "SELECT * FROM dbo.Patient";
            st = con.createStatement();
            resultSet = st.executeQuery(selectSql);

            while (resultSet.next()) {
                output = output + ("<tr><td><center>" + resultSet.getString(1) + "</td>"
                        + "<td><center>" + resultSet.getString(3) + "</td>"
                        + "<td><center>" + resultSet.getString(4) + "</td>"
                        + "<td><center>" + resultSet.getString(5) + "</td>"
                        + "<td><center>" + resultSet.getString(6) + "</td>"
                        + "<td><center>" + resultSet.getString(8) + "</td>"
                        + "<td><center>" + resultSet.getString(15) + "</td>"
                        + "<td><center>" + resultSet.getString(16) + "</td>"
                        + "</tr>");
            }

            output = output + "</table></body></html>";

        } catch (SQLException ex) {
            Logger.getLogger(ViewPatients.class.getName()).log(Level.SEVERE, null, ex);
        }

        basic = output;
        return output;
    }
    
    public String getData() throws SQLException
    {
        
        String ret = "L";
        String basic = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email</th>"
                    + "<th>Age</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + " </tr>";;
        String pro = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email</th>"
                    + "<th>Age</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + "<th>Sugar Level</th>"
                    + "<th>RBC</th>"
                    + "<th>Heart Rate</th> "
                    + "<th>Blood Preassure</th> "
                    + "<th>Hemoglobin</th>"
                    + "<th>WBC</th>";
        String perm = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email</th>"
                    + "<th>Sugar Level</th>"
                    + "<th>RBC</th>"
                    + "<th>Heart Rate</th> "
                    + "<th>Blood Preassure</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + "<th>Hemoglobin</th>"
                    + "<th>WBC</th>"
                    + "<th>Weight</th>"
                    + "<th>Age</th>"
                    + "<th>Height</th> "
                    + "<th>Family History</th>"
                    + " </tr>";;
       
       String sql = "select * from dbo.ExternalSystem where Username =  '" + user + "'";
      
       st = con.createStatement();
       resultSet = st.executeQuery(sql);
       while(resultSet.next())
       {
           if(resultSet.getBoolean("Basic"))
           {
                String b = "select * from dbo.Patient";
                st1 = con.createStatement();
                resultSet1 = st1.executeQuery(b);

                while (resultSet1.next()) 
                {
                    basic = basic + ("<tr><td><center>" + resultSet1.getString("Username") + "</td>"
                        + "<td><center>" + resultSet1.getString("Phone") + "</td>"
                        + "<td><center>" + resultSet1.getString("Address") + "</td>"
                        + "<td><center>" + resultSet1.getString("Email") + "</td>"
                        + "<td><center>" + resultSet1.getString("Age") + "</td>"
                        + "<td><center>" + resultSet1.getString("Gender") + "</td>"
                        + "<td><center>" + resultSet1.getString("Blood") + "</td>"
                        + "</tr>");
                }
               ret = basic;
           }
           else if (resultSet.getBoolean("Professional"))
           {
               String b = "select * from dbo.Patient";
                st1 = con.createStatement();
                resultSet1 = st1.executeQuery(b);

                while (resultSet1.next()) 
                {
                    pro = pro + ("<tr><td><center>" + resultSet1.getString("Username") + "</td>"
                        + "<td><center>" + resultSet1.getString("Phone") + "</td>"
                        + "<td><center>" + resultSet1.getString("Address") + "</td>"
                        + "<td><center>" + resultSet1.getString("Email") + "</td>"
                        + "<td><center>" + resultSet1.getString("Age") + "</td>"
                        + "<td><center>" + resultSet1.getString("Gender") + "</td>"
                        + "<td><center>" + resultSet1.getString("Blood") + "</td>"
                        + "<td><center>" + resultSet1.getString("Sugar_Level") + "</td>"
                        + "<td><center>" + resultSet1.getString("RBC_Count") + "</td>"
                        + "<td><center>" + resultSet1.getString("Heart_Rate") + "</td>"
                        + "<td><center>" + resultSet1.getString("Blood_Preassure") + "</td>"
                        + "<td><center>" + resultSet1.getString("Hemoglobin") + "</td>"
                        + "<td><center>" + resultSet1.getString("White_Cells") + "</td>"
                        + "</tr>");
                }
                   
                ret = pro;
           }
           else
            {
                String b = "select * from dbo.Patient";
                st1 = con.createStatement();
                resultSet1 = st1.executeQuery(b);

                while (resultSet1.next()) 
                {
                    perm = perm + ("<tr><td><center>" + resultSet1.getString("Username") + "</td>"
                        + "<td><center>" + resultSet1.getString("Phone") + "</td>"
                        + "<td><center>" + resultSet1.getString("Address") + "</td>"
                        + "<td><center>" + resultSet1.getString("Email") + "</td>"
                        + "<td><center>" + resultSet1.getString("Sugar_Level") + "</td>"
                        + "<td><center>" + resultSet1.getString("RBC_Count") + "</td>"
                        + "<td><center>" + resultSet1.getString("Heart_Rate") + "</td>"
                        + "<td><center>" + resultSet1.getString("Blood_Preassure") + "</td>"
                        + "<td><center>" + resultSet1.getString("Gender") + "</td>"
                        + "<td><center>" + resultSet1.getString("Blood") + "</td>"
                        + "<td><center>" + resultSet1.getString("Hemoglobin") + "</td>"
                        + "<td><center>" + resultSet1.getString("White_Cells") + "</td>"
                        + "<td><center>" + resultSet1.getString("Weight") + "</td>"
                        + "<td><center>" + resultSet1.getString("Age") + "</td>"
                        + "<td><center>" + resultSet1.getString("Height") + "</td>"
                        + "<td><center>" + resultSet1.getString("Family") + "</td>"
                        + "</tr>");
                }
                              
                ret = perm;
            }

       } 

        
        return ret;
        
    }

    public String getPerm() {
        String output = null;

        try {
            output = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email"
                    + "</th><th>Sugar Level</th>"
                    + "<th>RBC</th>"
                    + "<th>Heart Rate</th> "
                    + "<th>Blood Preassure</th> "
                    + "<th>Hemoglobin</th>"
                    + "<th>WBC"
                    + "</th><th>Weight</th>"
                    + "<th>Age</th>"
                    + "<th>Height</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + "<th>Family History</th>"
                    + " </tr>";

            String selectSql = selectSql = "SELECT * FROM dbo.Patient";
            st = con.createStatement();
            resultSet = st.executeQuery(selectSql);

            while (resultSet.next()) {
                output = output + ("<tr><td><center>" + resultSet.getString(1) + "</td>"
                        + "<td><center>" + resultSet.getString(3) + "</td>"
                        + "<td><center>" + resultSet.getString(4) + "</td>"
                        + "<td><center>" + resultSet.getString(5) + "</td>"
                        + "<td><center>" + resultSet.getString(6) + "</td>"
                        + "<td><center>" + resultSet.getString(7) + "</td>"
                        + "<td><center>" + resultSet.getString(8) + "</td>"
                        + "<td><center>" + resultSet.getString(9) + "</td>"
                        + "<td><center>" + resultSet.getString(10) + "</td>"
                        + "<td><center>" + resultSet.getString(11) + "</td>"
                        + "<td><center>" + resultSet.getString(12) + "</td>"
                        + "<td><center>" + resultSet.getString(13) + "</td>"
                        + "<td><center>" + resultSet.getString(14) + "</td>"
                        + "<td><center>" + resultSet.getString(15) + "</td>"
                        + "<td><center>" + resultSet.getString(16) + "</td>"
                        + "<td><center>" + resultSet.getString(17) + "</td></tr>");
            }

            output = output + "</table></body></html>";

        } catch (SQLException ex) {
            Logger.getLogger(ViewPatients.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    public String getAccountType() {

       
        return getBasic();
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean addToDB() throws SQLException, IOException {

        int test;
        PreparedStatement ps = con.prepareStatement("Insert into dbo.ExternalSystem (Username,Password,Basic,Professional,Premium) values " + "(?,?,?,?,?)");
        ps.setString(1, user);
        ps.setString(2, pass);

        if (time.equals("Basic")) {
            basicBool = true;
            premBool = false;
            proBool = false;

            ps.setBoolean(3, basicBool);
            ps.setBoolean(4, premBool);
            ps.setBoolean(5, proBool);
        } else if (time.equals("Professional")) {
            basicBool = false;
            premBool = false;
            proBool = true;

            ps.setBoolean(3, basicBool);
            ps.setBoolean(4, premBool);
            ps.setBoolean(5, proBool);
        } else if (time.equals("Premium")) {
            basicBool = false;
            premBool = true;
            proBool = false;

            ps.setBoolean(3, basicBool);
            ps.setBoolean(4, premBool);
            ps.setBoolean(5, proBool);
        }

        test = ps.executeUpdate();
        if (test == 1) {
            return true;
        } else {
            return false;
        }

    }

    public String search() {

        System.out.println(patientsName);
        String output = null;

        try {
            output = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email"
                    + "</th><th>Sugar Level</th>"
                    + "<th>RBC</th>"
                    + "<th>Heart Rate</th> "
                    + "<th>Blood Preassure</th> "
                    + "<th>Hemoglobin</th>"
                    + "<th>WBC"
                    + "</th><th>Weight</th>"
                    + "<th>Age</th>"
                    + "<th>Height</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + "<th>Family History</th>"
                    + " </tr>";

            String selectSql = selectSql = "SELECT * FROM dbo.Patient WHERE Username  ='" + patientsName + "'";
            st = con.createStatement();
            resultSet = st.executeQuery(selectSql);

            while (resultSet.next()) {
                output = output + ("<tr><td><center>" + resultSet.getString(1) + "</td>"
                        + "<td><center>" + resultSet.getString(3) + "</td>"
                        + "<td><center>" + resultSet.getString(4) + "</td>"
                        + "<td><center>" + resultSet.getString(5) + "</td>"
                        + "<td><center>" + resultSet.getString(6) + "</td>"
                        + "<td><center>" + resultSet.getString(7) + "</td>"
                        + "<td><center>" + resultSet.getString(8) + "</td>"
                        + "<td><center>" + resultSet.getString(9) + "</td>"
                        + "<td><center>" + resultSet.getString(10) + "</td>"
                        + "<td><center>" + resultSet.getString(11) + "</td>"
                        + "<td><center>" + resultSet.getString(12) + "</td>"
                        + "<td><center>" + resultSet.getString(13) + "</td>"
                        + "<td><center>" + resultSet.getString(14) + "</td>"
                        + "<td><center>" + resultSet.getString(15) + "</td>"
                        + "<td><center>" + resultSet.getString(16) + "</td>"
                        + "<td><center>" + resultSet.getString(17) + "</td></tr>");
            }

            output = output + "</table></body></html>";

        } catch (SQLException ex) {
            Logger.getLogger(ViewPatients.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;

    }

}
