package com.adc.DesignPatterns;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class SwingUI extends JFrame implements ActionListener {

	JLabel text,clicked;
	JButton button,clickButton;
	JPanel panel;
	private boolean m_clickMeMode=true;	
	public SwingUI() throws HeadlessException {
		// TODO Auto-generated constructor stub
		text=new JLabel("我很高兴！");
		button =new JButton("理我");
		button.addActionListener(this);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.white);
		getContentPane().add(panel);
		panel.add(BorderLayout.CENTER,text);
		panel.add(BorderLayout.SOUTH,button);
	}

	public SwingUI(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SwingUI(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SwingUI(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		Object source=event.getSource();
		if (m_clickMeMode)
		{
			text.setText("我很烦！");
			button.setText("别理我！");
			m_clickMeMode =false;
		}
		else
		{
			text.setText("我很高兴！");
			button.setText("理我");
			m_clickMeMode=true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUI frame= new SwingUI();
		frame.setTitle("我");
		WindowListener listener= new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
		frame.addWindowListener(listener);;
		frame.pack();
		frame.setVisible(true);
	}

}
