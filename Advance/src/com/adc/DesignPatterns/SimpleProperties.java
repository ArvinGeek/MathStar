package com.adc.DesignPatterns;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SimpleProperties {
	public static void main(String[] args) {
        // ���� , ���� Properties �����
        Properties prop = new Properties();
        try {
            // Ȼ�� , ���� �ļ������� , ��ȡָ���� properties �����ļ�
            FileInputStream input = new FileInputStream("DB.properties");

            // �ٺ� , ���� Properties ʵ������� load ���� , ���� properties �����ļ� �� �ļ�������
            prop.load(input);

            // ��� , ���� Properties ʵ������� getProperty ���� , ��ȡָ�� �� ��Ӧ�� ֵ
            System.out.println("database.url: " + prop.getProperty("database.url"));
            System.out.println("database.username: " + prop.getProperty("database.username"));
            System.out.println("database.password: " + prop.getProperty("database.password"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
 * 
 * 2������ʵ������ȡ�����ļ���Ȼ�����keyֵ��valueֵ�����ô��ַ�ʽ��ȡ��Ŀ�������ļ��������������廷����

���ƴ���
public class HelloWorld {
     public static void main(String[] args) {
         Properties properties=new Properties();
         InputStream in=HelloWorld.class.getClassLoader().getResourceAsStream("Config/config.properties");
         try{
             properties.load(in);
             Enumeration enumeration=properties.propertyNames();
             while (enumeration.hasMoreElements()){
                 String strKey=(String)enumeration.nextElement();
                 String strValue=properties.getProperty(strKey);
                 System.out.println("key:"+strKey+";Value:"+strValue);
             }
         }catch(Exception e){
             System.out.println("There is An IO error!");
         }
     }
 }
���ƴ���
������1����ȡ����һ�ֱ�����ʽ

���ƴ���
     InputStream in = new BufferedInputStream(new FileInputStream("D:/b.properties"));
     properties.load(in);
     Iterator<String> it = properties.stringPropertyNames().iterator();
             while (it.hasNext()) {
                 String key = it.next();
                 System.out.println(key + ":" + properties.getProperty(key));
             }
���ƴ���
 

3��һЩ������ȡ�����ļ��ķ���

������1���ӻ����̶�λ�ö�ȡ�����ļ��������ļ�����ĳ�������¼��ַ�ʽ��������

    FileInputStream in=new FileInputStream("D:/config.properties");
    properties.load(in);    
������

    InputStream in= new BufferedInputStream(newFileInputStream("D:/config.properties"));
    properties.load(in);
������

    BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/config.properties"));
    properties.load(bufferedReader);
 

4�������ļ�����µļ�ֵ�ԣ�Ȼ�󽫱����һ�����ļ����洢��

    FileOutputStream oFile = new FileOutputStream("D:/b.properties", true);//true��ʾ׷�Ӵ�
    properties.setProperty("�ƶ�", "10086");
    properties.store(oFile, "The New properties file has Created");
    oFile.close();
 

����java.util.ResourceBundle���ȡproperties�����ļ������ַ�ʽ����ȡproperties�����ļ�����Ҫ��.properties��׺����ֻ��Ҫ�ļ������ɡ�

    ResourceBundle resource = ResourceBundle.getBundle("Config/config");
    String key = resource.getString("foo");
    System.out.println(key);
 * 
 * */
