/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.util.ArrayList;

/**
 *
 * @author 2181042
 */
public class TipoVeiculo {
    
    private int numero;
    private String designacao;
    private String descricao;
    private double preco;
    private int numAlugueres;
    private ArrayList<Veiculo> veiculos= new ArrayList<>();

    public TipoVeiculo(String designacao, String descricao, double preco) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the designacao
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * @param designacao the designacao to set
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the numAlugueres
     */
    public int getNumAlugueres() {
        return numAlugueres;
    }

    /**
     * @param numAlugueres the numAlugueres to set
     */
    public void setNumAlugueres(int numAlugueres) {
        this.numAlugueres = numAlugueres;
    }

    /**
     * @return the veiculos
     */
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    /**
     * @param veiculos the veiculos to set
     */
    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    

    
    
    
           
    
}
