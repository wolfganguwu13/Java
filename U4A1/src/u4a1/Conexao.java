/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4a1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author WolfGang
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/U4A1";
    private static final String USUARIO = "root";
    private static final String SENHA = "**WolfGang13##";
    public static Connection conectar(){
        try{
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch(SQLException e){
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }        
}
