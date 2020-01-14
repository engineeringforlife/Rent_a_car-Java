/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;

/**
 *Classe do objeto do tipo funcionário que deriva da classe pessoa
 * @author 2181042/2172563
 */
public class Funcionario extends Pessoa implements Serializable{
    public static int numFuncionarios;
    private String funcao;
/**
 * Construtor da classe funcionário
 * @param funcao- o papel desempenhado pelo funcionário da empresa de alugueres
 * @param NIF-o número de identificação único que identifica o funcionário
 * @param nome- o nome do funcionário de serviço
 * @param morada- morada do funcionáio em serviço
 * @param telefone - contacto do funcionáio em serviço
 */
    public Funcionario(String funcao, int NIF, String nome, String morada, int telefone) {
        super(NIF, nome, morada, telefone);
        this.funcao = funcao;
        numFuncionarios++;
    }


    /**
     * Recebe a função o funcionário
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
/**
 * Define um objeto
 * @return str.toString();-retorna caracteres de string
 */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append(super.toString());
        str.append("\nFunção: ").append(funcao);
        return str.toString();
        
        
        
    }
    
    
    
}
