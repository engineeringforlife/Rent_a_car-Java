/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 * Superclasse de Funcionário e de Condutor.
 *
 * @author 2181042/2172563
 */
public class Pessoa implements Serializable {

    public static int numPessoas;
    protected int NIF;
    protected String nome;
    protected String morada;
    protected int telefone;

    /**
     *
     * @param NIF - Nif da pessoa. Unico e identificativo
     * @param nome - Nome da pessoa
     * @param morada - Morada da pessoa
     * @param telefone - Numero de telemovel da pessoa
     */
    public Pessoa(int NIF, String nome, String morada, int telefone) {
        this.NIF = NIF;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        numPessoas++;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nNome: ").append(nome);
        str.append("\nNIF: ").append(NIF);
        str.append("\nMorada: ").append(morada);
        str.append("\nTelefone: ").append(telefone);
        return str.toString();
    }

}
    
