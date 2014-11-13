/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.util.*;
import lab1.*;

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

         Map<String,Song> songs = new LinkedHashMap<>();
         songs.put(song1.getSongName(), song1);
         songs.put(song2.getSongName(), song2);
         songs.put(song3.getSongName(), song3);
         songs.put(song4.getSongName(), song4);
         
         Set<String> keys = new LinkedHashSet<>(songs.keySet());
        for(String key : keys) {
            Song found = songs.get(key);
            System.out.println(found.toString());
        }
    }
}