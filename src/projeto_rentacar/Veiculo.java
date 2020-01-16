/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 2181042
 */
public class Veiculo implements Serializable{
    public static int numVeiculos;
    protected String matricula;
    protected int nºpessoas;
    protected TipoVeiculo tipoveiculo;
    protected String combustivel;       
    protected int n_quilometros;
    protected ArrayList<Aluguer> alugueres = new ArrayList<>();
    protected ArrayList<Aluguer> alugueresR = new ArrayList<>();

    public Veiculo(String matricula, int nºpessoas, TipoVeiculo tipoveiculo, String combustivel, int n_quilometros) {
        this.matricula = matricula;
        this.nºpessoas = nºpessoas;
        this.tipoveiculo = tipoveiculo;
        this.combustivel = combustivel;
        this.n_quilometros = n_quilometros;
        numVeiculos++;
    }

    
        public int numeroDeAlugueres (){
        return alugueres.size();
    }
         public void adicionarAluguer (Aluguer aluguer){
        alugueres.add(aluguer);
         }
    
    public String monstrarAlugueres (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres.size(); i++) {
            str.append(alugueres.get(i)).append("\n");
        }
        return str.toString();
    }
        
    public void pesquisarAlugueres (){
        
    }
            
    public Aluguer obterAlugueres (int pos){
        return alugueres.get(pos);
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
    
        
        
    
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nºpessoas
     */
    public int getNºpessoas() {
        return nºpessoas;
    }

    /**
     * @param nºpessoas the nºpessoas to set
     */
    public void setNºpessoas(int nºpessoas) {
        this.nºpessoas = nºpessoas;
    }

    /**
     * @return the tipoveiculo
     */
    public TipoVeiculo getTipoveiculo() {
        return tipoveiculo;
    }

    /**
     * @param tipoveiculo the tipoveiculo to set
     */
    public void setTipoveiculo(TipoVeiculo tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the n_quilometros
     */
    public int getN_quilometros() {
        return n_quilometros;
    }

    /**
     * @param n_quilometros the n_quilometros to set
     */
    public void setN_quilometros(int n_quilometros) {
        this.n_quilometros = n_quilometros;
    }
    
        
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\nMatrícula: ").append(matricula);
        str.append("\nNºpessoas: ").append(nºpessoas);
        str.append("\nCombustível: ").append(combustivel);
        str.append("\nNºquilómetros: ").append(n_quilometros);
        
        return str.toString();

    }
    
    
}
