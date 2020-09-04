package com.adc.advance;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class DrawStampGraphic 
{

	
	public static void main(String[] args) throws Exception 
	{
		//new DrawGraphic();
		graphicsGeneration();
	}

		/**
	     * 生成图片
	     * 
	     * @return
	     * @throws Exception
	     */
	public static String graphicsGeneration() throws Exception 
	{
		// 实际数据行数+标题+备注
		int imageWidth = 490;
		int imageHeight = 130;

		BufferedImage image = new BufferedImage(imageWidth, imageHeight,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = (Graphics2D) image.getGraphics();
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, imageWidth, imageHeight);

		// ---------- 增加下面的代码使得背景透明 -----------------
		// image =
		// g2d.getDeviceConfiguration().createCompatibleImage(imageWidth,
		// imageHeight, Transparency.TRANSLUCENT);
		// g2d.dispose();
		// g2d = image.createGraphics();
		// ---------- 背景透明代码结束 -----------------

		g2d.setColor(new Color(220, 240, 240));
		g2d.setStroke(new BasicStroke(3.0f));
		// 画横线
		g2d.setColor(Color.red);

		g2d.drawLine(10, 10, imageWidth - 10, 10);
		g2d.drawLine(10, imageHeight - 10, imageWidth - 10, imageHeight - 10);
		// 画竖线
		g2d.setColor(Color.red);
		g2d.drawLine(10, 10, 10, imageHeight - 10);
		g2d.drawLine(imageWidth - 10, 10, imageWidth - 10, imageHeight - 10);

		// 设置字体
		Font font = new Font("华文楷体", Font.BOLD, 25);
		g2d.setFont(font);
		// 写入内容
		g2d.setColor(Color.black);
		font = new Font("华文楷体", Font.BOLD, 25);
		g2d.setFont(font);
		g2d.drawString("人员：李某某", 12, 45);
		g2d.drawString("部门：综合业务处", 12, 100);

		g2d.drawString("下载次数：3次", 270, 45);
		g2d.drawString("时间：2018-10-15", 270, 100);

		String path = "G:/Stamp001.jpg";
		ImageIO.write(image, "jpg", new File(path));
		return path;
		
	}
}
