/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Classe Que contém todas as informações de um determinado aluguer
 *
 * @author 2181042/2172563
 */
public class Aluguer implements Serializable {

    public static int numAlugueres;
    private int numero;
    private int estado = 1;
    private String localLevantamento;
    private String localEntrega;
    private Calendar dataHoraLevantamento;
    private Calendar dataHoraEntrega;
    private Condutor condutor;
    private Veiculo veiculo;
    private int numPessoas;
    private String carataristicas;
    private double preco;
    private ArrayList<Opcao> opcoes = new ArrayList<>();

    /**
     *
     * @param localLevantamento - local de levantamento do aluguer
     * @param localEntrega - local de entrega do aluguer
     * @param dataHoraLevantamento - data e hora de levantamento do aluguer
     * @param dataHoraEntrega - data e hora de entrega do aluguer
     * @param condutor - contém todas as caracteristicas do contutor associado
     * ao aluguer
     * @param veiculo - contém todas as caracteristicas do veículo associado ao
     * aluguer
     * @param numPessoas - número de pessoas associadop a aluguer
     * @param carataristicas * cacateristicas gerais do aluguer
     * @param preco - preço do aluguer
     */

    public Aluguer(String localLevantamento, String localEntrega, Calendar dataHoraLevantamento, Calendar dataHoraEntrega, Condutor condutor, Veiculo veiculo, int numPessoas, String carataristicas, double preco) {
        numAlugueres++;
        this.localLevantamento = localLevantamento;
        this.localEntrega = localEntrega;
        this.dataHoraLevantamento = dataHoraLevantamento;
        this.dataHoraEntrega = dataHoraEntrega;
        this.condutor = condutor;
        this.veiculo = veiculo;
        this.numPessoas = numPessoas;
        this.carataristicas = carataristicas;
        this.preco = preco;

    }

    /**
     * Permite adicionar uma opção de aluguer a este aluguer
     *
     * @param op - opção de aluguer
     */
    public void adicionarOpcao(Opcao op) {
        opcoes.add(op);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getLocalLevantamento() {
        return localLevantamento;
    }

    public void setLocalLevantamento(String localLevantamento) {
        this.localLevantamento = localLevantamento;
    }

    public String getLocalEntrega() {
        return localEntrega;
    }

    public void setLocalEntrega(String localEntrega) {
        this.localEntrega = localEntrega;
    }

    public Calendar getDataHoraLevantamento() {
        return dataHoraLevantamento;
    }

    public void setDataHoraLevantamento(Calendar dataHoraLevantamento) {
        this.dataHoraLevantamento = dataHoraLevantamento;
    }

    public Calendar getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(Calendar dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public String getCarataristicas() {
        return carataristicas;
    }

    public void setCarataristicas(String carataristicas) {
        this.carataristicas = carataristicas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Calcula o preço das opções de aluguer
     *
     * @return Preço total das opções associadas ao aluguer
     */
    public double precoOpcoes() {
        double preco = 0;
        for (int i = 0; i < opcoes.size(); i++) {
            preco += opcoes.get(i).getPreco();
        }
        return preco;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nNumero : ").append(numero);
        str.append("\nLocal de levantamento: ").append(localLevantamento);
        str.append("\nLocal e entrega: ").append(localEntrega);
        str.append("\nData e hora de levantamento: ").
                append(dataHoraLevantamento.get(Calendar.DATE)).append("-").
                append(dataHoraLevantamento.get(Calendar.MONTH) + 1).append("-").
                append(dataHoraLevantamento.get(Calendar.YEAR));
        str.append("\nData e hora de Entrega: ").
                append(dataHoraEntrega.get(Calendar.DATE)).append("-").
                append(dataHoraEntrega.get(Calendar.MONTH) + 1).append("-").
                append(dataHoraEntrega.get(Calendar.YEAR));
        //str.append("\nCondutor: ").append(condutor);
        str.append("\nVeiculo: ").append(veiculo);

        return str.toString();
    }

}
