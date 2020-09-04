package com.adc.design;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;


public class ChineChessPanel extends JPanel implements MouseListener, ActionListener  {

	@Override
	public void paint(Graphics gp) { // ��дpaint����
        super.paint(gp);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0)
                	gp.drawRect(i * 100, j * 100, 100, 100);
                else if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)
                	gp.drawRect(i * 100, j * 100, 100, 100);
                else
                	gp.fillRect(i * 100, j * 100, 100, 100);
            }

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
