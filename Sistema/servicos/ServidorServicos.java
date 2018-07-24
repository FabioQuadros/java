/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ServidorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ServidorVO;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 07/06/2018 - 01:30
 */
public class ServidorServicos {
    
    /**
     * 
     * @param sVO objeto proviniente da interface
     * @throws SQLException lançando exeção SQL
     */
    public void  cadastrarServidor(ServidorVO sVO) throws SQLException{
        ServidorDAO sDAO = DAOFactory.getServidorDAO();
        sDAO.cadastrarServidor(sVO);
    }//fecha  metodo
    
    public ArrayList<ServidorVO> buscarServidor() throws SQLException {
        ServidorDAO sDAO = DAOFactory.getServidorDAO();
    
        return sDAO.buscarServidor();
    }//fecha método
    
    public ArrayList<ServidorVO> filtrar(String query) throws SQLException {
        ServidorDAO sDAO = DAOFactory.getServidorDAO();
        return sDAO.filtrar(query);
    }//fecha método    
    
    public void deletarServidor(long id) throws SQLException{
        ServidorDAO sDAO = DAOFactory.getServidorDAO();
        sDAO.deletarServidor(id);
    }
    
    public void alterarServidor(ServidorVO sVO) throws SQLException {
        ServidorDAO sDAO = DAOFactory.getServidorDAO();
        sDAO.alterarServidor(sVO);
    }//fecha método
}//FECHA CLASSE
