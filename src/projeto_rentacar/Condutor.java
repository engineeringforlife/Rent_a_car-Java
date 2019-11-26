/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 2181042
 */
public class Condutor extends Pessoa{
    
    private String n_carta;
    private Calendar dataValCarta;
    private ArrayList<Aluguer> alugueres = new ArrayList<>();

    public Condutor(String n_carta, Calendar dataValCarta, int NIF, String nome, String morada, int telefone) {
        super(NIF, nome, morada, telefone);
        this.n_carta = n_carta;
        this.dataValCarta = dataValCarta;
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

    /**
     * @return the alugueres
     */
    public ArrayList<Aluguer> getAlugueres() {
        return alugueres;
    }

    /**
     * @param alugueres the alugueres to set
     */
    public void setAlugueres(ArrayList<Aluguer> alugueres) {
        this.alugueres = alugueres;
    }
    
    
    
}

