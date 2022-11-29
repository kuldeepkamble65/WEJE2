package com.jspider.singletone.movielazy;

public class MovieLazy {
		static int noOfTickets;
		static MovieLazy movielazy;
		
		private MovieLazy(int noOfTickets) {
			this.noOfTickets =  noOfTickets;
			}
		
		public static MovieLazy bookTickets(int noOfBooking) {
			if(movielazy == null) {
				movielazy = new MovieLazy(100);
			}
			System.out.println("Available Tickets "+noOfTickets);
			System.out.println("Booking "+noOfBooking+" Tickets");
			
			if(noOfBooking > noOfTickets) {
				System.out.println("Tickets not Available");
				return movielazy;
			}
			noOfTickets -= noOfBooking;
			System.out.println("Tickets Left: "+noOfTickets);
			return movielazy;
		}
}
