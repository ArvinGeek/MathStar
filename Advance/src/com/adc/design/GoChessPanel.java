package com.adc.design;

//import java.awt.AlphaComposite;
import java.awt.Button;
//import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
//import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.awt.geom.Ellipse2D;
//import java.util.Random;

import javax.swing.JPanel;

//import com.adc.test.ChessPad;

public class GoChessPanel extends JPanel implements MouseListener, ActionListener 
{

	private static final int sx = 75;// 小方格宽度
	private static final int sy = 75;// 小方格高度
	private static final int w = 50;
	private static final int rw = 900;
	private Button BtnComputer = new Button("人机对弈");
	private Button buttonA = new Button("打谱对弈");
	int x = -1, y = -1, 棋子颜色 = 1;

	GoChessPanel() {
		setLayout(null);
		setBackground(Color.orange);
		addMouseListener(this);
		add(BtnComputer);
		BtnComputer.setBounds(1000, 80, 60, 26);
		BtnComputer.addActionListener(this);
		add(buttonA);
		buttonA.setBounds(1080, 80, 60, 26);
		buttonA.addActionListener(this);


	}

	//private Color rectColor = new Color(0xf5f5f5);

	@Override
	public void paint(Graphics gp) { // 重写paint方法
		// TODO Auto-generated method stub
		Graphics2D g = (Graphics2D) gp; // 获得Graphics2D对象

		try {

			// 设置线条颜色为红色
			g.setColor(Color.black);
			// 绘制外层矩形框

			g.drawRect(sx, sy, rw, rw);

			// 绘制水平10个，垂直10个方格。 即水平方向9条线，垂直方向9条线， 外围四周4条线已经画过了，不需要再画。 同时内部64个方格填写数字。

			for (int i = 1; i < 18; i++) {
				// 绘制第i条竖直线
				g.drawLine(sx + (i * w), sy, sx + (i * w), sy + rw);

				// 绘制第i条水平线
				g.drawLine(sx, sy + (i * w), sx + rw, sy + (i * w));

				// 填写第i行从第1个方格到第8个方格里面的数字（方格序号从0开始）
				//				  for(int j = 0; j < 18; j ++) 
				//				  {
				//					  g.drawString("A", j, i); 
				//			  
				//				  } 
				g.fillOval(55, 55, 40, 40); // g.draw
				g.fillOval(55, 155, 40, 40); 

				g.fillOval(105, 105, 40, 40);
				g.fillOval(155, 155, 40, 40);
				g.fillOval(205, 205, 40, 40);
				g.fillOval(305, 305, 40, 40);
				g.fillOval(405, 405, 40, 40);
				g.fillOval(505, 505, 40, 40);
				g.fillOval(605, 605, 40, 40);
				g.fillOval(705, 705, 40, 40);
				g.fillOval(805, 805, 40, 40);
				g.fillOval(905, 905, 40, 40);
				g.fillOval(955, 955, 40, 40);
			}
			g.setColor(Color.WHITE);
			g.fillOval(55, 105, 40, 40); 

			g.fillOval(105, 205, 40, 40);
			g.fillOval(105, 155, 40, 40);
			g.fillOval(105, 255, 40, 40);
			g.fillOval(155, 255, 40, 40);
			g.fillOval(155, 205, 40, 40);
			int fontSize = 50;
			// SolidBrush drawBrush = new SolidBrush(Color.Black);// Create point for
			// upper-left corner of drawing.
			// Graphics2D graphics = (Graphics2D) g;
			Font font = new Font("楷体", Font.BOLD, 50);
			g.setFont(font);
			g.setColor(Color.BLACK);

			g.drawString("天元围棋比赛", 350, 50);
			// g.fill3DRect(500, 500, 80, 80, false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * this.removeAll(); 棋子颜色 = 1;
		 */
		// this.setBackground(rectColor);

		// setBounds(810, 5, 60, 26);

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*
		 * if (arg0.getModifiers() == InputEvent.BUTTON1_MASK) { }
		 */	
		}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		 if (arg0.getModifiers() == InputEvent.BUTTON1_MASK) 
		 { 
				x = (int) arg0.getX();
				y = (int) arg0.getY();
		 }

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
