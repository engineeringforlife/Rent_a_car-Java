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
    /*Lista auxiliar para mostrar veículos por tipo de veiculo. Lista a percorre
    Adicionar veiculo/ mostrar veiculo*/
    
    private ArrayList<Veiculo> veiculos= new ArrayList<>();

    public TipoVeiculo(String designacao, String descricao, double preco) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    
     public void adicionarVeiculo (Veiculo veiculo){
        veiculos.add(veiculo);    
    }
    
    //As validações sao feitas aqui ou na main?
    public String monstrarVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            str.append(veiculos.get(i)).append("\n");
        }
        return str.toString();
    }


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
    
    

    
    
    
           
    
}
