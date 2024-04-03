package com.adc.DesignPatterns;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PickleMaker extends Frame {

	PickleMaker(String text,int size)
	{
		super("Pickle Maker");
		addWindowListener(new win());
		setLayout(new FlowLayout());
		
		TextField textField = makeTextField(text,size);
		serializeTextField(textField,"mytextfield.ser");
		add(textField);
		
	}
	private TextField makeTextField(String text,int size)
	{
		TextField textField = new TextField(text,size);
		return textField;
	}
	private void serializeTextField(TextField textField,String filename)
	{
		try 
		{
			FileOutputStream outStream=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(outStream);
			out.writeObject(textField);
			out.flush();
			out.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args)
	{
		Frame frame=new PickleMaker("No matter where you go,&this.",25);
		frame.setBounds(0,0,300,200);
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
