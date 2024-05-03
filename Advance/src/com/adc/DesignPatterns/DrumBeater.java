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
		//����������
		DrumBeater drumBeater = new DrumBeater();
		JiaMu jiaMu =new JiaMu(null);
		jiaMu.setSuccessor(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(jiaMu)))));
		//��ʼ���Ĺ���
		drumBeater.startBeating(1);
		//�ɼ�ĸ��ʼ����
		firstPlayer=jiaMu;
		firstPlayer.handle();
	}
	/*
	 * 	�������淽����ʼ���Ĺ���
	 * */
	public void startBeating(int stopInSeconds)
	{
		System.out.println("Drum beating started...");
		timer=new Timer();
		timer.schedule(new StopBeatingReminder(), stopInSeconds );
	}
	/*
	 * 	�ڲ���Ա�࣬����ֹͣ���ĵ�����
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
