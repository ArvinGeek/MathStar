package com.adc.DesignPatterns;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;

public class ResetCommand extends Button implements CommandFromGod {
	private Panel p;
	public ResetCommand(String caption , Panel pnl) {
		// TODO Auto-generated constructor stub
		super(caption);
		p=pnl;

	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		p.setBackground(Color.black);
	}

}
