/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.creerapplication;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sn.ugb.ipsl.entity.Filiere;
import sn.ugb.ipsl.service.FiliereServiceImplem;

/**
 *
 * @author lenov
 */
public class FiliereTableModel extends AbstractTableModel {

    private final List<Filiere> filiere;

    public FiliereTableModel() {

        FiliereServiceImplem filiereservice = new FiliereServiceImplem();
        filiere = filiereservice.getFilieres();
    }

    @Override
    public int getRowCount() {
        return filiere.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Filiere e = filiere.get(rowIndex);
        Object res = null;
        switch (columnIndex) {
            case 0:
                res = e.getNomF();

        }

        return res;
    }
}
