/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realization;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guest-44bnxg
 */
public class MySqlFactory implements ConnectionFactory {
    
    @Override
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306","root","lin");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
