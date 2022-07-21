/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class OperacionesTvs {
    private ArrayList<Televisor> listaTv;
    private double totalPrecioTvs;
    private double tvMasCaro;
    private String listaMarcasVendidas;
    
    public void establecerTvs(ArrayList<Televisor> t){
        listaTv = t;
    }
    
    public ArrayList<Televisor> obtenerTvs(){
        return listaTv;
    }
            
    public void establecerTotalPrecioTvs(){
        for (int i = 0; i < listaTv.size(); i++) {
             totalPrecioTvs = totalPrecioTvs + listaTv.get(i).obtenerPrecio();
        }
    }
    
    public double obtenerTotalPrecioTvs(){
        return totalPrecioTvs;
    }
    
    public void establecerTelevisorMasCaro(){
        tvMasCaro = listaTv.get(0).obtenerPrecio();
        for (int i = 0; i < listaTv.size(); i++) {
            if (tvMasCaro < listaTv.get(i).obtenerPrecio()){
                tvMasCaro = listaTv.get(i).obtenerPrecio();
            }
        }        
    }
    
    public double obtenerTelevisorMasCaro(){
        return tvMasCaro;
    }
    
    public void establecerListaMarcasVendidas(){
        String s = "";
        for (int i = 0; i < listaTv.size(); i++) {
            s = String.format("%s%s\n", s, listaTv.get(i).obtenerMarca());
        }
        listaMarcasVendidas = s;
    }    
    
    public String obtenerListaMarcasVendidas(){
        return listaMarcasVendidas;
    }
    
    public String toString(){
        String cadena = String.format("-- LISTA DE TVS --\n");
        for (int i = 0; i < listaTv.size(); i++) {
            cadena = String.format("%s%s",cadena,listaTv.get(i));
        }
        cadena = String.format("%s"
                + "Total precio tvs: %.2f\n"
                + "Valor del televisor más caro: %.2f\n"
                + "-- LISTA DE MARCAS VENDIDAS --\n"
                + "%s\n",
                cadena,
                totalPrecioTvs,
                tvMasCaro,
                listaMarcasVendidas);
        return cadena;
    }
}
