package com.adc.DesignPatterns;

import java.util.Timer;
import java.util.TimerTask;

public class Reminder 
{
	Timer timer;
	public Reminder(int seconds) {
		// TODO Auto-generated constructor stub
		timer = new Timer();
		timer.schedule(new ReminderTask(), seconds*1000);
	}
	
	class ReminderTask extends TimerTask
	{
		public void run()
		{
			System.out.println("Time's up!");
			//Terminate the timer thread
			timer.cancel();
		}
	}
	public static void main(String args[])
	{
		System.out.println("About to schedule task.");
		new Reminder(5);
		System.out.println("Task scheduled.");
	}

}
