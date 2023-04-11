/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Cambio;
import Clases.Medida;
import java.awt.Color;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author PSN
 */
public final class Horario extends javax.swing.JFrame {

    /**
     * Creates new form Moneda
     */
    private List<Medida> sistemaMonedas;
    private Medida SMSeleccionado;
    private Cambio CambioMoneda;
    
    public Horario(List<Medida> sMonedas) {
        initComponents();
        this.sistemaMonedas = sMonedas;
        this.jH1.setBorder(new BordeCurvo(Color.BLACK, 10));
        this.jH2.setBorder(new BordeCurvo(Color.BLACK, 10));
        this.jM1.setBorder(new BordeCurvo(Color.BLACK, 10));
        this.jS1.setBorder(new BordeCurvo(Color.BLACK, 10));
        this.jM2.setBorder(new BordeCurvo(Color.BLACK, 10));
        this.jS2.setBorder(new BordeCurvo(Color.BLACK, 10));
        
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(smonedas().toArray(new String[0]));
        ComboM1.setModel(model);
        
        ecombo1();
        ecombo2();
        eventoM1();
        ComboM1.setSelectedItem(ComboM1.getItemAt(0));
        
    }

    public Medida getSMSeleccionado() {
        return SMSeleccionado;
    }

    public void setSMSeleccionado(Medida SMSeleccionado) {
        this.SMSeleccionado = SMSeleccionado;
    }

    public Cambio getCambioMoneda() {
        return CambioMoneda;
    }

    public void setCambioMoneda(Cambio CambioMoneda) {
        this.CambioMoneda = CambioMoneda;
    }
    
    public ArrayList<String> smonedas(){
        ArrayList<String> lista = new ArrayList<>();
        sistemaMonedas.forEach((a) -> {
            if(a.getTipo().equals("hora"))
            lista.add(a.getNombre());
        });
        return lista;
    }
    
    public String my23(int h){
        if(h>23){
            h = h-24;
        }else if(h < 0){
            h = h + 24;
        }
        
        return Integer.toString(h);
    }
    
