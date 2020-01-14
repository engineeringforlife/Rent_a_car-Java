/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *Classe onde serão guardadas todos os objetos relativamente aos alugueres
 * @author 2181042/2172563
 */
public class GestaoRentacar {
    private ArrayList<Veiculo> veiculos= new ArrayList<>();
    private ArrayList<VeiculoLigeiro> veiculosLigeiros = new ArrayList<>();
    private ArrayList<TipoVeiculo> tiposdeveiculo = new ArrayList<>();
    private ArrayList<Condutor> condutores = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();
    private ArrayList<Opcao> opcoes = new ArrayList<>();
    private ArrayList<Aluguer> alugueres = new ArrayList<>();
    
    private ArrayList<Aluguer> alugueresR = new ArrayList<>();
    private ArrayList<Aluguer> alugueresI = new ArrayList<>();
    private ArrayList<Aluguer> alugueresC = new ArrayList<>();
    private ArrayList<Aluguer> alugueresT = new ArrayList<>();
    
    //private ArrayList<Double> lucroAno = new ArrayList<>();
    private ArrayList<Estatisticas> estatisticas = new ArrayList<>();
    
    //Extras:
    /*Ordenar elementos das listas
    */
    
    /**
     * Adiciona o lucro ou preço total anual a lista lucro de aluguer anual
     * @param ano- o ano que será contabilizados o preço total de alugueres
     * @param mes- o mês que fará 12º mês desde o início dos alugueres
     * @param lucro_aluguer valor total atingido com os alugueres
     */
    public void adicionarLucro(int ano, int mes, double lucro_aluguer){
        

        double lucro_anual=estatisticas.get(ano - 2019).getLucro_anual();
        //double lucro_mensal=lucro.get(ano - 2019).getLucro_mensal(mes);
        double totalLucroAnual= lucro_anual + lucro_aluguer;
        //double totalLucroMensal=lucro_mensal + lucro_aluguer;
        
        estatisticas.get(ano - 2019).setLucro_anual(totalLucroAnual);
        //estatisticas.get(ano - 2019).setLucro_mensal(totalLucroMensal, mes);
        estatisticas.get(ano - 2019).addNum_alugueres_mensal(mes);
        
    }
    /**
     * Mostra o preço total de todos os alugueres
     * @return str.toString();
     */
    public String mostrarLucroAno (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < estatisticas.size(); i++) {
            str.append("\nO lucro no ano ").append(2019+i).append(" foi de ").append(estatisticas.get(i).getLucro_anual()).append(" €");
        }
        return str.toString();
    }
    
        /**
         * adiciona o preço total de alugueres por ano na lista de estatística
         * @param e- onde serão armazenados o preço total dos alugueres por ano
         */
    public void adicionarAnoLucro(Estatisticas e){
        estatisticas.add(e);
    }
    
    /**
     * Lista a estatística total do precço dos alugueres por ano
     * @return 
     */
    public int numeroAnoLucro(){
        return estatisticas.size();
    }
    
    /**
     * Lista o número de alugures reservados
     * @return 
     */
    public int numeroAlugueresRes(){
       return alugueresR.size();
    }
    /**
     * Adiciona alugueres reservados a lista de alugueres
     * @param aluguer- onde serão guardados todos os alugueres efectuados
     */
    public void adicionarAlugueresRes(Aluguer aluguer){
        alugueresR.add(aluguer);
    }
    
    /**
     * Remove alugueres reservados da lista de alugueres
     * @param aluguer-onde serão guardados todos os alugueres efectuados
     */
    public void RemoverAlugueresRes(Aluguer aluguer){
        alugueresR.remove(aluguer);
    }
     /**
      * Mostra a lista de todos os alugueres reservados, após ser registado
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
         * Lista o núero de alugueres iniciados
         * @return 
         */
    public int numeroAlugueresIn(){
        return alugueresI.size();
    }
    /**
     * Adiciona alugueres iniciados a lista de alugueres, uma vez que ja foi
     * iniciado, o aluguer não poderá ser cancelado
     * @param aluguer-onde serão guardados todos os alugueres efectuados
     */
    public void adicionarAlugueresIn(Aluguer aluguer){
        alugueresI.add(aluguer);
    }
    /**
     * Remove os alugueres iniciados da lista de alugueres reservados
     * @param aluguer-onde serão guardados todos os alugueres efectuados
     */
    public void removerAlugueresIn(Aluguer aluguer){
        alugueresI.remove(aluguer);
    }
    /**
     * Mostra todos os alugueres iniciados, a lista de reservados ficarão a zero
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
     * Lista o numero de alugueres cancelados, isto antes de serem iniciados
     * @return 
     */
    public int numeroAlugueresCan(){
       return alugueresC.size();
    }
    /**
     * Adiciona os alugures cancelados a lista de alugueres cancelados
     * @param aluguer-onde serão guardados todos os alugueres efectuados
     */
    public void adicionarAlugueresCan(Aluguer aluguer){
        alugueresC.add(aluguer);
    }
    /**
     * Remove todos os alugueres cancelados na lista de alugueres reservados
     * @param aluguer-onde serão guardados todos os alugueres efectuados
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
     * @return 
     */
    public int numeroAluguerester(){
      return  alugueresT.size();
    }
    /**
     * Adiciona alugueres terminados a lista de alugueres terminados
     * @param aluguer-onde serão guardados todos os alugueres efectuados
     */
    public void adicionarAlugueresTer(Aluguer aluguer){
        alugueresT.add(aluguer);
    }
    /**
     * Remove todos os alugueres terminados da lista dos alugueres iniciados
     * @param aluguer-onde serão guardados todos os alugueres efectuados 
     */
    public void removerAlugueresTer(Aluguer aluguer){
        alugueresT.remove(aluguer);
    }
    /**
     * Mostra todos os alugueres terminados
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
     * Adiciona veículos na lista de veículos
     * @param veiculo - onde serão guardados todos os veículos adiconados
     */
    public void adicionarVeiculo (Veiculo veiculo){
        veiculos.add(veiculo);    
    }
    
    /**
     * Mostra todos os veículos 
     * @return str.toString();
     */
    public String monstrarVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            str.append(veiculos.get(i)).append("\n");
        }
        return str.toString();
    }
