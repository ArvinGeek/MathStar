package com.adc.DesignPatterns;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.Action;
import javax.swing.Timer;

public class SwingClock extends Applet 
{
	private Timer clock=new Timer(1000, 
			new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					synchronized(SwingClock.this)
					{
						repaint();
					}

				}
			}
			);
	public void init()
	{
		setBackground(Color.green);
		setFont(new Font("TimesRoman",Font.BOLD,36));
	}
	public void paint(Graphics g)
	{
		Calendar cal= Calendar.getInstance();
		Date date= cal.getTime();
		DateFormat dateFormatter = DateFormat.getDateTimeInstance();
		g.drawString(dateFormatter.format(date), 5, 100);
	}
	public SwingClock() throws InterruptedException
	{
		clock.start();
	} 
}
