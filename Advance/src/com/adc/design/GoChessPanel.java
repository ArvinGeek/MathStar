/*********************************************************************
 * 
 * 					GoChess 1.0    
 *    Create Man �� Jones
 *    Create Date��2019-09-15
 *    
 * ��������
 * 1.��ŵ��Զ�����
 * 2.�Զ�����
 * 3.�˻�����
 * 4.����ֱ��
 * 5.��Ŀ����
 * 6.����
 * 7.��ֵ�˫������
 * 8.����ֱ��
 * 9.���׸��̲鿴
 * 10.�����ƶ�
 * 11.3D����Ч��
 *    
 * ����ʰ��
 * 1. ����Χ������
 * 2. ����ӵ�λ��ΧУ��
 * 3. Canvas ��ͼӦ��
 * 4. ���̱�����ɫ
 * 5. ���ӵĻ���Ч��
 * 
 * 2020-02-24
 * 1. ��Ϸʤ����
 * 
 * 
 * 
 * *******************************************************************/

package com.adc.design;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 * @author yshic
 *
 */

public class GoChessPanel extends JPanel implements MouseListener, ActionListener 
{	
	private static final int sx = 55; // С������
	private static final int sy = 55; // С����߶�
	private static final int w = 35;
	private static final int rw = 630;
	private Button BtnComputer = new Button("�˻�����");
	private Button BtnInternetwork = new Button("�������");
	private Button BtnNumMan = new Button("��ʾ����");
	private Button BtnModels = new Button("���׼���");
	private Button BtnTakeUp = new Button("�������");
	private Button BtnCheckWin = new Button("�����Ŀ");
	private Button BtnGoArea = new Button("���Ʒ���");
	private Button BtnCountResult = new Button("ʤ����Ŀ");
	
	//
	private int StepCount=0;
	//��ʱ��
	//private Timer timerAutoGo = new Timer();
	///private Edit TBContext =new 
	//�����ı���
	private TextField TFBCaption = new TextField(20);

	//������ť
	//Button bu = new Button("����ת��");
	private JTextField JTFText = new JTextField(); 
	        //�����ı���
	private TextArea TAContext = new TextArea(20, 50);

	///����
    private Vector GoMans;
    ///Ĭ�ϵķ��񳤶ȼ���Ŀ
    protected int qizilen = 40 ;                        // ������߼��ϱߵı߾�
    protected int top, left;  
    ///0 ��   1 ��  2 ��
    private int[][] ChessCE;
    private int PX,PY;
    //�������
    private int TurnMan = 1;
    //��Ƭ�װ�
    private Image BaseGround;    
    ///ͿĨ��Ƥ��    ///private  PPaint PCha;   
    ///����
    private int ChessNum=0,Csign=0;
    
