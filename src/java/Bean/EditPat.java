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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hashim
 */
public class EditPat 
{
    private String name;
    private String pass;
    private String phone;
    private String exp;
    private String add;
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
    private String list;
    Connection con = null;   
    ResultSet resultSet = null;
    java.sql.Statement st = null;
    
    public EditPat() 
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

    public String getName() throws SQLException 
    {
        String ret = resultSet.getString(1);
        return ret;
    }

    public String getPass() {
        return pass;
    }

    public String getPhone() throws SQLException 
    {

        String ret = resultSet.getString(3);
        return ret;
    }

    public String getExp() throws SQLException 
    {
        String ret = resultSet.getString(4);
        return ret;
    }

    public String getAdd() throws SQLException 
    {
        String ret = resultSet.getString(5);
        return ret;
    }

    public String getSug() throws SQLException 
    {
        String ret = resultSet.getString(6);
        return ret;
    }

    public String getRbc() throws SQLException
    {
        String ret = resultSet.getString(7);
        return ret;
    }

    public String getHeart() throws SQLException 
    {
        String ret = resultSet.getString(8);
        return ret;
    }

    public String getBp() throws SQLException 
    {
        String ret = resultSet.getString(9);
        return ret;
    }

    public String getHemoglobin() throws SQLException 
    {
        String ret = resultSet.getString(10);
        return ret;
    }

    public String getWbc() throws SQLException 
    {
        String ret = resultSet.getString(11);
        return ret;
    }

    public String getWt() throws SQLException 
    {
        String ret = resultSet.getString(12);
        return ret;
    }

    public String getAge() throws SQLException 
    {
        String ret = resultSet.getString(13);
        return ret;
    }

    public String getHt() throws SQLException 
    {
        String ret = resultSet.getString(14);
        return ret;
    }

    public String getGen() throws SQLException
    {
        String ret = resultSet.getString(15);
        return ret;
    }

    public String getBld() throws SQLException 
    {
        String ret = resultSet.getString(16);
        return ret;
    }

    public String getHist() throws SQLException 
    {
        String ret = resultSet.getString(17);
        return ret;
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
    
    public void setName(String name) {
        this.name = name;
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

    public void setAdd(String add) {
        this.add = add;
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

    public void setCon(Connection con) {
        this.con = con;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public void setSt(Statement st) {
        this.st = st;
    }
    
    
    public boolean ispatValid() throws SQLException 
    {
        String selectSql = "select * from dbo.Patient where Username = '" +name+"'";
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