package com.jspider.factorypattern.MovieName;

import com.jspider.factorypattern.inter.Movie;

public class Pushpa implements Movie{

	@Override
	public void nowPlaying() {
		System.out.println("Now Playing Pushpa");
	}
	

}
