package com.adc.DesignPatterns;

public class Variable extends Expression 
{
	private String name;
	public Variable(String name) 
	{
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return ctx.lookup(this);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o !=null && o instanceof Variable) 
		{
			return this.name.equals(((Variable)o).name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.toString()).hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
