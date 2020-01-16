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
 *
 * @author 2181042
 */
public class Estatisticas implements Serializable {
    
    public static int num_anos;
    private double lucro_anual;
   // private int[] num_alugueres_mensal = new int[12];
   // private double[] lucro_mensal = new double[12];
    private ArrayList<AlugueresMensal> alugueres_mensal = new ArrayList<>();
    // private ArrayList<Opcao> opcoes = new ArrayList<>();

    public Estatisticas() {
        this.lucro_anual = 0;
        
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
     * @return the num_anos
     */
    public static int getNum_anos() {
        return num_anos;
    }

    /**
     * @param aNum_anos the num_anos to set
     */
    public static void setNum_anos(int aNum_anos) {
        num_anos = aNum_anos;
    }

    /**
     * @return the alugueres_mensal
     */
    public ArrayList<AlugueresMensal> getAlugueres_mensal() {
        return alugueres_mensal;
    }

    /**
     * @param alugueres_mensal the alugueres_mensal to set
     */
    public void setAlugueres_mensal(ArrayList<AlugueresMensal> alugueres_mensal) {
        this.alugueres_mensal = alugueres_mensal;
    }
    
    
        public double getLucro_mensal(int mes) {
            //necessario pesquisar mes
           int pos=pesquisarAlugueresMensal(mes);
        return alugueres_mensal.get(pos).getLucroMensal();
    }
    
        public void setLucro_mensal(double lucro_mensal, int mes) {
            //necessario pesquisar mes
            int pos=pesquisarAlugueresMensal(mes);
        alugueres_mensal.get(pos).setLucroMensal(lucro_mensal);
    }
    
        public int getNum_alugueres_mensal(int mes) {
            int pos=pesquisarAlugueresMensal(mes);
        return alugueres_mensal.get(pos).getNumAlugueres();
    }


    public void addNum_alugueres_mensal(int mes) {
        int pos=pesquisarAlugueresMensal(mes);
        alugueres_mensal.get(pos).addNumAlugueres();
    }
    
    public void adicionarAlugueresMensal(){
        for (int i = 0; i <12; i++) {
            AlugueresMensal a = new AlugueresMensal(i+1);
            alugueres_mensal.add(a);
        }
        
    }
    
    public int pesquisarAlugueresMensal(int mes){
        for (int i = 0; i < alugueres_mensal.size(); i++) {
           if(alugueres_mensal.get(i).getMes()==mes){
               return i;
           }
        }
        return -1;
    }    
    
    public String mostrarAlugueresMensal (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres_mensal.size(); i++) {
           str.append(alugueres_mensal.get(i)).append("\n");
        }
        return str.toString();
    }

    
    
    
    
    
    
    
    
    
    /**
     * @param index
     * @return the lucro_mensal
     */

    /*
    public double getLucro_mensal(int index) {
        return lucro_mensal[index];
    }


    public void setLucro_mensal(double lucro_mensal, int index) {
        this.lucro_mensal[index] = lucro_mensal;
    }


    public int getNum_alugueres_mensal(int index) {
        return num_alugueres_mensal[index];
    }


    public void addNum_alugueres_mensal(int index) {
        this.num_alugueres_mensal[index] ++;
    }

    */


}