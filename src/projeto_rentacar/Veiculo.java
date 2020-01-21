/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que contém as caracteristicas de cada veículo
 *
 * @author 2181042/2172563
 */
public class Veiculo implements Serializable {

    public static int numVeiculos;
    protected String matricula;
    protected int nºpessoas;
    protected TipoVeiculo tipoveiculo;
    protected String combustivel;
    protected int n_quilometros;
    protected ArrayList<Aluguer> alugueres = new ArrayList<>();
    protected ArrayList<Aluguer> alugueresR = new ArrayList<>();

    /**
     *
     * @param matricula - matricula do veículo
     * @param nºpessoas - n de pessoas do veículo
     * @param tipoveiculo - tipo de veiculo associado ao veículo
     * @param combustivel - combistivel do veículo
     * @param n_quilometros - nº de quilometros do veículo
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
     *
     * @return total de alugueres do veículo
     */
    public int numeroDeAlugueres() {
        return alugueres.size();
    }

    /**
     * permite associar um aluguer a este veículo
     *
     * @param aluguer
     */
    public void adicionarAluguer(Aluguer aluguer) {
        alugueres.add(aluguer);
    }

    /**
     *
     * @return String contendo alugueres associados ao veículo
     */
    public String monstrarAlugueres() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres.size(); i++) {
            str.append(alugueres.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     *
     * @param pos
     * @return devolve o aluguer de uma deter«minada posição no ArrayList
     */
    public Aluguer obterAlugueres(int pos) {
        return alugueres.get(pos);
    }

    /**
     *
     * @return total de alugueres no estado Reservado
     */
    public int numeroAlugueresRes() {
        return alugueresR.size();
    }

    /**
     * permite adicionar um aluguer no estado reservado
     *
     * @param aluguer
     */
    public void adicionarAlugueresRes(Aluguer aluguer) {
        alugueresR.add(aluguer);
    }

    /**
     * Permite remover um aluguer do estado reservado
     *
     * @param aluguer
     */
    public void RemoverAlugueresRes(Aluguer aluguer) {
        alugueresR.remove(aluguer);
    }

    /**
     *
     * @return String contendo todos os alugueres no estado reservado para este
     * Veículo
     */
    public String mostrarAlugueresRes() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresR.size(); i++) {
            str.append("\n").append(alugueresR.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @param numAluguer
     * @return posição no ArrayList de um determinado numero de aluguer
     */
    public int pesquisarAlugueresRes(int numAluguer) {
        for (int i = 0; i < alugueresR.size(); i++) {
            if (alugueresR.get(i).getNumero() == numAluguer) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param pos
     * @return Devolve o aluguer associado a uma determinada posição
     */
    public Aluguer obterAlugueresRes(int pos) {
        return alugueresR.get(pos);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNºpessoas() {
        return nºpessoas;
    }

    public void setNºpessoas(int nºpessoas) {
        this.nºpessoas = nºpessoas;
    }

    public TipoVeiculo getTipoveiculo() {
        return tipoveiculo;
    }

    public void setTipoveiculo(TipoVeiculo tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getN_quilometros() {
        return n_quilometros;
    }

    public void setN_quilometros(int n_quilometros) {
        this.n_quilometros = n_quilometros;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nMatrícula: ").append(matricula);
        str.append("\nTipo: ").append(tipoveiculo.getDesignacao());
        str.append("\nNºpessoas: ").append(nºpessoas);
        str.append("\nCombustível: ").append(combustivel);
        str.append("\nNºquilómetros: ").append(n_quilometros);

        return str.toString();

    }

}
