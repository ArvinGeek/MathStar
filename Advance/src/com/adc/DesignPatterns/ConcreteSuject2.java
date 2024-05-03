package com.adc.DesignPatterns;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConcreteSuject2 extends Frame {

	public ConcreteSuject2() {
		// TODO Auto-generated constructor stub
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSuject2 s = new ConcreteSuject2();
		s.setBounds(100, 100, 100, 100);
		s.addMouseListener(new MouseListener() 
		{
			public void mouseClicked(MouseEvent e)
			{
				System.out.println(e.getWhen());
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			
		});
		s.show();
	}

}
