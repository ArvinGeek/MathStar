package com.adc.design;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Temple {

}


// SolidBrush drawBrush = new SolidBrush(Color.Black);
// Create point for			// upper-left corner of drawing.			
// Graphics2D graphics = (Graphics2D) g;
///g.fillOval(55, 155, 40, 40); 		// g.fill3DRect(500, 500, 80, 80, false);

/*
 * Map = new ChessMan[rectnum + 1][rectnum + 1]; MB =new ChessManB[rectnum +
 * 1][rectnum + 1]; MW =new ChessManW[rectnum + 1][rectnum + 1];
 */


//ChessMan cm = new ChessMan(2, 2, 0); Map[2][2] = cm; 
//MB[2][2]=new ChessManB(this);//BtnComputer.setLabel("ABC");//("ABC");
//ChessMan cm = new ChessMan(2, 2, 1); //Map[2][2] = cm;
//this.remove(Man[2][2]);//Man[2][2] = null;//ChessMan[2][2];
//buttonA.setLabel("DDD");//("ABC");
///private Color rectColor = new Color(0xf5f5f5);


/*
 * if (ChessCE[i][j]==0) g.setColor(new Color(1.0F, 0.75F, 0.0F, 0.45F)); 
 * if (ChessCE[i][j]==1) g.setColor(Color.BLACK); 
 * if (ChessCE[i][j]==2) g.setColor(Color.white); 
 * g.fillOval(left + i * rectlen - qizilen / 2, top + j * rectlen - qizilen / 2, qizilen, qizilen);
 */

/*
 * if (Map[i][j] == null) continue; g.setColor(Map[i][j].color ==
 * ChessMan._black?Color.black:Color.white); g.fillOval(left + i * rectlen -
 * qizilen / 2, top + j * rectlen - qizilen / 2, qizilen, qizilen);
 */

//int x = -1, y = -1, 棋子颜色 = 1;  //MessageBox(Show_Messager());	
//public static final int rectlen = 50, rectnum = 19;	//棋子的直径

/*
 * private ChessMan[][] Map; private ChessManB[][] MB; private ChessManW[][] MW;
 * 
 */
/*
 * //if (Man[i][j] == null) continue; if (ChessCE[i][j]==0) { if
 * (MB[i][j]!=null) { this.remove(MB[i][j]); } if (MW[i][j]!=null) {
 * this.remove(MW[i][j]); } }
 * 
 * if (ChessCE[i][j]==1) { MB[i][j] = new ChessManB(this); this.add(MB[i][j]);
 * MB[i][j].setBounds(i * 40 - 15, j * 40 - 15, 40, 40); } if (ChessCE[i][j]==2)
 * { MW[i][j] = new ChessManW(this); this.add(MW[i][j]); MW[i][j].setBounds(i *
 * 40 - 15, j * 40 - 15, 40, 40); }
 */
/*
 * if (arg0.getModifiers() == InputEvent.BUTTON1_MASK) { x = (int) arg0.getX();
 * y = (int) arg0.getY(); ChessManB chesspoint_black = new ChessManB(this);
 * ChessManW chesspoint_white = new ChessManW(this); int a = (x + 55) / 50, b =
 * (y + 55) / 50; if (x / 50 < 2 || y / 50 < 2 || x / 50 > 19 || y / 50 > 19) {
 * } else { if (棋子颜色 == 1) { this.add(chesspoint_black);
 * chesspoint_black.setBounds(a * 50 - 65, b * 50 - 65, 40, 40); 棋子颜色 = 棋子颜色 *
 * (-1); } else if (棋子颜色 == -1) { this.add(chesspoint_white);
 * chesspoint_white.setBounds(a * 50 - 65, b * 50 - 65, 40, 40); 棋子颜色 = 棋子颜色 *
 * (-1); } }
 * 
 * }
 * 
 */

