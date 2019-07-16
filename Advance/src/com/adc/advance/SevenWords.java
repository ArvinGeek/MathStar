package com.adc.advance;
import java.io.*;
import java.util.Calendar; 
import java.util.Date; 
import java.text.SimpleDateFormat;  
//java.util.Calendar
//import java.util.Date;

public class SevenWords 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		ReNameFile();
		System.out.println("ReName Success ！ ");

		
	}
	///File ReName
	public static void ReNameFile() 
	{
		File dir = new File("F:\\MediaDesign\\Temp\\");
	    ///String[] Flist = dir.list();
		File[] Flist = dir.listFiles();
		Date date = new Date(); 
		//DateTime today = new DateTime(new Date());
		//Date dt=new Date(new Date()).toDateTimeString(); 
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式  
	     // System.out.println(df.format(new Date()));// new Date()为获取当前系统时间  
		long Count=0,intRName=new Long(df.format(date));
		String RName="";
		for (File f  : Flist) {
			Count = Count + 1;
			intRName=intRName+Count;
			RName=String.valueOf(intRName);
            f.renameTo(new File(dir.getAbsolutePath()+"\\"+RName+".mp3"));
        }
	}
	//转移文件夹
	public static void SendToDir()
	{}
	 
}
