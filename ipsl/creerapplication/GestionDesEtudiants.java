/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.creerapplication;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sn.ugb.ipsl.DataAccessObject.DbaseUtils;
import sn.ugb.ipsl.DataAccessObject.PrenomDataInvalid;
import sn.ugb.ipsl.entity.Etudiant;
import sn.ugb.ipsl.service.EtudiantServiceImplem;
import sn.ugb.ipsl.service.InterfaceEtudiantService;

/**
 *
 * @author lenov
 */
public class GestionDesEtudiants extends javax.swing.JPanel {

    private InterfaceEtudiantService etudiantService = new EtudiantServiceImplem();
    Connection cnx = null;
    ResultSet res = null;
    private JTable table;
    PreparedStatement prepared = null;

    //JComboBox fEtudComboBox;
    /**
     * Creates new form GestionDesEtudiant
     */
    public GestionDesEtudiants() {
        initComponents();
         ResultSet res = null;
        try {
            res = DbaseUtils.getConnection().createStatement().executeQuery("select nomF from filiere");
        } catch (Exception ex) {
            Logger.getLogger(GestionDesEtudiants.class.getName()).log(Level.SEVERE, null, ex);
        }
         String [] Filiere = new String[10];
       int i=0;
        try {
            while (res.next()) {
                Filiere[i]=res.getString("nomF");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionDesEtudiants.class.getName()).log(Level.SEVERE, null, ex);
        }
        fEtudComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(Filiere) );
       anneeTextField.setText("2021");
        prenomErrorLabel1.setText("");
        
        
    }

    
    
     public void afficherTable(){
          //String querry;
       String f1;
       f1 = fEtudComboBox.getSelectedItem().toString();
       fEtudComboBox.addActionListener((ActionEvent e) -> {
           afficherTable();
          
       });
       
       
     }
        /* try {
            prepared = cnx.prepareStatement(sql);
            res = prepared.executeQuery();
            while (res.next()) {
                String nom = res.getString("NOMF").toString();
                fEtudComboBox.addItem(nom);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    

    /*public ArrayList<Etudiant> usersList() {
        ArrayList<Etudiant> usersList = new ArrayList();
        try {
            Connection c = DbaseUtils.getConnection();
            String query1 = "SELECT *FROM etudiant";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Etudiant etudiant;
            while (rs.next()) {
                etudiant = new Etudiant(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("dateNaissance"), rs.getString("niveau"), rs.getString("filiere"));
                usersList.add(etudiant);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }

    public void show_users() {
        ArrayList<Etudiant> list = usersList();
        DefaultTableModel model = (DefaultTableModel) TableEtudiant1.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getPrenom();
            row[2] = list.get(i).getNom();
            row[3] = list.get(i).getDateNaissance();
            row[4] = list.get(i).getNiveau();
            row[5] = list.get(i).getFiliere();
            model.addRow(row);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        prenomTextField = new javax.swing.JTextField();
        nomTextField = new javax.swing.JTextField();
        datNaisTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prenomErrorLabel1 = new javax.swing.JLabel();
        enregistrerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        anneeTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nivFilComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fEtudComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        quitterButton1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Prenom:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nom:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Date Lieu Naissance:");

        idTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        prenomTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nomTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        datNaisTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Prenom:");

        prenomErrorLabel1.setForeground(new java.awt.Color(204, 0, 0));
        prenomErrorLabel1.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datNaisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(prenomErrorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prenomErrorLabel1)
                        .addGap(79, 79, 79)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datNaisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(103, 103, 103))
        );

        enregistrerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enregistrerButton.setText("Save");
        enregistrerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerButtonActionPerformed(evt);
            }
        });

        annulerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        annulerButton.setText("Cancel");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        anneeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        anneeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anneeTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Annee");

        nivFilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licence1", "Licence2", "Licence3", "Master1","Master2" }));
        nivFilComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivFilComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Niveau:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Filiere:");

        fEtudComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fEtudComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEtudComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nivFilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEtudComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anneeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fEtudComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivFilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anneeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(53, 53, 53))
        );

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter Un Etudiant:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        quitterButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quitterButton1.setText("Exit");
        quitterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(quitterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(enregistrerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annulerButton)
                        .addGap(936, 936, 936))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 738, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitterButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enregistrerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annulerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enregistrerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerButtonActionPerformed

        String idString = idTextField.getText();
        String prenom = prenomTextField.getText();
        String nom = nomTextField.getText();
        String dateNaissance = datNaisTextField.getText();
        String niveau = nivFilComboBox.getSelectedItem().toString();
        String filiere = fEtudComboBox.getSelectedItem().toString();
        //Integer annee=anneeTextField.getText();

        Integer id = Integer.parseInt(idString);
        Etudiant e = new Etudiant();
        e.setId(id);
        e.setPrenom(prenom);
        e.setNom(nom);
        e.setDateNaissance(dateNaissance);
        e.setFiliere(filiere);
        e.setNiveau(niveau);
        if ((prenom != null || prenom.isBlank()) && (id != null)) {
            JOptionPane.showMessageDialog(null, "insertion Reussie");
            //show_users();
        } else {
            JOptionPane.showMessageDialog(null, "insertion impossible");
        }

        try {
            etudiantService.saveEtudiant(e);
        } catch (PrenomDataInvalid ex) {
            Logger.getLogger(GestionDesEtudiants.class.getName()).log(Level.SEVERE, null, ex);
            prenomErrorLabel1.setText(ex.getMessage());
            return;
        }
        /*EcolFormApp app1 = EcolFormApp.getInstance();
        app1.setContentPane(new ListeEtud());
        app1.revalidate();
        app1.repaint();
         //  Date date = DbaseUtils.SQL_FORMAT.parse(dateNaissance);
        /*String pwd = "";
        char[] pwdTab = codeTextField.getPassword();
        codeTextField.setText("");*/

 /*if (prenom == null || prenom.isBlank()) {
        //permet d'afficher des messages de dialoge
        JOptionPane.showMessageDialog(this, "Le Prenom est obligatoire", "Erreur Invalide", JOptionPane.ERROR_MESSAGE);
        //return pour quitter la methode
        return;
        }
        if (nom == null || nom.isBlank()) {
        //permet d'afficher des messages de dialoge
        JOptionPane.showMessageDialog(this, "Le Nom est obligatoire", "Erreur Invalide", JOptionPane.ERROR_MESSAGE);
        //return pour quitter la methode
        return;
        }

        /* for (char e : pwdTab) {
        pwd += e;
        }
        System.out.println("prenom=" + prenom + "nom=" + nom + "pwd=" + pwd);*/
        //EcolFormApp.getInstance().setContentPane(new ListeEtud());
    }//GEN-LAST:event_enregistrerButtonActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        idTextField.setText("");
        prenomTextField.setText("");
        nomTextField.setText("");
        datNaisTextField.setText("");
        //codeEtudiantTextField1.setText("");
    }//GEN-LAST:event_annulerButtonActionPerformed

    private void nivFilComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivFilComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivFilComboBoxActionPerformed

    private void anneeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anneeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anneeTextFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void fEtudComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEtudComboBoxActionPerformed
      /*  try {
            remplirCombobox();
        } catch (Exception ex) {
            Logger.getLogger(GestionDesEtudiants.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_fEtudComboBoxActionPerformed

    private void quitterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitterButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anneeTextField;
    private javax.swing.JButton annulerButton;
    private javax.swing.JTextField datNaisTextField;
    private javax.swing.JButton enregistrerButton;
    private javax.swing.JComboBox<String> fEtudComboBox;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> nivFilComboBox;
    private javax.swing.JTextField nomTextField;
    private javax.swing.JLabel prenomErrorLabel1;
    private javax.swing.JTextField prenomTextField;
    private javax.swing.JButton quitterButton1;
    // End of variables declaration//GEN-END:variables
}
