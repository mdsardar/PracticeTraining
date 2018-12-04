package org.javathoughts.sardar;

public class Laptop {

	private String color;
	private String brand;
	private int cPU;
	
	public Laptop(String color, String brand, int cPU) {
		super();
		this.color = color;
		this.brand = brand;
		this.cPU = cPU;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getcPU() {
		return cPU;
	}

	public void setcPU(int cPU) {
		this.cPU = cPU;
	}

	//@Override
	/*public int compareTo(Laptop lapSort) {
		// TODO Auto-generated method stub
		if (this.getcPU() > lapSort.getcPU())
			return 1;
		else if (this.getcPU() == lapSort.getcPU())
			return 0;
		else
			return -1;
	}*/

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Laptop [color] " + color + "[brand] " + brand + "[cPU] " + cPU;
	}
	
	
	
	
}
