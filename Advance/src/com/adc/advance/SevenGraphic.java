package com.adc.advance;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.adc.design.ArtDesignPanel;



///����������

///
public class SevenGraphic {
	
	public static void main(String[] args) {
		new DrawGraphic();
	}
	
}


//10X10����
class DrawGraphic  extends JFrame
{
	 private static final int sx = 50;//С������
	 private static final int sy = 50;//С����߶�
	 private static final int w = 40;
	 private static final int rw = 400;

	 private Graphics jg;

	 private Color rectColor = new Color(0xf5f5f5);
	 private static final long serialVersionUID = 1L; 
	 //���췽��
	 public DrawGraphic()  
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
	        this.setVisible(true);
			 Container p = getContentPane();
			 setBounds(100, 100, 500, 500);
			 setVisible(true);
			 p.setBackground(rectColor);
			 setLayout(null);   
			 setResizable(false);
			 //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
			 
			 try 
			 {
			 		Thread.sleep(500);
			 } 
			 catch (Exception e) 
			 {
				 e.printStackTrace();
			 }        
		 
			 // ��ȡר�������ڴ��ڽ����ϻ�ͼ�Ķ���
			 jg =  this.getGraphics();
			 // ������Ϸ����
			 paintComponents(jg);	
			//		this.setTitle("�ҵĵ�һ������");
			//		//this.setBounds(300,200,450,350);���ô���λ�ô�С��ǰ��������Ϊλ�ã�����������Ϊ�����С
			//		this.setLocation(300,200);//����λ��
			//		this.setSize(450,350);//���ô�С
			//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô���رշ�ʽ
			//		this.setVisible(true);//����Ϊ�ɼ�
	}
	public void paintComponents(Graphics g) 
	{
		 try 
		 {
		 
			 // ����������ɫΪ��ɫ
			 g.setColor(Color.RED);
			 
			 // ���������ο�
			 g.drawRect(sx, sy, rw, rw);
			 
			/* ����ˮƽ10������ֱ10������
			 * ��ˮƽ����9���ߣ���ֱ����9���ߣ�
			 * ��Χ����4�����Ѿ������ˣ�����Ҫ�ٻ���
			 * ͬʱ�ڲ�64��������д���֡�
			 */
			 for(int i = 1; i < 10; i ++) {
			 // ���Ƶ�i����ֱ��
			 g.drawLine(sx + (i * w), sy, sx + (i * w), sy + rw);
			 
			 // ���Ƶ�i��ˮƽ��
			 g.drawLine(sx, sy + (i * w), sx + rw, sy + (i * w));
			 
			 // ��д��i�дӵ�1�����񵽵�8��������������֣�������Ŵ�0��ʼ��
			 for(int j = 0; j < 10; j ++) 
			 {
				 //drawString(g, j, i);                    
			 }
			 
			 }
			 
		 } 
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 
	}
}

