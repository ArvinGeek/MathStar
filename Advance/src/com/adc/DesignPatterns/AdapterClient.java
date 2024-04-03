package com.adc.DesignPatterns;

public class AdapterClient {

	public AdapterClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube =new Cube(5);
		MagicFinger mf = new MagicFinger(cube);
		System.out.println(mf.calculateArea());
		System.out.println(mf.calculateVolume());
		System.out.println(cube.calculateFaceArea());
		System.out.println(cube.calculateVolume());
	}

}
