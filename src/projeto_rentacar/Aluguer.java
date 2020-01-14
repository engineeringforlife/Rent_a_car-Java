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
 *Classe fundamental para efetuar o registo de um aluguer
 * @author 2181042/272563
 */
public class Aluguer implements Serializable {
    public static int numAlugueres;
    private int numero;
    private int estado=1;       
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
 * Responsável pelo objeto do tipo aluguer, ou instancia a classe aluguer
 * @param localLevantamento- o lugar definido para o cliente levantar o veículo depois do reserva do mesmo
 * @param localEntrega- local definido para entregar o veículo depois de alugado
 * @param dataHoraLevantamento- o horario definido para ser entregue o veículo
 * @param dataHoraEntrega- horario definido para entrega do veículo alugado 
 * @param condutor- a pessoa que reservou ou alugou o veículo
 * @param veiculo- a variável responsável pelo aluguer
 * @param numPessoas- capacidade máxima do veículo
 * @param carataristicas- característica do aluguer
 * @param preco- valor a pagar pelo empréstimo do veículo
 */
    public Aluguer(String localLevantamento, String localEntrega, Calendar dataHoraLevantamento, Calendar dataHoraEntrega, Condutor condutor, Veiculo veiculo, int numPessoas, String carataristicas, double preco) {

        this.localLevantamento = localLevantamento;
        this.localEntrega = localEntrega;
        this.dataHoraLevantamento = dataHoraLevantamento;
        this.dataHoraEntrega = dataHoraEntrega;
        this.condutor = condutor;
        this.veiculo = veiculo;
        this.numPessoas = numPessoas;
        this.carataristicas = carataristicas;
        this.preco = preco;
        numAlugueres++;
    }

    /**
     * adiciona opcao a lista op
     * @param op- lista onte contém todas as opções do aluguer
     */
    public void adicionarOpcao(Opcao op) {
        opcoes.add(op);
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
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the localLevantamento
     */
    public String getLocalLevantamento() {
        return localLevantamento;
    }

    /**
     * @param localLevantamento the localLevantamento to set
     */
    public void setLocalLevantamento(String localLevantamento) {
        this.localLevantamento = localLevantamento;
    }

    /**
     * @return the localEntrega
     */
    public String getLocalEntrega() {
        return localEntrega;
    }

    /**
     * @param localEntrega the localEntrega to set
     */
    public void setLocalEntrega(String localEntrega) {
        this.localEntrega = localEntrega;
    }

    /**
     * @return the dataHoraLevantamento
     */
    public Calendar getDataHoraLevantamento() {
        return dataHoraLevantamento;
    }

    /**
     * @param dataHoraLevantamento the dataHoraLevantamento to set
     */
    public void setDataHoraLevantamento(Calendar dataHoraLevantamento) {
        this.dataHoraLevantamento = dataHoraLevantamento;
    }

    /**
     * @return the dataHoraEntrega
     */
    public Calendar getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    /**
     * @param dataHoraEntrega the dataHoraEntrega to set
     */
    public void setDataHoraEntrega(Calendar dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    /**
     * @return the condutor
     */
    public Condutor getCondutor() {
        return condutor;
    }

    /**
     * @param condutor the condutor to set
     */
    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the numPessoas
     */
    public int getNumPessoas() {
        return numPessoas;
    }

    /**
     * @param numPessoas the numPessoas to set
     */
    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    /**
     * @return the carataristicas
     */
    public String getCarataristicas() {
        return carataristicas;
    }

    /**
     * @param carataristicas the carataristicas to set
     */
    public void setCarataristicas(String carataristicas) {
        this.carataristicas = carataristicas;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double precoOpcoes(){
        double preco=0;
         for (int i = 0; i < opcoes.size(); i++) {
               preco+=opcoes.get(i).getPreco();   
            }
          return preco;
    }
    /**
     * Define um objeto
     * @return str.toString();-retorna caracteres de string
     */

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nNumero : ").append(numero);
        str.append("\nLocal de levantamento: ").append(localLevantamento);
        str.append("\nLocal e entrega: ").append(localEntrega);
        str.append("\nData e hora de levantamento: ").
                append(dataHoraLevantamento.get(Calendar.DATE)).append("-").
                append(dataHoraLevantamento.get(Calendar.MONTH)+1).append("-").
                append(dataHoraLevantamento.get(Calendar.YEAR));
        str.append("\nData e hora de Entrega: ").
                append(dataHoraEntrega.get(Calendar.DATE)).append("-").
                append(dataHoraEntrega.get(Calendar.MONTH)+1).append("-").
                append(dataHoraEntrega.get(Calendar.YEAR));
        str.append("\nCondutor: ").append(condutor);
        str.append("\nVeiculo: ").append(veiculo);
        
        return str.toString();
    }


    /**
     * @return the opcoes
     */

    
/*Adicionar metodos para Lista*/
    
    

    
    
    
}
