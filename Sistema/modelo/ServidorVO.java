/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 Inicial
 * @since 06/06/2018 22:20
 */
public class ServidorVO {
   
    private long idServidor;
    private String nomeServidor;
    private long cpf;
    private long matricula;
    private String email;
    private String setor;
    private String cargo;
    private String especializacao;
    private String supervisor;
    private String admissao;  

    public ServidorVO() {
    }

    public ServidorVO(long idServidor, String nomeServidor, long cpf, long matricula, String email, String setor, String cargo, String especializacao, String supervisor, String admissao) {
        this.idServidor = idServidor;
        this.nomeServidor = nomeServidor;
        this.cpf = cpf;
        this.matricula = matricula;
        this.email = email;
        this.setor = setor;
        this.cargo = cargo;
        this.especializacao = especializacao;
        this.supervisor = supervisor;
        this.admissao = admissao;
    }

    public long getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(long idServidor) {
        this.idServidor = idServidor;
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    @Override
    public String toString() {
        return "Código:  " + idServidor
                + "\n Nome do Servidor:  " + nomeServidor
                + "\n CPF:  " + cpf
                + "\n Mátricula:  " + matricula
                + "\n E-mail:  " + email
                + "\n Setor:  " + setor
                + "\n Cargo:  " + cargo
                + "\n Especialização:  " + especializacao
                + "\n Supervisor:  " + supervisor
                + "\n Admissão:  " + admissao;
    }
    
}//fecha classe
