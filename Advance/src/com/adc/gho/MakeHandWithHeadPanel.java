package com.adc.gho;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MakeHandWithHeadPanel extends JPanel implements MouseListener, ActionListener  {
	
	/*
	 * private Button BtnComputer = new Button("人机对弈"); private Button
	 * BtnInternetwork = new Button("网络对弈"); private Button BtnNumMan = new
	 * Button("显示手数"); private Button BtnModels = new Button("棋谱加载"); private Button
	 * BtnTakeUp = new Button("检查提子"); private Button BtnCheckWin = new
	 * Button("申请计目"); private Button BtnGoArea = new Button("形势分析"); private Button
	 * BtnCountResult = new Button("胜负计目");
	 */

	MakeHandWithHeadPanel() {
		setLayout(null);
		//setBackground(Color.orange);
		addMouseListener(this);
		//		add(BtnComputer);
		//		BtnComputer.setBounds(1000, 80, 60, 26);
		//		BtnComputer.addActionListener(this);
		//		add(buttonA);
		//		buttonA.setBounds(1080, 80, 60, 26);
		//		buttonA.addActionListener(this);
		/*
		 * add(BtnComputer); BtnComputer.setBounds(1020, 80, 60, 26);
		 * BtnComputer.addActionListener(this); add(BtnInternetwork);
		 * BtnInternetwork.setBounds(1020, 120, 60, 26);
		 * BtnInternetwork.addActionListener(this); add(BtnNumMan);
		 * BtnNumMan.setBounds(1020, 160, 60, 26); BtnNumMan.addActionListener(this);
		 * add(BtnModels); BtnModels.setBounds(1020, 200, 60, 26);
		 * BtnModels.addActionListener(this); add(BtnTakeUp); BtnTakeUp.setBounds(1020,
		 * 240, 60, 26); BtnTakeUp.addActionListener(this); add(BtnCheckWin);
		 * BtnCheckWin.setBounds(1020, 280, 60, 26);
		 * BtnCheckWin.addActionListener(this); add(BtnGoArea);
		 * BtnGoArea.setBounds(1020, 320, 60, 26); BtnGoArea.addActionListener(this);
		 * add(BtnCountResult); BtnCountResult.setBounds(1020, 360, 60, 26);
		 * BtnCountResult.addActionListener(this);
		 */

	}


	@Override
	public void paint(Graphics gp) { // 重写paint方法
        super.paint(gp);
        gp.setColor(Color.GRAY);
        
        gp.draw3DRect(50, 30, 800, 950, true);
		/*
		 * for (int i = 0; i < 10; i++) { for (int j = 0; j < 10; j++) { if ((i + 1) % 2
		 * != 0 && (j + 1) % 2 != 0) gp.drawRect(i * 100, j * 100, 100, 100); else if
		 * ((i + 1) % 2 == 0 && (j + 1) % 2 == 0) gp.drawRect(i * 100, j * 100, 100,
		 * 100); else gp.fillRect(i * 100, j * 100, 100, 100); }
		 * 
		 * }
		 * 
		 * InitalitionChess(gp);
		 */	
        }


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void InitalitionChess(Graphics gp) 
	{
		LoadChess(gp);
	} 
	
	private void LoadChess(Graphics gp) 
	{
		/*
		 * Graphics2D g = (Graphics2D) gp; Image iBrookR =
		 * Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Brook.png"); Image
		 * iBknightR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bknight.png"); Image
		 * iBbishopR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bbishop.png"); Image
		 * iBqueen = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bqueen.png"); Image
		 * iBking = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bking.png"); Image
		 * iBbishopL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bbishop.png"); Image
		 * iBknightL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bknight.png"); Image
		 * iBrookL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Brook.png");
		 * g.drawImage(iBrookR, 0, 0, 100, 100, this); g.drawImage(iBknightR, 100, 0,
		 * 100, 100, this); g.drawImage(iBbishopR, 200, 0, 100, 100, this);
		 * g.drawImage(iBqueen, 300, 0, 100, 100, this); g.drawImage(iBking, 400, 0,
		 * 100, 100, this); g.drawImage(iBbishopL, 500, 0, 100, 100, this);
		 * g.drawImage(iBknightL, 600, 0, 100, 100, this); g.drawImage(iBrookL, 700, 0,
		 * 100, 100, this);
		 * 
		 * Image iWrookR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wrook.png"); Image
		 * iWknightR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wknight.png"); Image
		 * iWbishopR = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wbishop.png"); Image
		 * iWqueen = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wqueen.png"); Image
		 * iWking = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wking.png"); Image
		 * iWbishopL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wbishop.png"); Image
		 * iWknightL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wknight.png"); Image
		 * iWrookL = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wrook.png");
		 * g.drawImage(iWrookR, 0, 700, 100, 100, this); g.drawImage(iWknightR, 100,
		 * 700, 100, 100, this); g.drawImage(iWbishopR, 200, 700, 100, 100, this);
		 * g.drawImage(iWqueen, 300, 700, 100, 100, this); g.drawImage(iWking, 400, 700,
		 * 100, 100, this); g.drawImage(iWbishopL, 500, 700, 100, 100, this);
		 * g.drawImage(iWknightL, 600, 700, 100, 100, this); g.drawImage(iWrookL, 700,
		 * 700, 100, 100, this);
		 * 
		 * Image iBpawn = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Bpawn.png"); Image
		 * iWpawn = Toolkit.getDefaultToolkit().getImage(
		 * "F:\\ServerSpace\\GitHub\\MathStar\\Advance\\images\\Wpawn.png");
		 * 
		 * for (int i = 0; i < 8; i++) { g.drawImage(iBpawn, 0+i*100, 100, 100, 100,
		 * this); g.drawImage(iWpawn, 0+i*100, 600, 100, 100, this);
		 * 
		 * }
		 */	
		}
}
