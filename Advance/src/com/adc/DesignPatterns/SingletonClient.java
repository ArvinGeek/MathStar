package com.adc.DesignPatterns;
import java.util.Properties;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class SingletonClient {

	public SingletonClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type quit to quit");
		do 
		{
			System.out.println("Property item to read: ");
			String line = reader.readLine();
			if (line.equals("quit"))
			{
				break;
			}
			System.out.println(ConfigManager.getIntance().getConfigItem(line, "Not Found."));
		}
		while(true);
	}

}
