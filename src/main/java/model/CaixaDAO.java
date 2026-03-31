/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CaixaDAO {
    
    
   public void criar(CaixaBean caixa) {
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("INSERT INTO tarefas (valor, tipo, entrega) VALUES (?, ?, ?)");
            stmt.setDouble(1, caixa.getValor());           
            stmt.setString(2, caixa.getTipo());       
            stmt.setString(3, caixa.getEntrege()); 
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   public List<CaixaBean> listar() {
        List<CaixaBean> caixas = new ArrayList();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM caixa ORDER BY id_caixa DESC");
            
            rs = stmt.executeQuery();
            while (rs.next()) {
                CaixaBean caixa = new CaixaBean();
                caixa.setId_caixa(rs.getInt("id_caixa"));
                caixa.setValor(rs.getFloat("valor"));
                caixa.setTipo(rs.getString("Tipo"));
                caixa.setEntrege(rs.getString("entrege"));
                

                caixas.add(caixa);
            }
            
            
            rs.close();    
            stmt.close();   
            conn.close();   
            
        } catch (SQLException e) {
  
            e.printStackTrace();
        }
  
        return caixas;
    }
  public void atualizar(CaixaBean caixa) {
        try {
           
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
           
            stmt = conn.prepareStatement("UPDATE caixa SET  valor = ?, tipo = ?, entrega = ? WHERE id_caixa = ?");
            stmt.setDouble(1, caixa.getValor());   
            stmt.setString(2, caixa.getTipo()); 
            stmt.setString(3, caixa.getEntrege());      
            stmt.setInt(4, caixa.getId_caixa());             
            
            stmt.executeUpdate();
            stmt.close();   
            conn.close();  
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      public void deletar(int id) {
        try {
            // Estabelece conexão com o banco de dados
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            // Prepara a instrução SQL para deletar uma tarefa pelo ID
            stmt = conn.prepareStatement("DELETE FROM tarefas WHERE id_caixa = ?");
            stmt.setInt(1, id); // Define qual tarefa será deletada (por ID)
            
            // Executa a instrução de deleção no banco
            stmt.executeUpdate();
            stmt.close();   // Fecha a instrução preparada
            conn.close();   // Fecha a conexão com o banco
            
        } catch (SQLException e) {
            // Captura e exibe erros de SQL
            e.printStackTrace();
        }
    }
}
