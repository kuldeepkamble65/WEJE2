package com.jspider.singletone.moviEaager1;

public class MovieEager {
	static int noOfTickets;
	//static MovieEager movieEager;
	
	static MovieEager movieEager= new MovieEager(100);
	
	private MovieEager(int noOfTickets) {
		this.noOfTickets =noOfTickets;
		
	}
	public static MovieEager booktickets(int noOfBooking) {
		System.out.println("Avaible tickes"+noOfTickets);
		System.out.println("Booking "+noOfBooking+" Tickets");
		
		if(noOfBooking > noOfTickets) {
			System.out.println("Tickets not Available");
			return movieEager;
		}
		noOfTickets -= noOfBooking;
		System.out.println("Ticket left"+noOfTickets);
		return movieEager;
	}
	
	
}
