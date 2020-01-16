/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author 2181042
 */
public class AlugueresMensal implements Serializable{
    
    private int mes;
    private int numAlugueres;
    private double lucroMensal;

    public AlugueresMensal(int mes) {
        this.mes= mes;
    }

    /**
     * @return the numAlugueres
     */
    public int getNumAlugueres() {
        return numAlugueres;
    }


    public void addNumAlugueres() {
        this.numAlugueres = numAlugueres + 1;
    }

    /**
     * @return the lucroMensal
     */
    public double getLucroMensal() {
        return lucroMensal;
    }

    /**
     * @param lucroMensal the lucroMensal to set
     */
    public void setLucroMensal(double lucroMensal) {
        this.lucroMensal = lucroMensal;
    }

    @Override
    public String toString() {
       StringBuilder str = new StringBuilder("");
       str.append("\n\nMês : ").append(mes);
       str.append("\nLucro: ").append(lucroMensal);
       str.append("\nNumero de alugueres: ").append(numAlugueres);
            return str.toString();
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }
    
    
    
}