    private int ChessModelSign=0;
    //Χ������
    private int[] block;
    private int blockLength;
	GoChessPanel() 
	{
		//		timerAutoGo.schedule(new TimerTask() {
		//			public void run() {
		//				// TODO Auto-generated method stub
		//				//System.out.println("learn...");
		//				timerAutoGo.cancel();
		//					}
		//			}, 3000);
		setBackground(Color.orange);
		setLayout(null);		
		addMouseListener(this);
		add(BtnComputer);
		BtnComputer.setBounds(900, 80, 60, 26);
		BtnComputer.addActionListener(this);
		add(BtnInternetwork);
		BtnInternetwork.setBounds(900, 120, 60, 26);
		BtnInternetwork.addActionListener(this);
		add(BtnNumMan);
		BtnNumMan.setBounds(900, 160, 60, 26);
		BtnNumMan.addActionListener(this);
		add(BtnModels);
		BtnModels.setBounds(900, 200, 60, 26);
		BtnModels.addActionListener(this);
		add(BtnTakeUp);
		BtnTakeUp.setBounds(900, 240, 60, 26);
		BtnTakeUp.addActionListener(this);
		add(BtnCheckWin);
		BtnCheckWin.setBounds(900, 280, 60, 26);
		BtnCheckWin.addActionListener(this);
		add(BtnGoArea);
		BtnGoArea.setBounds(900, 320, 60, 26);
		BtnGoArea.addActionListener(this);
		add(BtnCountResult);
		BtnCountResult.setBounds(900, 360, 60, 26);
		BtnCountResult.addActionListener(this);

		add(TAContext);
		TAContext.setBounds(5, 800, 780, 350);
		
		ChessCE= new int[20][20];
		GoMans = new Vector();		
	}
	@Override
	public void paint(Graphics gp) { 		//��дpaint����
		//TODO Auto-generated method stub
		top = left = 55 ;
		Graphics2D g = (Graphics2D) gp; 
		g.setColor(Color.orange);
		g.clearRect(sx, sy, rw, rw);
		g.fillRect(sx-50, sy-50, rw+150, rw+150);
		//���Graphics2D����		
		//g.setBackground(Color.orange);
		try 
		{
			//����������ɫΪ��ɫ
			g.setColor(Color.black);
			//���������ο�
			g.drawRect(sx, sy, rw, rw);
			//����ˮƽ10������ֱ10������ ��ˮƽ����9���ߣ���ֱ����9���ߣ� 
			//��Χ����4�����Ѿ������ˣ�����Ҫ�ٻ��� ͬʱ�ڲ�64��������д���֡�
			for (int i = 1; i < 18; i++) 
			{
				// 	���Ƶ�i����ֱ��
				g.drawLine(sx + (i * w), sy, sx + (i * w), sy + rw);
				// 	���Ƶ�i��ˮƽ��
				g.drawLine(sx, sy + (i * w), sx + rw, sy + (i * w));
			}
			/*
			 * for (int i = 0; i < GoMans.size(); i++) { Font font = new Font("����",
			 * Font.PLAIN, 20); g.setFont(font);
			 * 
			 * if (Csign==0) { if (((GoMan)GoMans.get(i)).getColor()==1) {
			 * g.setColor(Color.BLACK); g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 +
			 * 40, ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30);
			 * //g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()),
			 * ((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong()
			 * * 35 + 40); } else { g.setColor(Color.WHITE);
			 * g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 + 40,
			 * ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30);
			 * //g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()),
			 * ((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong()
			 * * 35 + 40);
			 * 
			 * }
			 * 
			 * } else { if (((GoMan)GoMans.get(i)).getColor()==1) { g.setColor(Color.BLACK);
			 * g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 + 40,
			 * ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30); g.setColor(Color.WHITE);
			 * //g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()),
			 * ((GoMan)GoMans.get(i)).getHeng() * 35 + 50, ((GoMan)GoMans.get(i)).getZong()
			 * * 35 + 60); } else { g.setColor(Color.WHITE);
			 * g.fillOval(((GoMan)GoMans.get(i)).getHeng() * 35 + 40,
			 * ((GoMan)GoMans.get(i)).getZong() * 35 + 40, 30, 30); g.setColor(Color.BLACK);
			 * //g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()),
			 * ((GoMan)GoMans.get(i)).getHeng() * 35 + 50, ((GoMan)GoMans.get(i)).getZong()
			 * * 35 + 60); } if (i<10)
			 * g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()),
			 * ((GoMan)GoMans.get(i)).getHeng() * 35 + 50, ((GoMan)GoMans.get(i)).getZong()
			 * * 35 + 60); else if (i<99)
			 * g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()),
			 * ((GoMan)GoMans.get(i)).getHeng() * 35 + 45, ((GoMan)GoMans.get(i)).getZong()
			 * * 35 + 60); else if (i<300)
			 * g.drawString(String.valueOf(((GoMan)GoMans.get(i)).getGoNum()),
			 * ((GoMan)GoMans.get(i)).getHeng() * 35 + 40, ((GoMan)GoMans.get(i)).getZong()
			 * * 35 + 60); } }
			 */
	        if (ChessModelSign==1) 
	        {
				for (int i = 0; i < 19 ; i++)
					for (int j = 0; j < 19; j++) 
				{
						if(ChessCE[i][j]==1)
						{
							g.setColor(Color.BLACK);					
							g.fillOval(i * 35 + 40, j * 35 + 40, 30, 30);
						}
						if(ChessCE[i][j]==2)
						{
							g.setColor(Color.WHITE);					
							g.fillOval(i * 35 + 40, j * 35 + 40, 30, 30);
						}
						if(ChessCE[i][j]==0)
						{}
				}
			}
			int fontSize = 50;			
			Font font = new Font("����", Font.BOLD, 28);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("��ԪΧ�����", 350, 30);	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		 if(e.getActionCommand().equals("�˻�����"))//��Red��ť�¼�
		 {			
			/*
			 * ChessCE[2][2]=1; GoMans.addElement(ChessCE[2][2]); repaint();
			 * 
			 */	
		        for (int i = 0; i < GoMans.size(); i++) {  
		        	//GoMan gm= new GoMan();
		        	if (((GoMan)GoMans.get(i)).getDead()==1)
		        		ChessCE[((GoMan)GoMans.get(i)).getHeng()][((GoMan)GoMans.get(i)).getZong()]=0;  
		        }
		        repaint();
		 }
		 else if(e.getActionCommand().equals("���׶���"))//��Green��ť�¼�
		 {
			/*
			 * ChessCE[2][2] = 0; ChessCE[2][5] = 2; repaint();
			 */
		        for (int i = 0; i < GoMans.size(); i++) {  
		        	//GoMan gm= new GoMan();
		        	if (((GoMan)GoMans.get(i)).getColor()==1)
		        		ChessCE[((GoMan)GoMans.get(i)).getHeng()][((GoMan)GoMans.get(i)).getZong()]=0;  
		        }
		        repaint();

		 }
		 else if(e.getActionCommand().equals("���׼���"))
		 {
			 ChessModelSign=1;
			 DownChessSeven();
			 //TQZChess();
			 repaint();	
			 //JFileChooser chooser = new JFileChooser();
		     //FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		     //chooser.setFileFilter(filter);
		     //int returnVal = chooser.showOpenDialog(chooser);
		     //if(returnVal == JFileChooser.APPROVE_OPTION) 
		     {
				/*
				 * System.out.println("You chose to open this file: " +
				 * chooser.getSelectedFile().getName());
				 * clooser.getSelectedFile().getName()
				 * Ϊ������ļ���
				 */		     
		     }
		 }
		 else if(e.getActionCommand().equals("��ʾ����"))
		 {	
			 Csign=1;
			 TQZChess();
			 repaint();
		 }
		 else if(e.getActionCommand().equals("�������"))
		 {	
			 //Csign=1;
			 ChessModelSign=1;
			 TQZChess();
			 repaint();
		 }
		 else if(e.getActionCommand().equals("���Ʒ���"))
		 {	
			TAContext.appendText("���Ʒ���");
			//Csign=1;
			//			 ChessModelSign=1;
			//			 TQZChess();
			//			 repaint();
		 }
		 else   if(e.getActionCommand().equals("ʤ����Ŀ"))
		 {
			 
		 }
		 else 
		 {
			 Csign=0;
		 }
	}
	//�����Ѿ�����
	private void CleanDeadChess()
	{
		
	}
	//////����-1. ���Ľ�
	private void DownChessSeven()
	{
		ChessCE[0][0]=2;
		ChessCE[1][1]=2;
		ChessCE[1][0]=1;
		ChessCE[2][0]=1;
		ChessCE[2][1]=1;
		ChessCE[0][1]=1;
		ChessCE[0][2]=1;
		ChessCE[1][2]=1;
		ChessCE[2][2]=1;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getModifiers() == InputEvent.BUTTON1_MASK) 
		{
			ChessModelSign=1;
			StepCount+=1;
			PX = (int) e.getX();
			PY = (int) e.getY();
			int a = (PX - 55) / 35, b = (PY -55) / 35;
			if (TurnMan==1)
			{
				if (ChessCE[a][b]!=0) return;
				TurnMan=2;
				ChessCE[a][b]=1;
				System.out.println(a+"-"+b+"+1");
				
				GoMan gm= new GoMan();
				gm.setHeng(a);
				gm.setZhong(b);		
				gm.setColor(1);
				gm.setDead(0);
				ChessNum+=1;
				gm.setGoNum(ChessNum);
				GoMans.addElement(gm);
			} else {
				if (ChessCE[a][b]!=0) return;
				TurnMan=1;
				ChessCE[a][b]=2;
				System.out.println(a+"-"+b+"+2");
				GoMan gm= new GoMan();
				gm.setHeng(a);
				gm.setZhong(b);		
				gm.setColor(2);
				gm.setDead(1);
				ChessNum+=1;
				gm.setGoNum(ChessNum);
				GoMans.addElement(gm);
			}
			//AutoGoChess();
			this.repaint();
		}
	}
	//�Զ�����
	public void AutoGoChess() 
	{
		if (StepCount==1) 
		{
			if (ChessCE[3][3]!=0) return;
			TurnMan=1;
			ChessCE[3][3]=2;
			System.out.println(3+"-"+3+"+2");
			GoMan gm= new GoMan();
			gm.setHeng(3);
			gm.setZhong(3);		
			gm.setColor(2);
			gm.setDead(1);
			ChessNum+=1;
			gm.setGoNum(ChessNum);
			GoMans.addElement(gm);
		}
		if (StepCount==2) 
		{
			if (ChessCE[15][3]!=0) return;
			TurnMan=1;
			ChessCE[15][3]=2;
			System.out.println(15+"-"+3+"+2");
			GoMan gm= new GoMan();
			gm.setHeng(15);
			gm.setZhong(3);		
			gm.setColor(2);
			gm.setDead(1);
			ChessNum+=1;
			gm.setGoNum(ChessNum);
			GoMans.addElement(gm);
		}
		if (StepCount==3) 
		{
			if (ChessCE[3][15]!=0) return;
			TurnMan=1;
			ChessCE[3][15]=2;
			System.out.println(3+"-"+15+"+2");
			GoMan gm= new GoMan();
			gm.setHeng(3);
			gm.setZhong(15);		
			gm.setColor(2);
			gm.setDead(1);
			ChessNum+=1;
			gm.setGoNum(ChessNum);
			GoMans.addElement(gm);
		}
		if (StepCount==4) 
		{
			if (ChessCE[15][15]!=0) return;
			TurnMan=1;
			ChessCE[15][15]=2;
			System.out.println(15+"-"+15+"+2");
			GoMan gm= new GoMan();
			gm.setHeng(15);
			gm.setZhong(15);		
			gm.setColor(2);
			gm.setDead(1);
			ChessNum+=1;
			gm.setGoNum(ChessNum);
			GoMans.addElement(gm);
		}

	}
	@Override
	public void mouseReleased(MouseEvent arg0)
	{		
		// TODO Auto-generated method stub		
	}
	
