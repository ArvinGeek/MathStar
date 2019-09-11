package com.adc.Crawler;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HbCrawler {

    private static String suggestsRegex = "app.page\\[\"suggests\"\\] = \\{.*\\}";
    private static String urlRegex = "\"url\":\".*?\"";
    private String folder_name ;//瀛樺偍璺緞
    private String url;//

    public HbCrawler(String url,String folder_name) {
        this.folder_name = folder_name;
        this.url = url;
    }

    public static void main(String[] args) throws Exception {
        //String url = "https://huaban.com/boards/favorite/beauty/";
    	String url = "https://huaban.com/boards/favorite/fitness/";
        String folder_name = "H:\\Storage\\National Picture\\DownLoads\\Huaban\\";
        new HbCrawler(url,folder_name).startCrawle();
        System.out.println("Download OK ! ");
        //鍗曠嫭鐖彇鏌愪竴鐢绘澘
//        new Crawler("https://huaban.com/boards/50744395/","E:\\HbCrawler\\52334297\\").start();
    }

    /**
     * 鑾峰彇姣忎釜鐢绘澘鐨剈rl骞跺惎鍔ㄧ埇铏�
     *
     * @throws Exception
     */
    public void startCrawle() throws Exception {
        StringBuffer html = getHtml(url);
        Matcher matcherSu = Pattern.compile(suggestsRegex).matcher(html);
        while (matcherSu.find()) {
            Matcher matcherUrl = Pattern.compile(urlRegex).matcher(matcherSu.group());
            while (matcherUrl.find()) {
                String urlStr = matcherUrl.group();
                if (urlStr.contains("boards")) {
                    Matcher matcherId = Pattern.compile("[\\d]+").matcher(urlStr);
                    String id = "";
                    while (matcherId.find()) {
                        id = matcherId.group();
                    }
                    String url = "https://huaban.com/boards/" + id;
                    String folderName = folder_name + id;
                    new Crawler(url, folderName + "\\").start();
                }
            }
        }
    }

    /**
     * 浼犲叆url杩斿洖html
     *
     * @param url 浼犲叆鐨剈rl鍙傛暟
     * @return 杩斿洖html
     * @throws Exception
     */
    public static StringBuffer getHtml(String url) throws Exception {
        URL url1 = new URL(url);
        URLConnection connection = url1.openConnection();
        InputStream is = connection.getInputStream();
        BufferedReader bw = new BufferedReader(new InputStreamReader(is));
        StringBuffer sb = new StringBuffer();
        while (bw.ready()) {
            sb.append(bw.readLine()).append("\n");
        }
        bw.close();
        is.close();
        return sb;
    }

    /**
     * 鍒犻櫎鐩綍涓嬫墍鏈夋枃浠跺寘鎷鐩綍锛屽鏋滆鐩綍涓嬫湁涓嶄负绌虹殑鐩綍鍒欎細鍒犻櫎澶辫触
     *
     * @param file 浼犲叆鐨凢ile瀵硅薄
     */
    public static void delete(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            file1.delete();
        }
        file.delete();
    }
}
