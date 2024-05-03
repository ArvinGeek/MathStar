package com.adc.DesignPatterns;

public class Or extends Expression 
{
	private Expression left, right;
	public Or(Expression left, Expression right) 
	{
		// TODO Auto-generated constructor stub
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Context ctx) {
		// TODO Auto-generated method stub
		return left.interpret(ctx)||right.interpret(ctx);
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o != null && o instanceof Or)
		{
			return this.left.equals(((Or)o).left) && this.right.equals(((Or)o).right);
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
		return "("+left.toString()+ " OR "+ right.toString()+")";
	}

}
