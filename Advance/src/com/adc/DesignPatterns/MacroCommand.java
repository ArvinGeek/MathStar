package com.adc.DesignPatterns;

public interface MacroCommand extends Command {
	void execute();
	/*
	 *  宏命令聚集的管理方法   可以删除一个成员命令
	 * */
	void remove(Command toRemove);
	/*
	 *  宏命令聚集的管理方法   可以添加一个成员命令
	 * */
	void add(Command toAdd);
	
}
