package com.adc.DesignPatterns;

public class ConcreteIterator1 implements Iterator 
{
	private ConcreteAggregate agg;
	private int index=0;
	private int size=0;
	public ConcreteIterator1(ConcreteAggregate agg) 
	{
		this.agg = agg;
		//size=agg.size();
		index=0;
			
	}
	/*
	 * �����������ƶ�����һ��Ԫ��
	 * */
	@Override
	public void first() {
		// TODO Auto-generated method stub
		index=0;
	}
	/*
	 * �����������ƶ�����һ��Ԫ��
	 * */

	@Override
	public void next() {
		// TODO Auto-generated method stub
		if(index<size)
		{
			index++;
		}
	}
	/*
	 * �����������Ƿ������һ��Ԫ��
	 * */
	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return (index>=size);
	}
	/*
	 * ����������������ǰԪ��
	 * */
	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return null;//agg.getElement(index);
	}

}
