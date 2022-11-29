package com.jspider.factorypattern.main;

import java.util.Scanner;

import com.jspider.factorypattern.MovieName.KGF2;
import com.jspider.factorypattern.MovieName.Kantara;
import com.jspider.factorypattern.MovieName.Pushpa;
import com.jspider.factorypattern.MovieName.Vikram;
import com.jspider.factorypattern.inter.Movie;

public class MovieMain {
		static boolean loop = true;
		static Movie movie;
		
		public static void main(String[] args) {
			while(loop) {
				try {
					movieFactory().nowPlaying();
				}
				catch(Exception e) {
					System.out.println("No movie Selected");
				}
			}
		}
			public static Movie movieFactory() {
				System.out.println("Select a Movie to watch: \n" +"1- K.G.F-2 \n"+"2- vikram\n"+"3-Pushpa\n"+"4- Kantara\n");
				Scanner scanner = new Scanner(System.in);
				int choice = scanner.nextInt();
				scanner.close();
				
				switch (choice) {
				case 1: {
					movie =  new KGF2();
					loop = false;
					return movie;
				}
				case 2: {
					movie = new Vikram();
					loop = false;
					return movie;
				}
				case 3: {
					movie = new Pushpa();
					loop = false;
					return movie;
				}
				case 4: {
					movie = new Kantara();
					loop = false;
					return movie;
				}
				 
				default:{
					System.out.println("Invalid Input");
					return movie;
				}
			}
			
		}
}

