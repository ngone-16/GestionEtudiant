/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.creerapplication;

/**
 *
 * @author lenov
 */
public class Configuration {
     private static Configuration instance;//unique instance de la class : chmp statique
    
    private String dbHost;
    private String dbLogin;

    //ce contructeur ne peut pas etre utiliser a l'exterieur de la classe
    private Configuration() {
        dbHost = "localhost";
        dbLogin = "root";
    }

    public static Configuration getInstnce() {
        //verifier si l'instance n'est pas null
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
}
