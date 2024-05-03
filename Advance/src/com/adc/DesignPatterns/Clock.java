package com.adc.design;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import java.text.DateFormat;

public class Clock extends Applet implements Runnable 
{
	private Thread clockThread=null;
	//Applet 初始化方法
	public void init() 
	{
		setBackground(Color.green);
	}
	//Applet 启动方法
	public void start()
	{
		if (clockThread==null)
		{
			clockThread = new Thread(this,"Clock");
			clockThread.start();
		}
	}
	//一个Thread方法
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread myThread = Thread.currentThread();
		while(clockThread==myThread)
		{
			repaint();
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}
	//一个applet方法
	public void paint(Graphics g)
	{
		Calendar cal= Calendar.getInstance();
		Date date= cal.getTime();
		DateFormat dateFormatter= DateFormat.getTimeInstance();
		g.drawString(dateFormatter.format(date), 5, 10);
	}
	//将AppLet的停止方法置换掉
	public void stop()
	{
		clockThread=null;
	}
}