/*
 * class ChessManB extends Canvas implements MouseListener { GoChessPanel
 * chesspad = null; ChessManB(GoChessPanel p) { setSize(40, 40); chesspad = p;
 * addMouseListener(this); } public void paint(Graphics g) {
 * g.setColor(Color.black); g.fillOval(0, 0, 40, 40); } public void
 * mousePressed(MouseEvent e) { if (e.getModifiers() == InputEvent.BUTTON3_MASK)
 * { chesspad.remove(this); } } public void mouseReleased(MouseEvent e) { }
 * public void mouseEntered(MouseEvent e) { } public void mouseExited(MouseEvent
 * e) { } public void mouseClicked(MouseEvent e) { if (e.getClickCount() > 2)
 * chesspad.remove(this); } } //@SuppressWarnings("serial") class ChessManW
 * extends Canvas implements MouseListener { GoChessPanel chesspad = null;
 * ChessManW(GoChessPanel p) { setSize(40, 40); addMouseListener(this); chesspad
 * = p; } public void paint(Graphics g) { g.setColor(Color.white); g.fillOval(0,
 * 0, 40, 40); } public void mousePressed(MouseEvent e) { if (e.getModifiers()
 * == InputEvent.BUTTON3_MASK) { chesspad.remove(this); chesspad.棋子颜色 = -1; } }
 * public void mouseReleased(MouseEvent e) { } public void
 * mouseEntered(MouseEvent e) { } public void mouseExited(MouseEvent e) { }
 * public void mouseClicked(MouseEvent e) { if (e.getClickCount() > 2)
 * chesspad.remove(this); } } class ChessMan { public static int
 * _black=0,_white=1; protected int x,y; protected int color; public
 * ChessMan(int i,int j,int c) { x=i; y=j; color=c; } public String toString() {
 * String c=(color==_black?"black":"white"); return "["+x+","+y+"]:"+c; } }
 */


// 			填写第i行从第1个方格到第8个方格里面的数字（方格序号从0开始）
//			for(int j = 0; j < 18; j ++) 
//			{
//				 g.drawString("A", j, i); 
//			} 
//			g.fillOval(55, 55, 40, 40);  // g.draw
//			g.fillOval(55, 155, 40, 40); 
//			g.fillOval(105, 105, 40, 40);
//			g.fillOval(155, 155, 40, 40);
//			g.fillOval(205, 205, 40, 40);
//			g.fillOval(305, 305, 40, 40);
//			g.fillOval(405, 405, 40, 40);
//			g.fillOval(505, 505, 40, 40);
//			g.fillOval(605, 605, 40, 40);
//			g.fillOval(705, 705, 40, 40);
//			g.fillOval(805, 805, 40, 40);
//			g.fillOval(905, 905, 40, 40);
//			g.fillOval(955, 955, 40, 40);						
//			g.setColor(Color.WHITE);
//			g.fillOval(55, 105, 40, 40); 
//			g.fillOval(105, 205, 40, 40);
//			g.fillOval(105, 155, 40, 40);
//			g.fillOval(105, 255, 40, 40);
//			g.fillOval(155, 255, 40, 40);
//			g.fillOval(155, 205, 40, 40);							
//			ChessManB chessNumB = new ChessManB(this);
//			ChessManW chessManW = new ChessManW(this);
//			this.add(chessNumB);
//			chessNumB.setBounds(55, 55, 40, 40);
//			chessNumB.setBounds(55, 155, 40, 40); 	



//BtnComputer.setLabel("ABC");//("ABC");
//Map





//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//p.setBackground(Color.ORANGE);
//pack();

// 获取专门用于在窗口界面上绘图的对象
//jg = this.getGraphics();
// 绘制游戏区域
//paintComponents(jg);
// jg.drawString(getTitle(), 50, 50);
// this.setTitle("我的第一个窗体");
// this.setBounds(300,200,450,350);设置窗体位置大小，前两个参数为位置，后两个参数为窗体大小
// this.setLocation(300,200);//设置位置
// this.setSize(450,350);//设置大小
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式
// this.setVisible(true);//设置为可见







