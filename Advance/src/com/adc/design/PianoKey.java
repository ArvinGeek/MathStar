package com.adc.design;

public class PianoKey {
	private int PKID, Left,Top,Bottom,Right;
	private String AudioKey;
	
    public PianoKey(int PKID, int Left,int Top,int Bottom,int Right, String AudioKey) 
    {
        this.PKID = PKID;
        this.Left = Left;
        this.Top = Top;
        this.Bottom = Bottom;
        this.Right = Right;
        this.AudioKey = AudioKey;
    }
	public int getPKID()
	{
		return PKID;
	}
	public void setPKID(int pkid) 
	{
		this.PKID = pkid;
	}
	public int getLeft() 
	{
		return Left;
	}	 
	public void setLeft(int left) 
	{
		this.Left = left;
	}
	public int getTop() 
	{
		return Top;
	}	 
	public void setTop(int top) 
	{
		this.Top = top;
	}
	public int getBottom() 
	{
		return Bottom;
	}	 
	public void setBottom(int bottom) 
	{
		this.Bottom = bottom;
	}
	public int getRight() 
	{
		return Right;
	}	 
	public void setRight(int right) 
	{
		this.Right = right;
	}
	public String getAudioKey() 
	{
		return AudioKey;
	}	 
	public void setAudioKey(String audioKey) 
	{
		this.AudioKey = audioKey;
	}

}
