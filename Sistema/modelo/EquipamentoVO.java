/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fabio Guedes
 * @version 1.0 inical
 * @since 10/06/2018 - 20:00
 */
public class EquipamentoVO {
    
    private long idEquipamento;
    private String nomeEquipamento;
    private int numSerie;
    private String patrimonio;
    private String descricao;
    private String marca;
    private String tecnologio;

    public EquipamentoVO() {
    }
    
    public EquipamentoVO(long idEquipamento, String nomeEquipamento, int numSerie, String patrimonio, String descricao, String marca, String tecnologio) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.numSerie = numSerie;
        this.patrimonio = patrimonio;
        this.descricao = descricao;
        this.marca = marca;
        this.tecnologio = tecnologio;
    }

    public long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String ppareimonio) {
        this.patrimonio = ppareimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTecnologio() {
        return tecnologio;
    }

    public void setTecnologio(String tecnologio) {
        this.tecnologio = tecnologio;
    }

    @Override
    public String toString() {
        return "Código: " + idEquipamento
                + "\n Nome do equipamento: " + nomeEquipamento
                + "\n Número de série: " + numSerie
                + "\n Patrimônio: " + patrimonio
                + "\n Descrição: " + descricao
                + "\n Marca: " + marca
                + "\n Tecnologio: " + tecnologio;
    }
    
    
}//feha classe
