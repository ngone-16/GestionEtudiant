/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.service;

import java.util.List;
import sn.ugb.ipsl.DataAccessObject.EtudiantDaoImplementation;
import sn.ugb.ipsl.DataAccessObject.PrenomDataInvalid;
import sn.ugb.ipsl.entity.Etudiant;

/**
 *
 * @author lenov
 */
public class EtudiantServiceImplem implements InterfaceEtudiantService {

    private final EtudiantDaoImplementation etudiantDao = new EtudiantDaoImplementation();
    
    /* @Override
    public void ajouterEtudiant(Etudiant e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    @Override
    public void saveEtudiant(Etudiant e) throws PrenomDataInvalid {
        etudiantDao.saveEtudiant(e);
    }

    @Override
    public List<Etudiant> getEtudiants() {
        return etudiantDao.getEtudiants();
       
    }

    @Override
    public void saveEtudiant(List<Etudiant> etudiants) throws PrenomDataInvalid {
        for (Etudiant etudiant : etudiants) {
            etudiantDao.saveEtudiant(etudiant);
        }
    }


    @Override
    public List<Etudiant> getEtudiantsFilieres(String EF) {
    return etudiantDao.getEtudiantsFilieres(EF);
    }

    @Override
    public List<Etudiant> getEtudiantsFilNiv(String EF, String EN) {
    return etudiantDao.getEtudiantsFilNiv(EF,EN);
    }

}
