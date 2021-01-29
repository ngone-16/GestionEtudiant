/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.creerapplication;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sn.ugb.ipsl.entity.Etudiant;
import sn.ugb.ipsl.service.EtudiantServiceImplem;

/**
 *
 * @author lenov
 */
public class EtudiantTableModel extends AbstractTableModel {

    private final List<Etudiant> etudiant;

    public EtudiantTableModel() {
        EtudiantServiceImplem etudiantservice = new EtudiantServiceImplem();
        etudiant = etudiantservice.getEtudiants();
    }

    public EtudiantTableModel(List<Etudiant> etudiant) {
        this.etudiant = etudiant;
    }
    

    @Override
    public int getRowCount() {
        return etudiant.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Etudiant e = etudiant.get(rowIndex);
        Object res = null;
        switch (columnIndex) {
            case 0:
                res = e.getId();
                break;
            case 1:
                res = e.getNom();
                break;
            case 2:
                res = e.getPrenom();
                break;
            case 3:
                res = e.getDateNaissance();
                break;
            case 4:
                res = e.getNiveau();
                break;
            case 5:
                res = e.getFiliere();
                break;
        }

        return res;
    }

}

// System.out.println("getValueAt" + rowIndex + "," + columnIndex);
/*Etudiant e = etudiants.get(rowIndex);
        Object res;
        switch (columnIndex) {
            case 0:
                res = e.getId();
                break;
            case 1:
                res = e.getPrenom();
                break;
            case 2:
                res = e.getNom();
                break;
            case 3:
                res = e.getDateNaissance();
                break;
            case 4:
                res = e.getNiveau();
                break;
            case 5:
                res = e.getFiliere();
                break;
            default:
                res = "pas encore implemente";
        }
        return res;
        //return "Valeur row=" + rowIndex + "col=" + columnIndex;
    }

    @Override
    public String getColumnName(int column) {
        return null;
        /*switch (column) {
            case 0:
                return "ID";
            case 1:
                return "PRENOM";
            case 2:
                return "NOM";
            case 3:
                return "DATENAISSANCE";
            case 4:
                return "NIVEAU";
            case 5:
                return "FILIERE";
            default:
                return "COLONNE" + column;

        }*/
