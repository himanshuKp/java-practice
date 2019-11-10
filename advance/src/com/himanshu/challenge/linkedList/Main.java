package com.himanshu.challenge.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

  private static ArrayList<Albums> albums = new ArrayList<Albums>();

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
        
        LinkedList<Songs> playList = new LinkedList<Songs>();
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

  private static void play(LinkedList<Songs> playList) {
    Scanner scanner = new Scanner(System.in);
    boolean flag = false;
    boolean forward = true;
        
    ListIterator<Songs> listIterator = playList.listIterator();
    if(playList.size()==0) {
      System.out.println("There are no songs in the playlsit");
      return;
    }else {
      System.out.println("Next we are playling: " +listIterator.next());
    }
    
    while(!flag) {
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
      case 0:
        System.out.println("Playlist stopped");
        flag = true;
        break;
      case 1:   //moving forward in playlist
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
      case 2:   //moving backward in playlist
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
        printList(playList);
        break;
      }
    }
    
    
  }

  private static void printList(LinkedList<Songs> playList) {
    
  }
    
  }
