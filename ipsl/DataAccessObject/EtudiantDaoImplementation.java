/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.DataAccessObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.ugb.ipsl.entity.Etudiant;

/**
 *
 * @author lenov
 */
public class EtudiantDaoImplementation implements InterfaceEtudiantDao {
    //private static final SimpleDateFormat SQL_FORMAT=new SimpleDateFormat("yyyy-MM-dd");

    public EtudiantDaoImplementation() {
    }

    /*@Override
    public void ajouterEtudiant(Etudiant e) {
    }*/
    @Override
    public void saveEtudiant(Etudiant e) throws PrenomDataInvalid {
        int id = e.getId();
        String prenom = e.getPrenom();
        String nom = e.getNom();
        String dateNaissance = e.getDateNaissance();
        String filiere = e.getFiliere();
        String niveau = e.getNiveau();
        

        if (prenom == null || prenom.isBlank()) {
            throw new PrenomDataInvalid("Prenom Obligatoire");
        }
        /*if (nom==null || nom.isBlank()){
            throw new PrenomDataInvalid("Nom Obligatoire"); 
        }*/

        String requete = "INSERT INTO etudiant(ID,PRENOM,NOM,DATENAISSANCE,NIVEAU,FILIERE) VALUES(" + id + ",'" + nom + "','" + prenom + "','" + dateNaissance + "','" + niveau + "','" + filiere + "')";
        System.out.println("requete=" + requete);

        try {
            Statement st = DbaseUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Etudiant> getEtudiants() {
        
        String requete = "select * from etudiant";
        ResultSet lst = null;
        List <Etudiant> e = new ArrayList<>();
        try {
            Statement st = DbaseUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           while (lst.next()) {
                int id = lst.getInt("id");
                String nom = lst.getString("nom");
                String prenom = lst.getString("prenom");
                String datenaissance = lst.getString("dateNaissance");
                String niveau = lst.getString("niveau");
                String filiere = lst.getString("filiere");
                
                e.add(new Etudiant(id,nom,prenom,datenaissance, niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        return e;
    }
 @Override
    public List<Etudiant> getEtudiantsFilieres(String EF) {
    String requete = "select * from etudiant where FILIERE='"+EF+"' ";
        ResultSet lst = null;
        List <Etudiant> e = new ArrayList<>();
        try {
            Statement st = DbaseUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           while (lst.next()) {
                int id = lst.getInt("id");
                String nom = lst.getString("nom");
                String prenom = lst.getString("prenom");
                String datenaissance = lst.getString("dateNaissance");
                String niveau = lst.getString("niveau");
                String filiere = lst.getString("filiere");
                
                e.add(new Etudiant(id,nom,prenom,datenaissance, niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        return e;
    }

    @Override
    public List<Etudiant> getEtudiantsFilNiv(String EF, String EN) {
    String requete = "select * from etudiant where FILIERE='"+EF+"' AND NIVEAU='"+EN+"' ";
        ResultSet lst = null;
        List <Etudiant> e = new ArrayList<>();
        try {
            Statement st = DbaseUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           while (lst.next()) {
                int id = lst.getInt("id");
                String nom = lst.getString("nom");
                String prenom = lst.getString("prenom");
                String datenaissance = lst.getString("dateNaissance");
                String niveau = lst.getString("niveau");
                String filiere = lst.getString("filiere");
                
                e.add(new Etudiant(id,nom,prenom,datenaissance, niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        return e;
    }
}
