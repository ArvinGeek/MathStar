package com.adc.DesignPatterns;

import java.io.IOException;
import java.io.OptionalDataException;

public class TheGreatestSage {

	private Monkey monkey=new Monkey();
	public TheGreatestSage() {
		// TODO Auto-generated constructor stub
	}
	public void change()throws IOException,ClassNotFoundException
	{
		Monkey copyMonkey ;
		for(int i=0;i<2000;i++) {}
		//copyMonkey =(Monkey)monkey.clone();
		copyMonkey = (Monkey)monkey.deepClone();
		System.out.println("Monkey King's birth date="+monkey.getBirthDate());
		System.out.println("Copy Monkey's birth date="+copyMonkey.getBirthDate());
		System.out.println("Monkey King==Copy Monkey?"+(monkey==copyMonkey));
		System.out.println("Monkey King's Staff==Copy Monkey's Staff?"+(monkey.getStaff()==copyMonkey.getStaff()));
	}
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		TheGreatestSage  sage=new TheGreatestSage();
		sage.change();
	}

}
