/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.service;

import java.util.List;
import sn.ugb.ipsl.DataAccessObject.FiliereDaoImplementation;
import sn.ugb.ipsl.DataAccessObject.NomFDataInvalid;
import sn.ugb.ipsl.entity.Filiere;

/**
 *
 * @author lenov
 */
public class FiliereServiceImplem implements InterfaceFiliereService {

    private final FiliereDaoImplementation filiereDao = new FiliereDaoImplementation();

    @Override
    public List<Filiere> getFilieres() {
        return filiereDao.getFilieres();
    }

    @Override
    public void deleteFiliere(Filiere f) {
        filiereDao.deleteFiliere(f);
    }

    @Override
    public void saveFiliere(List<Filiere> filieres) throws NomFDataInvalid {
        for (Filiere filiere : filieres) {
            filiereDao.saveFiliere(filiere);
        }
    }

    @Override
    public int getNbreFiliere() {
        return filiereDao.getNbreFiliere();
    }

    @Override
    public void saveFiliere(Filiere f) throws NomFDataInvalid {
        filiereDao.saveFiliere(f);
    }

    @Override
    public void modifierFiliere(String an, String nn) {
        filiereDao.modifierFiliere(an, nn);
    }

}
