package com.adc.design;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;
public class ArtFontStringDesign extends JFrame {
    private Shape rect;//���ζ���
    private Font font;//�������
    private Date date;//��ǰ���ڶ���
    public ArtFontStringDesign()
    {
        rect=new Rectangle2D.Double(10, 10, 200, 80);
        font=new Font("����",Font.BOLD,16);
        date=new Date();
        this.setSize(230,140);//���ô���Ĵ�С
        //���ô���Ĺرշ�ʽ
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new CanvasPanel());//���ô������Ϊ��ͼ������
        this.setTitle("��ͼ�ı�");//���ô������
    }
    class CanvasPanel extends JPanel{
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2=(Graphics2D)g;//ǿ������ת��
            g2.setColor(Color.CYAN);//���õ�ǰ��ͼ��ɫ
            g2.fill(rect);//������
            g2.setColor(Color.blue);//���õ�ǰ��ͼ��ɫ
            g2.setFont(font);//��������
            g2.drawString("���ڵ�ʱ����", 20, 30);//�����ı�
            g2.drawString(String.format("%tr", date), 50, 60);//�����¼��ı�
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	ArtFontStringDesign ds=new ArtFontStringDesign();//
        ds.setVisible(true);
    }

}
