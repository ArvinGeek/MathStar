package com.adc.design;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class FashionDesignFrame extends JFrame {
	FashionDesignPanel fdp=new FashionDesignPanel(); 
	// 构造方法
	public FashionDesignFrame() {
		// TODO Auto-generated constructor stub		
		this.add(fdp);
		this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent arg0) 
			{
				// TODO Auto-generated method stub
			}
			@Override
			public void windowIconified(WindowEvent arg0) 
			{
				// TODO Auto-generated method stub
			}
			@Override
			public void windowDeiconified(WindowEvent arg0) 
			{
				// TODO Auto-generated method stub
			}
			@Override
			public void windowDeactivated(WindowEvent arg0) 
			{
				// TODO Auto-generated method stub
			}
			@Override
			public void windowClosing(WindowEvent arg0) 
			{
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
		setBounds(510, 2, 1000, 1000);
		this.getGraphics().setColor(Color.orange);
		this.getGraphics().fillRect(510, 2, 1000, 1000);;
		setVisible(true);
		setLayout(null);
		setResizable(false);
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		new FashionDesignFrame();
	}
}
