/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicmanager;

import java.awt.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Ata Turkoglu
 */
public class ManageLikedGUI extends javax.swing.JFrame {

    private boolean otherButtonClicked;
    private StackInterface stackInterface;
    private DLLinterface playlist1;
    private DLLinterface playlist2;

    /**
     * Creates new form ManagePlaylistGUI
     */
    public ManageLikedGUI(StackInterface stackInterface, DLLinterface playlist1, DLLinterface playlist2) {
        this.stackInterface = stackInterface;
        this.playlist1 = playlist1;
        this.playlist2 = playlist2;
        initComponents();
        otherButtonClicked = false;
        musicCountLiked();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        addLikedPanel = new javax.swing.JPanel();
        likedListAddLabel = new javax.swing.JLabel();
        likedCountLabel = new javax.swing.JLabel();
        newMusicTF = new javax.swing.JTextField();
        songNameLabel = new javax.swing.JLabel();
        artistNameLabel = new javax.swing.JLabel();
        artistTF = new javax.swing.JTextField();
        likedControlPanel = new javax.swing.JPanel();
        stackAddBtn = new javax.swing.JButton();
        stackDltBtn = new javax.swing.JButton();
        stackDisplayBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        musicManagerSP = new javax.swing.JScrollPane();
        musicManagerTA = new javax.swing.JTextArea();
        appLabel = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        navBar = new javax.swing.JMenuBar();
        manageLikedMenu = new javax.swing.JMenu();
        ManageLiked = new javax.swing.JMenuItem();
        managePlaylistMenu = new javax.swing.JMenu();
        managePlaylists = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setMinimumSize(new java.awt.Dimension(400, 400));

        addLikedPanel.setBackground(new java.awt.Color(102, 255, 102));
        addLikedPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        likedListAddLabel.setText("Add a new song to the liked list ");

        likedCountLabel.setText("Currently you don't have any liked music.");

        songNameLabel.setText("Song name: ");

        artistNameLabel.setText("Artist name:");

        javax.swing.GroupLayout addLikedPanelLayout = new javax.swing.GroupLayout(addLikedPanel);
        addLikedPanel.setLayout(addLikedPanelLayout);
        addLikedPanelLayout.setHorizontalGroup(
            addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLikedPanelLayout.createSequentialGroup()
                .addGroup(addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addLikedPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(likedCountLabel)
                            .addComponent(likedListAddLabel)))
                    .addGroup(addLikedPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(artistNameLabel)
                            .addComponent(songNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newMusicTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artistTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        addLikedPanelLayout.setVerticalGroup(
            addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLikedPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(likedListAddLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(likedCountLabel)
                .addGap(18, 18, 18)
                .addGroup(addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songNameLabel)
                    .addComponent(newMusicTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addLikedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistNameLabel)
                    .addComponent(artistTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        likedControlPanel.setBackground(new java.awt.Color(102, 255, 102));
        likedControlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        stackAddBtn.setText("Add to liked list");
        stackAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stackAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackAddBtnActionPerformed(evt);
            }
        });

        stackDltBtn.setText("Delete last song");
        stackDltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackDltBtnActionPerformed(evt);
            }
        });

