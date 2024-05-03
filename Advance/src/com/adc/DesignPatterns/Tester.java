package com.adc.DesignPatterns;
import java.util.Observer;
public class Tester 
{
	static private Watched watched;
	static private Observer watcher;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		watched = new Watched();
		watcher = new Watcher(watched);
		watched.changeData("In C, we create bugs.");
		watched.changeData("In Java, we inherit bugs.");
		watched.changeData("In Java, we inherit bugs.");
		watched.changeData("In Visual Basic, we visualize bugs.");
		watched.changeData("In C, we create bugs.");
		watched.changeData("In Java, we inherit bugs.");

	}

}
