package com.adc.design;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.JFrame;

import sun.font.FontDesignMetrics;

//import com.adc.advance.DrawGraphic;

public class GoChessFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	GoChessPanel gcp=new GoChessPanel(); 
	// 构造方法
	public GoChessFrame() {
		// TODO Auto-generated constructor stub
		
		this.add(gcp);
		this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
		this.setVisible(true);
		Container p = getContentPane();
		setBounds(510, 2, 1200, 1080);
		setVisible(true);
		p.setBackground(Color.ORANGE);
		setLayout(null);
		//pack();
		setResizable(false);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 获取专门用于在窗口界面上绘图的对象
		//jg = this.getGraphics();
		// 绘制游戏区域
		//paintComponents(jg);

		// jg.drawString(getTitle(), 50, 50);
		// this.setTitle("我的第一个窗体");
		// //this.setBounds(300,200,450,350);设置窗体位置大小，前两个参数为位置，后两个参数为窗体大小
		// this.setLocation(300,200);//设置位置
		// this.setSize(450,350);//设置大小
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式
		// this.setVisible(true);//设置为可见
	}
	public static void main(String[] args) {
		new GoChessFrame();
	}

//	public void kill(){
//        for(int i = 0;i < 19; i++){
//            for(int j = 0;j < 19; j++){
//                if(map[i][j] == 0)  
//                   continue;
//                else{
//                	block = new int[361];
//                	blockLength = 1;                   
//                   	block[0] = i*100 + j; 
//                   
//                    recursion(i,j); 
//                    
//                    if(hasQi()) 
//                    	continue;            
//                    else {
//                        for(int t = 0;t < blockLength; t++)
//                         map[block[t]/100][block[t]%100] = 0; 
//                    }
//                }
//            }
//        }
//    }
// 
//    public void recursion(int i,int j){   
//        //Left
//        if(i-1 >= 0 && map[i-1][j] == map[i][j] && isInBlock((i-1)*100+j)){
//            block[blockLength] = (i-1)*100 + j;
//            blockLength++;
//            recursion(i-1,j);
//        }
//        //Up
//        if(j-1 >= 0 && map[i][j-1] == map[i][j] && isInBlock(i*100+j-1)){
//            block[blockLength] = i*100 + j-1;
//            blockLength++;
//            recursion(i,j-1);
//        }
//        //Right
//       if(i+1 < 19 && map[i+1][j] == map[i][j] && isInBlock((i+1)*100+j)){
//    	    block[blockLength] = (i+1)*100 + j;
//    	    blockLength++;
//            recursion(i+1,j);
//        }
//       //Down
//        if(j+1 < 19 && map[i][j+1] == map[i][j] && isInBlock(i*100+j+1)){
//            block[blockLength] = i*100 + j+1;
//            blockLength++;
//            recursion(i,j+1);
//        }
//    }
//    
//    public boolean hasQi(){
//        int i,j;
//        for(int t = 0;t < blockLength; t++){
//            i = block[t]/100;
//            j = block[t]%100;
//            if(i-1 >= 0 && map[i-1][j] == 0) return true;
//            if(i+1 < 19 && map[i+1][j] == 0) return true;
//            if(j-1 >= 0 && map[i][j-1] == 0) return true;
//            if(j+1 < 19 && map[i][j+1] == 0) return true;            
//        }
//        return false;
//    }
//    
//    public boolean isInBlock(int neighbor){    
//        for(int i = 0;i < blockLength; i++)
//        {
//            if (block[i] == neighbor) return false;
//        }
//        return true;
//    }

	/// Function 提子
}
