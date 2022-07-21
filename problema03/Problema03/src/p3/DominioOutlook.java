/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author DELL
 */
public class DominioOutlook implements DominioCorreo {
    private String dominio;
    
    @Override
    public void establecerDominio(String g){
        dominio = String.format(g);
    }
    
    public String obtenerDominio(){
        return dominio;
    }    
}
