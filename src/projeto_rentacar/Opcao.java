/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 * Classe que contém as caracteristicas de cada opção.
 *
 * @author 2181042/2172563
 */
public class Opcao implements Serializable {

    public static int numOpcoes;
    private int numero;
    private String nome;
    private String descricao;
    private double preco;

    /**
     *
     * @param nome - nome da opção
     * @param descricao - descrição da opção
     * @param preco - preço da opção
     */
    public Opcao(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        numOpcoes++;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nNome: ").append(nome);
        str.append("\nDescrição: ").append(descricao);
        str.append("\nPreço: ").append(preco);

        return str.toString();

    }

}
