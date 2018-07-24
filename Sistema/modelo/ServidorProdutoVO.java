/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 09/06/2018 04:50
 */
public class ServidorProdutoVO {
   
    ArrayList<ServidorVO> servidor = new ArrayList<>();
    ArrayList<ProdutoVO> produto = new ArrayList<>();
    
    private LocalDate data;
    private LocalTime hora;

    public ServidorProdutoVO() {
    }

    public ArrayList<ServidorVO> getServidor() {
        return servidor;
    }

    public void setServidor(ArrayList<ServidorVO> servidor) {
        this.servidor = servidor;
    }

    public ArrayList<ProdutoVO> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<ProdutoVO> produto) {
        this.produto = produto;
    }   
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