    public void eventoM1(){
        jH1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Se ha insertado texto en el JTextField");
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(!jH1.getText().equals("")){
                    System.out.println("Se ha eliminado texto del JTextField");
                    int cantidad = Integer.parseInt(jH1.getText());
                    int conver = (int) getCambioMoneda().getValor();
                    jH2.setText(my23(cantidad + conver));
                    jM2.setText(jM1.getText());
                    jS2.setText(jS1.getText());
                }else{
                    jH2.setText("0");
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Se ha cambiado el texto del JTextField");
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }
        });
        jM1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Se ha insertado texto en el JTextField");
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(!jH1.getText().equals("")){
                    System.out.println("Se ha eliminado texto del JTextField");
                    int cantidad = Integer.parseInt(jH1.getText());
                    int conver = (int) getCambioMoneda().getValor();
                    jH2.setText(my23(cantidad + conver));
                    jM2.setText(jM1.getText());
                    jS2.setText(jS1.getText());
                }else{
                    jH2.setText("0");
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Se ha cambiado el texto del JTextField");
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }
        });
        jS1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Se ha insertado texto en el JTextField");
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(!jH1.getText().equals("")){
                    System.out.println("Se ha eliminado texto del JTextField");
                    int cantidad = Integer.parseInt(jH1.getText());
                    int conver = (int) getCambioMoneda().getValor();
                    jH2.setText(my23(cantidad + conver));
                    jM2.setText(jM1.getText());
                    jS2.setText(jS1.getText());
                }else{
                    jH2.setText("0");
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Se ha cambiado el texto del JTextField");
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }
        });
    }
    
    public void ecombo1(){
        ComboM1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el elemento seleccionado del primer JComboBox
                String seleccion = (String) ComboM1.getSelectedItem();
                asignarSM(seleccion);
                // Modificar el segundo JComboBox en función del elemento seleccionado
                ComboM2.setModel(new DefaultComboBoxModel<>(getSMSeleccionado().listaCambios().toArray(new String[0])));
                ComboM2.setSelectedItem(ComboM2.getItemAt(0));
                
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }
        });
    }
    
    public void ecombo2(){
        ComboM2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el elemento seleccionado del primer JComboBox
                String seleccion = (String) ComboM2.getSelectedItem();
                setCambioMoneda(getSMSeleccionado().retornarCambioValor(seleccion));//problema aqui
                System.out.println(getCambioMoneda().getValor());
                
                int cantidad = Integer.parseInt(jH1.getText());
                int conver = (int) getCambioMoneda().getValor();
                jH2.setText(my23(cantidad + conver));
                jM2.setText(jM1.getText());
                jS2.setText(jS1.getText());
            }
        });
    }
    
    public void asignarSM(String selec){
        sistemaMonedas.forEach((a) ->{
            if(a.getNombre().equals(selec)){
                setSMSeleccionado(a);
            }
        });
    }
    
    public List<Medida> getSistemaMonedas() {
        return sistemaMonedas;
    }

    public void setSistemaMonedas(List<Medida> sistemaMonedas) {
        this.sistemaMonedas = sistemaMonedas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jH1 = new javax.swing.JTextField();
        ComboM1 = new javax.swing.JComboBox<>();
        ComboM2 = new javax.swing.JComboBox<>();
        jH2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jM1 = new javax.swing.JTextField();
        jS1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jM2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jS2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(520, 350));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de Horarios");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jH1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jH1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jH1.setText("12");
        jH1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jH1KeyTyped(evt);
            }
        });

        ComboM1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ComboM1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboM1.setOpaque(false);

        ComboM2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ComboM2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jH2.setEditable(false);
        jH2.setBackground(new java.awt.Color(255, 255, 255));
        jH2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jH2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jH2.setText("00");
        jH2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jH2KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText(":");

        jM1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jM1.setText("00");
        jM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jM1KeyTyped(evt);
            }
        });

        jS1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jS1.setText("00");
        jS1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jS1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setText(":");

        jM2.setEditable(false);
        jM2.setBackground(new java.awt.Color(255, 255, 255));
        jM2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jM2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jM2.setText("00");
        jM2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jM2KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setText(":");

        jS2.setEditable(false);
        jS2.setBackground(new java.awt.Color(255, 255, 255));
        jS2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jS2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jS2.setText("00");
        jS2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jS2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboM1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboM2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Inicio ini = new Inicio(sistemaMonedas);
        ini.setLocationRelativeTo(null);
        ini.setSize(400, 520);
        ini.setResizable(false);
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jH2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jH2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jH2KeyTyped

    private void jH1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jH1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // No permite el ingreso de caracteres no numericos
        } else {
            String text = jH1.getText() + c;
            try {
                int value = Integer.parseInt(text);
                if (value < 0 || value > 23) {
                    evt.consume(); // No permite el ingreso de numeros fuera del rango 0-24
                }
            } catch (NumberFormatException ex) {
                evt.consume(); // No permite el ingreso de numeros invalidos
            }
        }
    }//GEN-LAST:event_jH1KeyTyped

    private void jM1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jM1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // No permite el ingreso de caracteres no numericos
        } else {
            String text = jM1.getText() + c;
            try {
                int value = Integer.parseInt(text);
                if (value < 0 || value > 59) {
                    evt.consume(); // No permite el ingreso de numeros fuera del rango 0-24
                }
            } catch (NumberFormatException ex) {
                evt.consume(); // No permite el ingreso de numeros invalidos
            }
        }
    }//GEN-LAST:event_jM1KeyTyped

    private void jS1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jS1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // No permite el ingreso de caracteres no numericos
        } else {
            String text = jS1.getText() + c;
            try {
                int value = Integer.parseInt(text);
                if (value < 0 || value > 59) {
                    evt.consume(); // No permite el ingreso de numeros fuera del rango 0-24
                }
            } catch (NumberFormatException ex) {
                evt.consume(); // No permite el ingreso de numeros invalidos
            }
        }
    }//GEN-LAST:event_jS1KeyTyped

    private void jM2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jM2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jM2KeyTyped

    private void jS2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jS2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jS2KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboM1;
    private javax.swing.JComboBox<String> ComboM2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jH1;
    private javax.swing.JTextField jH2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jM1;
    private javax.swing.JTextField jM2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jS1;
    private javax.swing.JTextField jS2;
    // End of variables declaration//GEN-END:variables
}
