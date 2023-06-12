package javaapplication33;

import com.GUI.Fonts.FontManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public final class MainFeatures extends JPanel {

    private JLabel[] features;
    private Timer timer;
    private int currentIndex;

    public MainFeatures() {
        
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setBackground(new Color(51, 57, 140));
        
        setupFeatures();
        startTimer();
    }

    private void setupFeatures() {
        features = new JLabel[3];
        

        features[0] = new JLabel("<html><div style='text-align: center;'>Banking Made Easy,<br>Anytime, Anywhere.</div></html>");
        features[0].setBounds(135, 500, 300, 90);
        features[0].setVerticalAlignment(SwingConstants.CENTER);
        features[0].setHorizontalAlignment(SwingConstants.CENTER);
        add(features[0]);

        features[1] = new JLabel("<html><div style='text-align: center;'>Streamline<br>Your Payments.</div></html>");
        features[1].setBounds(135, 500, 300, 90);
        features[1].setVerticalAlignment(SwingConstants.CENTER);
        features[1].setHorizontalAlignment(SwingConstants.CENTER);
        add(features[1]);

        features[2] = new JLabel("<html><div style='text-align: center;'>Tailored Solutions for<br>Your Borrowing Needs.</div></html>");
        features[2].setBounds(135, 500, 300, 90);
        features[2].setVerticalAlignment(SwingConstants.CENTER);
        features[2].setHorizontalAlignment(SwingConstants.CENTER);
        add(features[2]);

        for (JLabel label : features) {
            label.setForeground(new java.awt.Color(242, 242, 242));
            label.setFont(new Font(loadFonts(11).getFontName(),Font.BOLD,28));
        }

        // Hide all features initially
        for (JLabel feature : features) {
            feature.setVisible(false);
        }
    }

    private void startTimer() {
        timer = new Timer(2000, e -> {
            // Hide the current feature
            features[currentIndex].setVisible(false);

            // Move to the next feature
            currentIndex++;
            if (currentIndex >= features.length) {
                currentIndex = 0;
            }

            // Show the next feature
            features[currentIndex].setVisible(true);
        });

        timer.setInitialDelay(0);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFeatures::new);
    }
    
    public Font loadFonts(int i) {
        FontManager fontManager = new FontManager();

        // Set the desired font for lblTitle
        return fontManager.registerFonts(i);
    }

}
