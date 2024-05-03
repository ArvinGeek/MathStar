package com.adc.DesignPatterns;

class JiaShe extends Player {

	public JiaShe(Player aSuccessor) {
		// TODO Auto-generated constructor stub
		this.setSuccessor(aSuccessor);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		if (DrumBeater.stopped)
		{
			System.out.println("Jia She gotta drink!");
		}
		else
		{
			System.out.println("Jia She passed!");
			next();
		}

	}

}
