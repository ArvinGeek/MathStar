package com.adc.DesignPatterns;
/*
 * 
 * ¿¡∫∫ Ωµ•¿˝¿‡
 * 
 * */
public class LazySingleton 
{
	private static LazySingleton m_instance=null;
	private LazySingleton() {
		// TODO Auto-generated constructor stub
	}
	synchronized public static LazySingleton getInstance()
	{
		if(m_instance==null)
		{
			m_instance= new LazySingleton();
		}
		return m_instance;
	}
}
