/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 *Classe derivada do objeto do tipo Veículo
 * @author 2181042/2172563
 */
public class VeiculoLigeiro extends Veiculo implements Serializable{
    public static int numVeiculosLigeiros;
    private int n_portas;
    private int capacidade;
    
    /**
     * Construtor da classe veículo 
     * @param n_portas- número de portas que contém o veículo
     * @param capacidade- número de malas
     * @param matricula- número que caracteriza o veículo
     * @param nºpessoas-ocupação do veículo
     * @param tipoveiculo- tipo de veículo que foi associado a veículo
     * @param combustivel- tipo de combutível usado no veículo
     * @param n_quilometros-número de quilóemtros no momento do aluguer 
     */

    public VeiculoLigeiro(int n_portas, int capacidade, String matricula, int nºpessoas, TipoVeiculo tipoveiculo, String combustivel, int n_quilometros) {
        super(matricula, nºpessoas, tipoveiculo, combustivel, n_quilometros);
        this.n_portas = n_portas;
        this.capacidade = capacidade;
        numVeiculosLigeiros++;
    }

    /**
     * @return the n_portas
     */
    public int getN_portas() {
        return n_portas;
    }

    /**
     * @param n_portas the n_portas to set
     */
    public void setN_portas(int n_portas) {
        this.n_portas = n_portas;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    /**
     * Define um objeto
     * @return str.toString();-retorna caracteres de string
     */    
        @Override
        public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append(super.toString());
        str.append("\nNºportas: ").append(n_portas);
        str.append("\nCapacidade: ").append(capacidade);

        return str.toString();

    }
    
    
    
}
