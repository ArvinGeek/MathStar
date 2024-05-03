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
	 * 迭代方法：移动到第一个元素
	 * */
	@Override
	public void first() {
		// TODO Auto-generated method stub
		index=0;
	}
	/*
	 * 迭代方法：移动到下一个元素
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
	 * 迭代方法：是否是最后一个元素
	 * */
	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return (index>=size);
	}
	/*
	 * 迭代方法：返还当前元素
	 * */
	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return null;//agg.getElement(index);
	}

}
