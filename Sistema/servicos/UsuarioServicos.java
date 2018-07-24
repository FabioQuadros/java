/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.UsuarioVO;

/**
 *
 * @author Fabio
 */
public class UsuarioServicos {
    
    public void cadastrarUsuario(UsuarioVO uVO) throws SQLException {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.cadastrarUsuario(uVO);
    }//fecha método
    
    public ArrayList<UsuarioVO> buscarUsuarios() throws SQLException {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        return uDAO.buscarUsuarios();
    }//fecha método    
    
    public boolean validarSenha(UsuarioVO u) throws SQLException {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        return uDAO.validarSenha(u);
    }//fecha método
}//fecha método
