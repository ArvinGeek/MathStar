package com.adc.design;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import java.text.DateFormat;

public class Clock extends Applet implements Runnable 
{
	private Thread clockThread=null;
	//Applet ��ʼ������
	public void init() 
	{
		setBackground(Color.green);
	}
	//Applet ��������
	public void start()
	{
		if (clockThread==null)
		{
			clockThread = new Thread(this,"Clock");
			clockThread.start();
		}
	}
	//һ��Thread����
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
	//һ��applet����
	public void paint(Graphics g)
	{
		Calendar cal= Calendar.getInstance();
		Date date= cal.getTime();
		DateFormat dateFormatter= DateFormat.getTimeInstance();
		g.drawString(dateFormatter.format(date), 5, 10);
	}
	//��AppLet��ֹͣ�����û���
	public void stop()
	{
		clockThread=null;
	}
}
