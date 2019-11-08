package com.himanshu.challenge.linkedList;

import java.util.ArrayList;

public class Albums {
  
  private String name;
  private String artists;
  private ArrayList<Songs> songs;
  
  public Albums(String name, String artists) {
    this.artists = artists;
    this.name = name;
    this.songs = ArrayList<Songs>();
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
  
}
