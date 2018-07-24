/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Fábio Guedes
 * @version 1.0 inicial
 * @since 07/06/2018 - 02:00
 */
public class ServicosFactory {
  
    private static final ProdutoServicos produtoServicos = new ProdutoServicos();
    private static final ServidorServicos servidorServicos = new ServidorServicos();
    private static final ServidorProdutoServicos spServicos = new ServidorProdutoServicos();
    private static final EquipamentoServicos equipamentoServicos = new EquipamentoServicos();
    private static final UsuarioServicos usuarioServicos= new UsuarioServicos();
    
    public static final EquipamentoServicos getEquipamentoServicos(){
        return equipamentoServicos;
    }
    
    public static final ProdutoServicos getProdutoServicos(){
       return produtoServicos;                                
   }//fecha metodo
    
    public static final ServidorServicos getServidorServicos(){
        return servidorServicos;
    }//fecha metodo
    
    public static final ServidorProdutoServicos getServidorProdutoServicos(){
        return spServicos;
    }
    public static UsuarioServicos getUsuarioServicos(){
       
       return usuarioServicos;
   }//fecha metodo
}//classe
