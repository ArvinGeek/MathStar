package com.adc.DesignPatterns;

import java.util.Vector;

public class InventoryVisitor extends VisitorC 
{
	private Vector inv;
	public InventoryVisitor() {
		// TODO Auto-generated constructor stub
		inv = new Vector(10,5);
	}
	public int size()
	{
		return inv.size();
	}
	@Override
	public void visitHardDisk(HardDisk e) {
		// TODO Auto-generated method stub
		inv.addElement(e);
	}

	@Override
	public void visitMainBoard(MainBoard e) {
		// TODO Auto-generated method stub
		inv.addElement(e);
	}

	@Override
	public void visitCpu(Cpu e) {
		// TODO Auto-generated method stub
		inv.addElement(e);
	}

	@Override
	public void visitPc(Pc e) {
		// TODO Auto-generated method stub
		inv.addElement(e);
	}

	@Override
	public void visitCase(Case e) {
		// TODO Auto-generated method stub
		inv.addElement(e);
	}

	@Override
	public void visitIntergratedBoard(IntergratedBoard e) {
		// TODO Auto-generated method stub
		inv.addElement(e);
	}

}
