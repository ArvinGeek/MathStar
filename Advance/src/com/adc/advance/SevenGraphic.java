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



///贝塞尔曲线

public class SevenGraphic {

	public static void main(String[] args) {
		new DrawGraphic();
	}

}







//10X10方格
class DrawGraphic  extends JFrame
{
	 private static final int sx = 50;//小方格宽度
	 private static final int sy = 50;//小方格高度
	 private static final int w = 40;
	 private static final int rw = 400;

	 private Graphics jg;

	 private Color rectColor = new Color(0xf5f5f5);
	 private static final long serialVersionUID = 1L; 
	 //构造方法
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
		 
			 // 获取专门用于在窗口界面上绘图的对象
			 jg =  this.getGraphics();
			 // 绘制游戏区域
			 paintComponents(jg);	
			//		this.setTitle("我的第一个窗体");
			//		//this.setBounds(300,200,450,350);设置窗体位置大小，前两个参数为位置，后两个参数为窗体大小
			//		this.setLocation(300,200);//设置位置
			//		this.setSize(450,350);//设置大小
			//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式
			//		this.setVisible(true);//设置为可见
	}
	public void paintComponents(Graphics g) 
	{
		 try 
		 {
		 
			 // 设置线条颜色为红色
			 g.setColor(Color.RED);
			 
			 // 绘制外层矩形框
			 g.drawRect(sx, sy, rw, rw);
			 
			/* 绘制水平10个，垂直10个方格。
			 * 即水平方向9条线，垂直方向9条线，
			 * 外围四周4条线已经画过了，不需要再画。
			 * 同时内部64个方格填写数字。
			 */
			 for(int i = 1; i < 10; i ++) {
			 // 绘制第i条竖直线
			 g.drawLine(sx + (i * w), sy, sx + (i * w), sy + rw);
			 
			 // 绘制第i条水平线
			 g.drawLine(sx, sy + (i * w), sx + rw, sy + (i * w));
			 
			 // 填写第i行从第1个方格到第8个方格里面的数字（方格序号从0开始）
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

