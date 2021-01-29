/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.DataAccessObject;

import java.util.List;
import sn.ugb.ipsl.entity.Filiere;

/**
 *
 * @author lenov
 */
public interface InterfaceFiliereDao {

    public void saveFiliere(Filiere f) throws NomFDataInvalid;

    public void deleteFiliere(Filiere f);

    public void modifierFiliere(String an, String nn);

    public List<Filiere> getFilieres();

    public int getNbreFiliere();

}