/**
 * Pesquisa o veículo por número de identificação único(matrícula)
 * @param matricula- número de identificação único atribuído a cada veículo
 * @return -1 se se não encontrar tipos com o mesmo número de identificação(matrícula)
 */
    public int pesquisarVeiculoPorMatricula (String matricula){
        for (int i = 0; i < veiculos.size(); i++) {
                if(veiculos.get(i).getMatricula().equalsIgnoreCase(matricula)){
                    return i;   
            } 
        }
        return -1;      
    }
     /**
      * Obtem veículos e lista de veículos
      * @param pos- mostra em que posição se encontra o veículo pesquisado
      * @return veiculos.get(pos);
      */
    public Veiculo obterVeiculo (int pos){
        return veiculos.get(pos);
    }
     /**
      * Lista o número de identificação de todos os veículos
      * @return veiculos.size();-lista de todos os veículos
      */        
    public int numeroVeiculos (){
        return veiculos.size();
    }
    /**
     * Adiciona tipos de veículos a lista tipo de veículos
     * @param tipoveiculo- onde serão guardados todos os tipos de veículos
     */
    public void adicionarTipoVeiculo (TipoVeiculo tipoveiculo){
          tipoveiculo.setNumero(tiposdeveiculo.size()+1);
          tiposdeveiculo.add(tipoveiculo);     
    }
    /**
     * Mostra todos os tipos de veículos
     * @return str.toString();
     */
    public String monstrarTipoVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i));
        }
        return str.toString();
    }
    
    /**
     * Mostra os tipos de veículos por designação
     * @return str.toString(); 
     */
        public String monstrarDesignacaoTipoVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i).getDesignacao());
        }
        return str.toString();
    }
    
    /**
     * Procurar tipos de veículos por designação
     * @param designacao- a forma de procurar o veículo
     * @return -1 - se não encontrar tipos de veíclos com a mesma designação
     */
        public int pesquisarTipodeVeiculo (String designacao){
            for (int i = 0; i < tiposdeveiculo.size(); i++) {
                if(tiposdeveiculo.get(i).getDesignacao().equalsIgnoreCase(designacao))
                    return i;   
            }
            return -1;     
            
    }

        
