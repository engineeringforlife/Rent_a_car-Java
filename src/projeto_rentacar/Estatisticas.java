/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 *Classe que faz a estatística de um veículo durante um aluguer, ou seja, faz 
 * a estatística de quantos alugueres ja foram efetuados pelo ou pelos veículos
 * @author 2181042/2172563
 */
public class Estatisticas implements Serializable {
    
    private double lucro_anual;
    private int[] num_alugueres_mensal = new int[12];
    private double[] lucro_mensal = new double[12];

    /**
     * Construtor da classe de tipo estatística
     */
    public Estatisticas() {
        this.lucro_anual = 0;
    }



    
    public double getLucro_anual() {
        return lucro_anual;
    }

    
    public void setLucro_anual(double lucro_anual) {
        this.lucro_anual = lucro_anual;
    }

    
    public double getLucro_mensal(int index) {
        return lucro_mensal[index];
    }

    
    public void setLucro_mensal(double lucro_mensal, int index) {
        this.lucro_mensal[index] = lucro_mensal;
    }

   
    public int getNum_alugueres_mensal(int index) {
        return num_alugueres_mensal[index];
    }

    /**
     * Adiciona a numero de alugueres a lista index
     * @param index 
     */
    public void addNum_alugueres_mensal(int index) {
        this.num_alugueres_mensal[index] ++;
    }


}