//public void kill(){
//for(int i = 0;i < 19; i++){
//  for(int j = 0;j < 19; j++){
//      if(map[i][j] == 0)  
//         continue;
//      else{
//      	block = new int[361];
//      	blockLength = 1;                   
//         	block[0] = i*100 + j;         
//          recursion(i,j);          
//          if(hasQi()) 
//			continue;            
//          else 
//			{
//              for(int t = 0;t < blockLength; t++)
//               map[block[t]/100][block[t]%100] = 0; 
//          }//                }//            }//        }//    }
//public void recursion(int i,int j){   
////Left
//if(i-1 >= 0 && map[i-1][j] == map[i][j] && isInBlock((i-1)*100+j)){
//  block[blockLength] = (i-1)*100 + j;
//  blockLength++;
//  recursion(i-1,j);
//}
////Up
//if(j-1 >= 0 && map[i][j-1] == map[i][j] && isInBlock(i*100+j-1)){
//  block[blockLength] = i*100 + j-1;
//  blockLength++;
//  recursion(i,j-1);
//}
////Right
//if(i+1 < 19 && map[i+1][j] == map[i][j] && isInBlock((i+1)*100+j)){
//  block[blockLength] = (i+1)*100 + j;
//  blockLength++;
//  recursion(i+1,j);
//}
////Down
//if(j+1 < 19 && map[i][j+1] == map[i][j] && isInBlock(i*100+j+1)){
//  block[blockLength] = i*100 + j+1;
//  blockLength++;
//  recursion(i,j+1);
//}//    }
//
//public boolean hasQi(){
//int i,j;
//for(int t = 0;t < blockLength; t++){
//  i = block[t]/100;
//  j = block[t]%100;
//  if(i-1 >= 0 && map[i-1][j] == 0) return true;
//  if(i+1 < 19 && map[i+1][j] == 0) return true;
//  if(j-1 >= 0 && map[i][j-1] == 0) return true;
//  if(j+1 < 19 && map[i][j+1] == 0) return true;            
//}
//return false;
//}
//
//public boolean isInBlock(int neighbor){    
//for(int i = 0;i < blockLength; i++)
//{
//  if (block[i] == neighbor) return false;
//}
//return true;
//}
/// Function 提子



///A： 全盘计数     局势辅助应用
//Java围棋吃子详解 
//2014年04月08日 08:57:59 AlienGMX 阅读数 4283
//版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
//本文链接：https://blog.csdn.net/u013787595/article/details/23158031
//上上周末花了两天时间解决了围棋吃子程序，在上周又赶了一个socket的chatroom，结果数据分析的课的作业就拉下了~_~。今天得空把围棋吃子程序及其思路拿出来与大家分享下。本围棋程序是用processing编写的。
//从易到难，我们先进行单个子吃子的分析，吃单个子的程序是很容易实现的，就是判断每个字的上下左右四个位置是否有对手的子或者是到了边缘，如果都是这样就将此子提掉。
//换做连续多个子的分析，我们引入“气”这个围棋概念，“气”你可以简单理解成单个子周围是否有空位，没有空位就包括周围是对方子或已到边缘，这也就是成为了是否可以提子的判断依据。由于是多个相同颜色的棋子连在一起，我们把这些连在一起的子称之为“块”。我们定义吃子概念为：如果该“块”无“气”，便可以提去，即吃子。
//有了吃子的理论实现方法我们下面来进行代码的实现：
//Note：map[][]是储存了棋盘状态的二维数组，0表示该位置无棋子，黑子为-1，白子为1.
//简单介绍下框架：
//1．声明一维数组block[]作为一个临时变量记录一个块的大小，声明一个整型blockLength记录这个块的长度。
//2．kill()为吃子的主函数。
//  recersion(int i,int j)为遍历周围棋子的函数在kill函数中调用。
//  hasQi()判断该块是否有气在kill函数中调用。
//  isInBlock(int neighbor)用来判断在遍历周围棋子中是否已经遍历，在recersion函数中调用。
//
//详细介绍下功能：
//kill函数双层for循环里遍历了所有位置，判断如果该位置无棋子，跳过本此循环检测下个位置。如果有棋子，定义一个19*19=361空间的int数组，名为block，并且将对应此block的blockLength更新为1. 将该坐标记录在int型的block[0]里，x坐标值*100+y坐标值。
//调用recursion函数，参数i,j为该棋子的坐标值，递归调用直至遍历了所有与坐标(i,j)处的棋子颜色相同的棋子并将他们挨个记录在block的数组里。
//recursion函数里if判断语句分别对应：
//1.下个位置是否还在棋盘里
//2.下个位置是否与自己颜色一致
//3.是否该棋子已经存在于block的数组里了即是否已经遍历过了。
//（这样做的目的是防治进入左与右或者上与下不断相互判断的无限循环中。eg：两个左右相邻的相同颜色的棋子组成的一个块中，先判断了右边是相同颜色，如果不检测左边这个棋子是否已经在block里，在recursion到右边这个棋子的时候还会判断到左边这个棋子，这样就会进入一种无限的循环之中，这不是我们想看到的。）
//hasQi函数在kill函数里调用recursion记录块结束后调用，判断该块是否有气，有气则该函数返回true。如果该块无气，即满足提子要求，则将这些子在map[][]里对应位置的值设0.
//在编写的draw函数不断的刷新显示map就可以啦。至此已成功实现围棋吃子功能。


