package com.GUI;

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
import javax.swing.JButton;
import com.GUI.Fonts.FontManager;

public class GUI_Button extends JButton {

    public Color btnBackGroundColor = Color.magenta;
    public Color btnStartColor = new Color(51, 57, 140);
    public Color btnEndColor = Color.GREEN;
    public Color btnHoverColor = new Color(242,242,242);
    public Color btnHoverForeGround = Color.magenta;
    public Color btnHoverOutline = new Color(7,7,7);
    public boolean btnAllowGradient = true;
    public int btnBorderRadius = 10;
    private boolean mouseExited = false;
    private boolean mouseEntered = false;
    private boolean mousePressed = false;
    private boolean mouseReleased = false;
    public boolean btnFillButton = true;
    public Color btnForeGround = new Color(242,242,242);
    public Color btnSelectedColor = Color.magenta;
    public Color btnPressedColor = Color.LIGHT_GRAY;
    public int btnIndicatorThickness = 2;
    public Color btnIndicatorColor = Color.white;
    public boolean btnAllowTab = false;
    
    
    
    private void loadFonts() {
        String[] fontPaths = {
            "QuinoaUltrabold_2.otf",
            "QuinoaBlack.otf",
            "QuinoaBlackItalics.otf",
            "QuinoaBold.otf",
            "QuinoaBoldItalics.otf",
            "QuinoaHeavy.otf",
            "QuinoaHeavyItalics.otf",
            "QuinoaLight.otf",
            "QuinoaLightItalics.otf",
            "QuinoaMedium.otf",
            "QuinoaMediumItalics.otf",
            "QuinoaRegular.otf",
            "QuinoaRegularItalics.otf",
            "QuinoaSemibold.otf",
            "QuinoaSemiboldItalics.otf",
            "QuinoaThin.otf",
            "QuinoaThinItalics.otf",
            "QuinoaUltrabold.otf",
            "QuinoaUltraboldItalics.otf"
        };
        
        FontManager.loadFont(fontPaths, 15f);
        
    }
    
    
    
}
