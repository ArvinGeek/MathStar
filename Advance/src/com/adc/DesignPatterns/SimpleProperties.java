package com.adc.DesignPatterns;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SimpleProperties {
	public static void main(String[] args) {
        // 首先 , 创建 Properties 类对象
        Properties prop = new Properties();
        try {
            // 然后 , 创建 文件输入流 , 读取指定的 properties 配置文件
            FileInputStream input = new FileInputStream("DB.properties");

            // 再后 , 调用 Properties 实例对象的 load 函数 , 加载 properties 配置文件 的 文件输入流
            prop.load(input);

            // 最后 , 调用 Properties 实例对象的 getProperty 函数 , 获取指定 键 对应的 值
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
 * 2、以下实例，读取配置文件，然后遍历key值和value值，采用此种方式读取项目中配置文件，将不依赖具体环境。

复制代码
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
复制代码
　　（1）读取后另一种遍历方式

复制代码
     InputStream in = new BufferedInputStream(new FileInputStream("D:/b.properties"));
     properties.load(in);
     Iterator<String> it = properties.stringPropertyNames().iterator();
             while (it.hasNext()) {
                 String key = it.next();
                 System.out.println(key + ":" + properties.getProperty(key));
             }
复制代码
 

3、一些其它读取配置文件的方法

　　（1）从环境固定位置读取配置文件，配置文件放在某个磁盘下几种方式。　　　

    FileInputStream in=new FileInputStream("D:/config.properties");
    properties.load(in);    
　　或

    InputStream in= new BufferedInputStream(newFileInputStream("D:/config.properties"));
    properties.load(in);
　　或

    BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/config.properties"));
    properties.load(bufferedReader);
 

4、配置文件添加新的键值对，然后将保存成一个新文件并存储。

    FileOutputStream oFile = new FileOutputStream("D:/b.properties", true);//true表示追加打开
    properties.setProperty("移动", "10086");
    properties.store(oFile, "The New properties file has Created");
    oFile.close();
 

二、java.util.ResourceBundle类读取properties配置文件，这种方式来获取properties属性文件不需要加.properties后缀名，只需要文件名即可。

    ResourceBundle resource = ResourceBundle.getBundle("Config/config");
    String key = resource.getString("foo");
    System.out.println(key);
 * 
 * */
