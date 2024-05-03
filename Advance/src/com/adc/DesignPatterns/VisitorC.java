package com.adc.DesignPatterns;

public abstract class VisitorC 
{
	public abstract void visitHardDisk(HardDisk e);
	public abstract void visitMainBoard(MainBoard e);
	public abstract void visitCpu(Cpu e);
	public abstract void visitPc(Pc e);
	public abstract void visitCase(Case e);
	public abstract void visitIntergratedBoard(IntergratedBoard e);
}
