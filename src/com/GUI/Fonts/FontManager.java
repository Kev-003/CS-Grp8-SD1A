package com.GUI.Fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class FontManager {
    
    
    public static Font loadFont(String[] fontPaths, float size) {
        
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            for (String fontPath : fontPaths) {
                File fontFile = new File(fontPath);
                Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(size);
                ge.registerFont(font);
            }
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            // Handle font loading errors
        }
        return null;
    }
}
