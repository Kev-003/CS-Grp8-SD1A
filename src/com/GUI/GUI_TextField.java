package com.GUI;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import javax.swing.BorderFactory;
import com.GUI.Fonts.FontManager;
import javax.swing.border.Border;

public final class GUI_TextField extends JTextField {
    
    public Color txtBackgroundColor = new Color(0,0,0,0);
    public Color txtOutlineColor = new Color(242,242,242);
    public Color txtForegroundColor = new Color(242,242,242);
    public Border border = BorderFactory.createLineBorder(txtOutlineColor);
    
    public GUI_TextField() {
        this.setPreferredSize(new Dimension(185, 45));
        setBackground(txtBackgroundColor);
        setForeground(txtForegroundColor);
        setBorder(border);
        setFont(new Font(loadFonts(9).getFontName(),Font.BOLD,45));
    }
    
    public Font loadFonts(int i) {
        FontManager fontManager = new FontManager();

        // Set the desired font for lblTitle
        return fontManager.registerFonts(i);
    }
    
    
}
