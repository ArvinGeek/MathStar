/*********************************************************************
 * 
 * 					GoChess 1.0    
 *    Create Man ： Jones
 *    Create Date：2019-09-15
 *    
 * 错误拾遗
 * 1. 超出围棋棋盘
 * 2.
 * 
 * 
 * 
 * 
 * *******************************************************************/

package com.adc.design;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JPanel;

public class GoChessPanel extends JPanel implements MouseListener, ActionListener 
{	
	private static final int sx = 55; // 小方格宽度
	private static final int sy = 55; // 小方格高度
	private static final int w = 35;
	private static final int rw = 630;
	private Button BtnComputer = new Button("人机对弈");
	private Button BtnInternetwork = new Button("网络对弈");
	private Button BtnNumMan = new Button("显示手数");
	private Button BtnModels = new Button("棋谱加载");
	private Button BtnTakeUp = new Button("检查提子");
	private Button BtnCheckWin = new Button("申请计目");

	///提子
    private Vector GoMans;
    ///默认的方格长度及数目
    protected int qizilen = 40 ;                        // 棋盘左边及上边的边距
    protected int top, left;  
    ///0 空   1 黑  2 白
    private int[][] ChessCE;
    private int PX,PY;
    //标记棋手
    private int TurnMan = 1;
    //底片底板
    private Image BaseGround;    
    ///涂抹橡皮檫    ///private  PPaint PCha;   
    ///手数
    private int ChessNum=0,Csign=0;
    
	GoChessPanel() 
	{
		setBackground(Color.orange);
		setLayout(null);		
		addMouseListener(this);
		add(BtnComputer);
		BtnComputer.setBounds(900, 80, 60, 26);
		BtnComputer.addActionListener(this);
		add(BtnInternetwork);
		BtnInternetwork.setBounds(900, 120, 60, 26);
		BtnInternetwork.addActionListener(this);
		add(BtnNumMan);
		BtnNumMan.setBounds(900, 160, 60, 26);
		BtnNumMan.addActionListener(this);
		add(BtnModels);
		BtnModels.setBounds(900, 200, 60, 26);
		BtnModels.addActionListener(this);
		add(BtnTakeUp);
		BtnTakeUp.setBounds(900, 240, 60, 26);
		BtnTakeUp.addActionListener(this);
		add(BtnCheckWin);
		BtnCheckWin.setBounds(900, 280, 60, 26);
		BtnCheckWin.addActionListener(this);

		ChessCE= new int[20][20];
		GoMans = new Vector();		
	}
	@Override
	public void paint(Graphics gp) { 		//重写paint方法
		//TODO Auto-generated method stub
		top = left = 55 ;
		Graphics2D g = (Graphics2D) gp; 
		g.setColor(Color.orange);
		g.clearRect(sx, sy, rw, rw);
		g.fillRect(sx-50, sy-50, rw+150, rw+150);
		//获得Graphics2D对象		
		//g.setBackground(Color.orange);
		try 
		{
			//设置线条颜色为红色
			g.setColor(Color.black);
			//绘制外层矩形框
			g.drawRect(sx, sy, rw, rw);
			//绘制水平10个，垂直10个方格。 即水平方向9条线，垂直方向9条线， 
			//外围四周4条线已经画过了，不需要再画。 同时内部64个方格填写数字。
			for (int i = 1; i < 18; i++) 
			{
				// 	绘制第i条竖直线
				g.drawLine(sx + (i * w), sy, sx + (i * w), sy + rw);
				// 	绘制第i条水平线
				g.drawLine(sx, sy + (i * w), sx + rw, sy + (i * w));
			}
	        for (int i = 0; i < GoMans.size(); i++) {  
				Font font = new Font("楷体", Font.PLAIN, 20);
				g.setFont(font);

	        	if (Csign==0)
	        	{
	        		if (((GoMan)GoMans.get(i)).getColor()==1) 
	        		{
	        			g.setColor(Color.BLACK);
	        			g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30);
	        			//g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()), ((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 40);
	        		}
	        		else
	        		{
	        			g.setColor(Color.WHITE);
	        			g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30);
	        			//g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()), ((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 40);
	        			
	        		}
	        		
	        	}
	        	else 
	        	{
	        		if (((GoMan)GoMans.get(i)).getColor()==1) 
	        		{
	        			g.setColor(Color.BLACK);
	        			g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30);
	        			g.setColor(Color.WHITE);
	        			//g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()), ((GoMan)GoMans.get(i)).getHeng() * 35 + 50, ((GoMan)GoMans.get(i)).getZong() * 35 + 60);
	        		}
	        		else
	        		{
	        			g.setColor(Color.WHITE);
	        			g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30);
	        			g.setColor(Color.BLACK);
	        			//g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()), ((GoMan)GoMans.get(i)).getHeng() * 35 + 50, ((GoMan)GoMans.get(i)).getZong() * 35 + 60);       			
	        		}
	        		if (i<10)
	        			g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()), ((GoMan)GoMans.get(i)).getHeng() * 35 + 50, ((GoMan)GoMans.get(i)).getZong() * 35 + 60);
	        		else if (i<99)
	        			g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()), ((GoMan)GoMans.get(i)).getHeng() * 35 + 45, ((GoMan)GoMans.get(i)).getZong() * 35 + 60);
	        		else if (i<300)
	        		    g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()), ((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 60);
	        	}
	        }
