/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *Classe caracterizada por um númeroo inserido automaticamente e associado 
 * a um tipo de veículo
 * @author 2181042/2172563
 */
public class TipoVeiculo implements Serializable{
    public static int numTiposDeVeiculo;
    private int numero;
    private String designacao;
    private String descricao;
    private double preco;
    private int numAlugueres;
    
    /**
     *Lista auxiliar para mostrar veículos por tipo de veiculo. Lista a percorre 
     * Adicionar veiculo/ mostrar veiculo
     */
    private ArrayList<Veiculo> veiculos= new ArrayList<>();
    
    /**
     * Construtor do objeto do tipo tipo de veículo, associado a um 
     * tipo de veículo
     * @param designacao-se o vceículo é suv ou automático
     * @param descricao- a marca ou modelo do veículo
     * @param preco-preço de aluguer associado ao veículo
     */

    public TipoVeiculo(String designacao, String descricao, double preco) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.preco = preco;
        numTiposDeVeiculo++;
    }
    
    /**
     * Adiciona veículo a lista de veículos
     * @param veiculo- onde são adicionados os veículos 
     */
     public void adicionarVeiculo (Veiculo veiculo){
        veiculos.add(veiculo);    
    }
    
    /**
     * Mostra veículos associados a um tipo de veículo
     * @return str.toString();
     */
    public String monstrarVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            str.append(veiculos.get(i)).append("\n");
        }
        return str.toString();
    }

/**
 * Lista número de veículos na lista de tipo de veículos
 * @return veiculos.size();- retorna a lista do tamanho dos veículos
 */
    public int numeroVeiculos (){
        return veiculos.size();
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
    /**
     *  Define um objeto
     * @return str.toString();-retorna caracteres de string
     */
    @Override
    public String toString() {
        StringBuilder str= new StringBuilder("");
        str.append("\nDesignação: ").append(designacao);
        str.append("\nDescrição: ").append(descricao);
        str.append("\nPreço: ").append(preco);
    
        return str.toString();
    }

    
    
    
           
    
}
