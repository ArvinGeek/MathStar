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
			//this.setBounds(300,200,450,350);���ô���λ�ô�С��ǰ��������Ϊλ�ã�����������Ϊ�����С
			this.setLocation(300,200);//����λ��
			this.setSize(750,550);//���ô�С
			//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô���رշ�ʽ
			this.setVisible(true);//����Ϊ�ɼ�
	 }
	 public static void main(String[] args) {
			new RoomDesignFrame();
	 }

}
