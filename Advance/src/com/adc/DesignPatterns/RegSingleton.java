/**
 * 
 */
package com.adc.DesignPatterns;
import java.util.HashMap;
/**
 * @author yshic
 * 登记式单例类
 *
 */
public class RegSingleton {

	static private HashMap m_registry= new HashMap();
	static
	{
		RegSingleton x=new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}
	/**
	 * 
	 */
	protected RegSingleton() {
		// TODO Auto-generated constructor stub
	}
	static public RegSingleton getInstance(String name)
	{
		if (name==null) 
		{
			name="com.adc.DesignPatterns.RegSingleton";
		}
		if (m_registry.get(name)==null)
		{
			try 
			{
				m_registry.put(name, Class.forName(name).newInstance());
			}
			catch(Exception e) 
			{
				System.out.println("Error happened.");
			}
		}
		return (RegSingleton)(m_registry.get(name));
	}
	public String about()
	{
		return "Hello， I am RegSingleton";
	}
}
