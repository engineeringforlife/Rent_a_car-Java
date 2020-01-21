/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 * Classe que contém todas as informações referentes ao funcionário.
 *
 * @author 2181042/2172563
 */
public class Funcionario extends Pessoa implements Serializable {

    public static int numFuncionarios;
    private String funcao;

    /**
     *
     * @param funcao Função que o funcionario desempenha
     * @param NIF - NIF do funcionário. Unico e identificativo
     * @param nome - Nome do funcionario
     * @param morada - Morada do funcionário
     * @param telefone - número de telemóvel do funcionário
     */
    public Funcionario(String funcao, int NIF, String nome, String morada, int telefone) {
        super(NIF, nome, morada, telefone);
        this.funcao = funcao;
        numFuncionarios++;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append(super.toString());
        str.append("\nFunção: ").append(funcao);
        return str.toString();

    }

}
