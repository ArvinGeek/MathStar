package com.adc.DesignPatterns;

public class Constant extends Expression 
{
	private boolean value;
	public Constant(boolean value) {
		// TODO Auto-generated constructor stub
		this.value= value;
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o!=null && o instanceof Constant)
		{
			return this.value == ((Constant)o).value;
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
		return new Boolean(value).toString();
	}

}
