package com.adc.test;

//import java.awt.Color;

//import java.awt.Graphics;
//import java.awt.Toolkit;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//public class TestA extends JFrame implements MouseListener {
//JLabel jl = new JLabel("haha");
//private int x = 0;
//private int y = 0;
//int[][] body = new int[20][20];
//boolean chessFlag = true;
//public void paint(Graphics g) {
//// ������
//g.setColor(Color.yellow);// cyan
//g.fill3DRect(80, 80, 360, 360, false);// ��������fill
//g.setColor(Color.black);
//for (int i = 0; i < 19; i++) {
//g.drawLine(80, 80 + i * 20, 440, 80 + i * 20);
//}
//for (int j = 0; j < 19; j++) {
//g.drawLine(80 + j * 20, 80, 80 + j * 20, 440);
//}
//// ������
//for (int x = 0; x < body.length; x++) {
//System.out.println(body[x][y]);
//for (int y = 0; y < body[x].length; y++) {// [0][]
//if (body[x][y] != 0) {
//if (body[x][y] == 2) {
//g.setColor(Color.black);
//g.fillOval(x * 20 + 72, y * 20 + 72, 16, 16);
//} else {
//g.setColor(Color.white);
//g.fillOval(x * 20 + 72, y * 20 + 72, 16, 16);
//}
//}
//}
//}
//}
//public TestA() {
//this.add(jl);
//this.setDefaultCloseOperation(3);
//int width = Toolkit.getDefaultToolkit().getScreenSize().width;
//int height = Toolkit.getDefaultToolkit().getScreenSize().height;
//this.setLocation((width - 500) / 2, (height - 500) / 2);
//this.addMouseListener(this);
//this.setSize(500, 500);
//this.setResizable(false);
//this.setVisible(true);
//}
//public static void main(String[] args) {
//new TestA();
//}
//public void mouseClicked(MouseEvent e) {
//// TODO Auto-generated method stub
//}
//public void mousePressed(MouseEvent e) {
//x = e.getX();
//y = e.getY();
//if ((x >= 20 && x <= 380) && (y >= 80 && y <= 440)) {
//x = Math.round((x - 80) / 20F);
//y = Math.round((y - 80) / 20F);
//if (body[x][y] == 0) {
//System.out.println(body[x][y]);
//if (this.chessFlag) {
//body[x][y] = 2;// ����
//this.chessFlag = false;
//} else {
//body[x][y] = 1;// ����
//this.chessFlag = true;
//}
//System.out.println(x + " " + y);
//this.repaint();
//if (gameWinx(x, y)) {
//if (body[x][y] == 2) {
//JOptionPane.showMessageDialog(this, "����ʤ��");
//} else {
//JOptionPane.showMessageDialog(this, "����ʤ��");
//}
//}
//} else {
//JOptionPane.showMessageDialog(this, "�˴�������");
//}
//}
//}
//public void mouseReleased(MouseEvent e) {
//// TODO Auto-generated method stub
//}
//public void mouseEntered(MouseEvent e) {
//// TODO Auto-generated method stub
//}
//public void mouseExited(MouseEvent e) {
//// TODO Auto-generated method stub
//}
//public boolean gameWinx(int x, int y) // �ж���Ӯ
//{
//int ���� = 1;
//int �Լ� = 1;
//while (x + ���� <= 19 && body[x][y] == body[x + �Լ�][y]) {
//����++;
//�Լ�++;
//}
//�Լ� = 1;
//while (x - ���� >= 0 && body[x][y] == body[x - �Լ�][y]) {
//����++;
//�Լ�++;
//}
//�Լ� = 1;
//while (y + ���� <= 19 && body[x][y] == body[x][y + �Լ�]) {
//����++;
//�Լ�++;
//}
//�Լ� = 1;
//while (y - ���� >= 0 && body[x][y] == body[x][y - �Լ�]) {
//����++;
//�Լ�++;
//}
//�Լ� = 1;
//while (y - ���� >= 0 && y + ���� <= 19
//&& body[x][y] == body[x + �Լ�][y - �Լ�]) {
//����++;
//�Լ�++;
//}
//�Լ� = 1;
//while (x - ���� >= 0 && y + ���� <= 19
//&& body[x][y] == body[x - �Լ�][y + �Լ�]) {
//����++;
//�Լ�++;
//}
//�Լ� = 1;
//while (x + ���� <= 190 && y + ���� <= 19
//&& body[x][y] == body[x + �Լ�][y + �Լ�]) {
//����++;
//�Լ�++;
//}
//�Լ� = 1;
//while (x - ���� >= 0 && y - ���� >= 0 && body[x][y] == body[x - �Լ�][y - �Լ�]) {
//����++;
//�Լ�++;
//}
//if (���� >= 5) {
//return true;
//}
//return false;
//}
//}