/**
 * Obtem o topo de veículo na lista tipos de veículos
 * @param pos-mostra em que posição se encontra o tipo veículo pesquisado
 * @return tiposdeveiculo.get(pos);- retorna tipos de veículos e a posição em que se encontra
 */
    public TipoVeiculo obterTipoVeiculo (int pos){
        return tiposdeveiculo.get(pos);
    }
    /**
     * Lista o número de tipos de veículo
     * @return  return tiposdeveiculo.size();-retorna a lista do tamanho de tipos de veículos
     */            
    public int numeroTiposVeiculo (){
        return tiposdeveiculo.size();
    }
    /**
     * Adiciona todos os condutores na lista de condutores que pertence a lista de pessoas
     * @param condutor- aquele que fará a reserva do veículo 
     */
    public void adicionarCondutores (Condutor condutor){
        condutores.add(condutor);
        pessoas.add(condutor);
    }
    /**
     * Mostra a lista de todos os condutores
     * @return str.toString();
     */
    public String monstrarCondutores (){
        
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < condutores.size(); i++) {
            str.append(condutores.get(i)).append("\n");
        }
        return str.toString();
        
    }
      /**
       * Pesquisa de condutores por nome
       */
    public void pesquisarCondutorPorNome (){
        
    }
    
    /*
    public void pesquisarCondutorPor (){
        
    }
    public void pesquisarCondutorPor (){
        
    }
*/
    /**
     * 
     * @param pos- mostra em que posição se encontra o condutor com o nome pesquisado
     * @return condutores.get(pos);-retorna a lista dos condutores e a posição em que se encontra
     */
    public Condutor obterCondutor (int pos){
        return condutores.get(pos);
    }
                
    /**
     * Funçãoque pesquisa o condutor por numero de identificação único(NIF)
     * @param NIF- número identificação único que caracteriza o condutor 
     * @return -1 se não encontrar o condutor condutores com o mesmo nif
     */   
    public int pesquisarCondutorPorNIF (int NIF){
        for (int i = 0; i < condutores.size(); i++) {
                if(condutores.get(i).getNIF()==NIF)
                    return i;   
            }
            return -1;     
    }
    /**
     * Pesquia a pessoa por número de identificação único(NIF)
     * @param NIF- número identificação único que caracteriza uma pessoa
     * @return -1-se não encontrar pessoas com o mesmo nif
     */
        public int pesquisarPessoaPorNIF (int NIF){
        for (int i = 0; i < pessoas.size(); i++) {
                if(pessoas.get(i).getNIF()==NIF)
                    return i;   
            }
            return -1;      //retorna -1 se não encontrar pessoas com o mesmo nif
    }
        /**
         * 
         * @param pos mostra em que posição se encontra a ser pesquisada
         * @return pessoas.get(pos);- retorna a lista de pessoas e a posição em que se encontra
         */
        public Pessoa obterPessoa (int pos){
            return pessoas.get(pos);
        }
    
        
        /**
         * Lista o número de condutores 
         * @return condutores.size(); - retorna o tamanho da lista dos condutores
         */        
    public int numeroCondutores (){
        return condutores.size();
    }
    /**
     * Adiciona funcionário a lista de funcionários, que é deridado da lista de pessoas
     * @param funcionario - onde serão guardados todos os funcionários
     */
    public void adicionarFuncionario (Funcionario funcionario){
        funcionarios.add(funcionario);
        pessoas.add(funcionario);
    }
    /**
     * Mostra a lista de todos os funcionários 
     * @return str.toString();
     */
    public String monstrarFuncionarios (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < funcionarios.size(); i++) {
            str.append(funcionarios.get(i)).append("\n");
        }
        return str.toString();
    }
        
    public void pesquisarFuncionarioPor (){
        
    }
            
    public void obterFuncionarioPor (){
        
    }
                
    public int numeroDeFuncionarios (){
        return funcionarios.size();
        
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
    /**
     * Adiciona opcão a lista de opções
     * @param op- onde são guardadas todas as opções
     */
    public void adicionarOpcao (Opcao op){
        opcoes.add(op);
    }
    /**
     * Mostra todas a opções da lista de opções
     * @return str.toString();
     */
    public String monstrarOpcoes (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < opcoes.size(); i++) {
            str.append(opcoes.get(i)).append("\n");
        }
        return str.toString();
    }
      /**
       * Pesquisar opções por nome na lista dos nomes
       * @param nome- onde estão todos os nomes
       * @return -1 senão encontrar opções com o mesmo nome
       */
    public int pesquisarOpcaoPorNome (String nome){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < opcoes.size(); i++) {
                if(opcoes.get(i).getNome().equalsIgnoreCase(nome))
                    return i;   
            }
            return -1;      
    }
         /**
          * Obter opção na lista de opções
          * @param pos posição da opção escolhida
          * @return  opcoes.get(pos);- retorna a posição da posição
          */   
    public Opcao obterOpcao (int pos){
        return opcoes.get(pos);
    }
       /**
        * Lista o número de todas as opções
        * @return opcoes.size();- retorna das as opções
        */       
    public int numeroDeOpcoes (){
        return opcoes.size();
        
    }
    /**
     * Adiciona todos os alugueres a lista de alugueres
     * @param aluguer-onde são guardados todos os alugueres 
     */
    public void adicionarAluguer (Aluguer aluguer){
        alugueres.add(aluguer);
        alugueres.get(numeroDeAlugueres()-1).setNumero(numeroDeAlugueres());
        
    }
    /**
     * Lista o número total de alugueres 
     * @return alugueres.size();- retorna o número de todos os alugueres
     */
    public int numeroDeAlugueres (){
        return alugueres.size();
    }
    
    /**
     * Mostra todos os alugueres
     * @return str.toString();
     */
    public String monstrarAlugueres (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres.size(); i++) {
            str.append(alugueres.get(i)).append("\n");
        }
        return str.toString();
    }
        
    public void pesquisarAlugueres (){
        
    }
     /**
      * Obtem alugueres na lista de alugueres
      * @param pos- posição que se encontra o aluguer
      * @return alugueres.get(pos);
      */       
    public Aluguer obterAlugueres (int pos){
        return alugueres.get(pos);
    }
                
