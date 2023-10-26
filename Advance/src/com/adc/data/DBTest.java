package com.adc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.cms.User;

public class DBTest {
    //�������ݿ�Ĵ���
    public Connection getCon()
    {
        //���ݿ���������
        String username = "root";
        //���ݿ���������
        String password = "admin";
        String driver = "com.mysql.cj.jdbc.Driver";
        //����testΪ���ݿ�����
        String url = "jdbc:mysql://localhost:3306/test";
        Connection conn = null;
        try
        {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, username, password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    //���в�ѯ�ķ��������������������������򷵻�true
    public boolean getSelect(String userName, String password)
    {
        boolean flag = false;
        String sql = "select * from user where UserName='" + userName + "' and Password='" + password + "'";
        Connection conn = getCon();
        PreparedStatement pst = null;
        try
        {
        	System.out.println(sql);
            pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next())
            {
                flag = true;
            }
        }
        catch (Exception e)
        {}
        return flag;
    }
    
    public boolean register(String userName, String password) 
    {
    	boolean success=false;
    	String sql = "insert into user(UserName,Password) values(?,?)";
    	Connection conn = getCon();
    	int count = 0;
		try 
		{
		            PreparedStatement ps = conn.prepareStatement(sql);
		            ps.setString(1,userName);
		            ps.setString(2,password);
		            count = ps.executeUpdate();
		            //DBUtil.release(null,null,ps,conn);
		            
		} 
		catch (SQLException e) 
		{
		            e.printStackTrace();
		}
		if(count==0)
		{
            return false;
        }else{
            return  true;
        }
    	//return success;
    }
    
    public boolean deleteuser(String userName) 
    {
    	boolean success=false;
    	String sql = "delete from user where UserName=?";
    	Connection conn = getCon();
    	int count = 0;
		try 
		{
		            PreparedStatement ps = conn.prepareStatement(sql);
		            ps.setString(1,userName);
		            //ps.setString(2,password);
		            count = ps.executeUpdate();
		            //DBUtil.release(null,null,ps,conn);
		            
		} 
		catch (SQLException e) 
		{
		            e.printStackTrace();
		}
		if(count==0)
		{
            return false;
        }else{
            return  true;
        }
    	//return success;
    }

    
	/*
	 * public List<User> selectAll() { List<User> list=null; try { Connection conn =
	 * getCon(); String sql="select * from user"; PreparedStatement
	 * ps=conn.prepareStatement(sql); ResultSet rs=ps.executeQuery(); list=new
	 * ArrayList<>(); while (rs.next()) { User user=new User();
	 * user.setUserName(rs.getString(1)); user.setPassword(rs.getString(2));
	 * //user.setG_price(rs.getDouble(3)); //user.setG_date(rs.getDate(4));
	 * list.add(user); } return list; } catch (SQLException e) {
	 * e.printStackTrace(); } finally { //super.closeall(); } return list; }
	 */
    public static void main(String[] argc){
    	System.out.println("�������ݿ�...");
    	DBTest dbt=new DBTest();
    	
    	
    	//if (dbt.getSelect("admin", "admin"))
    	if (dbt.deleteuser("User5"))
    	{
    		System.out.println("ɾ���ɹ�");
    		//System.out.println("������");
    	}
    	else
    	{    	 
    		System.out.println("������.");
    	}
    }

}
