package com.adc.design;

import java.awt.Button;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chess2020 extends JFrame {
	private static final long serialVersionUID = 1L;
	Chess2020Panel ncp=new Chess2020Panel(); 
	// 构造方法
	public Chess2020() {
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
		setTitle("中国象棋棋盘");
		setLocation(100, 20);
		setSize(1500, 836);
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
		// TODO Auto-generated method stub
		//		new GoChessFrame();
		//		new ChinaChessFrame();
		new Chess2020();
	}
	public class Chess2020Panel extends JPanel implements MouseListener, ActionListener  {
		/**
		 * 
		 */
		private Button BtnGoChess = new Button("围棋");
		private Button BtnInternationalChess = new Button("国际象棋");
		private Button BtnChinaChess = new Button("中国象棋");
		private Button BtnInternationalCheckersChess = new Button("拿破仑跳棋");

		private static final long serialVersionUID = 1L;
		Chess2020Panel() 
		{
			addMouseListener(this);
			add(BtnGoChess);
			BtnGoChess.setBounds(900, 80, 60, 26);
			BtnGoChess.addActionListener(this);
			add(BtnInternationalChess);
			BtnInternationalChess.setBounds(900, 120, 60, 26);
			BtnInternationalChess.addActionListener(this);
			add(BtnChinaChess);
			BtnChinaChess.setBounds(900, 160, 60, 26);
			BtnChinaChess.addActionListener(this);
			add(BtnInternationalCheckersChess);
			BtnInternationalCheckersChess.setBounds(900, 200, 60, 26);
			BtnInternationalCheckersChess.addActionListener(this);

		}
		@Override
		public void paint(Graphics gp) { // 重写paint方法
	        super.paint(gp);
//	        for (int i = 0; i < 8; i++) {
//	            for (int j = 0; j < 8; j++) {
//	                if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0)
//	                	gp.drawRect(i * 100, j * 100, 100, 100);
//	                else if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)
//	                	gp.drawRect(i * 100, j * 100, 100, 100);
//	                else
//	                	gp.fillRect(i * 100, j * 100, 100, 100);
	           // }
	
	        //}
	        
	        //InitalitionChess(gp);
		}
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getActionCommand().equals("围棋"))
			 {	
				new GoChessFrame();
				 //repaint();
			 }
			 else if(e.getActionCommand().equals("国际象棋"))
			 {	
				 //repaint();
				 new InternationalChessFrame();
			 }
			 else if(e.getActionCommand().equals("中国象棋"))
			 {	
				 new ChinaChessFrame();
			 }
			 else   if(e.getActionCommand().equals("拿破仑跳棋"))
			 {
				 new InternationalCheckersChessFrame();
			 }
		}
	
	
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
	
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	
	}

}


