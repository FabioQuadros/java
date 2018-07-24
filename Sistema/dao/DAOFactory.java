/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 06/06/2018 - 23:27
 */
public class DAOFactory {
    private static final ProdutoDAO produtoDAO = new ProdutoDAO();
    private static final ServidorDAO servidorDAO = new ServidorDAO();
    private static final ServidorProdutoDAO servidorProdutoDAO = new ServidorProdutoDAO();
    private static final EquipamentoDAO equipamentoDAO = new EquipamentoDAO();    
    private static final UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public static final ProdutoDAO getProdutoDAO(){
        return produtoDAO;
      }//fecha método
    
    public static final ServidorDAO getServidorDAO(){
        return  servidorDAO;
    }//fecha metodo
    
    public static final EquipamentoDAO getEquipamentoDAO(){
        return equipamentoDAO;
    }
    
    public static final ServidorProdutoDAO getServidorProduto(){
        return servidorProdutoDAO;
    }
    public static UsuarioDAO getUsuarioDAO(){
        return usuarioDAO;
    }//fecha método
    
        
}//fecha classe
