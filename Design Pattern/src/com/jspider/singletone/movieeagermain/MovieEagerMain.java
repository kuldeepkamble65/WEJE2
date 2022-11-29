package com.jspider.singletone.movieeagermain;

import com.jspider.singletone.moviEaager1.MovieEager;

public class MovieEagerMain {
	public static void main(String[] args) {
		MovieEager.booktickets(20);
		MovieEager.booktickets(50);
		MovieEager.booktickets(40);
	}
}
