/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import java.sql.*;

/**
 *
 * @author boubadiop
 */
public class ConnectionDB {
        //chemin de la pilote
        String url="jdbc:mysql://localhost:3306/gestionecole";
        String user="root";
        String password="root";
        //declaration d'un objet de type connexion
        Connection conn;
    
    public ConnectionDB(){
        try{
            //chargement de la pilote
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("pilote chargé avec succès");
        }catch(ClassNotFoundException ex){
            System.out.println("Chargement de la pilote echoué"+ex);
        }
        //Connection à la base de données
        try{
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connexion à la base de données reussie");
        }catch(SQLException e){
            System.out.println("Connection à la base de données échoué"+e);
        }
    }
    
    public Connection obtenirCon(){
        return conn;
    }
}

