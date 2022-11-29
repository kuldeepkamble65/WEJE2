package com.jspider.musicplayer.main;

import java.util.Scanner;

import com.jspider.musicplayer.operation.SongOperation;

public class MusicPlayerMain {
	Scanner scanner = new Scanner(System.in);
	SongOperation songOperation = new SongOperation(null, null, 0);
	
	public static void main(String[] args) {
		MusicPlayerMain musicPlayerMain = new MusicPlayerMain();
		boolean loop = true;
		while(loop) {
			musicPlayerMain.multiPlayer();
		}
	}
	
	public void multiPlayer() {
		System.out.println("Choose the following operation : \n"
				+"1.Add/Remove the song. \n"
				+"2.Play the song.       \n"
				+"3.Edit the song.       \n"
				+"4.Exit.");
		int number = scanner.nextInt(); 
		switch (number) {
		case 1:
			System.out.println("1.Add the song  \n"+"2.Remove the song   \n"+"3.Back.");
			int num=scanner.nextInt();
			switch (number) {
			case 1:
				songOperation.addSong();
				break;
			case 2:
				songOperation.removeSong();
				break;
			case 3:
				multiPlayer();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			break;

		case 2:
			System.out.println("1.Select song to play   \n"
					+"2.Play all songs.    \n"
					+"3.Play random songs  \n"
					+"4.Back");
			switch (scanner.nextInt()) {
			case 1:
				songOperation.playSpeificSong();
				break;
			case 2:
				songOperation.playAllSong();
				break;
			case 3:
				songOperation.playSpeificSong();
				break;
			case 4:
				multiPlayer();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			break;
			
		case 3:
			System.out.println("1.Edit PlayList.  \n"+"2.Back.");
			switch (scanner.nextInt()) {
			case 1:
				songOperation.editPlaylist();
				break;
			case 2:
				multiPlayer();
				break;
			default:
				break;
			}
			break;
		
		case 4:
			boolean loop = false;
			System.out.println("Thank-you.");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