import java.awt.*;
import java.awt.event.*;

//�������̵���
class ChessPad extends Panel implements MouseListener, ActionListener {
	int x = -1, y = -1, ������ɫ = 1;
	Button button = new Button("���¿���");
	TextField text_1 = new TextField("���������");
	TextField text_2 = new TextField();

	ChessPad() {
		setSize(440, 440);
		setLayout(null);
		setBackground(Color.orange);
		addMouseListener(this);
		add(button);
		button.setBounds(10, 5, 60, 26);
		button.addActionListener(this);
		add(text_1);
		text_1.setBounds(90, 5, 90, 24);
		add(text_2);
		text_2.setBounds(290, 5, 90, 24);
		text_1.setEditable(false);
		text_2.setEditable(false);

	}

	//����Χ�����̵����
	public void paint(Graphics g) {
		for (int i = 40; i <= 400; i += 20) {
			g.drawLine(40, i, 400, i);
		}
		for (int j = 40; j <= 400; j += 20) {
			g.drawLine(j, 40, j, 400);
		}
		//���С��
		g.fillOval(97, 97, 6, 6);
		g.fillOval(97, 337, 6, 6);
		g.fillOval(337, 97, 6, 6);
		g.fillOval(337, 337, 6, 6);
		g.fillOval(217, 217, 6, 6);
	}

	//�����������������¼�
	public void mousePressed(MouseEvent e) {
		if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
			//��ȡ��갴��ʱ������
			x = (int) e.getX();
			y = (int) e.getY();
			//�����������ӣ���ɫ���Ӻͺ�ɫ����
			ChessPoint_black chesspoint_black = new ChessPoint_black(this);
			ChessPoint_white chesspoint_white = new ChessPoint_white(this);

			int a = (x + 10) / 20, b = (y + 10) / 20;
			//����λ�ó������̣���������
			if (x / 20 < 2 || y / 20 < 2 || x / 20 > 19 || y / 20 > 19) {
			} else {
				if (������ɫ == 1) {
					this.add(chesspoint_black);
					chesspoint_black.setBounds(a * 20 - 10, b * 20 - 10, 20, 20);
					������ɫ = ������ɫ * (-1);
					text_1.setText(null);
					text_2.setText("���������");
				} else if (������ɫ == -1) {
					this.add(chesspoint_white);
					chesspoint_white.setBounds(a * 20 - 10, b * 20 - 10, 20, 20);
					������ɫ = ������ɫ * (-1);
					text_1.setText("���������");
					text_2.setText(null);
				}
			}
		}
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

//��Ӧbutton �¼�
	public void actionPerformed(ActionEvent e) {
		this.removeAll();
		������ɫ = 1;
		add(button);
		button.setBounds(10, 5, 60, 26);
		add(text_1);
		text_1.setBounds(90, 5, 90, 24);
		add(text_2);
		text_2.setBounds(290, 5, 90, 24);
		text_1.setText("���º���");
		text_2.setText(null);
	}
}

//���𴴽���ɫ���ӵ���
class ChessPoint_black extends Canvas implements MouseListener {
	ChessPad chesspad = null;

	ChessPoint_black(ChessPad p) {
		setSize(20, 20);
		chesspad = p;
		addMouseListener(this);
	}

//�������ӵĴ�С
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(0, 0, 20, 20);
	}

	public void mousePressed(MouseEvent e) {
		if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
			chesspad.remove(this);
			chesspad.������ɫ = 1;
			chesspad.text_2.setText(null);
			chesspad.text_1.setText("���������");
		}
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() >= 2)
			chesspad.remove(this);
	}
}

//���𴴽���ɫ���ӵ���
class ChessPoint_white extends Canvas implements MouseListener {
	ChessPad chesspad = null;

	ChessPoint_white(ChessPad p) {
		setSize(20, 20);
		chesspad = p;
		addMouseListener(this);
	}

//�������ӵĴ�С
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(0, 0, 20, 20);
	}

	public void mousePressed(MouseEvent e) {
		if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
			chesspad.remove(this);
			chesspad.������ɫ = -1;
			chesspad.text_2.setText("���������");
			chesspad.text_1.setText(null);
		}
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() >= 2)
			chesspad.remove(this);
	}
}

//���̵����崰����
public class TestA extends Frame {
	ChessPad chesspad = new ChessPad();

	TestA() {
		setVisible(true);
		setLayout(null);
		Label label = new Label("������������ӣ�������˫�������Ҽ������ӻ���", Label.CENTER);
		add(label);
		label.setBounds(70, 55, 440, 26);
		label.setBackground(Color.orange);
		add(chesspad);
		chesspad.setBounds(70, 90, 440, 440);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		pack();
		setSize(600, 550);
	}

	public static void main(String args[]) {
		TestA chess = new TestA();
	}
}