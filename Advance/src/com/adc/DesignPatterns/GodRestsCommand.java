package com.adc.DesignPatterns;

import java.awt.Button;
import java.awt.Panel;

public class GodRestsCommand extends Button implements CommandFromGod {
	private Panel p;
	public GodRestsCommand(String caption) {
		// TODO Auto-generated constructor stub
		super(caption);
		//p=pnl;

	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
