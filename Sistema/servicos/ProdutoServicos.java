/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProdutoVO;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 07/06/2018 - 01:45
 */
public class ProdutoServicos {
    
    /**
     * 
     * @param pVO objeto proviniente da interface
     * @throws SQLException lançando exeção SQL
     */
    public void  cadastrarProduto(ProdutoVO pVO) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);
    }//fecha metodo
    public ArrayList<ProdutoVO> buscarProduto() throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.buscarProduto();
    }//fecha método
    
    public ArrayList<ProdutoVO> filtrar(String query) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.filtrar(query);
    }//fecha método    
    
    public void deletarProduto(long id) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
         pDAO.deletarProduto(id);
    }
    
    public void alterarProduto(ProdutoVO pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.alterarProduto(pVO);
    }
}//fecha classe 
