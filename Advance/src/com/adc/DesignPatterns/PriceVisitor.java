package com.adc.DesignPatterns;

public class PriceVisitor extends VisitorC {
	private float total;
	public PriceVisitor() {
		// TODO Auto-generated constructor stub
		total=0;
	}
	public float value()
	{
		return total;
	}
	@Override
	public void visitHardDisk(HardDisk e) {
		// TODO Auto-generated method stub
		total += e.price();

	}

	@Override
	public void visitMainBoard(MainBoard e) {
		// TODO Auto-generated method stub
		total += e.price();
	}

	@Override
	public void visitCpu(Cpu e) {
		// TODO Auto-generated method stub
		total += e.price();
	}

	@Override
	public void visitPc(Pc e) {
		// TODO Auto-generated method stub
		total += e.price();
	}

	@Override
	public void visitCase(Case e) {
		// TODO Auto-generated method stub
		total += e.price();
	}

	@Override
	public void visitIntergratedBoard(IntergratedBoard e) {
		// TODO Auto-generated method stub
		total += e.price();
	}

}
