/*
 *  Classe responsalvel por adicionar
 *  no Banco de Dados as informações 
 *  digitadas pelo usuario
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author DANIEL_VE160
 */
public class UsuarioDAO {


    //Cadastrando Usuario no Banco
    public void create(Usuario us) {
        Connection con = ConnectionFactory.getConnection();// Abrindo a Conexão
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (nome,senha,confiSenha)VALUES(?,?,?)");
            stmt.setString(1, us.getNome());
            stmt.setInt(2, us.getSenha());
            stmt.setInt(3, us.getConfiSenha());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    
    //Metodo Responsavel por fazet a Pesquisa no Banco
    public boolean chekLogin(String nome, int senha) {
        Connection con = ConnectionFactory.getConnection();// Abrindo a Conexão
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean chek = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome=? and senha=?");
            stmt.setString(1, nome);
            stmt.setInt(2, senha);
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {                
                
                chek = true;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //FECHANDO A CONEXÂO O PREPAREDSTATEMENT E O RESULT SET
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return chek;
    }
}
