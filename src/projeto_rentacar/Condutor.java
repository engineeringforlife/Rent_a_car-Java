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
 *
 * @author 2181042
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
    public void adicionarAluguer(Aluguer aluguer){
        alugueres.add(aluguer);
    }

    public Aluguer obterAlugueres (int pos){
        return alugueres.get(pos);
    }
    public int numeroAlugueres (){
        return alugueres.size();
    }
    public String monstrarAlugueres (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres.size(); i++) {
            str.append(alugueres.get(i)).append("\n");
        }
        return str.toString();
    }
    
    
     public int numeroAlugueresRes(){
       return alugueresR.size();
    }
    public void adicionarAlugueresRes(Aluguer aluguer){
        alugueresR.add(aluguer);
    }
    public void RemoverAlugueresRes(Aluguer aluguer){
        alugueresR.remove(aluguer);
    }
               
        public String mostrarAlugueresRes (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresR.size(); i++) {
            str.append("\n").append(alugueresR.get(i));
        }
        return str.toString();
    }
        public int pesquisarAlugueresRes (int numAluguer){
        for (int i = 0; i < alugueresR.size(); i++) {
            if(alugueresR.get(i).getNumero()==numAluguer){
                return i; 
            }
        }
        return -1;
    }
        public Aluguer obterAlugueresRes (int pos){
        return alugueresR.get(pos);
    }
        
        
    public int numeroAlugueresIn(){
        return alugueresI.size();
    }
    public void adicionarAlugueresIn(Aluguer aluguer){
        alugueresI.add(aluguer);
    }
    
    public void removerAlugueresIn(Aluguer aluguer){
        alugueresI.remove(aluguer);
    }
    
    public String mostrarAlugueresIn (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresI.size(); i++) {
            str.append("\n").append(alugueresI.get(i));
        }
        return str.toString();   
    }
     public int pesquisarAlugueresIn (int numAluguer){
        for (int i = 0; i < alugueresI.size(); i++) {
            if(alugueresI.get(i).getNumero()==numAluguer){
                return i; 
            }
        }
        return -1;
     }
    
    public Aluguer obterAlugueresIn (int pos){
        return alugueresI.get(pos);
    }
    
    public int numeroAlugueresCan(){
       return alugueresC.size();
    }
    public void adicionarAlugueresCan(Aluguer aluguer){
        alugueresC.add(aluguer);
    }
    
    public void removerAlugueresCan(Aluguer aluguer){
        alugueresC.remove(aluguer);
    }
    
    public String mostrarAlugueresCan (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresC.size(); i++) {
            str.append("\n").append(alugueresC.get(i));
        }
        return str.toString();   
    }
    
    public int numeroAluguerester(){
      return  alugueresT.size();
    }
    
    public void adicionarAlugueresTer(Aluguer aluguer){
        alugueresT.add(aluguer);
    }
    
    public void removerAlugueresTer(Aluguer aluguer){
        alugueresT.remove(aluguer);
    }
    
    public String mostrarAlugueresTer (){
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
                append(dataValCarta.get(Calendar.MONTH)+1).append("-").
                append(dataValCarta.get(Calendar.YEAR));
        if(numeroAlugueres()>0){
                    str.append("\n\nOs alugueres registados para o Senhor ").append(getNome()).append(" são os seguintes:\n");
                    str.append(monstrarAlugueres());
        }else{
             str.append("\n\nO Senhor ").append(getNome()).append(" ainda não realizou alugueres");
        }
        return str.toString();

    }
    
    
    
    
}

