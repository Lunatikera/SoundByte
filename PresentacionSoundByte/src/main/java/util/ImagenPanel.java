/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author carli
 */
public class ImagenPanel extends JPanel {
   private Icon image;
    private int borderSize = 0;
    private Color borderColor = new Color(60, 60, 60);

    // Getters and Setters
    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
        repaint(); // Repaint the component when the image changes
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
        repaint(); // Repaint when the border size changes
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint(); // Repaint when the border color changes
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure proper background rendering

        if (image != null) {
            int size = Math.min(getWidth(), getHeight()); // Ensure the square size
            int borderOffset = borderSize * 2;
            int drawSize = size - borderOffset;

            // Resize the image
            BufferedImage squareImage = new BufferedImage(drawSize, drawSize, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = squareImage.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(toImage(image), 0, 0, drawSize, drawSize, null);
            g2d.dispose();

            // Draw the image
            int x = borderSize;
            int y = borderSize;
            g.drawImage(squareImage, x, y, this);

            // Draw the border
            if (borderSize > 0) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(borderColor);
                g2.setStroke(new BasicStroke(borderSize));
                g2.drawRect(x, y, drawSize, drawSize);
            }
        }
    }

    private Image toImage(Icon icon) {
        if (icon instanceof ImageIcon) {
            return ((ImageIcon) icon).getImage();
        }
        // Create a buffered image for non-ImageIcon icons
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();
        return bufferedImage;
    }
}