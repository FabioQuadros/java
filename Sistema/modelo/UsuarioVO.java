/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fabio
 */
public class UsuarioVO {
        private long idusuario;
    private String login;
    private String senha;

    public UsuarioVO() {
    }

    public UsuarioVO(long idusuario, String login, String senha) {
        this.idusuario = idusuario;
        this.login = login;
        this.senha = senha;
    }

    public long getIdUsuario() {
        return idusuario;
    }

    public void setIdUsuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Código: " + idusuario
                + "\n Login: " + login
                + "\n Senha: " + senha;
    }
}
