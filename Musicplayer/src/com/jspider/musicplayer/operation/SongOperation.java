package com.jspider.musicplayer.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.musicplayer.object.Song;

public class SongOperation {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Song> arrylist = new ArrayList<Song>();
    //Song song = new Song();
    
	public SongOperation(Object object, Object object2, int i) {
		// TODO Auto-generated constructor stub
	}

	public void addSong() {
		System.out.println("How many songs you want to add?");
		int addCount = scanner.nextInt();
		for (int i=0;i<addCount;i++) {
		    Song song = new Song();
			System.out.println("Enter the ID for song: ");
			song.setId(scanner.nextInt());
			
			System.out.println("Enter the name for song: ");
			song.setName(scanner.next());
			
			System.out.println("Enter the movie name for song: ");
			song.setMovie(scanner.next());
			
			System.out.println("Enter the length for song: ");
			song.setLength(scanner.nextDouble());
			
			System.out.println("Enter the composer name for song: ");
			song.setComposer(scanner.next());
			
			System.out.println("Enter the lyrist name for song: ");
			song.setLyricist(scanner.next());
			
			arrylist.add(song);
			System.out.println(song.getName()+" Song added succeessfully.");
		}
	}
	
	public void displayAllSongs() {
		if (arrylist.isEmpty()) {
			System.out.println("Add songs then you will get songlist.");
			addSong();
		}
		for(Song song : arrylist) {
			System.out.println(song.getName());
		}
	}
    public void removeSong() {
		if (arrylist.isEmpty()) {
			System.out.println("Add song then remove.");
			addSong();
		}
		System.out.println("Select song to remove.");
		displayAllSongs();
		int removeId = scanner.nextInt();
		System.out.println(arrylist.get(removeId - 1).getName()+" song removed Successfully...");
		arrylist.remove(removeId - 1);
		displayAllSongs();
	}
        
    public void playAllSong() {
		if (arrylist.isEmpty()) {
			System.out.println("Add songs then play..");
			addSong();
		}
		System.out.println("Playing all songs");
		for(Song song : arrylist) {
			System.out.println(song.getName());
		}
   	}
    
    public void playRandomSong() {
		if(arrylist.isEmpty()) {
			System.out.println(" first Add songs then play...");
			addSong();
		}
		System.out.println("Playing random songs");
    	double number = Math.random();
    	int random = (int) (number * 10) + 1;
    	if (random>arrylist.size()) {
			random = 1;
		}
    	System.out.println("Playing song "+ arrylist.get(random).getName());
	}
    
    
    public void playSpeificSong() {
		if (arrylist.isEmpty()) {
			System.out.println("Add songs then play...");
			addSong();
		}
		System.out.println("Select song to play.");
		displayAllSongs();
		int play = scanner.nextInt();
		System.out.println("Playing song "+arrylist.get(play - 1).getName());
   	}
    
    public void editPlaylist() {
    	if (arrylist.isEmpty()) {
			System.out.println("Add songs then edit the song..");
			addSong();
		}
    	System.out.println("Select song to edit");
		displayAllSongs();
		int edit = scanner.nextInt();
		arrylist.remove(edit - 1);
	    Song song1 = new Song();	
		System.out.println("Enter the new Id for song: ");
		song1.setId(scanner.nextInt());
		
		System.out.println("Enter the new name for song: ");
		song1.setName(scanner.next());
		
		System.out.println("Enter the new movie name for song: ");
		song1.setMovie(scanner.next());
		
		System.out.println("Enter the new length for song: ");
		song1.setLength(scanner.nextDouble());
		
		System.out.println("Enter the new composer name for song: ");
		song1.setComposer(scanner.next());
		
		System.out.println("Enter the new lyrist name for song: ");
		song1.setLyricist(scanner.next());
		
		arrylist.add(edit - 1,song1);
		System.out.println(arrylist.get(edit - 1).getName()+" song details updated successfully.");
   	}
}
