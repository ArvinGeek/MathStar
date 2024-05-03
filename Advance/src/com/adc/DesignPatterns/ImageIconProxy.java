package com.adc.DesignPatterns;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class ImageIconProxy implements Icon 
{
	private ImageIcon realIcon=null;
	private String imageName;
	private int width;
	private int height;
	boolean isIconCreated = false;
	public ImageIconProxy(String imageName,int width,int height) {
		// TODO Auto-generated constructor stub
		this.imageName =imageName;
		this.width = width ;
		this.height = height;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return realIcon.getIconHeight();
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return realIcon.getIconWidth();
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if (isIconCreated) 
		{
			realIcon.paintIcon(c, g, x, y);
			g.drawString("Java and Patterns by Jeff Yan, Ph.D", x+20, y+370);
		}
		else
		{
			g.drawRect(x, y, width-1, height -1);
			g.drawString("Loading author's photo...", x+20, y+20);
			synchronized(this)
			{
				SwingUtilities.invokeLater(new Runnable() 
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						try 
						{
							Thread.currentThread().sleep(2000);
							realIcon=new ImageIcon(imageName);
							isIconCreated = true;
						}
						catch(InterruptedException ex) 
						{
							ex.printStackTrace();
						}
						c.repaint();
					}
					
				});		
				
			}		
		}
	}

}
