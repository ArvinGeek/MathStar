package com.adc.Crawler;

//package com.demo.javaCrawler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler extends Thread {

    private String url;
    private String folderName;

    private static String get_img_regex = "<img src=\"//hbimg.*?/>";
    private static String get_src_regex = "\"//hbimg.huabanimg.com/.*?\"";
    private static String get_dataId_regex = "pin_id:'[\\d]+'";

    public Crawler(String url, String folderName) {
        this.url = url;
        this.folderName = folderName;
    }

    @Override
    public void run() {
        try {
            File file = new File(folderName);
            if (file.exists()) {
                HbCrawler.delete(file);
            }
            file.mkdirs();
            String thisUrl = url;
            while (true) {
                StringBuffer html = HbCrawler.getHtml(thisUrl);
                LinkedHashSet<String> srcSet = getSrc(html);
                if (srcSet.size() == 0) {
                    System.out.println(url + "椤甸潰宸茬埇鍙栧畬鎴�");
                    break;
                }
                saveImg(srcSet);
                thisUrl = getNextUrl(html);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 鑾峰彇html涓璼rc鏍囩鍐呭
     *
     * @param html 浼犲叆鐨刪tml鏂囨湰
     * @return 杩斿洖src鍒楄〃
     */
    public LinkedHashSet<String> getSrc(StringBuffer html) {
        LinkedHashSet<String> srcSet = new LinkedHashSet<>();
        Matcher matcherImg = Pattern.compile(get_img_regex).matcher(html);
        while (matcherImg.find()) {
            Matcher matcherSrc = Pattern.compile(get_src_regex).matcher(matcherImg.group());
            while (matcherSrc.find()) {
                String srcStr = matcherSrc.group();
                if (srcStr.contains("fw236")) {
                    String srcUrl = "http:"+srcStr.substring(1, srcStr.length() - 1).replace("fw236", "fw658");
                    srcSet.add(srcUrl);
                }
            }
        }
        return srcSet;
    }

    /**
     * 鏍规嵁src鍦板潃涓嬭浇璇ュ浘鐗�
     *
     * @param srcSet 浼犲叆鐨剆rc鍒楄〃
     */
    public void saveImg(LinkedHashSet<String> srcSet) {
        for (String src : srcSet) {
            try {
                URL url = new URL(src);
                InputStream is = url.openStream();
                FileOutputStream fos = new FileOutputStream(folderName + src.substring(src.lastIndexOf("/") + 1) + ".jpg");
                byte buf[] = new byte[1024];
                int length = 0;
                while ((length = is.read(buf)) != -1) {
                    fos.write(buf, 0, length);
                }
                fos.close();
                is.close();
                System.out.println(src.substring(src.lastIndexOf("/") + 1) + ".jpg" + "涓嬭浇鎴愬姛");
            } catch (Exception e) {
                System.out.println(src.substring(src.lastIndexOf("/") + 1) + ".jpg" + "涓嬭浇澶辫触");
            }
        }
    }

    /**
     * 瀹炵幇椤甸潰鐨刟jax鍔犺浇锛岃幏鍙栦笅娆¤姹傜殑url
     *
     * @param html
     * @return
     */
    public String getNextUrl(StringBuffer html) {
        String last_id = null;
        try {
            Matcher matcher = Pattern.compile(get_dataId_regex).matcher(html);
            while (matcher.find()) {
                last_id = matcher.group();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String lastId = last_id.substring(last_id.indexOf("'") + 1, last_id.lastIndexOf("'"));
        String nextUrl = url + "/?max=" + lastId;
        return nextUrl;
    }
}
