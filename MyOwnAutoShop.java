package com.bridgelab.workshop.myownautoshop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Sedan sedan = new Sedan(10,500, 500000, "Brown");
		Ford ford1 = new Ford(2021, 15000, 280, 500000, "Red");
		Ford ford2 = new Ford(2018, 25000, 230, 400000, "White");
		Car car = new Car(140, 100000, "Off-White");
		
		System.out.println(sedan.getSalePrice());
		System.out.println(ford1.getSalePrice());
		System.out.println(ford2.getSalePrice());
		System.out.println(car.getSalePrice());
	}

}
