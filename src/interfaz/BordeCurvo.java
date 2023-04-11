/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author PSN
 */
public class BordeCurvo extends AbstractBorder {
    private Color colorBorde;
    private int radio;

    public BordeCurvo(Color colorBorde, int radio) {
        this.colorBorde = colorBorde;
        this.radio = radio;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(colorBorde);
        g.drawRoundRect(x, y, width - 1, height - 1, radio, radio);
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(radio + 1, radio + 1, radio + 2, radio);
    }

    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.right = radio + 1;
        insets.top = radio + 1;
        insets.bottom = radio + 2;
        return insets;
    }

    public boolean isBorderOpaque() {
        return true;
    }
}
