package com.adc.DesignPatterns;

public class FacadeClient {
	private static SecurityFacade security =new SecurityFacade();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//security = new SecurityFacade();
		security.activate();
		security.deactivate();
	}

}
