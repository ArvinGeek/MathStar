package com.adc.design;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;



public class PianoFrame  extends JFrame {
	PianoPanel gcp=new PianoPanel(); 
	// 构造方法
	public PianoFrame() {
		// TODO Auto-generated constructor stub		
		this.add(gcp);
		this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
		this.setVisible(true);
		setBackground(Color.orange);
		Container p = getContentPane();
		setBounds(10, 50, 1900, 900);
		//this.getGraphics().setColor(Color.orange);
		//this.getGraphics().fillRect(50, 2, 1800, 300);;
		setVisible(true);
		setLayout(null);
		setResizable(false);
		
		try 
		{
			Thread.sleep(500);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{ 
		PianoFrame PF = new PianoFrame();
	}	


}
