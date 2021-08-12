/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

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
public class AddPat 
{
    private String name;
    private String pass;
    private String phone;
    private String exp;
    private String add;

    public String getAdd() {
        return add;
    }
    private String sug;
    private String rbc;
    private String heart;
    private String bp;
    private String hemoglobin;
    private String wbc;
    private String wt;
    private String age;
    private String ht;
    private String gen;
    private String bld;
    private String hist;
    Connection con = null;   
    ResultSet resultSet = null;
    java.sql.Statement st = null;

    public AddPat() 
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

    public void setAdd(String add) {
        this.add = add;
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

    public void setSug(String sug) {
        this.sug = sug;
    }

    public void setRbc(String rbc) {
        this.rbc = rbc;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public void setHemoglobin(String hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public void setWbc(String wbc) {
        this.wbc = wbc;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setBld(String bld) {
        this.bld = bld;
    }

    public void setHist(String hist) {
        this.hist = hist;
    }
    
    
    public String getName() {
        return name;
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

    public String getSug() {
        return sug;
    }

    public String getRbc() {
        return rbc;
    }

    public String getHeart() {
        return heart;
    }

    public String getBp() {
        return bp;
    }

    public String getHemoglobin() {
        return hemoglobin;
    }

    public String getWbc() {
        return wbc;
    }

    public String getWt() {
        return wt;
    }

    public String getAge() {
        return age;
    }

    public String getHt() {
        return ht;
    }

    public String getGen() {
        return gen;
    }

    public String getBld() {
        return bld;
    }

    public String getHist() {
        return hist;
    }
    
    public boolean isValid() throws SQLException 
    {
        int test;
        PreparedStatement ps = con.prepareStatement("Insert into dbo.Patient values " + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, pass);
        ps.setString(3, phone);
        ps.setString(4, exp);
        ps.setString(5, add);
        ps.setString(6, sug);
        ps.setString(7, rbc);
        ps.setString(8, heart);
        ps.setString(9, bp);
        ps.setString(10, hemoglobin);
        ps.setString(11, wbc);
        ps.setString(12, wt);
        ps.setString(13, age);
        ps.setString(14, ht);
        ps.setString(15, gen);
        ps.setString(16, bld);
        ps.setString(17, hist);
        test = ps.executeUpdate();
        if(test == 1)
        {
            return true;
        }
        else
            return false; 
    }
    
}
