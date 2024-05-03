package com.adc.DesignPatterns;
import java.awt.*;
import java.awt.event.*;
import java.awt.Panel;

public class LetThereBeLightCommand extends Button implements CommandFromGod {

	private Panel p;
	public LetThereBeLightCommand(String caption , Panel pnl) {
		// TODO Auto-generated constructor stub
		super(caption);
		p=pnl;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		p.setBackground(Color.white);

	}

}
