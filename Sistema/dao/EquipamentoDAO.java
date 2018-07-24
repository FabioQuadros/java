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
import modelo.EquipamentoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Fabio Guedes
 * @version 1.0 inical
 * @since 10/06/2018 - 20:00
 */
public class EquipamentoDAO {
    
    public void cadastrarEquipamento(EquipamentoVO eVO) throws SQLException{
    
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
            
        try {
            String sql ;
            
            sql = "insert into equipamento(idequipamento, nomeequipamento,numserie, patrimonio, descricao, marca, tecnologia)"
                    +"values (null,'"+eVO.getNomeEquipamento()+"', "+eVO.getNumSerie()+", '"+eVO.getPatrimonio()+"', "
                    + "'"+eVO.getDescricao()+"', '"+eVO.getMarca()+"', '"+eVO.getTecnologio()+"')";
            
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastar equipamento!! ");
        }finally{
            con.close();
            stat.close();
        }//fecha fiinally 
    }//fecha metodo
    
    public ArrayList<EquipamentoVO> buscarEquipamento() throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from equipamento ";
            
            ResultSet rs  = stat.executeQuery(sql);
            
            ArrayList<EquipamentoVO> eq = new ArrayList<>();

            while (rs.next()) {
                EquipamentoVO e  = new EquipamentoVO();
                
                e.setIdEquipamento(rs.getLong("idequipamento"));
                e.setNomeEquipamento(rs.getString("nomeequipamento"));
                e.setNumSerie(rs.getInt("numserie"));
                e.setPatrimonio(rs.getString("patrimonio"));
                e.setDescricao(rs.getString("descricao"));
                e.setMarca(rs.getString("marca"));
                e.setTecnologio(rs.getString("tecnologia"));

                eq.add(e);
            }//fecha while

            return eq;

        } catch (Exception e) {
          throw new SQLException("Erro ao buscar equipamento! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha metodo
    
    public ArrayList<EquipamentoVO> filtrar(String query) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from equipamento "+query;
            
            ResultSet rs  = stat.executeQuery(sql);
            
            ArrayList<EquipamentoVO> eq = new ArrayList<>();

            while (rs.next()) {
                EquipamentoVO e  = new EquipamentoVO();
                
                e.setIdEquipamento(rs.getLong("idequipamento"));
                e.setNomeEquipamento(rs.getString("nomeequipamento"));
                e.setNumSerie(rs.getInt("numserie"));
                e.setPatrimonio(rs.getString("patrimonio"));
                e.setDescricao(rs.getString("descricao"));
                e.setMarca(rs.getString("marca"));
                e.setTecnologio(rs.getString("tecnologia"));

                eq.add(e);
            }//fecha while

            return eq;

        } catch (Exception e) {
          throw new SQLException("Erro ao buscar equipamento! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha metodo
        
    public void deletarEquipamento(long id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from equipamento where idequipamento = "+id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar!! "+e.getMessage());
        }finally{
            con.close();
            stat.close();
        }//fecha finaly
    }//fecha metodo

    public void alterarEquipamento(EquipamentoVO eVO) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update equipamento set nomeequipamento='"+eVO.getNomeEquipamento()+"', numserie='"+eVO.getNumSerie()+"',"
                    + " patrimonio="+eVO.getPatrimonio()+",descricao='"+eVO.getDescricao()+"', marca='"+eVO.getMarca()+"',"
                    + " tecnologia='"+eVO.getTecnologio()+"' where idequipamento="+eVO.getIdEquipamento();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro ao alterar servidor!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método 
}
