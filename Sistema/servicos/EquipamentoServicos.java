/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.EquipamentoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.EquipamentoVO;

/**
 *
 * @author Fabio
 */
public class EquipamentoServicos {
    
    public void  cadastrarEquipamento(EquipamentoVO eVO) throws SQLException{
        EquipamentoDAO eDAO = DAOFactory.getEquipamentoDAO();
        eDAO.cadastrarEquipamento(eVO);
    }//fecha metodo
    public ArrayList<EquipamentoVO> buscarEquipamento() throws SQLException {
        EquipamentoDAO eDAO = DAOFactory.getEquipamentoDAO();
        return eDAO.buscarEquipamento();
    }//fecha método
    
    public ArrayList<EquipamentoVO> filtrar(String query) throws SQLException {
        EquipamentoDAO eDAO = DAOFactory.getEquipamentoDAO();
        return eDAO.filtrar(query);
    }//fecha método    
    
    public void deletarEquipamento(long id) throws SQLException{
        EquipamentoDAO eDAO = DAOFactory.getEquipamentoDAO();
        eDAO.deletarEquipamento(id);
    }
    
    public void alterarEquipamento(EquipamentoVO eVO) throws SQLException {
        EquipamentoDAO eDAO = DAOFactory.getEquipamentoDAO();
        eDAO.alterarEquipamento(eVO);
    }
}
