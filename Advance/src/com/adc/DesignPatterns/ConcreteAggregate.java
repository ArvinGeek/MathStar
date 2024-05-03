package com.adc.DesignPatterns;

public class ConcreteAggregate extends Aggregate 
{
	private Object[] objs= {"Monk Tang","Monkey","Pigsy","Sandy","Horse"};
	public Iterator createIterator()
	{
		return new ConcreteIterator();
	}
	private class ConcreteIterator implements Iterator
	{
		private int currentIndex=0;
		public void first()
		{
			currentIndex=0;
		}
		public void next()
		{
			if (currentIndex<objs.length)
			{
				currentIndex++;
			}
		}
		public boolean isDone()
		{
			return (currentIndex==objs.length);
		}
		public Object currentItem()
		{
			return objs[currentIndex];
		}
	}
	/*
	 * public Object getElement(int index) { if(index<objs.length) { return
	 * objs[index]; } else { return null; } } public int size() { return
	 * objs.length; }
	 */}
