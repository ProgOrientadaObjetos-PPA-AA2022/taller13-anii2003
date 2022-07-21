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
public class Correo {
    private DominioCorreo dominio;
    private String correo;
    private String username;
    private String tipoCorreo;
    
    public void establecerDominio(DominioCorreo d){
        dominio = d;
    }
    
    public void establecerUserName(String u){
        username = u;
    }
    
    public void establecerCorreo(){
        correo = String.format("%s@%s", obtenerUserName(), 
                obtenerDominio().obtenerDominio());
    }
    
    public void establecerTipoCorreo(String t){
        tipoCorreo = t;
    }
    
    public DominioCorreo obtenerDominio(){
        return dominio;
    }
    
    public String obtenerUserName(){
        return username;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public String obtenerTipoCorreo(){
        return tipoCorreo;
    }
    
    public String toString(){
        String cadena = String.format("URL: %s\n",
                correo);
        return cadena;
    }
    
}
