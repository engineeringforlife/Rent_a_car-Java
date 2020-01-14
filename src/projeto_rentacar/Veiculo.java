/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 *Variável em estudo, onde cada veículo será associado um tipo de veículo, o 
 * preço que corresponde ao preço de aluguer de um veículo por dia
 * @author 2181042/2172563
 */
public class Veiculo implements Serializable{
    public static int numVeiculos;
    protected String matricula;
    protected int nºpessoas;
    protected TipoVeiculo tipoveiculo;
    protected String combustivel;       
    protected int n_quilometros;

    /**
     * Construtor que instancia a classe do tipo veículo
     * @param matricula- número único que caracteriza o veículo
     * @param nºpessoas- ocupação máxima do veículo
     * @param tipoveiculo-o tipo de veículo a ser alugado
     * @param combustivel-o tipo de combústivel do veículo a ser alugado
     * @param n_quilometros- número de quilómetros indicado no momento do aluguer
     */
    public Veiculo(String matricula, int nºpessoas, TipoVeiculo tipoveiculo, String combustivel, int n_quilometros) {
        this.matricula = matricula;
        this.nºpessoas = nºpessoas;
        this.tipoveiculo = tipoveiculo;
        this.combustivel = combustivel;
        this.n_quilometros = n_quilometros;
        numVeiculos++;
    }

    /**
     * Recebe o número de matrícula do Veículo
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nºpessoas
     */
    public int getNºpessoas() {
        return nºpessoas;
    }

    /**
     * @param nºpessoas the nºpessoas to set
     */
    public void setNºpessoas(int nºpessoas) {
        this.nºpessoas = nºpessoas;
    }

    /**
     * @return the tipoveiculo
     */
    public TipoVeiculo getTipoveiculo() {
        return tipoveiculo;
    }

    /**
     * @param tipoveiculo the tipoveiculo to set
     */
    public void setTipoveiculo(TipoVeiculo tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the n_quilometros
     */
    public int getN_quilometros() {
        return n_quilometros;
    }

    /**
     * @param n_quilometros the n_quilometros to set
     */
    public void setN_quilometros(int n_quilometros) {
        this.n_quilometros = n_quilometros;
    }
    
    /**
     *  Define um objeto
     * @return str.toString();-retorna caracteres de string
     */    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nMatrícula: ").append(matricula);
        str.append("\nNºpessoas: ").append(nºpessoas);
        str.append("\nCombustível: ").append(combustivel);
        str.append("\nNºquilómetros: ").append(n_quilometros);
        
        return str.toString();

    }
    
    
}
