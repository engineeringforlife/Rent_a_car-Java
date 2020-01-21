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
 * Classe que contém e manipula todos os ArrayLists.
 *
 * @author 2181042/2172563
 */
public class GestaoRentacar {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();
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
    private ArrayList<Estatisticas> estatisticas = new ArrayList<>();

    /**
     *
     * @param ano - ano à qual se pretende verificar as informações
     * @return String com informação mesal de alugueres, oredenada por ordem
     * decrescente do numero de alugueres mensais
     */
    public String mostrarAlugueresMensalDec(int ano) {

        OrdenaAlugueresMensal on = new OrdenaAlugueresMensal();
        Collections.sort(estatisticas.get(ano - 2019).getAlugueres_mensal(), on);
        return estatisticas.get(ano - 2019).mostrarAlugueresMensal();
    }

    /**
     * Função que permite adicionar o lucro a um determinado mes de um
     * determinado ano
     *
     * @param ano - ano à qual se pretende adicionar informações
     * @param mes - mês à qual e pretende adicionar informações
     * @param lucro_aluguer - lucro do aluguer
     */
    public void adicionarLucro(int ano, int mes, double lucro_aluguer) {
        double lucro_anual = estatisticas.get(ano - 2019).getLucro_anual();
        double lucro_mensal = estatisticas.get(ano - 2019).getLucro_mensal(mes + 1);
        double totalLucroAnual = lucro_anual + lucro_aluguer;
        double totalLucroMensal = lucro_mensal + lucro_aluguer;
        estatisticas.get(ano - 2019).setLucro_anual(totalLucroAnual);
        estatisticas.get(ano - 2019).setLucro_mensal(totalLucroMensal, mes + 1);
        estatisticas.get(ano - 2019).addNum_alugueres_mensal(mes + 1);
    }

