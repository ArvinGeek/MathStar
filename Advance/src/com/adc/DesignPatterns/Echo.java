package com.adc.DesignPatterns;
import java.io.*;
public class Echo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		InputStreamReader input=new InputStreamReader(System.in);
		System.out.println("Enter data and push enter:");
		BufferedReader reader=new BufferedReader(input);
		line =reader.readLine();
		System.out.println("Data entered:"+line);
	}

}
