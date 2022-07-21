/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private ArrayList <Matricula> matriculas;
    private double promedioTarifas;

    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    
    public void establecerMatriculas(ArrayList <Matricula> m){
        matriculas = m;
    }
    
    public ArrayList <Matricula> obtenerMatriculas(){
        return matriculas;
    }
        
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < matriculas.size(); i++) {
            suma = suma + matriculas.get(i).obtenerTarifa();
        }
        promedioTarifas = suma/matriculas.size();
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    public String toString(){
        String cadena = String.format("-- LISTADO DE MATRICULAS --\n");
        for (int i = 0; i < matriculas.size(); i++) {
            cadena = String.format("%s\n%s\n",cadena,matriculas.get(i));
        }
        cadena = String.format("%s\n"
                + "Promedio de tarifas: %.2f\n",cadena,
                promedioTarifas);
        return cadena;
    }
}
