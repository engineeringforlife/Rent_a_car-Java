/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que contém as caracteristicas de cada tipo de veículo
 *
 * @author 2181042/2172563
 */
public class TipoVeiculo implements Serializable {

    public static int numTiposDeVeiculo;
    private int numero;
    private String designacao;
    private String descricao;
    private double preco;
    private int numAlugueres;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    /**
     *
     * @param designacao - designação do tipo de veículo
     * @param descricao - descrição do tipo de veículo
     * @param preco - preço do tipo de veículo
     */
    public TipoVeiculo(String designacao, String descricao, double preco) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.preco = preco;
        numTiposDeVeiculo++;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    /**
     *
     * @return String com os veiculos associados ao tipo de veículo
     */
    public String monstrarVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            str.append(veiculos.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     *
     * @return total de veículos deste tipo
     */
    public int numeroVeiculos() {
        return veiculos.size();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumAlugueres() {
        return numAlugueres;
    }

    public void setNumAlugueres(int numAlugueres) {
        this.numAlugueres = numAlugueres;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nDesignação: ").append(designacao);
        str.append("\nDescrição: ").append(descricao);
        str.append("\nPreço: ").append(preco);

        return str.toString();
    }

}
