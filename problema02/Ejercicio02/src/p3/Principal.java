/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {        
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        
        ArrayList <Matricula> matriculas = new ArrayList<>();
        matriculas.add(mescuela);
        matriculas.add(mjardin);
        matriculas.add(mmaternal);
        matriculas.add(mmaternal2);
        
        tipos.establecerMatriculas(matriculas);
        
        for (int i = 0; i < matriculas.size(); i++) {
            matriculas.get(i).establecerTarifa();
        }
        
        tipos.establecerPromedioTarifas();
        
        System.out.printf("%s",tipos);
    }
}
