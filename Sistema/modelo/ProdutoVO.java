/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 06/06/2018 - 22:38
 */
public class ProdutoVO {
    private long idProduto;
    private String nomeProduto;
    private int numSerie;
    private String patrimonio;
    private String setor;
    private String descricao;
    private String estado;
    private String marca;
    private String modelo;
    private String fabricante;

    public ProdutoVO() {
    }

    public ProdutoVO(long idProduto, String nomeProduto, int numSerie, String patrimonio, String setor, String descricao, String estado, String marca, String modelo, String fabricante) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.numSerie = numSerie;
        this.patrimonio = patrimonio;
        this.setor = setor;
        this.descricao = descricao;
        this.estado = estado;
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return  "Código: " + idProduto 
                + "\n Nome do Produto: " + nomeProduto
                + "\n Número de Série: " + numSerie
                + "\n Patrimônio: " + patrimonio
                + "\n Setor: " + setor
                + "\n Descrição: " + descricao
                + "\n Estado Físico: " + estado
                + "\n Marca: " + marca
                + "\n Modelo: " + modelo
                + "\n Fabricante: " + fabricante ;
    }
}
