/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class DominioGmail implements DominioCorreo{
    private String dominio;
    
    @Override
    public void establecerDominio(String g){
        dominio = String.format(g);
    }
    
    public String obtenerDominio(){
        return dominio;
    }
}
