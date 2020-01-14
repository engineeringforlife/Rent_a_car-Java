/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 *Classe que está associado a um aluguer, contém um funcionário e condutor 
 *que realizará um aluguer,é caracterizado por um número de identificação único
 * @author 2181042/2172563
 */
public class Pessoa implements Serializable{
    public static int numPessoas;
    protected int NIF;
    protected String nome;
    protected String morada;       
    protected int telefone;
    
    /**
     * Construtor que instancia a classe pessoa
     * @param NIF- número de identificação único que caracteriza uma pessoa
     * @param nome-usado para tratar de uma pessoa em específica
     * @param morada- local onde pode ser encontrado ou habita
     * @param telefone- número de contacto da pessoa
     */

    public Pessoa(int NIF, String nome, String morada, int telefone) {
        this.NIF = NIF;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        numPessoas++;
    }

    /**
     * @return the NIF
     */
    public int getNIF() {
        return NIF;
    }

    /**
     * @param NIF the NIF to set
     */
    public void setNIF(int NIF) {
        this.NIF = NIF;
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
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
/**
 * Define um objeto
 * @return str.toString();-retorna caracteres de string 
 */
    @Override
    public String toString() {
        StringBuilder str= new StringBuilder("");
        str.append("\nNome: ").append(nome);
        str.append("\nNIF: ").append(NIF);
        str.append("\nMorada: ").append(morada);
        str.append("\nTelefone: ").append(telefone);
        return str.toString();
    }
    
}

    
    
            
    
