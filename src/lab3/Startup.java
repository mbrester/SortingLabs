/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;
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

         Map<String,Song> songs = new TreeMap<>();
         songs.put("111", song1);
         songs.put("000", song2);
         songs.put("222", song3);
         songs.put("333", song4);
         
         List<Song> values = new ArrayList<>();
         Set<String> keys = new LinkedHashSet<>(songs.keySet());
        for(String key : keys) {
            Song found = songs.get(key);
            
            values.add(found);
        }
        Collections.sort(values);
        for(Song s : values){
            System.out.println(s);
        }
        
    }
}
