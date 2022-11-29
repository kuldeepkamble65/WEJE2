package com.jspider.singletone.movielazyMain;

import com.jspider.singletone.movielazy.MovieLazy;

public class MovieLazyMain {
	public static void main(String[] args) {
		MovieLazy.bookTickets(20);
		MovieLazy.bookTickets(50);
		MovieLazy.bookTickets(40);
	}

}
