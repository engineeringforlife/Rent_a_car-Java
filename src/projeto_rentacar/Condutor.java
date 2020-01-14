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
 *Classe derivada do objetivo de tipo pessoa, está associada a alugueres de 
 * veículo e caracterizado por um numero de identificação único
 * @author 2181042/2172563
 */
public class Condutor extends Pessoa implements Serializable{
    public static int numCondutores;
    private String n_carta;
    private Calendar dataValCarta;
    private ArrayList<Aluguer> alugueres = new ArrayList<>();   //Lista que armazena os alugueres de um determinado condutor. Nesta lista nao há numeração automatica
    
    private ArrayList<Aluguer> alugueresR = new ArrayList<>();
    private ArrayList<Aluguer> alugueresI = new ArrayList<>();
    private ArrayList<Aluguer> alugueresC = new ArrayList<>();
    private ArrayList<Aluguer> alugueresT = new ArrayList<>();
    
/**
 *Construtor que instancia a classe condutor
 * @param n_carta-documento único que caracteriza o condutor
 * @param dataValCarta- o que valida a carta de condução
 * @param NIF-número de identificação único que caracteriza cada pessoa
 * @param nome- o que caracteriza cada condutor ou pessoa
 * @param morada- local de residência do condutor
 * @param telefone- número de contacto do condutor
 */
    public Condutor(String n_carta, Calendar dataValCarta, int NIF, String nome, String morada, int telefone) {
        super(NIF, nome, morada, telefone);
        this.n_carta = n_carta;
        this.dataValCarta = dataValCarta;
        numCondutores++;
    }

    /**
     * @return the n_carta
     */
    public String getN_carta() {
        return n_carta;
    }

    /**
     * @param n_carta the n_carta to set
     */
    public void setN_carta(String n_carta) {
        this.n_carta = n_carta;
    }

    /**
     * @return the dataValCarta
     */
    public Calendar getDataValCarta() {
        return dataValCarta;
    }

