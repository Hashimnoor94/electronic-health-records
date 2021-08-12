package Bean;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hashim
 */
public class Credential 
{
    private String user;
    private String pass;
    Connection con = null;   
    ResultSet resultSet = null;
    java.sql.Statement st = null;
    
    public Credential() 
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

    public String getUser()
    {
        return user;
    }

    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getPass() 
    {
        return pass;
    }

    public void setPass(String pass) 
    {
        this.pass = pass;
    }

    public boolean isValid() throws SQLException 
    {
        String selectSql = "select * from dbo.Doctor where uname = '" + user + "' and pwd = '" +pass+"'";
        st = con.createStatement(); 
        resultSet = st.executeQuery(selectSql);
        if (resultSet.next())   
        {  
        	return true;
        }
        else
        	return false;
    }
    
    public boolean isDocValid() throws SQLException 
    {
        String selectSql = "select * from dbo.Doctor where uname = '" + user +"'";
        st = con.createStatement(); 
        resultSet = st.executeQuery(selectSql);
        if (resultSet.next())   
        {  
        	return true;
        }
        else
        	return false;
    }
    
}
