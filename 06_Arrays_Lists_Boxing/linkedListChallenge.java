/*
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
*/

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedListChallenge {
  public static void main(String[] args) {
    System.out.println("-----linkedListChallenge-----");

    Song song = new Song("Drive","3:39");
    Song song2 = new Song("Awl Ashaq","3:24");
    Song song3 = new Song("Run","3:40");
    Song song4 = new Song("Pied Piper","3:55");
    Song song5 = new Song("FAKE LOVE","3:44");
    System.out.println(song.toString());
    Album album = new Album("EVERYTHING YOU WANTED");
    album.addSong(song);
    album.addSong(song2);
    album.addSong(song3);
    album.addSong(song4);
    album.addSong(song5);
    System.out.println(album.toString());
    album.removeSong(song);
    System.out.println(album.toString());
    

    System.out.println("-----END-----");
  }



  public static class Album {
    private String name;
    private LinkedList<Song> songs;

    public Album(String name) {
      this.name = name;
      this.songs = new LinkedList<Song>();
    }
    public String getName() {
      return this.name;
    }
    public LinkedList<Song> getSongs() {
      return this.songs;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setSongs(LinkedList<Song> songs) {
      this.songs = songs;
    }
    public void addSong(Song song) {
      this.songs.add(song);
    }
    public void removeSong(Song song) {
      Iterator i = this.songs.iterator();
      while(i.hasNext()) {
        String temp = i.next().toString();
        if(temp.equals(song.toString())) {
          i.remove();
          break;
        }
      }
    }
    public String toString() {
      Iterator i = songs.iterator();
      String temp = "Album: " + this.name + "\n";
      while(i.hasNext()) {
        temp += "\t" + i.next().toString() + "\n";
      }
      return temp;
    }
  }


  public static class Song {
    private String title;
    private String duration;

    public Song(String title, String duration) {
      this.title = title;
      this.duration = duration;
    }
    public String getTitle() {
      return this.title;
    }
    public String getDuration() {
      return this.duration;
    }
    public void setTitle() {
      this.title = title;
    }
    public void setDuration() {
      this.duration = duration;
    }
    public String toString() {
      return "title: "+this.title+"\tdur: "+this.duration;
    }
  }
}
