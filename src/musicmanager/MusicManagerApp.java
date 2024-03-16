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
public class MusicManagerApp {

    private static StackInterface stackInterface;
    private static DLLinterface playlist1;
    private static DLLinterface playlist2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loadLiked();
        loadPlaylist();

        if (stackInterface == null) {
            stackInterface = new LikedMusicStack();
        }
        if (playlist1 == null) {
            playlist1 = new PlaylistDLL();
        }
        if (playlist2 == null) {
            playlist2 = new PlaylistDLL();
        }

        ManageLikedGUI manageLikedGUI = new ManageLikedGUI(stackInterface, playlist1, playlist2);
        manageLikedGUI.setVisible(true);
    }

    private static void loadLiked() {
        File f = new File("MusicManager.dat");

        if (f.exists()) {
            try {
                FileInputStream fStream = new FileInputStream(f);
                ObjectInputStream oStream = new ObjectInputStream(fStream);
                stackInterface = (LikedMusicStack) oStream.readObject();
                oStream.close();
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private static void loadPlaylist() {
        File f = new File("MusicManager2.dat");
        if (f.exists()) {
            try {
                FileInputStream fStream = new FileInputStream(f);
                ObjectInputStream oStream = new ObjectInputStream(fStream);
                playlist1 = (PlaylistDLL) oStream.readObject();
                playlist2 = (PlaylistDLL) oStream.readObject();
                oStream.close();
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
