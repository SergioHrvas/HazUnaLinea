package Vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author andres
 */
public class CuentaRrevoluciones extends javax.swing.JPanel {
    Salpicadero s;
    /**
     * Creates new form CuentaRevoluciones
     */
    public CuentaRrevoluciones(Salpicadero s) {
        this.s=s;
        initComponents();
    }
    
    public void actualizarCuentaRevoluciones(){
        revsLabel.setText(String.format("%.0f", s.getObjetivo().getRevs()));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        revsLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentarrevoluciones"));

        revsLabel.setText(revsLabel.getText());
        revsLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("RPM"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(revsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(revsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel revsLabel;
    // End of variables declaration//GEN-END:variables
}
