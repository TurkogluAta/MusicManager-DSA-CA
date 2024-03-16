/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicmanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Ata Turkoglu
 */
/**
 * Main application to manage music playlists and liked songs.
 */
public class MusicManagerApp {

    private static StackInterface stackInterface; // Stack for liked songs
    private static DLLinterface playlist1; // First playlist
    private static DLLinterface playlist2; // Second playlist

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Load liked songs and playlists from files
        loadLiked();
        loadPlaylist();

        // If any list is not loaded, create new
        if (stackInterface == null) {
            stackInterface = new LikedMusicStack();
        }
        if (playlist1 == null) {
            playlist1 = new PlaylistDLL();
        }
        if (playlist2 == null) {
            playlist2 = new PlaylistDLL();
        }

        // Show manage liked songs GUI
        ManageLikedGUI manageLikedGUI = new ManageLikedGUI(stackInterface, playlist1, playlist2);
        manageLikedGUI.setVisible(true);
    }

    // Loads liked songs from a file
    private static void loadLiked() {
        File f = new File("MusicManager.dat");

        if (f.exists()) { // Check if file exists
            try {
                FileInputStream fStream = new FileInputStream(f); // Open file input stream
                ObjectInputStream oStream = new ObjectInputStream(fStream); // Create object input stream
                stackInterface = (LikedMusicStack) oStream.readObject(); // Read liked songs stack
                oStream.close(); // Close the stream
            } catch (IOException | ClassNotFoundException e) { // Catch any errors
                JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE); // Show warning message
            }
        }
    }

    // Loads playlists from a file
    private static void loadPlaylist() {
        File f = new File("MusicManager2.dat");
        if (f.exists()) { // Check if file exists
            try {
                FileInputStream fStream = new FileInputStream(f); // Open file input stream
                ObjectInputStream oStream = new ObjectInputStream(fStream); // Create object input stream
                playlist1 = (PlaylistDLL) oStream.readObject(); // Read first playlist
                playlist2 = (PlaylistDLL) oStream.readObject(); // Read second playlist
                oStream.close(); // Close the stream
            } catch (IOException | ClassNotFoundException e) { // Catch any errors
                JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE); // Show warning message
            }
        }
    }
}
