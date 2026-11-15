/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImageGallery;

import Model.Shirt;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ImageGallery extends JFrame {

    public ImageGallery(ArrayList<String> searchResult) { 
        
        setTitle("Image Gallery");
        setSize(600, 700); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        String[] imagePaths = new String[searchResult.size()];
        int a = 0;
        for (String shirt : searchResult) {
            imagePaths[a++] = "Clothes_Images\\"+shirt+".jpg";
        }
        

        
        
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new GridLayout(0, 2, 10, 10)); 
        imagePanel.setBackground(Color.WHITE);

        
        int imageWidth = 250;
        int imageHeight = 250;

        
        for (String path : imagePaths) {
            try {
                
                ImageIcon originalIcon = new ImageIcon(path);
                Image img = originalIcon.getImage();
                
                
                Image scaledImg = img.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImg);
                
                
                JLabel imageLabel = new JLabel(scaledIcon);
                
                
                imagePanel.add(imageLabel);
            } catch (Exception e) {
                
            }
        }

        
        JScrollPane scrollPane = new JScrollPane(imagePanel);
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
       
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        
        add(scrollPane);
        setVisible(true);
    }

}