	///////////////////////////////////////////////////
	public void TQZChess()
	{
		  for(int i = 0;i < 19; i++){
		      for(int j = 0;j < 19; j++){
		          if(ChessCE[i][j] == 0)  
		             continue;
		          else{
		          	block = new int[361];
		          	blockLength = 1;                   
		             	block[0] = i*19 + j; 
		             
		              recursion(i,j); 
		              
		              if(hasQi()) 
		              	continue;            
		              else {
		                  for(int t = 0;t < blockLength; t++)
		                	  ChessCE[block[t]/19][block[t]%19] = 0; 
		              }
		          }
		      }
		  }
	}

    public void recursion(int i,int j)
    {   
    	//  //Left
    	if(i-1 >= 0 && ChessCE[i-1][j] == ChessCE[i][j] && isInBlock((i-1)*19+j))
    	{
	      block[blockLength] = (i-1)*19 + j;
	      blockLength ++;
	      recursion(i-1,j);
    	}
    	//  //Up
    	if(j-1 >= 0 && ChessCE[i][j-1] == ChessCE[i][j] && isInBlock(i*19+j-1))
    	{
	      block[blockLength] = i*19 + j-1;
	      blockLength++;
	      recursion(i,j-1);
    	}
    	//  //Right
    	if(i+1 < 19 && ChessCE[i+1][j] == ChessCE[i][j] && isInBlock((i+1)*19+j))
    	{
		    block[blockLength] = (i+1)*19 + j;
		    blockLength++;
	      recursion(i+1,j);
    	}
    	// //Down
    	if(j+1 < 19 && ChessCE[i][j+1] == ChessCE[i][j] && isInBlock(i*19+j+1)){
	      block[blockLength] = i*19 + j+1;
	      blockLength++;
	      recursion(i,j+1);
    	}
	}

	public boolean hasQi()
	{
		  int i,j;
		  for(int t = 0;t < blockLength; t++){
		      i = block[t]/19;
		      j = block[t]%19;
		      if(i-1 >= 0 && ChessCE[i-1][j] == 0) return true;
		      if(i+1 < 19 && ChessCE[i+1][j] == 0) return true;
		      if(j-1 >= 0 && ChessCE[i][j-1] == 0) return true;
		      if(j+1 < 19 && ChessCE[i][j+1] == 0) return true;            
		  }
		  return false;
	}

	public boolean isInBlock(int neighbor)
	{    
		  for(int i = 0;i < blockLength; i++)
		  {
		      if (block[i] == neighbor) return false;
		  }
		  return true;
	}
	
	
	//���Ʒ���
	public void AllAreaAnalyze()
	{		
		
	}
	//���Ʒ���-�������ӷ�
	public void LineEyesAnalyze()
	{		
		
	}

	//����ʤ��Ŀ��
	public void CalculateWinChessEye() 
	{
		
	}

}
