// Jakob Evans
// 9/15/21
// Method Overriding

package com.cognixia.jump.model;

public class OverridingRunner {
	public static void main(String[] args) {
			
			Shape [] myShapes = {
									new Shape(),
									new Square("red", 5),
									new Circle("orange", 10)
								};
			
			
			for (Shape shape : myShapes) {
				shape.printShapeData();
				System.out.println("The overriden area is :" + shape.Area());
			}
		}
}
