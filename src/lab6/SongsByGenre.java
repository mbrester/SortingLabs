/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import java.util.Comparator;
import lab1.Song;

/**
 *
 * @author mbrester1
 */
public class SongsByGenre implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
