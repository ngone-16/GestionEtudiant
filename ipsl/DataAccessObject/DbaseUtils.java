/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lenov
 */
public class DbaseUtils {

    //public static final SimpleDateFormat SQL_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    //creer une variable statique
    private static Connection connection;

    //methode getConnection pour faire test connection
    public static Connection getConnection() throws Exception {
        if (connection == null) {
            //connection a la base
            //de ce fait n'importe ou nous serons dans l'appli et qu'on a besoin de la connection on peut utiliser DbUtils.getconnection
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipsl?useSSL=false", "root", "passer");
        }
        return connection;
    }

    public static void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }

    public static void main(String[] args) throws Exception {
        Connection c = DbaseUtils.getConnection();
        System.out.println("Bien connecté");
        DbaseUtils.disconnect();
        System.out.println("Bien déconnecté");
    }

}
