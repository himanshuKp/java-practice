package com.himanshu.challenge.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Albums {
  
  private String name;
  private String artists;
  private ArrayList<Songs> songs;
  
  public Albums(String name, String artists) {
    this.artists = artists;
    this.name = name;
    this.songs = new ArrayList<Songs>();
  }
  
  public boolean addSong(String songName, Double songDuration) {
    if(findSong(songName) == null) {
      this.songs.add(new Songs(songName, songDuration));
      return true;
    }
    return false;
  }

  private Songs findSong(String songName) {
    for(Songs songNString: this.songs) {
      if(songNString.getSongTitle().equals(songName)) {
        return songNString;
      }
    }
    return null;
  }
  
  //add song to playlist using song track number
  public boolean addToPlaylist(int trackNumber, List<Songs> playlist) {
    int index = trackNumber - 1;    //counting start from 0 hence, -1
    if((index >= 0) && (index <= this.songs.size())) {
      playlist.add(this.songs.get(index));
      return true;
    }
    System.out.println("This album does not have a track " +trackNumber);
    return false;
  }
  
  
  //add song to playlist  using a song title
  public boolean addToPlaylist(String title, List<Songs> playlist) {
    Songs checkSong = findSong(title);
    if(checkSong != null) {
      playlist.add(checkSong);
      return true;
    }
    System.out.println("The song " +title+ " is not in this album.");
    return false;
  }
  
  
}
