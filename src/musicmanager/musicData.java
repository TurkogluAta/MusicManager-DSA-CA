/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanager;

import java.io.Serializable;

/**
 *
 * @author Ata Turkoglu
 */
/**
 * Represents the data for a music track including the song's name and artist's
 * name
 */
public class musicData implements Serializable {

    private String songName; // The name of the song
    private String artistName; // The name of the artist

    public musicData(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return songName + " by " + artistName;
    }
}
