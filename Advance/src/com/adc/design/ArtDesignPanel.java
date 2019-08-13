package com.adc.design;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JPanel;

public class ArtDesignPanel extends JPanel
{

     @Override
     public void paint(Graphics g) {  //��дpaint����
        // TODO Auto-generated method stub
         Graphics2D g2 = (Graphics2D)g;     //���Graphics2D����
         Ellipse2D.Float ellipse = new Ellipse2D.Float(-80, 5, 160, 10); //������Բ����
         g2.translate(160, 90); //ƽ��������
         
         Random random = new Random(); //��������
         int R = random.nextInt(256);  //���������ɫ��Rֵ
         int G = random.nextInt(256);  //���������ɫ��Gֵ
         int B = random.nextInt(256);  //���������ɫ��Bֵ
        
         Color color = new Color(R,G,B);  //������ɫ����
         g2.setColor(color);  //ָ����ɫ
         g2.draw(ellipse);   //������Բ
         g2.drawString("Art Design One !", 300, 300);
         int i = 0;
         while (i < 100) 
         {
             
            R = random.nextInt(256);  //���������ɫ��Rֵ
            G = random.nextInt(256);  //���������ɫ��Gֵ
            B = random.nextInt(256);  //���������ɫ��Bֵ
             
            color = new Color(R,G,B);

            g2.setColor(color);
            g2.rotate(10);   //��ת����
            g2.draw(ellipse);  //������Բ
           
             i++;
        }
        
     }
 }
