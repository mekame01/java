package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShapeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle[] circle = new Circle[3];
		circle[0] = new Circle(20);
		circle[1] = new Circle(40);
		circle[2] = new Circle(50);
		for(int i = 0; i < circle.length; i++) {
			circle[i].draw();
		}
		
		System.out.println();
		
		RectAngle[] rectAngel = new RectAngle[2];
		rectAngel[0] = new RectAngle(20, 20);
		rectAngel[1] = new RectAngle(50, 60);
		for(int i = 0; i < rectAngel.length; i++) {
			rectAngel[i].draw();
		}
	}

}