/**
 * Função que diferencia os dias, o dia de entraga do veículo não 
 * pode ser superior ao da entrega
 * @param dataIni data que inicia o aluguer ou a reserva
 * @param dataFim data da entrega do veículo
 * @return difDias, retorna a quantidade de dias em que o veículo esteve alugado
 */
    
        public long diferencaDias(Calendar dataIni, Calendar dataFim) {
        long difDias = (dataFim.getTimeInMillis() - dataIni.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        //System.out.println("Diferença dias: " + difDias);
        return difDias;
    }
/**
 * Função que diferencia os meses, o mês do início do aluguer não pode ser
 * superior ao mês de entrega do veículo
 * @param dataIni data que inicia o aluguer ou a reserva
 * @param dataFim data da entrega do veículo
 */
    public void diferencaMeses(Calendar dataIni, Calendar dataFim) {
        int difMes = dataFim.get(Calendar.MONTH) - dataIni.get(Calendar.MONTH);
        int difMesAno = ((dataFim.get(Calendar.YEAR) - dataIni.get(Calendar.YEAR)) * 12);
        int total = difMesAno + difMes;
        if (dataFim.get(Calendar.DATE) < dataIni.get(Calendar.DATE)) {
            total--;
        }
        System.out.println("Diferença meses: " + total);

    }
/**
 * Função que diferencia os anos, a data de início não pode ser superior a 
 * data do fim
 * @param dataIni- data que inicia o aluguer ou a reserva
 * @param dataFim data da entrega do veículo
 */
    public void diferencaAnos(Calendar dataIni, Calendar dataFim) {
        int difAnos = dataFim.get(Calendar.YEAR) - dataIni.get(Calendar.YEAR);
        if (dataFim.get(Calendar.DAY_OF_YEAR) < dataIni.get(Calendar.DAY_OF_YEAR)) {
            difAnos--;
        }
        System.out.println("Diferença anos: " + difAnos);

    }
    /**
     * Cálculo das percentagens de reservas canceladas
     * @return percentagem de todas a as reservas canceladas
     */
    public double percentagemReservasCanceladas(){
        double percentagem; 
        percentagem=((double)alugueresC.size()/alugueres.size())*100;
        return percentagem;
    }
    
    /**
     * Função para gravar os ficheiros
     */
    
        public void gravarFicheiro() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Dados.dat"));
            
            out.writeObject(tiposdeveiculo);
            out.writeObject(veiculos);
            out.writeObject(condutores);
            out.writeObject(funcionarios);
            out.writeObject(pessoas);
            out.writeObject(servicos);
            out.writeObject(opcoes);
            out.writeObject(alugueres);
            out.writeObject(alugueresR);
            out.writeObject(alugueresI);
            out.writeObject(alugueresC);
            out.writeObject(alugueresT);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
        
   /**
    * Função que lê ficheiros
    */

    public void lerFicheiro() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Dados.dat"));
            
            tiposdeveiculo = (ArrayList<TipoVeiculo>) in.readObject();
            veiculos = (ArrayList<Veiculo>) in.readObject();
            condutores = (ArrayList<Condutor>) in.readObject();
            funcionarios = (ArrayList<Funcionario>) in.readObject();
            pessoas = (ArrayList<Pessoa>) in.readObject();
            servicos = (ArrayList<Servico>) in.readObject();
            opcoes = (ArrayList<Opcao>) in.readObject();
            alugueres = (ArrayList<Aluguer>) in.readObject();
            alugueresR = (ArrayList<Aluguer>) in.readObject();
            alugueresI = (ArrayList<Aluguer>) in.readObject();
            alugueresC = (ArrayList<Aluguer>) in.readObject();
            alugueresT = (ArrayList<Aluguer>) in.readObject();
            
            Aluguer.numAlugueres = alugueres.size();
            Condutor.numCondutores = condutores.size();
            Funcionario.numFuncionarios = funcionarios.size();
            Opcao.numOpcoes = opcoes.size();
            Pessoa.numPessoas = pessoas.size();
            Servico.numServicos = servicos.size();
            TipoVeiculo.numTiposDeVeiculo = tiposdeveiculo.size();
            Veiculo.numVeiculos = veiculos.size();
            VeiculoLigeiro.numVeiculosLigeiros = veiculosLigeiros.size();
          /*  Curso.numCursos = cursos.size();
            Aluno.numAlunos = alunos.size();
            FuncionarioDocente.numDocentes = docentes.size();
            FuncionarioNaoDocente.numNaoDocentes = naoDocentes.size();
*/
            in.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private Object append(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
           
    
    
}