//			for (int i = 0; i < 19 ; i++)
//				for (int j = 0; j < 19; j++) 
//			{
//					if(ChessCE[i][j]==1)
//					{
//						g.setColor(Color.BLACK);					
//						g.fillOval(i * 35 + 40, j * 35 + 40, 30, 30);
//					}
//					if(ChessCE[i][j]==2)
//					{
//						g.setColor(Color.WHITE);					
//						g.fillOval(i * 35 + 40, j * 35 + 40, 30, 30);
//					}
//					if(ChessCE[i][j]<>0)
//					{
//						
//						
//					}
			//}
			int fontSize = 50;			
			Font font = new Font("楷体", Font.BOLD, 28);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("天元围棋比赛", 350, 30);	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		 if(e.getActionCommand().equals("人机对弈"))//是Red按钮事件
		 {			
			/*
			 * ChessCE[2][2]=1; GoMans.addElement(ChessCE[2][2]); repaint();
			 * 
			 */	
		        for (int i = 0; i < GoMans.size(); i++) {  
		        	//GoMan gm= new GoMan();
		        	if (((GoMan)GoMans.get(i)).getDead()==1)
		        		ChessCE[((GoMan)GoMans.get(i)).getHeng()][((GoMan)GoMans.get(i)).getZong()]=0;  
		        }
		        repaint();
		 }
		 else if(e.getActionCommand().equals("打谱对弈"))//是Green按钮事件
		 {
			/*
			 * ChessCE[2][2] = 0; ChessCE[2][5] = 2; repaint();
			 */
		        for (int i = 0; i < GoMans.size(); i++) {  
		        	//GoMan gm= new GoMan();
		        	if (((GoMan)GoMans.get(i)).getColor()==1)
		        		ChessCE[((GoMan)GoMans.get(i)).getHeng()][((GoMan)GoMans.get(i)).getZong()]=0;  
		        }
		        repaint();

		 }
		 else if(e.getActionCommand().equals("显示手数"))
		 {	
			 Csign=1;
			 repaint();
		 }
		 else
		 {
			 Csign=0;
		 }
	}
	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getModifiers() == InputEvent.BUTTON1_MASK) 
		{
			PX = (int) e.getX();
			PY = (int) e.getY();
			int a = (PX - 55) / 35, b = (PY -55) / 35;
			if (TurnMan==1)
			{
				if (ChessCE[a][b]!=0) return;
				TurnMan=2;
				ChessCE[a][b]=1;
				
				GoMan gm= new GoMan();
				gm.setHeng(a);
				gm.setZhong(b);		
				gm.setColor(1);
				gm.setDead(0);
				ChessNum+=1;
				gm.setGoNum(ChessNum);
				GoMans.addElement(gm);
			} else {
				if (ChessCE[a][b]!=0) return;
				TurnMan=1;
				ChessCE[a][b]=2;
				GoMan gm= new GoMan();
				gm.setHeng(a);
				gm.setZhong(b);		
				gm.setColor(2);
				gm.setDead(1);
				ChessNum+=1;
				gm.setGoNum(ChessNum);
				GoMans.addElement(gm);
			}
			this.repaint();
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0)
	{		
		// TODO Auto-generated method stub		
	}
}
