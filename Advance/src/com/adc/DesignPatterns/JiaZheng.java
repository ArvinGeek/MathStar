package com.adc.DesignPatterns;

class JiaZheng extends Player {

	public JiaZheng(Player aSuccessor) {
		// TODO Auto-generated constructor stub
		this.setSuccessor(aSuccessor);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		if (DrumBeater.stopped)
		{
			System.out.println("Jia Zheng gotta drink!");
		}
		else
		{
			System.out.println("Jia Zheng passed!");
			next();
		}
	}

}
