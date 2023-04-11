/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author PSN
 */
public class TimeTextField extends JTextField {
    public TimeTextField() {
        // Establece el tamaño máximo del JTextField
        setColumns(8);
        
        // Establece el formato inicial del JTextField
        setText("00:00:00");
        
        // Limita los caracteres que se pueden ingresar en el JTextField
        AbstractDocument document = (AbstractDocument) getDocument();
        document.setDocumentFilter(new TimeFilter());
        
        // Agrega un KeyListener para permitir solo los caracteres válidos
        addKeyListener(new TimeKeyListener());
        
        // Agrega un FocusListener para seleccionar todo el texto al hacer clic en el JTextField
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                selectAll();
            }
        });
    }

    private static class TimeFilter extends DocumentFilter {
        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            String oldText = fb.getDocument().getText(0, fb.getDocument().getLength());
            String newText = oldText.substring(0, offset) + text + oldText.substring(offset + length);
            if (!isValidTime(newText)) {
                return;
            }
            super.replace(fb, offset, length, text, attrs);
        }

        private boolean isValidTime(String text) {
            String[] parts = text.split(":");
            if (parts.length != 3) {
                return false;
            }
            try {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
                int seconds = Integer.parseInt(parts[2]);
                return (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59);
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    private static class TimeKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c) || c == ':')) {
                e.consume(); // Ignora el carácter ingresado
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // No es necesario hacer nada aquí
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // No es necesario hacer nada aquí
        }
    }
    
}
