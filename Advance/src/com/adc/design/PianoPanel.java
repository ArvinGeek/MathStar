package com.adc.design;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;

import sun.audio.AudioPlayer;

public class PianoPanel extends JPanel implements MouseListener, ActionListener {
	private Clip clip;
	private File audioInputStream;
	private PianoKey[] PK = new PianoKey[88];
	private PianoKey[] PK52 ;//= new PianoKey[52]
	private PianoKey[] PK36 = new PianoKey[36];
	private List<String> AudioWav52 = new ArrayList<>();
	private List<String> AudioWav36 = new ArrayList<>();
	private int width = 1800;
	private int height = 500;
	private Button BtnModels = new Button("曲谱演奏");
	private Button BtnTakeUp = new Button("钢琴调音");

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = 50;
		PK52 = new PianoKey[52];
		g.setColor(Color.WHITE);
		LoadPkeyWave();
		for (int i = 0; i < 52; i++) {
			g.fill3DRect(x, 0, width / 52, height, true);
			PianoKey Pkm=new PianoKey(i + 1, x, 0, height, x + width / 52, AudioWav52.get(i).toString());
			PK52[i]=Pkm;
			/*
			 * PK52[i].setLeft(x); PK52[i].setRight(x + width / 52); PK52[i].setTop(0);
			 * PK52[i].setBottom(height); PK52[i].setPKID(i + 1);
			 * PK52[i].setAudioKey(AudioWav52.get(i).toString());
			 */
			x = x + width / 52;
		}
		int y = 50 + 20 + width / 52 * 2;
		g.setColor(Color.BLACK);
		g.fill3DRect(70, 0, 30, height / 2, true);
		for (int k = 0; k < 7; k++) {
			for (int j = 0; j < 7; j++) {
				if (j == 2 || j == 6) {
					y = y + width / 52;
					continue;
				} else {
					g.fill3DRect(y, 0, 30, height / 2, true);
					
					/*
					 * PK36[j * k].setLeft(x); PK36[j * k].setRight(x + 30); PK36[j * k].setTop(0);
					 * PK36[j * k].setBottom(height / 2); PK36[j * k].setPKID(j * k + 1); PK36[j *
					 * k].setAudioKey(AudioWav36.get(j * k).toString());
					 */
					y = y + width / 52;
				}
			}
		}

	}

	/** Adds MouseListener */
	public PianoPanel() {
		addMouseListener(this);
		setLayout(null);
		add(BtnModels);
		BtnModels.setBounds(900, 600, 60, 26);
		BtnModels.addActionListener(this);
		add(BtnTakeUp);
		BtnTakeUp.setBounds(900, 640, 60, 26);
		BtnTakeUp.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		 if(e.getActionCommand().equals("人机对弈"))//是Red按钮事件
		 {			
			/*
			 * ChessCE[2][2]=1; GoMans.addElement(ChessCE[2][2]); repaint();
			 * 
			 */	
//		        for (int i = 0; i < GoMans.size(); i++) {  
//		        	//GoMan gm= new GoMan();
//		        	if (((GoMan)GoMans.get(i)).getDead()==1)
//		        		ChessCE[((GoMan)GoMans.get(i)).getHeng()][((GoMan)GoMans.get(i)).getZong()]=0;  
//		        }
//		        repaint();
		 }
	}
	/** Reads the coordinates where on the panel mouse is pressed */
	@Override
	public void mousePressed(MouseEvent e) 
	{
		if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
			int PX = (int) e.getX();
			int PY = (int) e.getY();
			int a = (PX - 50) / (width / 52);
			// int b = (PY) / 35;
			// if (TurnMan==1)
			// for (int i = 0; i < 52; i++)
			{
				// if
				// ((PX>PK52[i].getLeft())&(PX<PK52[i].getRight())&(PY>PK52[i].getTop())&(PY<PK52[i].getBottom()))
				{
					try 
					{
						play("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\" + AudioWav52.get(a).toString());
						return;
					} 
					catch (IOException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			// if
			// ((PX>PK36[i].getLeft())&(PX<PK36[i].getRight())&(PY>PK36[i].getTop())&(PY<PK36[i].getBottom()))
			/*
			 * 
			 * { //for (int i = 0; i < 36; i++) {
			 * 
			 * try {
			 * play("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\"+AudioWav36.get(i).
			 * toString()); return; } catch (IOException e1) { // TODO Auto-generated catch
			 * block e1.printStackTrace(); }
			 * 
			 * } }
			 * 
			 */

			/*
			 * 
			 * if ((PX>100)&(PX<200)) { try {
			 * play("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\20-E -大字组.wav"); } catch
			 * (IOException e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
			 * } if ((PX>200)&(PX<300)) { try {
			 * play("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\30-D  -小字组.wav"); } catch
			 * (IOException e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
			 * } if ((PX>300)&(PX<400)) { try {
			 * play("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\40-C  -小字1组.wav"); }
			 * catch (IOException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } } if ((PX>400)&(PX<500)) { try {
			 * play("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\50-A# -小字1组.wav"); }
			 * catch (IOException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } }
			 * 
			 */
		}

	}

	public void mouseClicked(MouseEvent evt) {

	}

	public void mouseReleased(MouseEvent evt) {

	}

	public void mouseEntered(MouseEvent evt) {

	}

	public void mouseExited(MouseEvent evt) {

	}

	private InputStream inputStream = null;

	public void play(String file) throws IOException 
	{
		inputStream = new FileInputStream(new File(file));
		AudioPlayer.player.start(inputStream);
	}
	// 加载音频
	public void LoadPkeyWave() {
		File file = new File("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\");
		File[] files = file.listFiles();
		AudioWav52.clear();
		AudioWav36.clear();
		for (File f : files) {
			if (!f.getName().contains("#")) {
				AudioWav52.add(f.getName());
				//System.out.println(f.getName());
			} else {
				AudioWav36.add(f.getName());
				//System.out.println(f.getName());
			}
		}
		//		System.out.println(AudioWav52.size());
		//		System.out.println(AudioWav36.size());
	}

}

/*****************************************************
 * 
 * 
 * 
 * 
 * int width = getWidth(); int height = getHeight(); int x = 0;
 * g.setColor(Color.WHITE); for (int i = 0; i < 52; i++) { g.fill3DRect(x, 0,
 * width / 52, height, true); x = x + width / 52; } int y = width / 52;
 * g.setColor(Color.BLACK); for (int k = 0; k < 7; k++) { for (int j = 0; j < 7;
 * j++) { if (j == 2 || j == 6) { y = y + width / 36; continue; } else {
 * g.fill3DRect(y, 0, width / 52, height / 2, true); y = y + width / 36; } } }
 * 
 * 
 * 
 * 
 * 
 * public void playMusic(String temp) { //this.note = temp; try { clip =
 * AudioSystem.getClip(); clip.open(AudioSystem.getAudioInputStream(new
 * File("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\" + temp + ".wav")));
 * audioInputStream = (new File("G:\\MyInformation\\Study\\Music\\标音\\钢琴音色WAV\\"
 * + temp + ".wav")); clip.start(); } catch(Exception e) {
 * //System.out.println("Some Sort of Key error."); } //addToHistory(temp);
 * //numberOfKeysPlayed++; } }
 * 
 * 
 * 
 * 
 * 
 * int width = getWidth(); int pressedX = evt.getX(); int pressedY = evt.getY();
 * int leftX = 0; int rightX = width / 52; for (int h = 0; h < 52; h++) { if
 * (leftX <= pressedX && pressedX < rightX) { // System.out.println("h=" + h);
 * // Laseb 玫ige sagedusega heli // Hz = Hz + muutuja } else { leftX = leftX +
 * width / 52; rightX = rightX + width / 52; } }
 * 
 * 
 * 
 * 
 * 
 ***************************************************/
