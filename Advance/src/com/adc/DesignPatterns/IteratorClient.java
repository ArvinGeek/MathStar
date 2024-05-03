package com.adc.DesignPatterns;

public class IteratorClient 
{
	private Iterator it;
	private Aggregate agg = new ConcreteAggregate();
	public void operation()
	{
		it =agg.createIterator();
		while(!it.isDone())
		{
			System.out.println(it.currentItem().toString());
			it.next();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		IteratorClient client = new IteratorClient();
		client.operation();
	}

}
