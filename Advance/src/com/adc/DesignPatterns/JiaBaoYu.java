package com.adc.DesignPatterns;

class JiaBaoYu extends Player {

	public JiaBaoYu(Player aSuccessor) {
		// TODO Auto-generated constructor stub
		this.setSuccessor(aSuccessor);
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		if (DrumBeater.stopped)
		{
			System.out.println("Jia Bao Yu gotta drink!");			
		}
		else
		{
			System.out.println("Jia Bao Yu passed!");
			next();
		}

	}

}
