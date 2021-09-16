// Jakob Evans
// 9/15/21
// Method Overriding

package com.cognixia.jump.model;

public class Shape {
	
	public Double Area() {
		System.out.println("I am in the parents area function (Shape class)");
		return 0.0;
	}
	
	private String color;
	private String type;
	
	public Shape() {
		this.color = "noColor";
		this.type = "parentShape";
	}
	
	public Shape( String type, String color) { 
		this.setType(type); 

		this.setColor(color); 
	}


	
	public void printShapeData() {
		System.out.println("\nType is : " + type + ", Color is : " + color);

		
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

}

