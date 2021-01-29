/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.creerapplication;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.ugb.ipsl.DataAccessObject.DbaseUtils;

/**
 *
 * @author lenov
 */
public class ListEtudNiv extends javax.swing.JPanel {

    /**
     * Creates new form ListEtudNiv
     */
    public ListEtudNiv() {
        initComponents();

        ResultSet res = null;
        try {
            res = DbaseUtils.getConnection().createStatement().executeQuery("select nomF from filiere");
        } catch (Exception ex) {
            Logger.getLogger(ListeEtudFiliere.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] Filiere = new String[10];
        int i = 0;
        try {
            while (res.next()) {
                Filiere[i] = res.getString("nomF");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionDesEtudiants.class.getName()).log(Level.SEVERE, null, ex);
        }
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(Filiere));

        ComboBox1.addActionListener((ActionEvent e) -> {
            
            ComboBox2.addActionListener((ActionEvent f) -> {
                Table1.setModel(new EtudiantFilNivTableModel(ComboBox1.getSelectedItem().toString(), ComboBox2.getSelectedItem().toString()));
                });
            
        });
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
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste Etudiants Niveau", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 0, 255))); // NOI18N
        jPanel1.setLayout(null);

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ComboBox1);
        ComboBox1.setBounds(120, 92, 145, 20);

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licence1", "Licence2", "Licence3", "Master1","Master2" }));
        jPanel1.add(ComboBox2);
        ComboBox2.setBounds(415, 92, 138, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Filiere");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(158, 60, 50, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Niveau");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 60, 60, 15);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 120, 610, 402);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 520);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JTable Table1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
