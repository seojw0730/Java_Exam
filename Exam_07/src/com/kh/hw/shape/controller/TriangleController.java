package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();
//	private Shape s;

	public double calcArea(double height, double width) {
		double result = 0.0;
		// TODO
		s.setHeight(height);
		s.setWidth(width);
//		s = new Shape(3, height, width);
		result = height * width / 2;
		return result;
	}

	public void paintColor(String color) {
		s.setColor(color);
		// TODO
	}

	public String print() {
		String result = "";
		result = "삼각형 : " + s.information();
		// TODO
		return result;
	}
}