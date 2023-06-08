package com.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.MalformedURLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash_Screen extends JWindow {

    private final JPanel contentPane;

    public static void main(String[] args) {
        try {
            Splash_Screen splashScreen = new Splash_Screen();
            splashScreen.showSplashScreen();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Splash_Screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Splash_Screen() throws MalformedURLException {
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        setLayout(new BorderLayout());
        
        Icon imageIcon = new ImageIcon(Splash_Screen.class.getResource("/com/images/ShadiFinTech-Logo.png"));
        JLabel imageLabel = new JLabel(imageIcon);

        contentPane.add(imageLabel, BorderLayout.CENTER);

        setAlwaysOnTop(true);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0f));
        setBounds(new Rectangle(100, 100, 513, 331));

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
    }

    public void showSplashScreen() {
        setVisible(true);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                java.awt.EventQueue.invokeLater(() -> {
                    dispose();
                });
            }
        }, 4000);
    }

}
