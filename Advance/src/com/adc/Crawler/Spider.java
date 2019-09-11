package com.adc.Crawler;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider {
    
    private static ArrayList<String> urlStrs = new ArrayList<String>();
    private static String regx = "\"[\\S]*\\.(jpg|gif)";   //读取jpg和gif图片的正则
    private static int num = 0;        //图片名递增量
    
    public static void main(String[] args)throws Exception{
        //String urlStr = "http://jandan.net/ooxx/page-2381#comments";        //要抓取的煎蛋妹子网页示例
        String urlStr="";
        String dstDir = "H:\\Storage\\National Picture\\DownLoads\\Jandan";
        int start = 2340;    //起始页
        int end = 2370;        //结束页
    
        for(int i=start;i<=end;i++){
            urlStr = "http://jandan.net/top-ooxx/page-"+i+"#comments";
            //http://jandan.net/top-ooxx
            matchAll(urlStr);
            if(urlStrs.size() > 0){
                for(String imgStr:urlStrs){
                    downFile(imgStr,dstDir);    
                    Thread.sleep(300);    //休息一会
                }
            }
            urlStrs.clear();
        }
        System.out.println("网址抓取完毕");
    }
    /*
     * @param:urlStr 要爬取的网址
     */
    private static void matchAll(String urlStr)throws Exception{
        Pattern p = Pattern.compile(regx);
        Matcher m;
        URL url;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            throw new Exception("网址不存在");
        }
        
        BufferedReader read= new BufferedReader(new InputStreamReader(url.openStream()));
        String line = "";
        while((line = read.readLine()) != null){
            m = p.matcher(line);
            while(m.find()){
                System.out.println(m.group());
                urlStrs.add("http:"+m.group().substring(1));        //将图片网址添加到ArrayList(过滤第一个双引号)
            }
        }
        read.close();
    }
    /*下载指定图片网址的图片
     * @param:urlStr 图片网址
     * @param:dstDir 图片存放目录
     */
    private static void downFile(String urlStr,String dstDir)throws Exception{
        byte[] bBuf = new byte[1024];
        File dir = new File(dstDir);
        String fileName = "";
        if(!dir.exists()){
            dir.mkdir();
        }
        if(urlStr.endsWith("jpg")){
            fileName = (num++) + ".jpg";
        }else if(urlStr.endsWith("gif")){
            fileName = (num++) + ".gif";
        }
        File imgFile = new File(dstDir,fileName);
        //if(imgFile.exists()){
        //    TODO..
        //}
        URL url = new URL(urlStr);
        BufferedInputStream in = new BufferedInputStream(url.openStream());
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(imgFile));
        
        System.out.println("开始下载。。");
        int len = 0;
        while((len = in.read(bBuf)) != -1){
            out.write(bBuf,0,len);
        }
        System.out.println("下载完毕");
        in.close();
        out.close();
    }
    /*
     * 获取网页源码(此方法没有使用)
     */
    private void getSourceCode(String u)throws Exception{
        //String u = "http://m.onepiece.cc/post/10001/";
        File f = new File("d:/tmp.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        URL url = new URL(u);
        BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter write = new BufferedWriter(new FileWriter(f));
        String s = "";
        while((s=read.readLine()) != null){
            write.write(s);
            write.write('\n');
        }
        System.out.println("拷贝完成");
        read.close();
        write.close();
    }
}