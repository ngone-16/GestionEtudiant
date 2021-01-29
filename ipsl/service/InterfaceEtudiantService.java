/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.service;

import java.util.List;
import sn.ugb.ipsl.DataAccessObject.PrenomDataInvalid;
import sn.ugb.ipsl.entity.Etudiant;

/**
 *
 * @author lenov
 */
public interface InterfaceEtudiantService {

    public void saveEtudiant(Etudiant e) throws PrenomDataInvalid;

    public List<Etudiant> getEtudiants();

    public List<Etudiant> getEtudiantsFilieres(String EF);

    public List<Etudiant> getEtudiantsFilNiv(String EF, String EN);

    public void saveEtudiant(List<Etudiant> etudiants) throws PrenomDataInvalid;

}
