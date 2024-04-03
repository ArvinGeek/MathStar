package com.adc.DesignPatterns;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.Beans;

public class ShowPickle extends Frame {

	ShowPickle(String serComponent)
	{
		super("Show Pickle");
		addWindowListener(new win());
		setLayout(new FlowLayout());
		
		TextField text;
		try 
		{
			text =(TextField)Beans.instantiate(null, serComponent);
		}
		catch(Exception e) 
		{
			System.out.println(e);
			text= new TextField();
		}
		add(text);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new ShowPickle("mytextfield");
		frame.pack();
		frame.setVisible(true);
	}
	class win extends WindowAdapter
	{
		public void windowClosing(WindowEvent evt)
		{
			Frame frame =(Frame)evt.getSource();
			frame.setVisible(false);
			frame.dispose();
			System.exit(0);
		}
	}
}
