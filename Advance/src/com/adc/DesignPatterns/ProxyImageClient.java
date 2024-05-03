package com.adc.DesignPatterns;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JFrame;

public class ProxyImageClient extends JFrame {

	private static int IMAGE_WIDTH=270;
	private static int IMAGE_HEIGHT =380;
	private Icon imageIconProxy =null;
	public ProxyImageClient() throws HeadlessException {
		// TODO Auto-generated constructor stub
		super("Virtual Proxy Client");
		imageIconProxy= new ImageIconProxy("Arvin2023001.jpg",IMAGE_WIDTH,IMAGE_HEIGHT);
		setBounds(100,100,IMAGE_WIDTH+10,IMAGE_HEIGHT+30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public ProxyImageClient(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ProxyImageClient(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ProxyImageClient(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		Insets insets= getInsets();
		imageIconProxy.paintIcon(this, g, insets.left, insets.top);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyImageClient app = new ProxyImageClient();
		app.show();
	}

}
