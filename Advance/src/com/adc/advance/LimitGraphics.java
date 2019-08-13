package com.adc.advance;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class LimitGraphics extends JFrame  
{
	 public LimitGraphics()  
	 {
	        // TODO Auto-generated constructor stub
	        //this.add(new ArtDesignPanel());
	        this.addWindowListener(new WindowListener() 
	        {	            
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
			this.setTitle("LimitGraphics Design");
			this.setLocation(300,200);//设置位置
			this.setSize(750,550);//设置大小
			this.setVisible(true);//设置为可见
	 }
	 public static void main(String[] args) {
			new LimitGraphics();
	 }
}
