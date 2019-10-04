package com.adc.design;

public class GoMan
{	
	private int Heng,Zong,Color,Dead,GoNum;
	//横位
	public int getHeng() 
	{
		return Heng;
	}	 
	public void setHeng(int heng) 
	{
		this.Heng = heng;
	}
	//纵位
	public int getZong() 
	{
		return Zong;
	}	 
	public void setZhong(int zong) 
	{
		this.Zong = zong;
	}
	//颜色 1B 2W
	public int getColor() 
	{
		return Color;
	}	 
	public void setColor(int color) 
	{
		this.Color = color;
	}
	//死活 1D
	public int getDead() 
	{
		return Dead;
	}	 
	public void setDead(int dead) 
	{
		this.Dead = dead;
	}
	//手数
	public int getGoNum() 
	{
		return GoNum;
	}	 
	public void setGoNum(int goNum) 
	{
		this.GoNum = goNum;
	}

}
