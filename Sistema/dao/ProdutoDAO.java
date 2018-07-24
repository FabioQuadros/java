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
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 06/06/2018 - 23:40
 */
public class ProdutoDAO {
    
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();        
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "insert into produto(idproduto,nomeproduto,numserie,patrimonio,setor,descricao,estadofisico,marca,modelo,fabricante)"
                    + "values(null,'"+pVO.getNomeProduto()+"',"+pVO.getNumSerie()+",'"+pVO.getPatrimonio()+"',"
                    + "'"+pVO.getSetor()+"', '"+pVO.getDescricao()+"', '"+pVO.getEstado()+"', '"+pVO.getMarca()+"',"
                    + " '"+pVO.getModelo()+"', '"+pVO.getFabricante()+"' )";

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto!");
        } finally {
            con.close();
            stat.close();
            
        }//fecha finally
    }//fecha método
    
    public ArrayList<ProdutoVO> buscarProduto() throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from produto ";
            
            ResultSet rs  = stat.executeQuery(sql); 
            ArrayList<ProdutoVO> prod = new ArrayList<>();

            while (rs.next()) {
                ProdutoVO p = new ProdutoVO();
                
                p.setIdProduto(rs.getLong("idproduto"));
                p.setNomeProduto(rs.getString("nomeproduto"));
                p.setNumSerie(rs.getInt("numserie"));
                p.setPatrimonio(rs.getString("patrimonio"));
                p.setSetor(rs.getString("setor"));
                p.setDescricao(rs.getString("descricao"));
                p.setEstado(rs.getString("estadofisico"));
                p.setMarca(rs.getString("marca"));
                p.setModelo(rs.getString("modelo"));
                p.setFabricante(rs.getString("fabricante"));

                prod.add(p);
            }//fecha while

            return prod;

        } catch (Exception e) {
          throw new SQLException("Erro ao buscar produto! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha metodo
    
    public ArrayList<ProdutoVO> filtrar(String query) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from produto "+query;
            
            ResultSet rs  = stat.executeQuery(sql);
            
            ArrayList<ProdutoVO> prod = new ArrayList<>();

            while (rs.next()) {
                ProdutoVO p = new ProdutoVO();
                p.setIdProduto(rs.getLong("idproduto"));
                p.setNomeProduto(rs.getString("nomeproduto"));
                p.setNumSerie(rs.getInt("numserie"));
                p.setPatrimonio(rs.getString("patrimonio"));
                p.setSetor(rs.getString("setor"));
                p.setDescricao(rs.getString("descricao"));
                p.setEstado(rs.getString("estadofisico"));
                p.setMarca(rs.getString("marca"));
                p.setModelo(rs.getString("modelo"));
                p.setFabricante(rs.getString("fabricante"));

                prod.add(p);
            }//fecha while

            return prod;

        } catch (Exception e) {
          throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha metodo
    
    public void deletarProduto(long id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from produto where idproduto = "+id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar!! "+e.getMessage());
        }finally{
            con.close();
            stat.close();
        }//fecha finaly
    }//fecha metodo
    
    public void alterarProduto(ProdutoVO p) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update produto set nomeproduto='"+p.getNomeProduto()+"', numserie="+p.getNumSerie()+","
                    + " patrimonio='"+p.getPatrimonio()+"', setor='"+p.getSetor()+"', descricao='"+p.getDescricao()+"',"
                    + " estadofisico='"+p.getEstado()+"', marca='"+p.getMarca()+"', modelo='"+p.getMarca()+"',"
                    + " fabricante='"+p.getFabricante()+"' where idproduto="+p.getIdProduto();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro ao alterar produto!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método 
}//fecha classe