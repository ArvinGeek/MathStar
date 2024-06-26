package com.adc.DesignPatterns;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.Date;

public class Monkey implements Cloneable,Serializable{

	private int height;
	private int weight;
	private GoldRingedStaff staff;
	private Date birthDate;
	public Monkey() {
		// TODO Auto-generated constructor stub
		this.birthDate=new Date();
		this.staff= new GoldRingedStaff();
	}
	public Object deepClone() throws IOException,OptionalDataException,ClassNotFoundException
	{
		ByteArrayOutputStream bo=new ByteArrayOutputStream();
		ObjectOutputStream oo=new ObjectOutputStream(bo);
		oo.writeObject(this);
		ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi =new ObjectInputStream(bi);
		return (oi.readObject());
	}
	public Object clone()
	{
		Monkey temp=null;
		try 
		{
			temp=(Monkey)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone faild");
		}
		finally 
		{
			return temp;
		}
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	public int getWeight() 
	{
		return weight;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	public Date getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	
	public GoldRingedStaff getStaff()
	{
		return staff;
	}
	public void setStaff(GoldRingedStaff staff)
	{
		this.staff = staff;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
