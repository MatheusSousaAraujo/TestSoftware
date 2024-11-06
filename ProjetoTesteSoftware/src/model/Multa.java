/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fabricio
 */
public class Multa {
    private String cpf,nome;
    private int dias;
    private double diaria;
    
    public Multa(String cpf,String nome, int dias, double diaria)
    {
        this.cpf=cpf;
        this.nome=nome;
        this.dias=dias;
        this.diaria=diaria;
        
    }
    
    public double calculaMulta()
    {
        return dias*diaria;
    }
    
    
}
