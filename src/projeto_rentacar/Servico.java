/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.util.Calendar;

/**
 *
 * @author 2181042
 */
public class Servico {
    
    private int numero;
    private Aluguer aluguer;       
    private Calendar dataHoraServico;       
    private String CondicoesVeiculo;       
    private int nivelReserva;       
    private Funcionario funcionario;       
    private int quilometros;
    private char tipo;

    public Servico(Aluguer aluguer, Calendar dataHoraServico, String CondicoesVeiculo, int nivelReserva, Funcionario funcionario, int quilometros, char tipo) {
        this.aluguer = aluguer;
        this.dataHoraServico = dataHoraServico;
        this.CondicoesVeiculo = CondicoesVeiculo;
        this.nivelReserva = nivelReserva;
        this.funcionario = funcionario;
        this.quilometros = quilometros;
        this.tipo = tipo;
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
     * @return the aluguer
     */
    public Aluguer getAluguer() {
        return aluguer;
    }

    /**
     * @param aluguer the aluguer to set
     */
    public void setAluguer(Aluguer aluguer) {
        this.aluguer = aluguer;
    }

    /**
     * @return the dataHoraServico
     */
    public Calendar getDataHoraServico() {
        return dataHoraServico;
    }

    /**
     * @param dataHoraServico the dataHoraServico to set
     */
    public void setDataHoraServico(Calendar dataHoraServico) {
        this.dataHoraServico = dataHoraServico;
    }

    /**
     * @return the CondicoesVeiculo
     */
    public String getCondicoesVeiculo() {
        return CondicoesVeiculo;
    }

    /**
     * @param CondicoesVeiculo the CondicoesVeiculo to set
     */
    public void setCondicoesVeiculo(String CondicoesVeiculo) {
        this.CondicoesVeiculo = CondicoesVeiculo;
    }

    /**
     * @return the nivelReserva
     */
    public int getNivelReserva() {
        return nivelReserva;
    }

    /**
     * @param nivelReserva the nivelReserva to set
     */
    public void setNivelReserva(int nivelReserva) {
        this.nivelReserva = nivelReserva;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the quilometros
     */
    public int getQuilometros() {
        return quilometros;
    }

    /**
     * @param quilometros the quilometros to set
     */
    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
  
    
    
}
