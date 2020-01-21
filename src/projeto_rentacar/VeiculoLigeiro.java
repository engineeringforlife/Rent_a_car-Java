/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 * Classe que contém as caracteristicas de cada tipo de veículo ligeiro
 *
 * @author 2181042/2172563
 */
public class VeiculoLigeiro extends Veiculo implements Serializable {

    public static int numVeiculosLigeiros;
    private int n_portas;
    private int capacidade;

    /**
     *
     * @param n_portas - numero de portas do veículo
     * @param capacidade - numero de malas possiveis de transportar
     * @param matricula - matricula do veículo
     * @param nºpessoas - nº de pessoas capazes de transportar
     * @param tipoveiculo - tipo de veículo associado
     * @param combustivel - combustivel do veiculo
     * @param n_quilometros - nº de quilometros do veículo
     */
    public VeiculoLigeiro(int n_portas, int capacidade, String matricula, int nºpessoas, TipoVeiculo tipoveiculo, String combustivel, int n_quilometros) {
        super(matricula, nºpessoas, tipoveiculo, combustivel, n_quilometros);
        this.n_portas = n_portas;
        this.capacidade = capacidade;
        numVeiculosLigeiros++;
    }

    public int getN_portas() {
        return n_portas;
    }

    public void setN_portas(int n_portas) {
        this.n_portas = n_portas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append(super.toString());
        str.append("\nNºportas: ").append(n_portas);
        str.append("\nCapacidade: ").append(capacidade);

        return str.toString();

    }

}
