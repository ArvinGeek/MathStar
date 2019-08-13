package com.adc.design;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

//import com.adc.advance.DrawGraphic;

public class RoomDesignFrame extends JFrame {
	 public RoomDesignFrame()  
	 {
	        // TODO Auto-generated constructor stub
	        //this.add(new ArtDesignPanel());
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
			this.setTitle("Room Design");
			//this.setBounds(300,200,450,350);设置窗体位置大小，前两个参数为位置，后两个参数为窗体大小
			this.setLocation(300,200);//设置位置
			this.setSize(750,550);//设置大小
			//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式
			this.setVisible(true);//设置为可见
	 }
	 public static void main(String[] args) {
			new RoomDesignFrame();
	 }

}
