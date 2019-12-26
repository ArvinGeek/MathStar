package com.adc.design;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class FootBallSpace {
	
	public static void main(String[] args) throws IOException {
		//new GoChessFrame();
		int width = 1200;
		int height = 820;
		// 创建BufferedImage对象
		BufferedImage image = new BufferedImage(width, height,     BufferedImage.TYPE_INT_RGB);
		// 获取Graphics2D
		Graphics2D g2d = image.createGraphics();
		// 画图
		/*
		 * g2d.setColor(Color.GREEN); g2d.setStroke(new BasicStroke(1)); //g2dd.draw
		 * //释放对象 g2d.dispose();
		 */
		g2d.setColor(Color.GREEN);
		g2d.fillRect(0, 0, width, height);
        //设置颜色
        g2d.setColor(Color.WHITE);
        g2d.fillRect(20, 20, width-40, height-40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(30, 30, width-60, height-60);
		g2d.setColor(Color.WHITE);
		g2d.fillRect(30, 190+30+15, 165, 330);		
		g2d.setColor(Color.WHITE);
		g2d.fillRect(1200-30-165, 190+30+15, 165, 330);
		
		g2d.fillRect(595, 30, 10, height-60);


		
		
		g2d.setColor(Color.GREEN);
		g2d.fillRect(30, 190+30+15+10, 165-10, 330-20);
		//g2d.fillRect(30,  190+30+15+55, 55, 220);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(1200-30-165+10, 190+30+15+10, 165-10, 330-20);

        // 将图片大小设置为大约4cm*4cm 具体根据纸张大小设定
        //g2d.drawImage(image2, 10, 85, 135, 135,null);
        //g2d.drawRect(0, 0, width - 1, height - 1);
		//        //设置字体:字体、字号、大小
		//        g2d.setFont(new Font("黑体", Font.BOLD, 26));
		//        //设置背景颜色
		//        g2d.setColor(Color.BLACK);
		//        //向图片上写字符串
		//        g2d.drawString("东久", 15, 30);
		//        g2d.setFont(new Font("黑体", Font.BOLD, 20));
		//        g2d.drawString("·", 65, 28);
		//        g2d.setFont(new Font("黑体", Font.BOLD, 26));
		//        g2d.drawString("佳能", 83, 30);
		//        g2d.setFont(new Font("黑体", Font.BOLD, 18));
		//        g2d.drawString("iR-ADV C3525", 15, 60);
		//        g2d.setFont(new Font("黑体", Font.ITALIC, 14));
        //g2d.drawString(code, 30, 80);
        // 图片上传后的路径
        String savePath = "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\FootBallSpace.jpg";
        ImageIO.write(image, "JPEG", new FileOutputStream(savePath));
		// 保存文件    
		//ImageIO.write(image, "png", new File("F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\FootBallSpace.png"));
		System.out.println(" Drawing Success ! ");	
	}
}
