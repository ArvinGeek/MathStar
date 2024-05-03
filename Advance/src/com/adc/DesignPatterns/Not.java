package com.adc.DesignPatterns;

public class Not extends Expression 
{
	private Expression exp;
	public Not(Expression exp) {
		// TODO Auto-generated constructor stub
		this.exp=exp;
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return !exp.interpret(ctx);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o !=null && o instanceof Not)
		{
			return this.exp.equals(((Not)o).exp);
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
		return " (Not " + exp.toString() + ")";
	}

}
