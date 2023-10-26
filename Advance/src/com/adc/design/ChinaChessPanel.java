package com.adc.design;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;



public class ChinaChessPanel extends JPanel implements MouseListener, ActionListener  {
	

	ChinaChessPanel(){
		setBackground(Color.lightGray);
		setLayout(null);		
		addMouseListener(this);

	}
	@Override
	public void paint(Graphics gp) { // 重写paint方法
        super.paint(gp);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0)
//                	gp.drawRect(i * 100, j * 100, 100, 100);
//                else if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)
//                	gp.drawRect(i * 100, j * 100, 100, 100);
//                else
//                	gp.fillRect(i * 100, j * 100, 100, 100);
//            }
//
//        }

        Graphics2D g = (Graphics2D) gp; 
		g.setColor(Color.white);
		//g.clearRect(sx, sy, rw, rw);
		g.fillRect(50, 50, 750, 700);
		try {
			
			g.setColor(Color.pink);
			Font font = new Font("楷体", Font.BOLD, 28);
			g.setFont(font);
			g.fillRect(50, 50, 5, 700);
			g.fillRect(50, 50, 750, 5);
			g.fillRect(800, 50, 5, 700);
			g.fillRect(50, 750, 755, 5);
			//g.drawLine(100, 50, 100, 750);
			g.drawLine(50, 100, 800, 100);

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
        InitalitionChess(gp);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
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
	
	private void InitalitionChess(Graphics gp) 
	{
		//LoadChess(gp);
	} 

}
