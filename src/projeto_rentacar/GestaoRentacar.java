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
import java.util.Collections;
import static projeto_rentacar.Projeto_RentaCar.gr;

  

/**
 *
 * @author 2181042
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
    /*Ordenar elementosdas listas
    */
    
    
    

    
    
        public String mostrarAlugueresMensalDec(int ano) {

        OrdenaAlugueresMensal on = new OrdenaAlugueresMensal();
        Collections.sort(estatisticas.get(ano - 2019).getAlugueres_mensal(), on);
        return estatisticas.get(ano - 2019).mostrarAlugueresMensal();

    }
    

    
    public void adicionarLucro(int ano, int mes, double lucro_aluguer){
        
        

        double lucro_anual = estatisticas.get(ano - 2019).getLucro_anual();
        double lucro_mensal=estatisticas.get(ano - 2019).getLucro_mensal(mes+1);
        
        double totalLucroAnual = lucro_anual + lucro_aluguer;
        double totalLucroMensal = lucro_mensal + lucro_aluguer;
        
        estatisticas.get(ano - 2019).setLucro_anual(totalLucroAnual);
        estatisticas.get(ano - 2019).setLucro_mensal(totalLucroMensal, mes+1);
        estatisticas.get(ano - 2019).addNum_alugueres_mensal(mes+1);
        
    }
    
    
    public String mostrarLucroAno (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < estatisticas.size(); i++) {
            str.append("\nO lucro no ano ").append(2019+i).append(" foi de ").append(estatisticas.get(i).getLucro_anual()).append(" €");
        }
        return str.toString();
    }
    
        
    public void adicionarAnoLucro(Estatisticas e){
        estatisticas.add(e);
    }
    
    public int numeroAnoLucro(){
        return estatisticas.size();
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
    
    
    public String mostrarAlugueresMes (int ano){
        
        
        StringBuilder str = new StringBuilder("");
       
        str.append("Para o ano ").append(ano).append(" constam os seguintes dados: ");

        
        for (int i = 11; i>=0; i--) { 
            str.append("\n\nMês ").append(i+1).append("\nNumero de alugueres : ").append(estatisticas.get(ano-2019).getNum_alugueres_mensal(i))
                    .append("\nLucro : ").append(estatisticas.get(ano-2019).getLucro_mensal(i)).append("€");
                
        }
        return str.toString();
    }    
    
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

    public int pesquisarVeiculoPorMatricula (String matricula){
        for (int i = 0; i < veiculos.size(); i++) {
                if(veiculos.get(i).getMatricula().equalsIgnoreCase(matricula)){
                    return i;   
            } 
        }
        return -1;      //retorna -1 se não encontrar tipos coma  mesma designação
    }
     
    public Veiculo obterVeiculo (int pos){
        return veiculos.get(pos);
    }
                
    public int numeroVeiculos (){
        return veiculos.size();
    }
    public void adicionarTipoVeiculo (TipoVeiculo tipoveiculo){
          tipoveiculo.setNumero(tiposdeveiculo.size()+1);
          tiposdeveiculo.add(tipoveiculo);     
    }
    
        public String monstrarNumVeiculosPorTipo (){
        StringBuilder str = new StringBuilder("");
        str.append("\n-------------------------------------------\n");
            str.append("Tipo de veículo").append("\t\t").append("Número de veículos");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i).getDesignacao()).append("\t\t").append(" - ").append("\t").append(tiposdeveiculo.get(i).numeroVeiculos());
        }
            str.append("\n-------------------------------------------");
        return str.toString();
    }
    
    public String monstrarTipoVeiculos (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i));
        }
        return str.toString();
    }
        public String monstrarDesignacaoTipoVeiculos (){
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
        pessoas.add(condutor);
    }
    
    public String monstrarCondutores (){
        
        StringBuilder str = new StringBuilder("");
        str.append("Lista de consutores: \n");
        for (int i = 0; i < condutores.size(); i++) {
            str.append("\n-------------------------------------\n")
                    .append("\nNome: ").append(condutores.get(i).getNome())
                    .append("\nNIF:").append(condutores.get(i).getNIF());
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
*/
    public Condutor obterCondutor (int pos){
        return condutores.get(pos);
    }
                
            
    public int pesquisarCondutorPorNIF (int NIF){
        for (int i = 0; i < condutores.size(); i++) {
                if(condutores.get(i).getNIF()==NIF)
                    return i;   
            }
            return -1;      //retorna -1 se não encontrar tipos com o mesmo nif
    }
    
        public int pesquisarPessoaPorNIF (int NIF){
        for (int i = 0; i < pessoas.size(); i++) {
                if(pessoas.get(i).getNIF()==NIF){
                    return i;   
                }

            }
            return -1;      //retorna -1 se não encontrar pessoas com o mesmo nif
    }
        public Pessoa obterPessoa (int pos){
            return pessoas.get(pos);
        }
    
        
                
    public int numeroCondutores (){
        return condutores.size();
    }
    public void adicionarFuncionario (Funcionario funcionario){
        funcionarios.add(funcionario);
        pessoas.add(funcionario);
    }
    
    public String monstrarFuncionarios (){
        StringBuilder str = new StringBuilder("");
        str.append("Lista de consutores: \n");
        for (int i = 0; i < funcionarios.size(); i++) {
            str.append("\n-------------------------------------\n")
                    .append("\nNome: ").append(funcionarios.get(i).getNome())
                    .append("\nNIF:").append(funcionarios.get(i).getNIF());
        }
        return str.toString();
    }
        
    public int pesquisarFuncionarioPorNIF (int NIF){
         for (int i = 0; i < funcionarios.size(); i++) {
                if(funcionarios.get(i).getNIF()==NIF){
                    return i;  
                }    
            }
            return -1;      //retorna -1 se não encontrar pessoas com o mesmo nif
    }
            
    public Funcionario obterFuncionario (int pos){
        return funcionarios.get(pos);
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
                

    public void adicionarOpcao (Opcao op){
        op.setNumero(opcoes.size()+1);
        opcoes.add(op);
        
    }
    
    public String monstrarOpcoes (){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < opcoes.size(); i++) {
            str.append(opcoes.get(i)).append("\n");
        }
        return str.toString();
    }
        
    public int pesquisarOpcaoPorNome (String nome){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < opcoes.size(); i++) {
                if(opcoes.get(i).getNome().equalsIgnoreCase(nome))
                    return i;   
            }
            return -1;      //retorna -1 se não encontrar tipos coma  mesma designação
    }
            
    public Opcao obterOpcao (int pos){
        return opcoes.get(pos);
    }
                
    public int numeroDeOpcoes (){
        return opcoes.size();
        
    }
    public void adicionarAluguer (Aluguer aluguer){
        alugueres.add(aluguer);
        alugueres.get(numeroDeAlugueres()-1).setNumero(numeroDeAlugueres());
        
    }
    public int numeroDeAlugueres (){
        return alugueres.size();
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
    
        public void adicionarServico(Servico s){
        servicos.add(s);
        servicos.get(numeroDeServicos()-1).setNumero(numeroDeServicos());
    }
        public int numeroDeServicos (){
        return servicos.size();
    }

    
    
        public boolean verificaDisponibilidade(Calendar dataLevantamento, Calendar dataEntrega, Veiculo veiculo){
            for (int i = 0; i < veiculo.numeroAlugueresRes(); i++) {
                if (dataEntrega.after(veiculo.alugueresR.get(i).getDataHoraEntrega()) && dataEntrega.before(veiculo.alugueresR.get(i).getDataHoraLevantamento())){    //verifica se a data inserida esta no intervalo de qualquer aluguer
                    return false;     
                }
                if (dataLevantamento.after(veiculo.alugueresR.get(i).getDataHoraEntrega()) && dataLevantamento.before(veiculo.alugueresR.get(i).getDataHoraLevantamento())){    //verifica se a data inserida esta no intervalo de qualquer aluguer
                    return false;     
                }
                if(veiculo.alugueresR.get(i).getDataHoraEntrega().after(dataLevantamento) && veiculo.alugueresR.get(i).getDataHoraEntrega().before(dataEntrega) ){  //verifiva se existe algum aluguer entre as datas
                   return false; 
                } 
            }    
                   return true; 
        }
    /*    
    public String mostraVeiculosDisponiveis(Calendar dataLevantamento, Calendar dataEntrega) {
        StringBuilder str = new StringBuilder("");
        str.append(monstrarVeiculos());

        for (int i = 0; i < numeroVeiculos(); i++) {
            for (int j = 0; j < veiculos.get(i).numeroAlugueresRes(); j++) {
                if (dataEntrega.after(veiculos.get(i).alugueresR.get(j).getDataHoraEntrega()) && dataEntrega.before(veiculos.get(i).alugueresR.get(j).getDataHoraLevantamento())) {    //verifica se a data inserida esta no intervalo de qualquer aluguer
                if (dataLevantamento.after(veiculos.get(i).alugueresR.get(j).getDataHoraEntrega()) && dataLevantamento.before(veiculos.get(i).alugueresR.get(j).getDataHoraLevantamento())) {    //verifica se a data inserida esta no intervalo de qualquer aluguer
            }
            }else{
                    
                }
            
            if (veiculos.get(i).getDataHoraEntrega().after(dataLevantamento) && veiculo.alugueresR.get(i).getDataHoraEntrega().before(dataEntrega)) {  //verifiva se existe algum aluguer entre as datas
                return false;
            }
            }

        }
    }

    */
        public long diferencaDias(Calendar dataIni, Calendar dataFim) {
        long difDias = (dataFim.getTimeInMillis() - dataIni.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        //System.out.println("Diferença dias: " + difDias);
        return difDias;
    }

    public void diferencaMeses(Calendar dataIni, Calendar dataFim) {
        int difMes = dataFim.get(Calendar.MONTH) - dataIni.get(Calendar.MONTH);
        int difMesAno = ((dataFim.get(Calendar.YEAR) - dataIni.get(Calendar.YEAR)) * 12);
        int total = difMesAno + difMes;
        if (dataFim.get(Calendar.DATE) < dataIni.get(Calendar.DATE)) {
            total--;
        }
        System.out.println("Diferença meses: " + total);

    }

    public void diferencaAnos(Calendar dataIni, Calendar dataFim) {
        int difAnos = dataFim.get(Calendar.YEAR) - dataIni.get(Calendar.YEAR);
        if (dataFim.get(Calendar.DAY_OF_YEAR) < dataIni.get(Calendar.DAY_OF_YEAR)) {
            difAnos--;
        }
        System.out.println("Diferença anos: " + difAnos);

    }
    
    public double percentagemReservasCanceladas(){
        double percentagem; 
        percentagem=((double)alugueresC.size()/alugueres.size())*100;
        return percentagem;
    }
    
    /*
    public String verificaDatas(Calendar dataLevantamento, Calendar dataEntrega) {
        double dias, dias1, dias2, dias3;
        StringBuilder str = new StringBuilder("");
        
        for (int j = 0; j < veiculos.size(); j++) {
            Veiculo v = obterVeiculo(j);
        for (int i = 0; i < v.numeroDeAlugueres(); i++) {
            Aluguer a = v.obterAlugueres(i);
            dias = diferencaDias(dataEntrega, a.getDataHoraLevantamento());     
            dias1 = diferencaDias(dataEntrega, a.getDataHoraEntrega());
            dias2 = diferencaDias(dataLevantamento, a.getDataHoraLevantamento());
            dias3 = diferencaDias(dataLevantamento, a.getDataHoraEntrega());

            if (dias > 0 && dias1 < 0) {        //Se verdadeiro, sifnifica que a data de entrega não esta compreendida entre a data de entrega e data de levantamento de um dado aluguer para o veículo
                if (dias2 > 0 && dias3 < 0) {   //Se verdadeiro, sifnifica que a data de levantamento não esta compreendida entre a data de entrega e data de levantamento de um dado aluguer para o veículo
                    System.out.println("o veiculo x não da");
                } else {
                    System.out.println("aqui nao da");
                }
            } else {
                System.out.println("aqui não da");
            }
        }
        str.append(str);
       
        
        }
        return str.toString();
    }
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
            out.writeObject(estatisticas);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


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
            estatisticas = (ArrayList<Estatisticas>) in.readObject();
            
            Aluguer.numAlugueres = alugueres.size();
            Condutor.numCondutores = condutores.size();
            Funcionario.numFuncionarios = funcionarios.size();
            Opcao.numOpcoes = opcoes.size();
            Pessoa.numPessoas = pessoas.size();
            Servico.numServicos = servicos.size();
            TipoVeiculo.numTiposDeVeiculo = tiposdeveiculo.size();
            Veiculo.numVeiculos = veiculos.size();
            VeiculoLigeiro.numVeiculosLigeiros = veiculosLigeiros.size();
            Estatisticas.num_anos = estatisticas.size();
                    
            
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
