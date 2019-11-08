package com.himanshu.challenge.linkedList;

public class Songs {
  private String songTitle;
  private double songDuration;
  
  public Songs(String songTitle, double songDuration) {
    this.songTitle = songTitle;
    this.songDuration = songDuration;
  }

  protected String getSongTitle() {
    return songTitle;
  }

  @Override
  public String toString() {
    return this.songTitle + ", " +this.songDuration;
  }
  
}
