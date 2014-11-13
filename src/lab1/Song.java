package lab1;

import java.util.Comparator;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Song implements Comparable<Song>, Comparator<Song>{
    private String songName;
    private String band;
    private String genre;
    private String relaseDate;

    public Song(String songName, String band, String genre, String relaseDate) {
        this.songName = songName;
        this.band = band;
        this.genre = genre;
        this.relaseDate = relaseDate;
    }
    

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.songName);
        hash = 67 * hash + Objects.hashCode(this.band);
        hash = 67 * hash + Objects.hashCode(this.relaseDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.songName, other.songName)) {
            return false;
        }
        if (!Objects.equals(this.band, other.band)) {
            return false;
        }
        if (!Objects.equals(this.relaseDate, other.relaseDate)) {
            return false;
        }
        return true;
    }

 
@Override
    public int compare(Song o1, Song o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
   


    @Override
    public int compareTo(Song o) {
    
     return new CompareToBuilder().append(this.songName, o.songName).toComparison();
    
    }

    @Override
    public String toString() {
        return "Song{" + "songName=" + songName + ", band=" + band + ", genre=" + genre + ", relaseDate=" + relaseDate + '}';
    }
    
    
    
}
