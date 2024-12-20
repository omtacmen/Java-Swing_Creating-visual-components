/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jpanelimagen;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author olivertm
 */
public class ImagenFondoJPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form ImagenFondoJPanelForm
     */
    public ImagenFondoJPanelForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRuta = new javax.swing.JTextField();
        jButtonAbrirRuta = new javax.swing.JButton();
        jSliderOpacidad = new javax.swing.JSlider();

        jLabel1.setText("Ruta imagen:");

        jLabel2.setText("Opacidad:");

        jTextFieldRuta.setEditable(false);

        jButtonAbrirRuta.setText("...");
        jButtonAbrirRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonAbrirRuta))
                    .addComponent(jSliderOpacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrirRuta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirRutaActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
        // mostramos el dialogo de elegir el archivo
        int resultado = fileChooser.showOpenDialog(this);
        // Como el usuario puede darle al dialogo: cancelar o aceptar el archivo, pues comprobamos
        // Que el usuario selecciona un archivo y le da a ACEPTAR.
        if (resultado == JFileChooser.APPROVE_OPTION)
        {
            // Entonces ahora seleccionamos el archivo.
            File file = fileChooser.getSelectedFile();
            // Y escribimos la ruta del archivo en el campo de texto.
            jTextFieldRuta.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonAbrirRutaActionPerformed

    // Hacemos método publico que devuelva el valor del fichero y la opacidad
    // de la clase ImagenFondo
    public ImagenFondo getSelectedValue()
    {
        File f = new File(jTextFieldRuta.getText());
        Float opacidad = jSliderOpacidad.getValue()/100f;
        return new ImagenFondo(f, opacidad);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSliderOpacidad;
    private javax.swing.JTextField jTextFieldRuta;
    // End of variables declaration//GEN-END:variables
}
