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
import modelo.ServidorProdutoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Fabio
 */
public class ServidorProdutoDAO {
        public void cadastrarServidorProduto(ServidorProdutoVO spVO) throws SQLException{
    
            Connection con = ConexaoBanco.getConexao();
            Statement stat = con.createStatement();
            
        try {
            String sql ;
            
            for(int i=0 ; i<spVO.getServidor().size() ; i++){
            sql = "insert into instalado(servidor, nomeservidor, produto, nomeproduto)"
                    +"values("+spVO.getServidor().get(i).getIdServidor()+","+spVO.getServidor().get(i).getNomeServidor()+","+spVO.getProduto().get(0).getIdProduto()+")" ;
            stat.execute(sql);
            }
            
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastar!! ");
        }finally{
            con.close();
            stat.close();
        }//fecha fiinally 
    }//fecha metodo
        
}
