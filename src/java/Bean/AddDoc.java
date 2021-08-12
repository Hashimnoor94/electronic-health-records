package Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hashim
 */
public class AddDoc 
{
    private String name;
    private String uName;
    private String pass;
    private String phone;
    private String exp;
    private String spez;
    Connection con = null;   
    ResultSet resultSet = null;
    java.sql.Statement st = null;

    public AddDoc() 
    {
        try 
        {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String connectionString = "jdbc:sqlserver://bbbgroup.database.windows.net:1433;database=BBBgroup;user=bbbgroup@bbbgroup;"
                    + "password=Anam!123;encrypt=true;trustServerCertificate=false"
                    + ";hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            con = DriverManager.getConnection(connectionString);                
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Credential.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setSpez(String spez) {
        this.spez = spez;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    
    public String getName() {
        return name;
    }

    public String getuName() {
        return uName;
    }

    public String getPass() {
        return pass;
    }

    public String getPhone() {
        return phone;
    }

    public String getExp() {
        return exp;
    }

    public String getSpez() {
        return spez;
    }

    public Connection getCon() {
        return con;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public Statement getSt() {
        return st;
    }

 
    
    public boolean isValid() throws SQLException 
    {
        int test;
        PreparedStatement ps = con.prepareStatement("Insert into dbo.Doctor values " + "(?,?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, uName);
        ps.setString(3, pass);
        ps.setString(4, phone);
        ps.setString(5, exp);
        ps.setString(6, spez);
        test = ps.executeUpdate();
        if(test == 1)
        {
            return true;
        }
        else
            return false; 
    }
    
    
    
}
