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
import com.k33ptoo.components.KButton;

public class GUI_Button extends com.k33ptoo.components.KButton {

    public Color kBorderColor = new Color(0, 0, 0, 0);
    public Color kBorderHoverColor = new Color(242, 242, 242);

    public Color getkBorderColor() {
        return kBorderColor;
    }

    public void setkBorderColor(Color kBorderColor) {
        this.kBorderColor = kBorderColor;
    }

    public Color getkBorderHoverColor() {
        return kBorderHoverColor;
    }

    public void setkBorderHoverColor(Color kBorderHoverColor) {
        this.kBorderHoverColor = kBorderHoverColor;
    }

    public GUI_Button() {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                if (contains(me.getX(), me.getY())) {
                    mouseEntered = true;
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                mouseExited = true;
                mouseEntered = false;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePressed = false;
                mouseReleased = true;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mousePressed = true;
                mouseReleased = false;
            }

        };
        addMouseListener(mouseAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        super.setContentAreaFilled(false);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (mousePressed == true) {
            g2.setPaint(kPressedColor);
            if (iskAllowTab()) {
                Component[] comp = getParent().getComponents();
                for (int i = 0; i < comp.length; i++) {
                    if (comp[i] instanceof KButton) {

                        ((KButton) comp[i]).setSelected(false);
                        ((KButton) comp[i]).setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, kIndicatorColor));
                    }
                }
                this.setBorder(BorderFactory.createMatteBorder(0, kIndicatorThickness, 0, 0, kIndicatorColor));
                this.setSelected(true);
            }

        } else {
            if (kAllowGradient == true) {
                GradientPaint gp = new GradientPaint(0, 0, kStartColor, 300, getHeight(), kEndColor);
                g2.setPaint(gp);
                setForeground(kForeGround);
                if (mouseEntered) {
                    gp = new GradientPaint(0, 0, kHoverStartColor, 300, getHeight(), kHoverEndColor);
                    g2.setPaint(gp);
                    setForeground(kHoverForeGround);
                    setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, kBorderHoverColor));
                } else if (mouseExited) {
                    gp = new GradientPaint(0, 0, kStartColor, 300, getHeight(), kEndColor);
                    g2.setPaint(gp);
                    setForeground(kForeGround);
                    setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, kBorderColor));
                }

            } else {

                if (mouseEntered) {
                    g2.setPaint(kHoverColor);
                    g2.fillRoundRect(0, 0, getWidth(), getHeight(), kBorderRadius, kBorderRadius);
                    setForeground(kHoverForeGround);
                    setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, kBorderHoverColor));
                } else if (mouseExited) {
                    g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, kBorderRadius, kBorderRadius);
                    g2.setPaint(kBackGroundColor);
                    setForeground(kForeGround);
                    setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, kBorderColor));

                } else {
                    g2.setPaint(kBackGroundColor);
                }

            }
        }
        // g2.fillRect(0, 0, getWidth(), getHeight());
        if (isSelected()) {
            g2.setPaint(kSelectedColor);
            setForeground(kForeGround);
        }
        if (kFillButton == true) {
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), kBorderRadius, kBorderRadius);
        }
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, kBorderRadius, kBorderRadius);
        // The drawString(string) must be put after the setPaint(gradient)
        g2.setPaint(Color.BLACK);
        centerString(g, new Rectangle(getWidth(), getHeight()), getText(), getFont());

        // draw account
//        try {
//            getIcon().paintIcon(this, g2, getHeight()/2, 4);
//        } catch (Exception e) {
//        }
        drawIcons(g, new Rectangle(0, 0, getWidth(), getHeight()));
        //dispose
        g2.dispose();

    }

}