        stackDisplayBtn.setText("Display liked list");
        stackDisplayBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stackDisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackDisplayBtnActionPerformed(evt);
            }
        });

        ClearBtn.setText("Clear ALL playlists and liked list");
        ClearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        musicManagerTA.setColumns(20);
        musicManagerTA.setLineWrap(true);
        musicManagerTA.setRows(5);
        musicManagerSP.setViewportView(musicManagerTA);

        javax.swing.GroupLayout likedControlPanelLayout = new javax.swing.GroupLayout(likedControlPanel);
        likedControlPanel.setLayout(likedControlPanelLayout);
        likedControlPanelLayout.setHorizontalGroup(
            likedControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likedControlPanelLayout.createSequentialGroup()
                .addGroup(likedControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(likedControlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(musicManagerSP, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, likedControlPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(likedControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stackDisplayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(likedControlPanelLayout.createSequentialGroup()
                                .addComponent(stackAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stackDltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        likedControlPanelLayout.setVerticalGroup(
            likedControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likedControlPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(likedControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stackAddBtn)
                    .addComponent(stackDltBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stackDisplayBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musicManagerSP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        appLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        appLabel.setText("Music Manager App");

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addLikedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(likedControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(appLabel))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(appLabel)
                .addGap(18, 18, 18)
                .addComponent(addLikedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(likedControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        navBar.setBackground(new java.awt.Color(102, 102, 102));

        manageLikedMenu.setText("Manage Liked");

        ManageLiked.setText("Manage Liked");
        ManageLiked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageLikedActionPerformed(evt);
            }
        });
        manageLikedMenu.add(ManageLiked);

        navBar.add(manageLikedMenu);

        managePlaylistMenu.setText("Manage Playlists");

        managePlaylists.setText("Manage Playlists");
        managePlaylists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePlaylistsActionPerformed(evt);
            }
        });
        managePlaylistMenu.add(managePlaylists);

        navBar.add(managePlaylistMenu);

        setJMenuBar(navBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Save() {
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            f = new File("MusicManager.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(stackInterface);

            oStream.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void SavePlaylist() {
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            f = new File("MusicManager2.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(playlist1);
            oStream.writeObject(playlist2);

            oStream.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void musicCountLiked() {
        int likedCount = stackInterface.size();

        if (!stackInterface.isEmpty()) {
            likedCountLabel.setText("Currently you have '" + likedCount + "' song in liked list.");
        } else {
            likedCountLabel.setText("Currently you don't have any liked Song.");
        }
    }

    private void stackAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackAddBtnActionPerformed
        // TODO add your handling code here:
        String songName = newMusicTF.getText();
        String artistName = artistTF.getText();

        newMusicTF.setText("");
        artistTF.setText("");

        if (otherButtonClicked) {
            musicManagerTA.setText("");
            otherButtonClicked = false;
        }

        if (!songName.isEmpty() && !artistName.isEmpty()) {
            musicData newMusic = new musicData(songName, artistName);
            stackInterface.push(newMusic);
            musicManagerTA.append(newMusic + " added to your liked list.\n");
            Save();
            musicCountLiked();
        } else {
            musicManagerTA.append("Please fill in the required fields.\n");
        }
    }//GEN-LAST:event_stackAddBtnActionPerformed

    private void stackDltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackDltBtnActionPerformed
        // TODO add your handling code here:
        if (otherButtonClicked) {
            musicManagerTA.setText("");
            otherButtonClicked = false;
        }

        if (!stackInterface.isEmpty()) {
            musicData outLikedSong;
            outLikedSong = stackInterface.pop();
            musicManagerTA.append(outLikedSong + " is deleted from your liked list.\n");
            Save();
            musicCountLiked();
        } else {
            musicManagerTA.setText("You don't have any liked song.\n");
            otherButtonClicked = true;
        }
    }//GEN-LAST:event_stackDltBtnActionPerformed

    private void stackDisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackDisplayBtnActionPerformed
        // TODO add your handling code here:
        otherButtonClicked = true;
        if (!stackInterface.isEmpty()) {
            String likedMusics = stackInterface.displayStack();
            musicManagerTA.setText(likedMusics);
        } else {
            musicManagerTA.setText("You don't have any liked song.");
        }
    }//GEN-LAST:event_stackDisplayBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        otherButtonClicked = true;

        if (!stackInterface.isEmpty() || !playlist1.isEmpty() || !playlist2.isEmpty()) {
            int response = JOptionPane.showConfirmDialog(null, "All your playlists and liked list will be DELETED are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                stackInterface.emptyStack();
                playlist1.emptyPlaylist();
                playlist2.emptyPlaylist();
                Save();
                SavePlaylist();
                musicCountLiked();
                musicManagerTA.setText("All playlists and your liked list have been deleted.");
            }
        } else {
            musicManagerTA.setText("All your playlists are empty.");
        }
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void ManageLikedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageLikedActionPerformed
        // TODO add your handling code here:
        Point currentLocation = this.getLocation();

        this.setVisible(false); // Mevcut GUI'yi gizle
        this.dispose();

        ManageLikedGUI manageLikedGUI = new ManageLikedGUI(stackInterface, playlist1, playlist2);

        manageLikedGUI.setLocation(currentLocation);

        manageLikedGUI.setVisible(true);
    }//GEN-LAST:event_ManageLikedActionPerformed

    private void managePlaylistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePlaylistsActionPerformed
        // TODO add your handling code here:
        Point currentLocation = this.getLocation();

        this.setVisible(false);
        this.dispose();

        ManagePlaylistsGUI managePlaylistsGUI = new ManagePlaylistsGUI(stackInterface, playlist1, playlist2);

        managePlaylistsGUI.setLocation(currentLocation);

        managePlaylistsGUI.setVisible(true);
    }//GEN-LAST:event_managePlaylistsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageLikedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageLikedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageLikedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageLikedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageLikedGUI(stackInterface).setVisible(true);
            }
        });
         */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JMenuItem ManageLiked;
    private javax.swing.JPanel addLikedPanel;
    private javax.swing.JLabel appLabel;
    private javax.swing.JLabel artistNameLabel;
    private javax.swing.JTextField artistTF;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel likedControlPanel;
    private javax.swing.JLabel likedCountLabel;
    private javax.swing.JLabel likedListAddLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu manageLikedMenu;
    private javax.swing.JMenu managePlaylistMenu;
    private javax.swing.JMenuItem managePlaylists;
    private javax.swing.JScrollPane musicManagerSP;
    private javax.swing.JTextArea musicManagerTA;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JTextField newMusicTF;
    private javax.swing.JLabel songNameLabel;
    private javax.swing.JButton stackAddBtn;
    private javax.swing.JButton stackDisplayBtn;
    private javax.swing.JButton stackDltBtn;
    // End of variables declaration//GEN-END:variables
}
