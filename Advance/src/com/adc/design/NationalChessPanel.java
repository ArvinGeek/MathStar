package com.adc.design;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class NationalChessPanel extends JPanel implements MouseListener, ActionListener  {
	
	private Button BtnComputer = new Button("�˻�����");
	private Button BtnInternetwork = new Button("�������");
	private Button BtnNumMan = new Button("��ʾ����");
	private Button BtnModels = new Button("���׼���");
	private Button BtnTakeUp = new Button("�������");
	private Button BtnCheckWin = new Button("�����Ŀ");
	private Button BtnGoArea = new Button("���Ʒ���");
	private Button BtnCountResult = new Button("ʤ����Ŀ");

	NationalChessPanel() {
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
		add(BtnGoArea);
		BtnGoArea.setBounds(900, 320, 60, 26);
		BtnGoArea.addActionListener(this);
		add(BtnCountResult);
		BtnCountResult.setBounds(900, 360, 60, 26);
		BtnCountResult.addActionListener(this);


	}


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
}
