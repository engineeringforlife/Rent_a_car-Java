/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.util.ArrayList;

/**
 *
 * @author 2181042
 */
public class GestaoRentacar {
    private ArrayList<Veiculo> veiculos= new ArrayList<>();
    private ArrayList<TipoVeiculo> tiposdeveiculo = new ArrayList<>();
    private ArrayList<Condutor> condutores = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();
    private ArrayList<Opcao> opcoes = new ArrayList<>();
    private ArrayList<Aluguer> alugueres = new ArrayList<>();
    
    //Extras:
    /*Ordenar elementosdas listas
    */
    
    
    public void adicionarVeiculo (Veiculo veiculo){
        veiculos.add(veiculo);    
    }
    
    //As validações sao feitas aqui ou na main?
    public String monstrarVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            str.append(veiculos.get(i)).append("\n");
        }
        return str.toString();
    }

    public void pesquisarVeiculoPorMatricula (){
        
        
        
    }
    
            
    /*public void obterVeiculoPor (){
        
    }
                */
    public int numeroVeiculos (){
        return veiculos.size();
    }
    public void adicionarTipoVeiculo (TipoVeiculo tipoveiculo){
          tipoveiculo.setNumero(tiposdeveiculo.size()+1);
          tiposdeveiculo.add(tipoveiculo);     
    }
    
    public String monstrarTipoVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i).getDesignacao());
        }
        return str.toString();
    }
    
        public int pesquisarTipodeVeiculo (String designacao){
        
            for (int i = 0; i < tiposdeveiculo.size(); i++) {
                if(tiposdeveiculo.get(i).getDesignacao().equalsIgnoreCase(designacao))
                    return i;   
            }
            return -1;      //retorna -1 se não encontrar tipos coma  mesma designação
        
        
    }
        

    public TipoVeiculo obterTipoVeiculo (int pos){
        return tiposdeveiculo.get(pos);
    }
                
    public int numeroTiposVeiculo (){
        return tiposdeveiculo.size();
    }
    
    public void adicionarCondutores (Condutor condutor){
        condutores.add(condutor);
    }
    
    public String monstrarCondutores (){
        
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < condutores.size(); i++) {
            str.append(condutores.get(i)).append("\n");
        }
        return str.toString();
        
    }
        
    public void pesquisarCondutorPorNome (){
        
    }
    
    /*
    public void pesquisarCondutorPor (){
        
    }
    public void pesquisarCondutorPor (){
        
    }
    public void pesquisarCondutorPor (){
        
    }*/
                
            
    public void obterCondutorPor (){
        
    }
                
    public void numeroCondutores (){
        
    }
    public void adicionarFuncionario (){
        
    }
    
    public void monstrarFuncionarios (){
        
    }
        
    public void pesquisarFuncionarioPor (){
        
    }
            
    public void obterFuncionarioPor (){
        
    }
                
    public void numeroDeFuncionarios (){
        
    }
    public void adicionarServico (){
        
    }
    
    public void monstrarServicos (){
        
    }
        
    public void pesquisarServicoPor (){
        
    }
            
    public void obterServicosPor (){
        
    }
                
    public void numeroDeServicos (){
        
    }
    public void adicionarOpcao (){
        
    }
    
    public void monstrarOpcaos (){
        
    }
        
    public void pesquisarOpcoesPor (){
        
    }
            
    public void obterOpcaoPor (){
        
    }
                
    public void numeroDeOpcoes (){
        
    }
    public void adicionarAluguer (){
        
    }
    
    public void monstrarAlugueres (){
        
    }
        
    public void pesquisarAlugueresPor (){
        
    }
            
    public void obterAlugueresPor (){
        
    }
                
    public void numeroDeAlugueres (){
        
    }
            
           
    
    
}
