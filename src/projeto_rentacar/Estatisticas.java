/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Arrays;

/**
 * Classe essencial para o cálculo estatístico
 *
 * @author 2181042/2172563
 */
public class Estatisticas implements Serializable {

    public static int num_anos;
    private double lucro_anual;
    private ArrayList<AlugueresMensal> alugueres_mensal = new ArrayList<>();

    public Estatisticas() {
        this.lucro_anual = 0;

    }

    public double getLucro_anual() {
        return lucro_anual;
    }

    public void setLucro_anual(double lucro_anual) {
        this.lucro_anual = lucro_anual;
    }

    public static int getNum_anos() {
        return num_anos;
    }

    public static void setNum_anos(int aNum_anos) {
        num_anos = aNum_anos;
    }

    public ArrayList<AlugueresMensal> getAlugueres_mensal() {
        return alugueres_mensal;
    }

    public void setAlugueres_mensal(ArrayList<AlugueresMensal> alugueres_mensal) {
        this.alugueres_mensal = alugueres_mensal;
    }

    public double getLucro_mensal(int mes) {
        int pos = pesquisarAlugueresMensal(mes);
        return alugueres_mensal.get(pos).getLucroMensal();
    }

    public void setLucro_mensal(double lucro_mensal, int mes) {
        int pos = pesquisarAlugueresMensal(mes);
        alugueres_mensal.get(pos).setLucroMensal(lucro_mensal);
    }

    public int getNum_alugueres_mensal(int mes) {
        int pos = pesquisarAlugueresMensal(mes);
        return alugueres_mensal.get(pos).getNumAlugueres();
    }

    /**
     * Incrementa o numero de alugueres por mês
     *
     * @param mes
     */
    public void addNum_alugueres_mensal(int mes) {
        int pos = pesquisarAlugueresMensal(mes);
        alugueres_mensal.get(pos).addNumAlugueres();
    }

    /**
     * Cria 12 novas posições no ArrayList alugueres_mensal (12 meses)
     */
    public void adicionarAlugueresMensal() {
        for (int i = 0; i < 12; i++) {
            AlugueresMensal a = new AlugueresMensal(i + 1);
            alugueres_mensal.add(a);
        }

    }

    /**
     *
     * @param mes
     * @return retorna a posição no ArrayList para um determinado mês
     */
    public int pesquisarAlugueresMensal(int mes) {
        for (int i = 0; i < alugueres_mensal.size(); i++) {
            if (alugueres_mensal.get(i).getMes() == mes) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @return String com toda a informação de lucros mensais
     */
    public String mostrarAlugueresMensal() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres_mensal.size(); i++) {
            str.append(alugueres_mensal.get(i)).append("\n");
        }
        return str.toString();
    }

}
