package com.GUI.Fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FontManager {

    String[] fontPaths = {
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaUltrabold_2.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaBlack.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaBlackItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaBold.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaBoldItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaHeavy.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaHeavyItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaLight.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaLightItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaMedium.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaMediumItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaRegular.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaRegularItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaSemibold.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaSemiboldItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaThin.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaThinItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaUltrabold.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\JavaApplication33\\src\\com\\GUI\\Fonts\\QuinoaUltraboldItalics.ttf"
    };

    public Font registerFonts(int i) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(fontPaths[i]));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (IOException | FontFormatException e) {
            //Handle exception
        }
        return null;
    }
}
