package com.adc.design;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

//import java.awt.image.*;
import javax.swing.JPanel;

public class InternationalCheckersChessPanel extends JPanel implements MouseListener, ActionListener  
{	
	
	private Button BtnComputer = new Button("�˻�����");
	private Button BtnInternetwork = new Button("�������");
	private Button BtnNumMan = new Button("��ʾ����");
	private Button BtnModels = new Button("���׼���");
	private Button BtnTakeUp = new Button("�������");
	private Button BtnCheckWin = new Button("�����Ŀ");
	private Button BtnGoArea = new Button("���Ʒ���");
	private Button BtnCountResult = new Button("ʤ����Ŀ");

	InternationalCheckersChessPanel() 
	{
		setLayout(null);
		//setBackground(Color.orange);
		addMouseListener(this);
		//		add(BtnComputer);
		//		BtnComputer.setBounds(1000, 80, 60, 26);
		//		BtnComputer.addActionListener(this);
		//		add(buttonA);
		//		buttonA.setBounds(1080, 80, 60, 26);
		//		buttonA.addActionListener(this);
		add(BtnComputer);
		BtnComputer.setBounds(820, 80, 60, 26);
		BtnComputer.addActionListener(this);
		add(BtnInternetwork);
		BtnInternetwork.setBounds(820, 120, 60, 26);
		BtnInternetwork.addActionListener(this);
		add(BtnNumMan);
		BtnNumMan.setBounds(820, 160, 60, 26);
		BtnNumMan.addActionListener(this);
		add(BtnModels);
		BtnModels.setBounds(820, 200, 60, 26);
		BtnModels.addActionListener(this);
		add(BtnTakeUp);
		BtnTakeUp.setBounds(820, 240, 60, 26);
		BtnTakeUp.addActionListener(this);
		add(BtnCheckWin);
		BtnCheckWin.setBounds(820, 280, 60, 26);
		BtnCheckWin.addActionListener(this);
		add(BtnGoArea);
		BtnGoArea.setBounds(820, 320, 60, 26);
		BtnGoArea.addActionListener(this);
		add(BtnCountResult);
		BtnCountResult.setBounds(820, 360, 60, 26);
		BtnCountResult.addActionListener(this);
	}
	
	@Override
	public void paint(Graphics gp) 
	{ 
		// ��дpaint����
        super.paint(gp);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0)
                	gp.drawRect(i * 75, j * 75, 75, 75);
                else if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)
                	gp.drawRect(i * 75, j * 75, 75, 75);
                else
                	gp.fillRect(i * 75, j * 75, 75, 75);
            }
        }        
        //InitalitionChess(gp);
        InitalitionChessMan(gp);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub		
	}
	
	private void InitalitionChessMan(Graphics G)
	{
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
				/*
				 * if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0) { G.setColor(Color.RED);
				 * G.fillOval((i+1) * 75 + 2, j * 75 + 2, 70, 70); }
				 */
            }
        }     
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {	
            	
            	if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0) 
            	{
	            	G.setColor(Color.RED);
	            	G.fillOval((i + 1) * 75 + 2, j * 75 + 2, 70, 70); 
            	}
            	if ((i ) % 2 != 0 && (j) % 2 != 0) 
            	{
	            	G.setColor(Color.RED);
	            	G.fillOval((i-1) * 75 + 2, j * 75 + 2, 70, 70); 
            	}            	
				/*
				 * if ((i + 1) % 3 != 0 && (j + 1) % 3 != 0) { G.setColor(Color.RED);
				 * G.fillOval((i) * 75 + 2, j * 75 + 2, 70, 70); }
				 */
            }
            for (int j = 6; j < 10; j++) 
            {	
            	G.setColor(Color.ORANGE);
            	if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0) 
            	{
	            	
	            	G.fillOval((i + 1) * 75 + 2, j * 75 + 2, 70, 70); 
            	}
            	if ((i ) % 2 != 0 && (j) % 2 != 0) 
            	{
	            	//G.setColor(Color.RED);
	            	G.fillOval((i-1) * 75 + 2, j * 75 + 2, 70, 70); 
            	}            	
				/*
				 * if ((i + 1) % 3 != 0 && (j + 1) % 3 != 0) { G.setColor(Color.RED);
				 * G.fillOval((i) * 75 + 2, j * 75 + 2, 70, 70); }
				 */
            }
        }
	}	
	
	private void InitalitionChess(Graphics gp) 
	{
		LoadChess(gp);
	} 
	
	private void LoadChess(Graphics gp) 
	{
		/*
		 * Graphics2D g = (Graphics2D) gp; Image iBrookR =
		 * Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Brook.png"); Image
		 * iBknightR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bknight.png"); Image
		 * iBbishopR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bbishop.png"); Image
		 * iBqueen = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bqueen.png"); Image
		 * iBking = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bking.png"); Image
		 * iBbishopL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bbishop.png"); Image
		 * iBknightL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bknight.png"); Image
		 * iBrookL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Brook.png");
		 * g.drawImage(iBrookR, 0, 0, 100, 100, this); g.drawImage(iBknightR, 100, 0,
		 * 100, 100, this); g.drawImage(iBbishopR, 200, 0, 100, 100, this);
		 * g.drawImage(iBqueen, 300, 0, 100, 100, this); g.drawImage(iBking, 400, 0,
		 * 100, 100, this); g.drawImage(iBbishopL, 500, 0, 100, 100, this);
		 * g.drawImage(iBknightL, 600, 0, 100, 100, this); g.drawImage(iBrookL, 700, 0,
		 * 100, 100, this);
		 * 
		 * Image iWrookR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wrook.png"); Image
		 * iWknightR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wknight.png"); Image
		 * iWbishopR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wbishop.png"); Image
		 * iWqueen = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wqueen.png"); Image
		 * iWking = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wking.png"); Image
		 * iWbishopL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wbishop.png"); Image
		 * iWknightL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wknight.png"); Image
		 * iWrookL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wrook.png");
		 * g.drawImage(iWrookR, 0, 700, 100, 100, this); g.drawImage(iWknightR, 100,
		 * 700, 100, 100, this); g.drawImage(iWbishopR, 200, 700, 100, 100, this);
		 * g.drawImage(iWqueen, 300, 700, 100, 100, this); g.drawImage(iWking, 400, 700,
		 * 100, 100, this); g.drawImage(iWbishopL, 500, 700, 100, 100, this);
		 * g.drawImage(iWknightL, 600, 700, 100, 100, this); g.drawImage(iWrookL, 700,
		 * 700, 100, 100, this);
		 * 
		 * Image iBpawn = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bpawn.png"); Image
		 * iWpawn = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wpawn.png");
		 * 
		 * for (int i = 0; i < 8; i++) { g.drawImage(iBpawn, 0+i*100, 100, 100, 100,
		 * this); g.drawImage(iWpawn, 0+i*100, 600, 100, 100, this);
		 * 
		 * }
		 */	
		}
}





/*
 * 
 * gp.drawRect(i * 75, j * 75, 75, 75);
 * else if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)    
 * gp.drawRect(i * 75, j * 75, 75, 75);    
 * else    
 * gp.fillRect(i * 75, j * 75, 75, 75);   
 * G.fillArc(x, y, width, height, startAngle, arcAngle);
 * (x, y, width, height);
 * 
 */

 


