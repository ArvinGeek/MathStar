package com.adc.DesignPatterns;

import java.util.Timer;
import java.util.TimerTask;
import java.lang.Thread;

public class DrumBeater 
{
	private static Player firstPlayer; 
	public static boolean stopped = false;
	Timer timer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建责任链
		DrumBeater drumBeater = new DrumBeater();
		JiaMu jiaMu =new JiaMu(null);
		jiaMu.setSuccessor(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(jiaMu)))));
		//开始击鼓过程
		drumBeater.startBeating(1);
		//由贾母开始传花
		firstPlayer=jiaMu;
		firstPlayer.handle();
	}
	/*
	 * 	调用下面方法开始击鼓过程
	 * */
	public void startBeating(int stopInSeconds)
	{
		System.out.println("Drum beating started...");
		timer=new Timer();
		timer.schedule(new StopBeatingReminder(), stopInSeconds );
	}
	/*
	 * 	内部成员类，描述停止击鼓的任务
	 * */
	class StopBeatingReminder extends TimerTask
	{
		public void run()
		{
			System.out.println("Drum beating stopped!");
			stopped= true;
			//Terminate the timer thread
			timer.cancel();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
