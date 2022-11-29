package com.jspider.factorypattern.MovieName;

import com.jspider.factorypattern.inter.Movie;

public class Kantara implements Movie{

	@Override
	public void nowPlaying() {
		System.out.println("Now playing Kantra");
	}
	

}
