/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.creerapplication;

import javax.swing.JOptionPane;
import sn.ugb.ipsl.DataAccessObject.FiliereDaoImplementation;

/**
 *
 * @author lenov
 */
public class Modify extends javax.swing.JPanel {
    FiliereDaoImplementation filiere=new FiliereDaoImplementation();
    /**
     * Creates new form Modify
     */
    public Modify() {
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

        ancienTextField = new javax.swing.JTextField();
        nouveauTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(null);
        add(ancienTextField);
        ancienTextField.setBounds(40, 150, 130, 20);
        add(nouveauTextField);
        nouveauTextField.setBounds(230, 150, 140, 20);

        jLabel1.setText(" Nom");
        add(jLabel1);
        jLabel1.setBounds(80, 110, 24, 14);

        jLabel2.setText("Nouveau Nom");
        add(jLabel2);
        jLabel2.setBounds(260, 120, 80, 14);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(0, 250, 73, 23);

        jButton2.setText("Modify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(320, 250, 73, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ancienTextField.setText("");
        nouveauTextField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String ancien=ancienTextField.getText();
       String nouveau=nouveauTextField.getText();
       if (ancien==null ||ancien.isBlank()|| nouveau==null){
           JOptionPane.showMessageDialog(this, "champs Obligatoire", "ERREUR",JOptionPane.ERROR_MESSAGE);
           return;
       }
       filiere.modifierFiliere(ancien, nouveau);
       EcolFormApp app=EcolFormApp.getInstance();
       app.setContentPane(new Listeretudiant());
       revalidate();
        repaint();
        JOptionPane.showMessageDialog(this, "Filiere Modifier", "ERREUR",JOptionPane.INFORMATION_MESSAGE);
        ancienTextField.setText("");
        nouveauTextField.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ancienTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nouveauTextField;
    // End of variables declaration//GEN-END:variables
}
