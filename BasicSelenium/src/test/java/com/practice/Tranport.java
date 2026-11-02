package com.practice;

public class Tranport {
	void publicTransport() {
		System.out.println("I am a public Transport");
	}
}
class Bus{
	void noOfSeats() {
		System.out.println("Many Seats");
	}
}
class Metro{
	void underGround() {
		System.out.println("Travels Under the Ground");
	}
}
class MainClass{
	public static void main(String[] args) {
		Tranport trp = new Tranport();
		Bus bs=new Bus();
		Metro mr=new Metro();
		trp.publicTransport();
		mr.underGround();
		bs.noOfSeats();
		
	}
}