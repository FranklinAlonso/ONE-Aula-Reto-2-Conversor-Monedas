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
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author PSN
 */
public final class Moneda extends javax.swing.JFrame {

    /**
     * Creates new form Moneda
     */
    private List<Medida> sistemaMonedas;
    private Medida SMSeleccionado;
    private Cambio CambioMoneda;
    
    public Moneda(List<Medida> sMonedas) {
        initComponents();
        this.sistemaMonedas = sMonedas;
        this.jTextMoneda1.setBorder(new BordeCurvo(Color.BLACK, 10));
        this.jTextMoneda2.setBorder(new BordeCurvo(Color.BLACK, 10));
        
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
            if(a.getTipo().equals("moneda"))
            lista.add(a.getNombre());
        });
        return lista;
    }
    
    public void eventoM1(){
        jTextMoneda1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Se ha insertado texto en el JTextField");
                float cantidad = Float.parseFloat(jTextMoneda1.getText());
                float conver = getCambioMoneda().getValor();
                jTextMoneda2.setText(Float.toString(cantidad * conver));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(!jTextMoneda1.getText().equals("")){
                    System.out.println("Se ha eliminado texto del JTextField");
                    float cantidad = Float.parseFloat(jTextMoneda1.getText());
                    float conver = getCambioMoneda().getValor();
                    jTextMoneda2.setText(Float.toString(cantidad * conver));
                }else{
                    jTextMoneda2.setText("0");
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Se ha cambiado el texto del JTextField");
                float cantidad = Float.parseFloat(jTextMoneda1.getText());
                float conver = getCambioMoneda().getValor();
                jTextMoneda2.setText(Float.toString(cantidad * conver));
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
                
                float cantidad = Float.parseFloat(jTextMoneda1.getText());
                float conver = getCambioMoneda().getValor();
                jTextMoneda2.setText(Float.toString(cantidad * conver));
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
                
                float cantidad = Float.parseFloat(jTextMoneda1.getText());
                float conver = getCambioMoneda().getValor();
                jTextMoneda2.setText(Float.toString(cantidad * conver));
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
        jTextMoneda1 = new javax.swing.JTextField();
        ComboM1 = new javax.swing.JComboBox<>();
        ComboM2 = new javax.swing.JComboBox<>();
        jTextMoneda2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(520, 350));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de Monedas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextMoneda1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextMoneda1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextMoneda1.setText("0");
        jTextMoneda1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMoneda1KeyTyped(evt);
            }
        });

        ComboM1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ComboM1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboM1.setOpaque(false);

        ComboM2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ComboM2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextMoneda2.setEditable(false);
        jTextMoneda2.setBackground(new java.awt.Color(255, 255, 255));
        jTextMoneda2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextMoneda2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextMoneda2.setText("0");
        jTextMoneda2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMoneda2KeyTyped(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextMoneda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboM1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextMoneda2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboM2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
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
                    .addComponent(jTextMoneda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMoneda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
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

    private void jTextMoneda1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMoneda1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume(); // Ignora el carácter ingresado
        }
    }//GEN-LAST:event_jTextMoneda1KeyTyped

    private void jTextMoneda2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMoneda2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume(); // Ignora el carácter ingresado
        }
    }//GEN-LAST:event_jTextMoneda2KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboM1;
    private javax.swing.JComboBox<String> ComboM2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextMoneda1;
    private javax.swing.JTextField jTextMoneda2;
    // End of variables declaration//GEN-END:variables
}
