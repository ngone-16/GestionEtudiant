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
import sn.ugb.ipsl.entity.Filiere;

/**
 *
 * @author lenov
 */
public class FiliereDaoImplementation implements InterfaceFiliereDao {

    public FiliereDaoImplementation() {
    }

    @Override
    public void saveFiliere(Filiere f) throws NomFDataInvalid {
        //int idF = f.getIdF();
        String nomF = f.getNomF();
        if (nomF == null || nomF.isBlank()) {
            throw new NomFDataInvalid("NomF Obligatoire");
        }
        String requete = "INSERT INTO filiere(NOMF) VALUES('" + nomF + "')";
        System.out.println("requete=" + requete);

        try {
            Statement st = DbaseUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteFiliere(Filiere f) {
    /*var requete = "DELETE FROM filiere WHERE IdF='?'";
        System.out.println("requete=" + requete);

        try {
            Statement st = DbaseUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    @Override
    public List<Filiere> getFilieres() {
     String requete = "select * from filiere";
        ResultSet lst = null;
        List <Filiere> e = new ArrayList<>();
        try {
            Statement st = DbaseUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(FiliereDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           while (lst.next()) {
                String nom = lst.getString("nomF");
                
                
                e.add(new Filiere(nom));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        return e;}

    @Override
    public int getNbreFiliere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifierFiliere(String ancien, String nouveau) {
        String requete="update filiere set nomF='"+nouveau+"'where nomF='"+ancien+"'";
        try {
            Statement s=DbaseUtils.getConnection().createStatement();
            s.executeUpdate(requete);
        } catch (Exception e) {
            Logger.getLogger(EtudiantDaoImplementation.class.getName()).log(Level.SEVERE,null,e);
        }
    }

   

}
