package com.adc.DesignPatterns;

class JiaMu extends Player {

	public JiaMu(Player aSuccessor) {
		// TODO Auto-generated constructor stub
		this.setSuccessor(aSuccessor);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		if (DrumBeater.stopped)
		{
			System.out.println("Jia Mu gotta drink!");
		}
		else
		{
			System.out.println("Jia Mu passed!");
			next();
		}
	}

}
