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

//int x = -1, y = -1, ������ɫ = 1;  //MessageBox(Show_Messager());	
//public static final int rectlen = 50, rectnum = 19;	//���ӵ�ֱ��

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
 * } else { if (������ɫ == 1) { this.add(chesspoint_black);
 * chesspoint_black.setBounds(a * 50 - 65, b * 50 - 65, 40, 40); ������ɫ = ������ɫ *
 * (-1); } else if (������ɫ == -1) { this.add(chesspoint_white);
 * chesspoint_white.setBounds(a * 50 - 65, b * 50 - 65, 40, 40); ������ɫ = ������ɫ *
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
 * == InputEvent.BUTTON3_MASK) { chesspad.remove(this); chesspad.������ɫ = -1; } }
 * public void mouseReleased(MouseEvent e) { } public void
 * mouseEntered(MouseEvent e) { } public void mouseExited(MouseEvent e) { }
 * public void mouseClicked(MouseEvent e) { if (e.getClickCount() > 2)
 * chesspad.remove(this); } } class ChessMan { public static int
 * _black=0,_white=1; protected int x,y; protected int color; public
 * ChessMan(int i,int j,int c) { x=i; y=j; color=c; } public String toString() {
 * String c=(color==_black?"black":"white"); return "["+x+","+y+"]:"+c; } }
 */


// 			��д��i�дӵ�1�����񵽵�8��������������֣�������Ŵ�0��ʼ��
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

// ��ȡר�������ڴ��ڽ����ϻ�ͼ�Ķ���
//jg = this.getGraphics();
// ������Ϸ����
//paintComponents(jg);
// jg.drawString(getTitle(), 50, 50);
// this.setTitle("�ҵĵ�һ������");
// this.setBounds(300,200,450,350);���ô���λ�ô�С��ǰ��������Ϊλ�ã�����������Ϊ�����С
// this.setLocation(300,200);//����λ��
// this.setSize(450,350);//���ô�С
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô���رշ�ʽ
// this.setVisible(true);//����Ϊ�ɼ�







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
/// Function ����



///A�� ȫ�̼���     ���Ƹ���Ӧ��
//JavaΧ�������� 
//2014��04��08�� 08:57:59 AlienGMX �Ķ��� 4283
//��Ȩ����������Ϊ����ԭ�����£���ѭ CC 4.0 BY-SA ��ȨЭ�飬ת���븽��ԭ�ĳ������Ӻͱ�������
//�������ӣ�https://blog.csdn.net/u013787595/article/details/23158031
//������ĩ��������ʱ������Χ����ӳ����������ָ���һ��socket��chatroom��������ݷ����Ŀε���ҵ��������~_~������ÿհ�Χ����ӳ�����˼·�ó������ҷ����¡���Χ���������processing��д�ġ�
//���׵��ѣ������Ƚ��е����ӳ��ӵķ������Ե����ӵĳ����Ǻ�����ʵ�ֵģ������ж�ÿ���ֵ����������ĸ�λ���Ƿ��ж��ֵ��ӻ����ǵ��˱�Ե��������������ͽ����������
//������������ӵķ������������롰�������Χ��������������Լ����ɵ�������Χ�Ƿ��п�λ��û�п�λ�Ͱ�����Χ�ǶԷ��ӻ��ѵ���Ե����Ҳ���ǳ�Ϊ���Ƿ�������ӵ��ж����ݡ������Ƕ����ͬ��ɫ����������һ�����ǰ���Щ����һ����ӳ�֮Ϊ���顱�����Ƕ�����Ӹ���Ϊ������á��顱�ޡ��������������ȥ�������ӡ�
//���˳��ӵ�����ʵ�ַ����������������д����ʵ�֣�
//Note��map[][]�Ǵ���������״̬�Ķ�ά���飬0��ʾ��λ�������ӣ�����Ϊ-1������Ϊ1.
//�򵥽����¿�ܣ�
//1������һά����block[]��Ϊһ����ʱ������¼һ����Ĵ�С������һ������blockLength��¼�����ĳ��ȡ�
//2��kill()Ϊ���ӵ���������
//  recersion(int i,int j)Ϊ������Χ���ӵĺ�����kill�����е��á�
//  hasQi()�жϸÿ��Ƿ�������kill�����е��á�
//  isInBlock(int neighbor)�����ж��ڱ�����Χ�������Ƿ��Ѿ���������recersion�����е��á�
//
//��ϸ�����¹��ܣ�
//kill����˫��forѭ�������������λ�ã��ж������λ�������ӣ���������ѭ������¸�λ�á���������ӣ�����һ��19*19=361�ռ��int���飬��Ϊblock�����ҽ���Ӧ��block��blockLength����Ϊ1. ���������¼��int�͵�block[0]�x����ֵ*100+y����ֵ��
//����recursion����������i,jΪ�����ӵ�����ֵ���ݹ����ֱ������������������(i,j)����������ɫ��ͬ�����Ӳ������ǰ�����¼��block�������
//recursion������if�ж����ֱ��Ӧ��
//1.�¸�λ���Ƿ���������
//2.�¸�λ���Ƿ����Լ���ɫһ��
//3.�Ƿ�������Ѿ�������block���������˼��Ƿ��Ѿ��������ˡ�
//����������Ŀ���Ƿ��ν��������һ��������²����໥�жϵ�����ѭ���С�eg�������������ڵ���ͬ��ɫ��������ɵ�һ�����У����ж����ұ�����ͬ��ɫ���������������������Ƿ��Ѿ���block���recursion���ұ�������ӵ�ʱ�򻹻��жϵ����������ӣ������ͻ����һ�����޵�ѭ��֮�У��ⲻ�������뿴���ġ���
//hasQi������kill���������recursion��¼���������ã��жϸÿ��Ƿ�������������ú�������true������ÿ�����������������Ҫ������Щ����map[][]���Ӧλ�õ�ֵ��0.
//�ڱ�д��draw�������ϵ�ˢ����ʾmap�Ϳ������������ѳɹ�ʵ��Χ����ӹ��ܡ�


//�����ǲο����룺
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

//�����⻶ӭ���ԡ�
//���Է����Թ����㷨�����ƣ������ǰ�������ӣ�
//1���԰��嵱ǰ�µĵ�Ϊ���������˰��ӵ��ĸ��ڽ��ӣ��������ң�
//
//2��������ڽ���Ϊ������ֱ��������ĸ��ٽӵ������������Ϊ�����򷵻ص�1��ȡ��һ���ڽ���
//3������������壬��˸�����ı����������˷������������
//4������������̱߽磬��˸�����ı����������˷������������
//5����������գ��ٽ�㴦�����ӣ����������������������廹������
//6������������壬���������������ٽӵ������ȥ������·���Ǹ��ٽӵ㣩������ִ��3-6����ֱ�����������������أ�
//
//7�����4���ڽ��Ӷ���������������򷵻ص�1����ȥ��һ���ڽ��ӡ�
//
//����������������Ҫ��ס���к����λ�ã��������������������������Ϊ��������������ģ������еĺ��彫��ɾ����