//下面是参考代码：
//public void kill(){
//      for(int i = 0;i < 19; i++){
//          for(int j = 0;j < 19; j++){
//              if(map[i][j] == 0)  
//                 continue;
//              else{
//              	block = new int[361];
//              	blockLength = 1;                   
//                 	block[0] = i*100 + j; 
//                 
//                  recursion(i,j); 
//                  
//                  if(hasQi()) 
//                  	continue;            
//                  else {
//                      for(int t = 0;t < blockLength; t++)
//                       map[block[t]/100][block[t]%100] = 0; 
//                  }
//              }
//          }
//      }
//  }

//  public void recursion(int i,int j){   
//      //Left
//      if(i-1 >= 0 && map[i-1][j] == map[i][j] && isInBlock((i-1)*100+j)){
//          block[blockLength] = (i-1)*100 + j;
//          blockLength++;
//          recursion(i-1,j);
//      }
//      //Up
//      if(j-1 >= 0 && map[i][j-1] == map[i][j] && isInBlock(i*100+j-1)){
//          block[blockLength] = i*100 + j-1;
//          blockLength++;
//          recursion(i,j-1);
//      }
//      //Right
//     if(i+1 < 19 && map[i+1][j] == map[i][j] && isInBlock((i+1)*100+j)){
//  	    block[blockLength] = (i+1)*100 + j;
//  	    blockLength++;
//          recursion(i+1,j);
//      }
//     //Down
//      if(j+1 < 19 && map[i][j+1] == map[i][j] && isInBlock(i*100+j+1)){
//          block[blockLength] = i*100 + j+1;
//          blockLength++;
//          recursion(i,j+1);
//      }
//  }
//  
//  public boolean hasQi(){
//      int i,j;
//      for(int t = 0;t < blockLength; t++){
//          i = block[t]/100;
//          j = block[t]%100;
//          if(i-1 >= 0 && map[i-1][j] == 0) return true;
//          if(i+1 < 19 && map[i+1][j] == 0) return true;
//          if(j-1 >= 0 && map[i][j-1] == 0) return true;
//          if(j+1 < 19 && map[i][j+1] == 0) return true;            
//      }
//      return false;
//  }
//  
//  public boolean isInBlock(int neighbor){    
//      for(int i = 0;i < blockLength; i++)
//      {
//          if (block[i] == neighbor) return false;
//      }
//      return true;
//  }

//有问题欢迎留言。
//可以仿照迷宫的算法来编制，假设是白棋提黑子：
//1、以白棋当前下的点为例，遍历此白子的四个邻接子（上下左右）
//
//2、如果此邻接子为黑子则分别向它的四个临接点做遍历；如果为白子则返回第1步取下一个邻接子
//3、如果遇到白棋，则此个方向的遍历结束，此方向黑棋无气；
//4、如果遇到棋盘边界，则此个方向的遍历结束，此方向黑棋无气；
//5、如果遇到空（临界点处无棋子），则整个遍历结束，黑棋还有气；
//6、如果遇到黑棋，则又向它的三个临接点遍历（去除掉来路的那个临接点），继续执行3-6部，直到遇到结束条件返回；
//
//7、如果4个邻接子都遍历完则结束否则返回第1步，去下一个邻接子。
//
//在整个遍历过程中要记住所有黑棋的位置，在整个遍历结束后，如果不是因为第四种情况结束的，则所有的黑棋将被删除。