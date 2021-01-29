/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.entity;

/**
 *
 * @author lenov
 */
public class Filiere {

    //private Integer idF;
    private String nomF;

    public Filiere() {
    }

    public Filiere(String nomF) {
        this.nomF = nomF;
    }
    
    public String getNomF() {
        return nomF;
    }

    public void setNomF(String nomF) {
        this.nomF = nomF;
    }

}
