package lab1_to_9.lab5.lab5_3;

import javax.swing.*;
import java.awt.*;

public class Photo extends JFrame {
    private String imagepath;

    public Photo(String imagepath) {
        this.imagepath = imagepath;

        setTitle("Картинка");
        setSize(960, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (imagepath != null && !imagepath.isEmpty()) {
            ImageIcon icon = new ImageIcon(imagepath);
            Image image = icon.getImage();

            if (image.getWidth(null) != -1) {
                // Указываем желаемые размеры
                int width = 960;  // новая ширина
                int height = 540; // новая высота
                g.drawImage(image, 5, 5, width, height, this);
            } else {
                g.drawString("Image not found: " + imagepath, 50, 50);
            }
        } else {
            g.drawString("No image path provided", 50, 50);
        }
    }

    public static void main(String[] args) {
        String imagepath = args.length > 0 ? args[0] : "";

        SwingUtilities.invokeLater(() -> {
            new Photo(imagepath).setVisible(true);
        });
    }
}