    /**
     * @param dataValCarta the dataValCarta to set
     */
    public void setDataValCarta(Calendar dataValCarta) {
        this.dataValCarta = dataValCarta;
    }
    /**
     * Adiciona aluguer de cada condutor a lista de alugueres
     * @param aluguer- onde são guardados os condutores que fizeram os alugueres 
     */
    public void adicionarAluguer(Aluguer aluguer){
        alugueres.add(aluguer);
    }
/**
 * Obtem alugueres da lista de Aluguer
 * @param pos- posição onde se encontra o aluguer obtido
 * @return alugueres.size();- retorna o tamanho dos alugueres realizados por 
 * cada condutor
 */
    public Aluguer obterAlugueres (int pos){
        return alugueres.get(pos);
    }
    /**
     * Lista o número de alugueres realizados por um condutor
     * @return alugueres.size();- retorna o tamanho dos alugueres realizados por 
 * cada condutor
     */
    public int numeroAlugueres (){
        return alugueres.size();
    }
    /**
     * Mostra todos os alugueres realizados por determinado condutor
     * @return str.toString();
     */
    public String monstrarAlugueres (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres.size(); i++) {
            str.append(alugueres.get(i)).append("\n");
        }
        return str.toString();
    }
    
    
    
    /**
     * Lista o numero de alugueres reservados 
     * @return alugueresR.size();-retorna o tamanho dos alugueres reservados
     */
     public int numeroAlugueresRes(){
       return alugueresR.size();
    }
     /**
      * Adiciona alugueres a lista de alugueres reservados
      * @param aluguer onde são guardados os alugueres reservados
      */
    public void adicionarAlugueresRes(Aluguer aluguer){
        alugueresR.add(aluguer);
    }
    /**
     * Remove os alugueres reservados da lista de alugueres rervados
     * @param aluguer- onde são guardados os alugueres reservados
     */
    public void RemoverAlugueresRes(Aluguer aluguer){
        alugueresR.remove(aluguer);
    }
            /**
             * Mostra a lista dos alugueres reservados
             * @return str.toString();
             */   
        public String mostrarAlugueresRes (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresR.size(); i++) {
            str.append("\n").append(alugueresR.get(i));
        }
        return str.toString();
    }
        /**
         * Função que pesquisa alugueres reservados por numero de aluguer
         * @param numAluguer- numero de reserva associado a um aluguer
         * @return -1 se não encontrar o aluguer pelo número de aluguer 
         * pesquisado
         */
        public int pesquisarAlugueresRes (int numAluguer){
        for (int i = 0; i < alugueresR.size(); i++) {
            if(alugueresR.get(i).getNumero()==numAluguer){
                return i; 
            }
        }
        return -1;
    }
        /**
         * Obtem os alugueres reservados na lista dos alugueres reservados
         * @param pos
         * @return alugueresR.get(pos);- retorna a posição do aluguer
         * reservado
         */
        public Aluguer obterAlugueresRes (int pos){
        return alugueresR.get(pos);
    }
        
       /**
        * Lista o número de alugueres iniciados
        * @return  alugueresI.size();-retorna a lista de todos os 
        * alugueres reservados 
        */ 
    public int numeroAlugueresIn(){
        return alugueresI.size();
    }
    /**
     * Adiciona alugueres iniciados a lista de alugueres iniciados
     * @param aluguer onde são guardados os alugueres iniciados 
     */
    public void adicionarAlugueresIn(Aluguer aluguer){
        alugueresI.add(aluguer);
    }
    /**
     * Remove alugueres iniciados na lista de alugueres reservados 
     * @param aluguer onde são guardados os alugueres iniciados 
     */
    public void removerAlugueresIn(Aluguer aluguer){
        alugueresI.remove(aluguer);
    }
    /**
     * Mostra todos os alugueres iniciados
     * @return str.toString();
     */
    public String mostrarAlugueresIn (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresI.size(); i++) {
            str.append("\n").append(alugueresI.get(i));
        }
        return str.toString();   
    }
    /**
     * Obtem a lista de todos os alugueres iniciados
     * @param pos posição em que encontra os alugueres resevados
     * @return alugueresI.get(pos);- retorna a posição dos alugueres iniciados
     */
    public Aluguer obterAlugueresIn (int pos){
        return alugueresI.get(pos);
    }
    /**
     * Lista o número de alugueres reservados
     * @return alugueresC.size();-retorna todos os alugueres cancelados 
     */
    public int numeroAlugueresCan(){
       return alugueresC.size();
    }
    /**
     * Adiciona alugueres cancelados a lista de alugueres cancelados
     * @param aluguer - onde são guardados os alugures 
     */
    public void adicionarAlugueresCan(Aluguer aluguer){
        alugueresC.add(aluguer);
    }
    /**
     * Remove os alugueres cancelados na lista e alugueres cancelados
     * @param aluguer onde são guardados os alugueres
     */
    public void removerAlugueresCan(Aluguer aluguer){
        alugueresC.remove(aluguer);
    }
    /**
     * Mostra todos os alugueres cancelados 
     * @return str.toString();
     */
    public String mostrarAlugueresCan (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresC.size(); i++) {
            str.append("\n").append(alugueresC.get(i));
        }
        return str.toString();   
    }
    /**
     * Lista o número de alugueres terminados
     * @return alugueresT.size();- retorna todos os alugueres terminados 
     */
    public int numeroAluguerester(){
      return  alugueresT.size();
    }
    /**
     * Adiciona alugueres terminados a lista de terminados
     * @param aluguer- onde são guardados todos os alugueres terminados
     */
    public void adicionarAlugueresTer(Aluguer aluguer){
        alugueresT.add(aluguer);
    }
    /**
     * Remove alugueres terminados na lista de alugueres terminados
     * @param aluguer- onde são guardados os alugueres removidos
     */
    public void removerAlugueresTer(Aluguer aluguer){
        alugueresT.remove(aluguer);
    }
    /**
     * Mostra os alugueres terminados 
     * @return str.toString();
     */
    public String mostrarAlugueresTer (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresT.size(); i++) {
            str.append("\n").append(alugueresT.get(i));
        }
        return str.toString();    
    }
    
    
    
    /**
     * Define um objeto
     * @return str.toString();-retorna caracteres de string
     */
    
    @Override
    public String toString() {
        
        StringBuilder str = new StringBuilder("");
        str.append(super.toString());
        str.append("\nNumero da carta de condução:: ").append(n_carta);
        str.append("\nData de validade da carta: ").
                append(dataValCarta.get(Calendar.DATE)).append("-").
                append(dataValCarta.get(Calendar.MONTH)+1).append("-").
                append(dataValCarta.get(Calendar.YEAR));
        
        return str.toString();
                
                
    }
    
    
    
    
}

