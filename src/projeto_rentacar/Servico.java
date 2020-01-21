/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que contém as caracteristicas de cada Levantamento/Entrega de veiculo
 *
 * @author 2181042/2172563
 */
public class Servico implements Serializable {

    public static int numServicos;
    private int numero;
    private Aluguer aluguer;
    private Calendar dataHoraServico;
    private String CondicoesVeiculo;
    private int nivelReserva;
    private Funcionario funcionario;
    private int quilometros;
    private char tipo;

    /**
     *
     * @param aluguer - comtém todas as informaçoes do aluguer associado ao
     * serviço
     * @param dataHoraServico - Contém a data e hora do serviço
     * @param CondicoesVeiculo - descrição das codiçoes do veiculo
     * @param nivelReserva - nivel da reserva
     * @param funcionario - contem as informações do funcionario
     * @param quilometros - numero de quilometros do veículo
     * @param tipo - tipo de serviço. levantamento ou entrega
     */
    public Servico(Aluguer aluguer, Calendar dataHoraServico, String CondicoesVeiculo, int nivelReserva, Funcionario funcionario, int quilometros, char tipo) {
        this.aluguer = aluguer;
        this.dataHoraServico = dataHoraServico;
        this.CondicoesVeiculo = CondicoesVeiculo;
        this.nivelReserva = nivelReserva;
        this.funcionario = funcionario;
        this.quilometros = quilometros;
        this.tipo = tipo;
        numServicos++;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Aluguer getAluguer() {
        return aluguer;
    }

    public void setAluguer(Aluguer aluguer) {
        this.aluguer = aluguer;
    }

    public Calendar getDataHoraServico() {
        return dataHoraServico;
    }

    public void setDataHoraServico(Calendar dataHoraServico) {
        this.dataHoraServico = dataHoraServico;
    }

    public String getCondicoesVeiculo() {
        return CondicoesVeiculo;
    }

    public void setCondicoesVeiculo(String CondicoesVeiculo) {
        this.CondicoesVeiculo = CondicoesVeiculo;
    }

    public int getNivelReserva() {
        return nivelReserva;
    }

    public void setNivelReserva(int nivelReserva) {
        this.nivelReserva = nivelReserva;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}
