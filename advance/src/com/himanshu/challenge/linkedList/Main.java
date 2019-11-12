package com.himanshu.challenge.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

  private static List<Albums> albums = new ArrayList<Albums>();

  // Create a program that implements a playlist for songs
  // Create a Song class having Title and Duration for a song.
  // The program will have an Album class containing a list of songs.
  // The albums will be stored in an ArrayList
  // Songs from different albums can be added to the playlist and will appear in the list in the order
  // they are added.
  // Once the songs have been added to the playlist, create a menu of options to:-
  // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
  // List the songs in the playlist
  // A song must exist in an album before it can be added to the playlist (so you can only play songs that
  // you own).
  // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
  // started tracking the direction we were going.
  // As an optional extra, provide an option to remove the current song from the playlist
  // (hint: listiterator.remove()
  
  public static void main(String[] args) {
        Albums album = new Albums("Stormbringer", "Deep purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.6);
        album.addSong("Holy man", 4.6);
        album.addSong("Hold on", 4.6);
        album.addSong("Lady double dealer", 4.6);
        album.addSong("You can't do it right", 4.6);
        album.addSong("High ball shooter", 4.6);
        albums.add(album);
        
        album = new Albums("For those about to rock", "AC/DC");
        album.addSong("I put the finger on you", 4.6);
        album.addSong("Love don't mean a thing", 4.6);
        album.addSong("Holy man", 4.6);
        album.addSong("Hold on", 4.6);
        album.addSong("Lady double dealer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("High ball shooter", 4.6);
        albums.add(album);
        
        List<Songs> playList = new ArrayList<Songs>();
        albums.get(0).addToPlaylist("High ball shooter", playList);
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Love don't mean a thing", playList);
        albums.get(0).addToPlaylist("Lady double dealer", playList);
        albums.get(0).addToPlaylist("Stormbringer", playList);
        albums.get(0).addToPlaylist("Lady double dealer", playList);
        albums.get(0).addToPlaylist("Summer of 60", playList);
        albums.get(0).addToPlaylist(2, playList);
        
        play(playList);
        
}

  private static void play(List<Songs> playList) {
    Scanner scanner = new Scanner(System.in);
    boolean flag = false;
    boolean forward = true;
        
    ListIterator<Songs> listIterator = playList.listIterator();
    if(playList.size()==0) {
      System.out.println("There are no songs in the playlsit");
      return;
    }else {
      System.out.println("Next we are playling: " +listIterator.next());
      printMenu();
    }
    
    while(!flag) {
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
      case 0:
        System.out.println("Playlist stopped");
        flag = true;
        break;
      case 1:   
        //moving forward in playlist
        if(!forward) {
          if(listIterator.hasNext()) {
            listIterator.next();
          }else {
            forward = true;
          }
        }
        if(listIterator.hasNext()) {
          System.out.println("Now playing: " +listIterator.next().toString());
        }else {
          System.out.println("We have reached the end of the playlist");
          forward = false;
        }
        break;
      case 2:  
        //moving backward in playlist
        if(forward) {
          if(listIterator.hasPrevious()) {
            listIterator.previous();
          }
          forward = false;
        }
        
        if(listIterator.hasPrevious()) {
          System.out.println("Now Playing: " +listIterator.previous());
        }else {
          System.out.println("We have reached the start of the playlist");
          forward = true;
        }           
        break;
      case 3:
//        replay the current song
        if(forward) {
          if(listIterator.hasPrevious()) {
            System.out.println("Now replaying: " +listIterator.previous().toString());
            forward = false;
          }else {
            System.out.println("We have reached the start of the list");
          }
        }else {
          if(listIterator.hasNext()) {
            System.out.println("Now replaying: " +listIterator.next().toString());
            forward = true;
          }else {
            System.out.println("We have reached the end of the playlist");
          }
        }
        break;
      case 4:
//        list songs in the playlist
        printList(playList);
        break;
      case 5:
        if(forward) {
          if(listIterator.hasNext()) {
            System.out.println("Currently playing: " +listIterator.next().toString());
            
            System.out.println("Do you want to remove the current song from the playlist.(Y/N)");
            String ch = scanner.next();
            scanner.nextLine();
            if(ch.equalsIgnoreCase("Y")) {
              listIterator.remove();
              System.out.println("Successfully removed from the playlist");
              listIterator.next();
              forward = false;
            }else {
              printMenu();
            }
          }else {
            System.out.println("We have reached the start of the list");
          }
        }else {
          if(listIterator.hasPrevious()) {
            System.out.println("Currently playing: " +listIterator.previous().toString());
            System.out.println("Do you want to remove the current song from the playlist.(Y/N)");
            String ch = scanner.next();
            scanner.nextLine();
            if(ch.equalsIgnoreCase("Y")) {
              listIterator.remove();
              System.out.println("Successfully removed from the playlist");
              listIterator.previous();
              forward = true;              
            }else {
              printMenu();
            }
          }else {
            System.out.println("We have reached the end of the playlist");
          }
        }
        break;
      case 6:
        printMenu();
        break;
      }
    }
    scanner.close();
  }

  private static void printMenu() {
    System.out.println("Available actions:\nPress");
    System.out.println("0 - To quit\n"
        + "1 - To play next song\n"
        + "2 - To play the previous song\n"
        + "3 - To replay the current song\n"
        + "4 - List songs in the playlist\n"
        + "5 - Remove current song from playlist\n"
        + "6 - Print available actions");
  }

  private static void printList(List<Songs> playList) {
    ListIterator<Songs> listAllSongs = playList.listIterator();
    System.out.println("============================");
    int count=1;
    while(listAllSongs.hasNext()) {
      System.out.println(count+": "+listAllSongs.next());
      count++;
    }
    System.out.println("============================");
  }
    
  }
