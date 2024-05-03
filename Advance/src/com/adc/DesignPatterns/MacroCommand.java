package com.adc.DesignPatterns;

public interface MacroCommand extends Command {
	void execute();
	/*
	 *  ������ۼ��Ĺ�����   ����ɾ��һ����Ա����
	 * */
	void remove(Command toRemove);
	/*
	 *  ������ۼ��Ĺ�����   �������һ����Ա����
	 * */
	void add(Command toAdd);
	
}
