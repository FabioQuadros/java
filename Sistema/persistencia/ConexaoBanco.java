/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 06/06/2018 - 22:57
 */
public class ConexaoBanco {

    private static final String URL = "jdbc:mysql://localhost:3306/projetofinalti";
    private static final String USUARIO = "root";
    private static final String SENHA = "fabiodb";

    public static Connection getConexao() throws SQLException {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha catch
        return c;
    }//fecha metodo
    
}//fecha classe