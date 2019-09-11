package com.adc.Crawler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class SpiderUtil {
 
	// ��ַ
	private static final String URL = "http://www.tooopen.com/view/1439719.html";
	// ��ȡimg��ǩ����
	private static final String IMGURL_REG = "<img.*src=(.*?)[^>]*?>";
	// ��ȡsrc·��������
	private static final String IMGSRC_REG = "[a-zA-z]+://[^\\s]*";
 
	// ��ȡhtml����
	public static String getHTML(String srcUrl) throws Exception {
		URL url = new URL(srcUrl);
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
 
		String line = null;
		StringBuffer buffer = new StringBuffer();
		while ((line = br.readLine()) != null) {
			buffer.append(line);
			buffer.append("\n");
		}
		br.close();
		isr.close();
		is.close();
		return buffer.toString();
	}
 
	// ��ȡimage url��ַ
	public static List<String> getImageURL(String html) {
		Matcher matcher = Pattern.compile(IMGURL_REG).matcher(html);
		List<String> list = new ArrayList<>();
		while (matcher.find()) {
			list.add(matcher.group());
		}
		return list;
	}
 
	// ��ȡimage src��ַ
	public static List<String> getImageSrc(List<String> listUrl) {
		List<String> listSrc = new ArrayList<String>();
		for (String img : listUrl) {
			Matcher matcher = Pattern.compile(IMGSRC_REG).matcher(img);
			while (matcher.find()) {
				listSrc.add(matcher.group().substring(0,
						matcher.group().length() - 1));
			}
		}
		return listSrc;
	}
 
	// ����ͼƬ
	private static void Download(List<String> listImgSrc) {
		try {
			// ��ʼʱ��
			Date begindate = new Date();
			for (String url : listImgSrc) {
				// ��ʼʱ��
				Date begindate2 = new Date();
				String imageName = url.substring(url.lastIndexOf("/") + 1,
						url.length());
				URL uri = new URL(url);
				InputStream in = uri.openStream();
				FileOutputStream fo = new FileOutputStream(new File(imageName));// �ļ������
				byte[] buf = new byte[1024];
				int length = 0;
				System.out.println("��ʼ����:" + url);
				while ((length = in.read(buf, 0, buf.length)) != -1) {
					fo.write(buf, 0, length);
				}
				// �ر���
				in.close();
				fo.close();
				System.out.println(imageName + "�������");
				// ����ʱ��
				Date overdate2 = new Date();
				double time = overdate2.getTime() - begindate2.getTime();
				System.out.println("��ʱ��" + time / 1000 + "s");
			}
			Date overdate = new Date();
			double time = overdate.getTime() - begindate.getTime();
			System.out.println("�ܺ�ʱ��" + time / 1000 + "s");
		} catch (Exception e) {
			System.out.println("����ʧ��");
		}
	}
 
	public static void main(String[] args) throws Exception {
		String html = getHTML(URL);
		List<String> listUrl = getImageURL(html);
		/*
		 * for(String img : listUrl){ System.out.println(img); }
		 */
		List<String> listSrc = getImageSrc(listUrl);
		/*
		 * for(String img : listSrc){ System.out.println(img); }
		 */
		Download(listSrc);
	}
 

}