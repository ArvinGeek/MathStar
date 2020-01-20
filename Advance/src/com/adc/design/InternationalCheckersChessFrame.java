package com.adc.design;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class InternationalCheckersChessFrame  extends JFrame{
	private static final long serialVersionUID = 1L;
	InternationalCheckersChessPanel ncp=new InternationalCheckersChessPanel(); 
	// 构造方法
	public InternationalCheckersChessFrame() {
		// TODO Auto-generated constructor stub
		
		this.add(ncp);
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
		setTitle("国际跳棋棋盘");
		setLocation(400, 20);
		setSize(1100, 1100);
		this.setVisible(true);
		Container p = getContentPane();
		
		//setBounds(510, 2, 1200, 1080);
		
		setVisible(true);


		setResizable(false);


		try 
		{
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	public static void main(String[] args) {
		new InternationalCheckersChessFrame();
	}

}

