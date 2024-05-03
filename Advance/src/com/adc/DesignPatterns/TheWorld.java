package com.adc.DesignPatterns;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheWorld extends Frame implements ActionListener 
{
	private LetThereBeLightCommand btnLight;
	private LetThereBeLandCommand btnLand;
	private ResetCommand btnReset;
	private GodRestsCommand btnExit;
	private Panel p;
	public TheWorld() {
		// TODO Auto-generated constructor stub
		super("This is the world, and God says...");
		p = new Panel();
		p.setBackground(Color.black);
		add(p);
		btnLight= new LetThereBeLightCommand("Let There Be Light",p);
		btnLand = new LetThereBeLandCommand("Let there b land ", p);
		btnReset =new ResetCommand("Reset",p);
		btnExit = new GodRestsCommand("God Rests");
		p.add(btnLight);
		p.add(btnLand);
		p.add(btnReset);
		p.add(btnExit);
		btnLight.addActionListener(this);
		btnLand.addActionListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		setBounds(100,100,400,200);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		CommandFromGod obj= (CommandFromGod)e.getSource();
		obj.Execute();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TheWorld();
	}

}
