package com.adc.DesignPatterns;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class ConfigManager {

	private static final String PFILE=System.getProperty("user.dir")+File.separator+"singleton.properties";
	private File m_file=null;
	private long m_lastModifiedTime=0;
	private Properties m_props=null;
	private static ConfigManager m_instance= new ConfigManager();
	private ConfigManager() 
	{
		// TODO Auto-generated constructor stub
		m_file =new File(PFILE);
		m_lastModifiedTime=m_file.lastModified();
		if (m_lastModifiedTime==0)
		{
			System.err.println(PFILE+" file does not exist!");
		}
		m_props= new Properties();
		try 
		{
			m_props.load(new FileInputStream(PFILE));
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	synchronized public static ConfigManager getIntance()
	{
		return m_instance;
	}
	final public Object getConfigItem(String name,Object defaultVal)
	{
		long newTime = m_file.lastModified();
		if (newTime==0) 
		{
			if (m_lastModifiedTime==0) 
			{
				System.err.println(PFILE+" file does not exist!");
			}
			else {
				System.err.println(PFILE+" file was deleted!!");
			}
			return defaultVal;
		}
		else if (newTime>m_lastModifiedTime) 
		{
			m_props.clear();
			try {
				m_props.load(new FileInputStream(PFILE));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		m_lastModifiedTime = newTime;
		Object val = m_props.getProperty(name);
		if (val==null)
		{
			return defaultVal;
		}
		else
		{
			return val;
		}
	}

}


























