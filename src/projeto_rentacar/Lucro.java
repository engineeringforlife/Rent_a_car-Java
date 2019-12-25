/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 *
 * @author 2181042
 */
public class Lucro implements Serializable {
    
    private double lucro_anual;
    private double[] lucro_mensal = new double[12];

    public Lucro() {
        this.lucro_anual=0;
    }

    /**
     * @return the lucro_anual
     */
    public double getLucro_anual() {
        return lucro_anual;
    }

    /**
     * @param lucro_anual the lucro_anual to set
     */
    public void setLucro_anual(double lucro_anual) {
        this.lucro_anual = lucro_anual;
    }

    /**
     * @param index
     * @return the lucro_mensal
     */
    public double getLucro_mensal(int index) {
        return lucro_mensal[index];
    }

    /**
     * @param lucro_mensal the lucro_mensal to set
     * @param index
     */
    public void setLucro_mensal(double lucro_mensal, int index) {
        this.lucro_mensal[index] = lucro_mensal;
    }


}
