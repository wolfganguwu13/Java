/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4a1;

/**
 *
 * @author WolfGang
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    
    public void listarTodos(){
        String sql = "SELECT * FROM usuarios";
        
        try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()){
            while(rs.next()){
                int id = rs.getInt("ID");
                String nome = rs.getString("Nome");
                String email = rs.getString("Email");
                
                System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email);
            }
        } catch(SQLException e){
            System.out.println("Errro ao listar: " + e.getMessage());
        }
        
    }
    
}
