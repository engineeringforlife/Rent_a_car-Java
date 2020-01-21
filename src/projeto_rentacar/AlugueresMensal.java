/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Classe que contém o numero de alugueres e o lucro mensal de um determinado
 * ano
 *
 * @author 2181042/2172563
 */
public class AlugueresMensal implements Serializable {

    private int mes;
    private int numAlugueres;
    private double lucroMensal;

    public AlugueresMensal(int mes) {
        this.mes = mes;
    }

    public int getNumAlugueres() {
        return numAlugueres;
    }

    public void addNumAlugueres() {
        this.numAlugueres = numAlugueres + 1;
    }

    public double getLucroMensal() {
        return lucroMensal;
    }

    public void setLucroMensal(double lucroMensal) {
        this.lucroMensal = lucroMensal;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\n\nMês : ").append(mes);
        str.append("\nLucro: ").append(lucroMensal);
        str.append("\nNumero de alugueres: ").append(numAlugueres);
        return str.toString();
    }

}
