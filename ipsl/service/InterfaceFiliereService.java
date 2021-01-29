/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.service;

import java.util.List;
import sn.ugb.ipsl.DataAccessObject.NomFDataInvalid;
import sn.ugb.ipsl.entity.Filiere;

/**
 *
 * @author lenov
 */
public interface InterfaceFiliereService {

    public void saveFiliere(Filiere f) throws NomFDataInvalid;

    public List<Filiere> getFilieres();

    public void modifierFiliere(String an, String nn);

    public void deleteFiliere(Filiere f);

    public void saveFiliere(List<Filiere> Filiere) throws NomFDataInvalid;

    public int getNbreFiliere();
}
