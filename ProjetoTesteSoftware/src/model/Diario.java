/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author fabricio
 */
public class Diario {
    final int freqMinima=75;
    final int notaMinima=6;
    private int matricula;
    private int frequencia;
    private int nota;
    
    public Diario(int matricula, int frequencia, int nota){
        this.matricula=matricula;
        this.frequencia=frequencia;
        this.nota=nota;
    }
    
    public String situacao()
    {
        if((frequencia>=freqMinima)&&(nota>=notaMinima))
            return "APROVADO";
        else if((frequencia>=freqMinima)&&(nota>=4))
            return "RECUPERAÇÃO";
        else
            return "REPROVADO";
    }
    
}
