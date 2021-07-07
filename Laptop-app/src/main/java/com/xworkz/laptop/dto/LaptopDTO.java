package com.xworkz.laptop.dto;

public class LaptopDTO {
	public LaptopDTO(String laptopName, String laptopBrand, int ram, double cost) {
		super();
		this.laptopName = laptopName;
		this.laptopBrand = laptopBrand;
		this.ram = ram;
		this.cost = cost;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "LaptopDTO [laptopName=" + laptopName + ", laptopBrand=" + laptopBrand + ", ram=" + ram + ", cost="
				+ cost + "]";
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	private String laptopName;
	private String laptopBrand;
	private int ram;
	private double cost;
	

}
