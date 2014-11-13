/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;
import java.util.*;
import lab1.Song;

/**
 *
 * @author mbrester1
 */
public class Startup {
     public static void main(String[] args) {
        
    
        Song song1 = new Song("Re:Make","One-Ok-Rock","J-Rock","2012");
        Song song2 = new Song("You're going far kid","Offspring","Rock","2011");
        Song song3 = new Song("Rock-Paper-Scissors","One-Ok-Rock","J-Rock","2011");
        Song song4 = new Song("Demons","Imagine Dragons","Alternitive","2012");
        Song song5 = new Song("Demons","Imagine Dragons","Rock","2012");
        
         Set<Song> songs = new TreeSet<>();
         songs.add(song1);
         songs.add(song2);
         songs.add(song3);
         songs.add(song4);
         songs.add(song5);
         
         for(Song s : songs){
             System.out.println(s);
         }
        
    }
}
