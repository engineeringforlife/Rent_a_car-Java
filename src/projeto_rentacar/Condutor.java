/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 2181042
 */
public class Condutor extends Pessoa implements Serializable{
    public static int numCondutores;
    private String n_carta;
    private Calendar dataValCarta;
    private ArrayList<Aluguer> alugueres = new ArrayList<>();   //Lista que armazena os alugueres de um determinado condutor. Nesta lista nao há numeração automatica

    public Condutor(String n_carta, Calendar dataValCarta, int NIF, String nome, String morada, int telefone) {
        super(NIF, nome, morada, telefone);
        this.n_carta = n_carta;
        this.dataValCarta = dataValCarta;
        numCondutores++;
    }

    /**
     * @return the n_carta
     */
    public String getN_carta() {
        return n_carta;
    }

    /**
     * @param n_carta the n_carta to set
     */
    public void setN_carta(String n_carta) {
        this.n_carta = n_carta;
    }

    /**
     * @return the dataValCarta
     */
    public Calendar getDataValCarta() {
        return dataValCarta;
    }

    /**
     * @param dataValCarta the dataValCarta to set
     */
    public void setDataValCarta(Calendar dataValCarta) {
        this.dataValCarta = dataValCarta;
    }
    public void adicionarAluguer(Aluguer aluguer){
        alugueres.add(aluguer);
    }

    public Aluguer obterAlugueres (int pos){
        return alugueres.get(pos);
    }
    public int numeroAlugueres (){
        return alugueres.size();
    }
    public String monstrarAlugueres (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres.size(); i++) {
            str.append(alugueres.get(i)).append("\n");
        }
        return str.toString();
    }
    
    @Override
    public String toString() {
        
        StringBuilder str = new StringBuilder("");
        str.append(super.toString());
        str.append("\nNumero da carta de condução:: ").append(n_carta);
        str.append("\nData de validade da carta: ").
                append(dataValCarta.get(Calendar.DATE)).append("-").
                append(dataValCarta.get(Calendar.MONTH)+1).append("-").
                append(dataValCarta.get(Calendar.YEAR));
        
        return str.toString();
                
                
    }
    
    
    
    
}

