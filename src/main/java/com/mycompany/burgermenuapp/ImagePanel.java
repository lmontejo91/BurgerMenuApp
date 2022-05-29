/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.burgermenuapp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DAW
 */
public class ImagePanel extends JPanel {
    
    /*Este clase y los métodos que sobrescribe me permite añadir una imagen de fondo al JPanel, que de otra 
    manera no admite imágenes sino sólo colores.*/
    
    private Image img;

    public ImagePanel(String img) {
      this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img) {
      this.img = img;
      Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
      setPreferredSize(size);
      setMinimumSize(size);
      setMaximumSize(size);
      setSize(size);
      setLayout(null);
    }
    
    @Override
    public void paintComponent(Graphics g) {
      g.drawImage(img, 0, 0, null);
    } 
      
}
