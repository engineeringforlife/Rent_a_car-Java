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
public class VeiculoLigeiro extends Veiculo{
    
    private int n_portas;
    private int capacidade;

    public VeiculoLigeiro(int n_portas, int capacidade, String matricula, int nºpessoas, TipoVeiculo tipoveiculo, String combustivel, int n_quilometros) {
        super(matricula, nºpessoas, tipoveiculo, combustivel, n_quilometros);
        this.n_portas = n_portas;
        this.capacidade = capacidade;
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
    
    
    
    
}
