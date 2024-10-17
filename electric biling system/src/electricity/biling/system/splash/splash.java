package electricity.biling.system.splash;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class splash extends JFrame {
    splash() {
        // Use absolute path directly if it's outside classpath
        ImageIcon imageIcon = new ImageIcon(
                "C:\\Users\\Ayush\\Desktop\\electric biling  system\\electric biling system\\src\\splash\\Splash.jpg");

        // Scale the image
        Image imageOne = imageIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(imageOne);

        // Add the image to a JLabel
        JLabel label = new JLabel(scaledIcon);
        add(label);

        // Set size for the window
        setSize(600, 400);

        // Set default close operation
        setLocation(600, 200);

        // Make the window visible
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            // Sleep for 3 seconds (3000 milliseconds)
            Thread.sleep(3000);

            // Hide the splash screen
            setVisible(false);

            // Terminate the program
           new Login();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new splash();
    }
}
