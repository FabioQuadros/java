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
import modelo.ServidorVO;
import persistencia.ConexaoBanco;

/**
 *
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 07/06/2018 - 00:30
 */
public class ServidorDAO {
    
    public void cadastrarServidor(ServidorVO sVO) throws SQLException{
    
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
            
        try {
            String sql ;
            
            sql = "insert into servidor(idservidor, nomeservidor, cpf, matricula, email, setor, cargo, especializacao, supervisor, admissao)"
                    +"values (null, '"+sVO.getNomeServidor()+"', "+sVO.getCpf()+", "+sVO.getMatricula()+", '"+sVO.getEmail()+"', "
                    + "'"+sVO.getSetor()+"', '"+sVO.getCargo()+"', '"+sVO.getEspecializacao()+"', '"+sVO.getSupervisor()+"', '"+sVO.getAdmissao()+"')";
            
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastar servidor!! ");
        }finally{
            con.close();
            stat.close();
        }//fecha fiinally 
    }//fecha metodo
    
    public ArrayList<ServidorVO> buscarServidor() throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from servidor";
            
            ResultSet rs  = stat.executeQuery(sql);
            
            ArrayList<ServidorVO> serv = new ArrayList<>();

            while (rs.next()) {
                ServidorVO s  = new ServidorVO();
                
                s.setIdServidor(rs.getLong("idservidor"));
                s.setNomeServidor(rs.getString("nomeservidor"));
                s.setCpf(rs.getLong("cpf"));
                s.setMatricula(rs.getLong("matricula"));
                s.setEmail(rs.getString("email"));
                s.setSetor(rs.getString("setor"));
                s.setCargo(rs.getString("cargo"));
                s.setEspecializacao(rs.getString("especializacao"));
                s.setSupervisor(rs.getString("supervisor"));
                s.setAdmissao(rs.getString("admissao"));

                serv.add(s);
            }//fecha while

            return serv;

        } catch (Exception e) {
          throw new SQLException("Erro ao buscar servidores! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha metodo
    
    public ArrayList<ServidorVO> filtrar(String query) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from servidor "+query;
            
            ResultSet rs  = stat.executeQuery(sql);
            
            ArrayList<ServidorVO> serv = new ArrayList<>();

            while (rs.next()) {
                ServidorVO s  = new ServidorVO();
                s.setIdServidor(rs.getLong("idservidor"));
                s.setNomeServidor(rs.getString("nomeservidor"));
                s.setCpf(rs.getLong("cpf"));
                s.setMatricula(rs.getLong("matricula"));
                s.setEmail(rs.getString("email"));
                s.setSetor(rs.getString("setor"));
                s.setCargo(rs.getString("cargo"));
                s.setEspecializacao(rs.getString("especializacao"));
                s.setSupervisor(rs.getString("supervisor"));
                s.setAdmissao(rs.getString("admissao"));

                serv.add(s);
            }//fecha while

            return serv;

        } catch (Exception e) {
          throw new SQLException("Erro ao buscar servidores! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha metodo
        
    public void deletarServidor(long id) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from servidor where idservidor = "+id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar!! "+e.getMessage());
        }finally{
            con.close();
            stat.close();
        }//fecha finaly
    }//fecha metodo

    public void alterarServidor(ServidorVO s) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "update servidor set nomeservidor='"+s.getNomeServidor()+"', cpf='"+s.getCpf()+"',"
                    + " matricula="+s.getMatricula()+", email='"+s.getEmail()+"', setor='"+s.getSetor()+"',"
                    + " cargo='"+s.getCargo()+"', especializacao='"+s.getEspecializacao()+"', supervisor='"+s.getSupervisor()+"',"
                    + " admissao='"+s.getAdmissao()+"' where idservidor="+s.getIdServidor();
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro ao alterar servidor!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método 
}//fecha classe 
