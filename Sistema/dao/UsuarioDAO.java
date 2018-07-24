/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.UsuarioVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Fabio
 */
public class UsuarioDAO {
    
    public void cadastrarUsuario(UsuarioVO uVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "insert into usuario(idusuario, login, senha)"
                    + "values(null, '" + uVO.getLogin() + "', '" + uVO.getSenha() + "')";
            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir usuário! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public ArrayList<UsuarioVO> buscarUsuarios() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;          
            sql = "select * from usuario";
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<UsuarioVO> users = new ArrayList<>();
            
            while (rs.next()) {
                
                UsuarioVO u = new UsuarioVO();
                u.setIdUsuario(rs.getLong("idusuario"));
                u.setLogin(rs.getString("nome"));
                u.setSenha(rs.getString("senha"));

                users.add(u);
            }//fecha while
            return users;
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar usuários! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public boolean validarSenha(UsuarioVO u) throws SQLException {                  

        Connection conexao = ConexaoBanco.getConexao();
        Statement stat = conexao.createStatement();

        String sql;

        sql = "select count(*)"
                + " from usuario"
                + " where login ='" + u.getLogin() + "' and"
                + " senha = '" + u.getSenha() + "' ";

        ResultSet rs = stat.executeQuery(sql);
        int retorno = -2;

        while (rs.next()) {
            retorno = rs.getInt(1);
        }//fecha while

        if (retorno == 1) {
            stat.close();
            return true;
        } else {
            return false;
        }//fecha else
    }//fecha método  
}//fecha classe
