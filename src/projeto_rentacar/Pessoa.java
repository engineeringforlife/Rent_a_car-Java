/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

/**
 *
 * @author 2181042
 */
public class Pessoa {
    
    protected int NIF;
    protected String nome;
    protected String morada;       
    protected int telefone;

    public Pessoa(int NIF, String nome, String morada, int telefone) {
        this.NIF = NIF;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
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
    
    
            
}
