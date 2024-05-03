package com.adc.DesignPatterns;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;

public class LetThereBeLandCommand extends Button implements CommandFromGod {
	private Panel p;
	public LetThereBeLandCommand(String caption , Panel pnl) {
		// TODO Auto-generated constructor stub
		super(caption);
		p=pnl;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		p.setBackground(Color.orange);
	}

}
