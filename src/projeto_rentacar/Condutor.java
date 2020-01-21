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
 * Classe Que contém todas as informações de um determinado condutor
 *
 * @author 2181042/2172563
 */
public class Condutor extends Pessoa implements Serializable {

    public static int numCondutores;
    private String n_carta;
    private Calendar dataValCarta;
    private ArrayList<Aluguer> alugueres = new ArrayList<>();   //Lista que armazena os alugueres de um determinado condutor. Nesta lista nao há numeração automatica

    private ArrayList<Aluguer> alugueresR = new ArrayList<>();
    private ArrayList<Aluguer> alugueresI = new ArrayList<>();
    private ArrayList<Aluguer> alugueresC = new ArrayList<>();
    private ArrayList<Aluguer> alugueresT = new ArrayList<>();

    /**
     *
     * @param n_carta - n de carta de condução do condutor
     * @param dataValCarta - data de validade da carta.
     * @param NIF - NIF do condutor. Unico e identificativo do condutor
     * @param nome - Nome do condutor
     * @param morada - Morada do condutor
     * @param telefone - Numero de telemovel do condutor
     */
    public Condutor(String n_carta, Calendar dataValCarta, int NIF, String nome, String morada, int telefone) {
        super(NIF, nome, morada, telefone);
        this.n_carta = n_carta;
        this.dataValCarta = dataValCarta;
        numCondutores++;
    }

    public String getN_carta() {
        return n_carta;
    }

    public void setN_carta(String n_carta) {
        this.n_carta = n_carta;
    }

    public Calendar getDataValCarta() {
        return dataValCarta;
    }

    public void setDataValCarta(Calendar dataValCarta) {
        this.dataValCarta = dataValCarta;
    }

    /**
     * Metodo que adiciona um aluguer associado ao condutor
     *
     * @param aluguer - contém as caracteristicas do aluguer
     */
    public void adicionarAluguer(Aluguer aluguer) {
        alugueres.add(aluguer);
    }

    /**
     * Permite obter o aluguer de uma dada posição
     *
     * @param pos - posição no ArrayList
     * @return Retorna o aluguer da posição
     */
    public Aluguer obterAlugueres(int pos) {
        return alugueres.get(pos);
    }

    /**
     *
     * @return Retorna o numero de alugueres associados ao condutor
     */
    public int numeroAlugueres() {
        return alugueres.size();
    }

    /**
     * Mostra todos os alugueres associados ao condutor
     *
     * @return String com a informação de todos os alugueres
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
     * @return Numero de alugueres no estado reservado para o condutor
     */
    public int numeroAlugueresRes() {
        return alugueresR.size();
    }

    /**
     * Permite assossiar um aluguer ao condutor
     *
     * @param aluguer - contém as caracteristicas do aluguer
     */
    public void adicionarAlugueresRes(Aluguer aluguer) {
        alugueresR.add(aluguer);
    }

    /**
     * Remove o aluguer do estado RESERVADO
     *
     * @param aluguer - contém as caracteristicas do aluguer
     */
    public void RemoverAlugueresRes(Aluguer aluguer) {
        alugueresR.remove(aluguer);
    }

    /**
     * Mostra todos os alugueres associados ao condutor no estado RESERVADO
     *
     * @return String com todoa a informação dos alugueres no estado RESERVADO
     */
    public String mostrarAlugueresRes() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresR.size(); i++) {
            str.append("\n").append(alugueresR.get(i));
        }
        return str.toString();
    }

    /**
     * Permite obter a posição de um aluguer no estado RESERVADO no Array
     *
     * @param numAluguer - número de aluguer. Unico e identificativo de cada
     * aluguer
     * @return Posição no Array
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
     * Obter as informações de aluguer de uma determinada posição
     *
     * @param pos - posição no Array
     * @return informações do aluguer
     */
    public Aluguer obterAlugueresRes(int pos) {
        return alugueresR.get(pos);
    }

    /**
     *
     * @return Número de alugueres no estado INICIADO para o condutor
     */
    public int numeroAlugueresIn() {
        return alugueresI.size();
    }

    /**
     * Permite adicionar um aluguer no estado INICIADO para o condutor
     *
     * @param aluguer - contém as caracteristicas do aluguer
     */
    public void adicionarAlugueresIn(Aluguer aluguer) {
        alugueresI.add(aluguer);
    }

    /**
     * Permite remover um aluguer do estado INICIADO para o condutor
     *
     * @param aluguer - contém as caracteristicas do aluguer
     */
    public void removerAlugueresIn(Aluguer aluguer) {
        alugueresI.remove(aluguer);
    }

    /**
     * Mostra todos os alugueres INICIADOS para o condutor
     *
     * @return String com todos os alugueres iniciados
     */
    public String mostrarAlugueresIn() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresI.size(); i++) {
            str.append("\n").append(alugueresI.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @param numAluguer - número de aluguer. Unico e identificativo de cada
     * aluguer
     * @return Posição de um determinado aluguer no Array AlugueresI
     */
    public int pesquisarAlugueresIn(int numAluguer) {
        for (int i = 0; i < alugueresI.size(); i++) {
            if (alugueresI.get(i).getNumero() == numAluguer) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param pos - posição no array
     * @return Caracteristicas do aluguer da posiçãoindicada
     */
    public Aluguer obterAlugueresIn(int pos) {
        return alugueresI.get(pos);
    }

    /**
     *
     * @return numero de alugueres cancelados pelo condutor
     */
    public int numeroAlugueresCan() {
        return alugueresC.size();
    }

    /**
     * permite adicionar um aluguer à lista de alugueres cancelados pelo
     * condutor
     *
     * @param aluguer - contém todas as informações do aluguer
     */
    public void adicionarAlugueresCan(Aluguer aluguer) {
        alugueresC.add(aluguer);
    }

    /**
     *
     * @return String com informação de todos os alugueres cancelados pelo
     * condutor
     */
    public String mostrarAlugueresCan() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresC.size(); i++) {
            str.append("\n").append(alugueresC.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @return numero total de alugueres terminado pelo condutor
     */
    public int numeroAluguerester() {
        return alugueresT.size();
    }

    /**
     * permite adicionar o aluguer à lista de alugueres terminados pelo condutor
     *
     * @param aluguer - contém todas as informações do aluguer
     */
    public void adicionarAlugueresTer(Aluguer aluguer) {
        alugueresT.add(aluguer);
    }

    /**
     *
     * @return String com as informaçoes de todos os alugueres terminado pelo
     * condutor
     */
    public String mostrarAlugueresTer() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresT.size(); i++) {
            str.append("\n").append(alugueresT.get(i));
        }
        return str.toString();
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("");
        str.append(super.toString());
        str.append("\nNumero da carta de condução:: ").append(n_carta);
        str.append("\nData de validade da carta: ").
                append(dataValCarta.get(Calendar.DATE)).append("-").
                append(dataValCarta.get(Calendar.MONTH) + 1).append("-").
                append(dataValCarta.get(Calendar.YEAR));
        if (numeroAlugueres() > 0) {
            str.append("\n\nOs alugueres registados para o Senhor ").append(getNome()).append(" são os seguintes:\n");
            str.append(monstrarAlugueres());
        } else {
            str.append("\n\nO Senhor ").append(getNome()).append(" ainda não realizou alugueres");
        }
        return str.toString();

    }

}
