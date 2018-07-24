/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ServidorProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ServidorProdutoVO;

/**
 *
 * @author Fabio
 */
public class ServidorProdutoServicos {
    public void cadastrarSP(ServidorProdutoVO spVO) throws SQLException{
        ServidorProdutoDAO spDAO = dao.DAOFactory.getServidorProduto();
        spDAO.cadastrarServidorProduto(spVO);
    }
      
}

