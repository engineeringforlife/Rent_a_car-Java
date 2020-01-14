/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 *Classe onde cada aluguer pode ter mais de uma opção, é caracterizado por um 
 * número único e sequêncial 
 * @author 2181042/2172563
 */
public class Opcao implements Serializable{
    public static int numOpcoes;
    private int numero; 
    private String nome;
    private String descricao;       
    private double preco;       

    /**
     * Construtor do objeto de tipo opção
     * @param nome- o nome associado ao aluguer
     * @param descricao- descrição do aluguer
     * @param preco-valor do aluguer
     */
    public Opcao(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        numOpcoes++;
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
 *  Define um objeto
 * @return str.toString();-retorna caracteres de string 
 */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nNome: ").append(nome);
        str.append("\nDescrição: ").append(descricao);
        str.append("\nPreço: ").append(preco);
        
        return str.toString();
        
    }
            
}
