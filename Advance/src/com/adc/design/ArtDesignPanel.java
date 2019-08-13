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
     public void paint(Graphics g) {  //重写paint方法
        // TODO Auto-generated method stub
         Graphics2D g2 = (Graphics2D)g;     //获得Graphics2D对象
         Ellipse2D.Float ellipse = new Ellipse2D.Float(-80, 5, 160, 10); //创建椭圆对象
         g2.translate(160, 90); //平移坐标轴
         
         Random random = new Random(); //获得随机数
         int R = random.nextInt(256);  //随机产生颜色的R值
         int G = random.nextInt(256);  //随机产生颜色的G值
         int B = random.nextInt(256);  //随机产生颜色的B值
        
         Color color = new Color(R,G,B);  //创建颜色对象
         g2.setColor(color);  //指定颜色
         g2.draw(ellipse);   //绘制椭圆
         g2.drawString("Art Design One !", 300, 300);
         int i = 0;
         while (i < 100) 
         {
             
            R = random.nextInt(256);  //随机产生颜色的R值
            G = random.nextInt(256);  //随机产生颜色的G值
            B = random.nextInt(256);  //随机产生颜色的B值
             
            color = new Color(R,G,B);

            g2.setColor(color);
            g2.rotate(10);   //旋转画布
            g2.draw(ellipse);  //绘制椭圆
           
             i++;
        }
        
     }
 }
