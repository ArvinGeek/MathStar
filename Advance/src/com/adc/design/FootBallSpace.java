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
		// ����BufferedImage����
		BufferedImage image = new BufferedImage(width, height,     BufferedImage.TYPE_INT_RGB);
		// ��ȡGraphics2D
		Graphics2D g2d = image.createGraphics();
		// ��ͼ
		/*
		 * g2d.setColor(Color.GREEN); g2d.setStroke(new BasicStroke(1)); //g2dd.draw
		 * //�ͷŶ��� g2d.dispose();
		 */
		g2d.setColor(Color.GREEN);
		g2d.fillRect(0, 0, width, height);
        //������ɫ
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

        // ��ͼƬ��С����Ϊ��Լ4cm*4cm �������ֽ�Ŵ�С�趨
        //g2d.drawImage(image2, 10, 85, 135, 135,null);
        //g2d.drawRect(0, 0, width - 1, height - 1);
		//        //��������:���塢�ֺš���С
		//        g2d.setFont(new Font("����", Font.BOLD, 26));
		//        //���ñ�����ɫ
		//        g2d.setColor(Color.BLACK);
		//        //��ͼƬ��д�ַ���
		//        g2d.drawString("����", 15, 30);
		//        g2d.setFont(new Font("����", Font.BOLD, 20));
		//        g2d.drawString("��", 65, 28);
		//        g2d.setFont(new Font("����", Font.BOLD, 26));
		//        g2d.drawString("����", 83, 30);
		//        g2d.setFont(new Font("����", Font.BOLD, 18));
		//        g2d.drawString("iR-ADV C3525", 15, 60);
		//        g2d.setFont(new Font("����", Font.ITALIC, 14));
        //g2d.drawString(code, 30, 80);
        // ͼƬ�ϴ����·��
        String savePath = "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\FootBallSpace.jpg";
        ImageIO.write(image, "JPEG", new FileOutputStream(savePath));
		// �����ļ�    
		//ImageIO.write(image, "png", new File("F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\FootBallSpace.png"));
		System.out.println(" Drawing Success ! ");	
	}
}
