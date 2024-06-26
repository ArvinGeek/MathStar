package com.adc.DesignPatterns;

import java.util.Enumeration;
import java.util.Vector;

public class ObjectStructure 
{
	private Vector nodes;
	private Node node;
	public ObjectStructure() {
		// TODO Auto-generated constructor stub
		nodes = new Vector();
	}
	public void action(Visitor visitor)
	{
		for(Enumeration e= nodes.elements();e.hasMoreElements();)
		{
			node = (Node)e.nextElement();
			node.accept(visitor);
		}
	}
	public void add(Node node)
	{
		nodes.addElement(node);
	}
}
