package com.adc.DesignPatterns;

public interface BallIF {
	/*
	 * 计算面积
	 * */
	double calculateArea();
	/*
	 * 计算体积
	 * */
	double calculateVolume();
	/*
	 * 半径的取值方法
	 * */
	double getRadius();
	/*
	 * 半径的赋值方法
	 * */
	void setRadius(double radius);
}
