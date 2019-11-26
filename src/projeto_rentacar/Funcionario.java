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
public class Funcionario extends Pessoa{
    private String funcao;

    public Funcionario(String funcao, int NIF, String nome, String morada, int telefone) {
        super(NIF, nome, morada, telefone);
        this.funcao = funcao;
    }


    /**
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
    
    
    
}