    /**
     *
     * @return String contendo os lucros anuais
     */
    public String mostrarLucroAno() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < estatisticas.size(); i++) {
            str.append("\nO lucro no ano ").append(2019 + i).append(" foi de ").append(estatisticas.get(i).getLucro_anual()).append(" €");
        }
        return str.toString();
    }

    /**
     * Adiciona uma posição ao ArrayList Estatisticas
     *
     * @param e - Objeto da classe Estatisticas
     */
    public void adicionarAnoLucro(Estatisticas e) {
        estatisticas.add(e);
    }

    /**
     *
     * @return numero de anos de lucro que constam na base de dados
     */
    public int numeroAnoLucro() {
        return estatisticas.size();
    }

    /**
     *
     * @return numero de alugueres no estado reservado
     */
    public int numeroAlugueresRes() {
        return alugueresR.size();
    }

    /**
     * permite adicionar um aluguer no estado reservado
     *
     * @param aluguer - contém toda a informação de aluguer
     */
    public void adicionarAlugueresRes(Aluguer aluguer) {
        alugueresR.add(aluguer);
    }

    /**
     * Permite remover um aluguuer do ArrayList
     *
     * @param aluguer - contém toda a informação de aluguer
     */
    public void RemoverAlugueresRes(Aluguer aluguer) {
        alugueresR.remove(aluguer);
    }

    /**
     *
     * @return String com todos os alugueres no estado RESERVADO
     */
    public String mostrarAlugueresRes() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresR.size(); i++) {
            str.append("\n").append(alugueresR.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @return numero de alugueres INICIADOS
     */
    public int numeroAlugueresIn() {
        return alugueresI.size();
    }

    /**
     * Permite adicionar um aluguer à lista de alugueres iniciados
     *
     * @param aluguer - contém toda a informação de aluguer
     */
    public void adicionarAlugueresIn(Aluguer aluguer) {
        alugueresI.add(aluguer);
    }

    /**
     * permite remover um aluguer da lista de alugueres Iniciados
     *
     * @param aluguer - contém toda a informação de aluguer
     */
    public void removerAlugueresIn(Aluguer aluguer) {
        alugueresI.remove(aluguer);
    }

    /**
     *
     * @return String com todos os alugueres no estado INICIADO
     */
    public String mostrarAlugueresIn() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresI.size(); i++) {
            str.append("\n").append(alugueresI.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @return total de alugueres cancelados
     */
    public int numeroAlugueresCan() {
        return alugueresC.size();
    }

    /**
     * adiciona à lista de alugueres cancelados um novo aluguer
     *
     * @param aluguer - contém toda a informação de aluguer
     */
    public void adicionarAlugueresCan(Aluguer aluguer) {
        alugueresC.add(aluguer);
    }

    /**
     *
     * @return String com todos os alugueres cancelados
     */
    public String mostrarAlugueresCan() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresC.size(); i++) {
            str.append("\n").append(alugueresC.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @return total de alugueres terminados
     */
    public int numeroAluguerester() {
        return alugueresT.size();
    }

    /**
     * Permite adicionar um aluguer à lista de augueres terminados
     *
     * @param aluguer - contém toda a informação de aluguer
     */
    public void adicionarAlugueresTer(Aluguer aluguer) {
        alugueresT.add(aluguer);
    }

    /**
     *
     * @return String com todos os alugueres terminados
     */
    public String mostrarAlugueresTer() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueresT.size(); i++) {
            str.append("\n").append(alugueresT.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @param ano - ano à qual se pretende saber informações mensais
     * @return String com todos os alugueres mensais de um determinado ano
     */
    public String mostrarAlugueresMes(int ano) {
        StringBuilder str = new StringBuilder("");
        str.append("Para o ano ").append(ano).append(" constam os seguintes dados: ");
        for (int i = 11; i >= 0; i--) {
            str.append("\n\nMês ").append(i + 1).append("\nNumero de alugueres : ").append(estatisticas.get(ano - 2019).getNum_alugueres_mensal(i))
                    .append("\nLucro : ").append(estatisticas.get(ano - 2019).getLucro_mensal(i)).append("€");
        }
        return str.toString();
    }

    /**
     * Permite adicionar um veículo à lista de veículos
     *
     * @param veiculo - contem todas as informações do veículo
     */
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    /**
     *
     * @return String com todos os veículos inseridos
     */
    public String monstrarVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            str.append(veiculos.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     *
     * @param matricula
     * @return posição no ArrayList de um determinado veículo
     */
    public int pesquisarVeiculoPorMatricula(String matricula) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                return i;
            }
        }
        return -1;      //retorna -1 se não encontrar tipos coma  mesma designação
    }

    /**
     *
     * @param pos
     * @return Veículo de uma dada posição
     */
    public Veiculo obterVeiculo(int pos) {
        return veiculos.get(pos);
    }

    /**
     *
     * @return total de veículos inseridos
     */
    public int numeroVeiculos() {
        return veiculos.size();
    }

    /**
     * Permite adicionar um novo tipo de veículo ao ArrayList TipoDeVeículo
     *
     * @param tipoveiculo
     */
    public void adicionarTipoVeiculo(TipoVeiculo tipoveiculo) {
        tipoveiculo.setNumero(tiposdeveiculo.size() + 1);
        tiposdeveiculo.add(tipoveiculo);
    }

    /**
     *
     * @return String com o número de veículos por tipo
     */
    public String monstrarNumVeiculosPorTipo() {
        StringBuilder str = new StringBuilder("");
        str.append("\n-------------------------------------------\n");
        str.append("Tipo de veículo").append("\t\t").append("Número de veículos");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i).getDesignacao()).append("\t\t").append(" - ").append("\t").append(tiposdeveiculo.get(i).numeroVeiculos());
        }
        str.append("\n-------------------------------------------");
        return str.toString();
    }

    /**
     *
     * @return String com Todos os tipos de veículos inseridos
     */
    public String monstrarTipoVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i));
        }
        return str.toString();
    }

    /**
     *
     * @return String com todas as designações de tipos de veículo
     */
    public String monstrarDesignacaoTipoVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append("\n").append(tiposdeveiculo.get(i).getDesignacao());
        }
        return str.toString();
    }

    /**
     *
     * @param designacao - designação do tipo de veículo
     * @return posição no Arraylist do tipo de veículo
     */
    public int pesquisarTipodeVeiculo(String designacao) {
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            if (tiposdeveiculo.get(i).getDesignacao().equalsIgnoreCase(designacao)) {
                return i;
            }
        }
        return -1;      //retorna -1 se não encontrar tipos coma  mesma designação
    }

    /**
     *
     * @param pos
     * @return tipo de veículo p«para a dada posição no ArrayList
     */
    public TipoVeiculo obterTipoVeiculo(int pos) {
        return tiposdeveiculo.get(pos);
    }

    /**
     *
     * @return total de tipos de veículo inseridos
     */
    public int numeroTiposVeiculo() {
        return tiposdeveiculo.size();
    }

    /**
     * Permite adicionar um condutor ao ArrayList
     *
     * @param condutor
     */
    public void adicionarCondutores(Condutor condutor) {
        condutores.add(condutor);
        pessoas.add(condutor);
    }

    /**
     *
     * @return String com todas as informações de todos os condutores
     */
    public String monstrarCondutores() {

        StringBuilder str = new StringBuilder("");
        str.append("Lista de consutores: \n");
        for (int i = 0; i < condutores.size(); i++) {
            str.append("\n-------------------------------------\n")
                    .append("\nNome: ").append(condutores.get(i).getNome())
                    .append("\nNIF:").append(condutores.get(i).getNIF());
        }
        return str.toString();

    }

    /**
     *
     * @param pos
     * @return condutor de uma dada posição no ArrayList
     */
    public Condutor obterCondutor(int pos) {
        return condutores.get(pos);
    }

    /**
     *
     * @param NIF
     * @return Devolve a posição no ArrayList em função do NIF
     */
    public int pesquisarCondutorPorNIF(int NIF) {
        for (int i = 0; i < condutores.size(); i++) {
            if (condutores.get(i).getNIF() == NIF) {
                return i;
            }
        }
        return -1;      //retorna -1 se não encontrar tipos com o mesmo nif
    }

    /**
     *
     * @param NIF
     * @return Devolve a posição no ArrayList em função do NIF
     */
    public int pesquisarPessoaPorNIF(int NIF) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNIF() == NIF) {
                return i;
            }

        }
        return -1;      //retorna -1 se não encontrar pessoas com o mesmo nif
    }

    /**
     *
     * @param pos
     * @return Pessoa de uma dada posição do ArrayList
     */
    public Pessoa obterPessoa(int pos) {
        return pessoas.get(pos);
    }

    /**
     *
     * @return total de condutores
     */
    public int numeroCondutores() {
        return condutores.size();
    }

    /**
     * Permite adicionar um funcionário à lista de funcionários
     *
     * @param funcionario
     */
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        pessoas.add(funcionario);
    }

    /**
     *
     * @return String contendo informações de todos os funcionários
     */
    public String monstrarFuncionarios() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < funcionarios.size(); i++) {
            str.append("\n-------------------------------------\n")
                    .append("\nNome: ").append(funcionarios.get(i).getNome())
                    .append("\nNIF:").append(funcionarios.get(i).getNIF());
        }
        return str.toString();
    }

    /**
     *
     * @param NIF
     * @return posição no ArrayList para um determinado NIF
     */
    public int pesquisarFuncionarioPorNIF(int NIF) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNIF() == NIF) {
                return i;
            }
        }
        return -1;      //retorna -1 se não encontrar pessoas com o mesmo nif
    }

    /**
     *
     * @param pos
     * @return Devolve o funcionário de uma dada posição no ArrayList
     */
    public Funcionario obterFuncionario(int pos) {
        return funcionarios.get(pos);
    }

    /**
     *
     * @return total de funcionários
     */
    public int numeroDeFuncionarios() {
        return funcionarios.size();

    }

    /**
     * Permite adicionar um aopção de aluguer ao ArrayList
     *
     * @param op
     */
    public void adicionarOpcao(Opcao op) {
        op.setNumero(opcoes.size() + 1);
        opcoes.add(op);

    }

    /**
     *
     * @return String com todas as opções de aluguer
     */
    public String monstrarOpcoes() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < opcoes.size(); i++) {
            str.append(opcoes.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     *
     * @param nome - nome da opção de aluguer
     * @return - posição no ArrayList de uma determinada opção
     */
    public int pesquisarOpcaoPorNome(String nome) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < opcoes.size(); i++) {
            if (opcoes.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;      //retorna -1 se não encontrar tipos coma  mesma designação
    }

    /**
     *
     * @param pos
     * @return Opção de uma determinada posição no ArrayList
     */
    public Opcao obterOpcao(int pos) {
        return opcoes.get(pos);
    }

    /**
     *
     * @return total de opções de aluguer
     */
    public int numeroDeOpcoes() {
        return opcoes.size();

    }

    /**
     * Permite adicionar um aluguer ao ArrayList de alugueres Atribui um numero.
     * Unico e sequencial
     *
     * @param aluguer
     */
    public void adicionarAluguer(Aluguer aluguer) {
        alugueres.add(aluguer);
        alugueres.get(numeroDeAlugueres() - 1).setNumero(numeroDeAlugueres());
    }

    /**
     *
     * @return total de alugueres
     */
    public int numeroDeAlugueres() {
        return alugueres.size();
    }

    /**
     *
     * @return String com todos os alugueres
     */
    public String monstrarAlugueres() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < alugueres.size(); i++) {
            str.append(alugueres.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     *
     * @param pos
     * @return Aluger de uma determinada posição no ArrayList
     */
    public Aluguer obterAlugueres(int pos) {
        return alugueres.get(pos);
    }

    /**
     * Permite adicionar um serviço ao ArrayList Serviços Atribui um numero ao
     * serviçi. Unico e sequencial
     *
     * @param s
     */
    public void adicionarServico(Servico s) {
        servicos.add(s);
        servicos.get(numeroDeServicos() - 1).setNumero(numeroDeServicos());
    }

    /**
     *
     * @return total de serviços
     */
    public int numeroDeServicos() {
        return servicos.size();
    }

    public boolean verificaDisponibilidade(Calendar dataLevantamento, Calendar dataEntrega, Veiculo veiculo) {
        for (int i = 0; i < veiculo.numeroAlugueresRes(); i++) {
            if (dataEntrega.after(veiculo.alugueresR.get(i).getDataHoraEntrega()) && dataEntrega.before(veiculo.alugueresR.get(i).getDataHoraLevantamento())) {    //verifica se a data inserida esta no intervalo de qualquer aluguer
                return false;
            }
            if (dataLevantamento.after(veiculo.alugueresR.get(i).getDataHoraEntrega()) && dataLevantamento.before(veiculo.alugueresR.get(i).getDataHoraLevantamento())) {    //verifica se a data inserida esta no intervalo de qualquer aluguer
                return false;
            }
            if (veiculo.alugueresR.get(i).getDataHoraEntrega().after(dataLevantamento) && veiculo.alugueresR.get(i).getDataHoraEntrega().before(dataEntrega)) {  //verifiva se existe algum aluguer entre as datas
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
    /**
     *
     * @param dataIni - data inicial
     * @param dataFim - data final
     * @return devolve a diferença em dias entre as duas datas
     */
    public long diferencaDias(Calendar dataIni, Calendar dataFim) {
        long difDias = (dataFim.getTimeInMillis() - dataIni.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        //System.out.println("Diferença dias: " + difDias);
        return difDias;
    }

    /**
     *
     * @return valor percentual de reservas canceladas
     */
    public double percentagemReservasCanceladas() {
        double percentagem;
        percentagem = ((double) alugueresC.size() / alugueres.size()) * 100;
        return percentagem;
    }

    /**
     * função que permite guardar dados
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

    /**
     * Função que permite ler dados
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

}
