/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

//import java.awt.desktop.QuitEvent;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import javax.swing.text.StyledEditorKit;
import util.Consola;
import java.util.Date;



/**
 *
 * @author 2181042
 */
public class Projeto_RentaCar implements Constantes{
    

    /**
     * @param args the command line arguments
     */
    
    public static GestaoRentacar gr = new GestaoRentacar();
    public static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy"); //verifica se a string tem o dado formato
    public static SimpleDateFormat formatoHD = new SimpleDateFormat("dd-MM-yyyy HH:mm"); //verifica se a string tem o dado formato
    
    public static void main(String[] args) {
      
        
        int op;
        int op2;
        gr.lerFicheiro();
        do {
            op = menu();
            switch (op) {
                case 1:
                    op2 = menu_tipo_veiculos();
                    switch (op2) {
                        case 1:
                            adicionarTipodeVeiculo();
                            break;
                        case 2:
                            if (gr.numeroTiposVeiculo() > 0) {
                                System.out.println(gr.monstrarTipoVeiculos());   
                            } else {
                                System.out.println("\nAinda não foram inseridos tipos de veículo");
                            }
                            break;
                    }
                    break;
                case 2:
                    op2 = menu_gestao_veiculos();
                    switch (op2) {
                        case 1:
                            if (gr.numeroTiposVeiculo() > 0) {
                                adicionarVeiculo();
                                gr.gravarFicheiro();
                            } else {
                                System.out.println("\nAinda não foram inseridos tipos de veículo");
                            }
                            break;
                    
                        case 2:
                            if (gr.numeroTiposVeiculo() > 0) {
                                consultarPorTipoVeiculo();
                            } else {
                                System.out.println("\nAinda não foram inseridos tipos de veículo");
                            }
                            break;
                    }

                    break;
                case 3:
                        op2 = menu_gestao_funcionarios();
                        switch(op2){
                            case 1:
                                adicionarPessoa(FUNCIONARIO);
                                break;
                            case 2:
                                if (gr.numeroDeFuncionarios()>0){
                                    System.out.println(gr.monstrarFuncionarios());
                                }
                                else
                                {
                                    System.out.println("Ainda não foram inseridos funcionários");
                                }
                                break;
                        }
                    break;
                case 4:
                        op2 = menu_gestao_condutores();
                        switch(op2){
                            case 1:
                                adicionarPessoa(CONDUTOR);
                                break;
                            case 2:
                                consultarCondutor();  
                                break;
                        }
                    break;
                case 5:
                        op2 = menu_gestao_opAlugueres();
                        switch(op2){
                            case 1:
                                adicionarOpAluguer();
                                break;
                            case 2:
                                if(gr.numeroDeOpcoes()>0){
                                    System.out.println(gr.monstrarOpcoes());
                                }  else
                                {
                                    System.out.println("Ainda não foram inseridas opções de aluguer");
                                }
                                break;
                        }
                    break;
                case 6:
                        op2=menu_gestao_alugueres();
                    switch (op2) {
                        case 1:
                            if (gr.numeroVeiculos() > 0) {
                                if (gr.numeroDeOpcoes() > 0) {
                                    adicionarAluguer();
                                } else {
                                    System.out.println("Ainda não foram inseridas opções de aluguer");
                                }
                            } else {
                                System.out.println("Ainda não foram inseridos veículos");
                            }

                            break;
                        case 2:
                               if(gr.numeroDeAlugueres()>0){
                                   consultarAlugueresporEstado();
                                   
                               }else{
                                   System.out.println("*Ainda não foram adicionados alugueres*");
                               }
                                   
                                break;
                            case 3:
                                if(gr.numeroDeAlugueres()>0){
                                   alterarDataseLocais();
                               }else{
                                   System.out.println("*Ainda não foram adicionados alugueres*");
                               }
                                break;
                            case 4:
                                if(gr.numeroDeAlugueres()>0){
                                   cancelarAluguer();
                               }else{
                                   System.out.println("*Ainda não foram adicionados alugueres*");
                               }
                                break;
                            case 5:
                                if(gr.numeroDeAlugueres()>0){
                                   levantarVeiculo();
                               }else{
                                   System.out.println("*Ainda não foram adicionados alugueres*");
                               }
                                break;
                            case 6:
                                if(gr.numeroDeAlugueres()>0){
                                   entregarVeiculo();
                               }else{
                                   System.out.println("*Ainda não foram adicionados alugueres*");
                               }
                                break;
  
                        }
                                
                                
                    break;
                case 7:
                    op2 = menu_estatisticas();
                    switch (op2) {
                        case 1:
                            System.out.println("A precentagem de reservas canveladas é de " +gr.percentagemReservasCanceladas() + "%");
                            break;
                        case 2:
                            System.out.println("O numero de veículos alugados no momento é de " + gr.numeroAlugueresIn());
                            break;
                        case 3:
                            System.out.println(gr.mostrarLucroAno());
                            break;
                        case 4:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 0:
                        System.out.println("\nA sair da aplicação");
                     break;
            }
        } while (op != 0);
        gr.gravarFicheiro();

    }

    public static int menu() {
        System.out.println("\n1.Gestão de Tipos de Veículos");
        System.out.println("2.Gestão de Veículos");
        System.out.println("3.Gestão de Funcionários");
        System.out.println("4.Gestão de Condutores");
        System.out.println("5.Gestão de opções de aluguer");
        System.out.println("6.Gestão de alugueres");
        System.out.println("7.Estatísticas");
        System.out.println("0.Sair");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 7);
        return opcao;
    }
    
    public static int menu_tipo_veiculos(){
        
        System.out.println("\n1.Registar Tipo de Veículo");
        System.out.println("2.Consultar todos os tipos de Veículos");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
    
        public static int menu_gestao_veiculos(){
        
        System.out.println("\n1.Registar Veículo");
        System.out.println("2.Consultar Veículos por tipo");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
        
        public static int menu_gestao_funcionarios(){
        
        System.out.println("\n1.Registar Funcionário");
        System.out.println("2.Consultar todos os funcionarios");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
        public static int menu_gestao_condutores(){
        
        System.out.println("\n1.Registar Condutor");
        System.out.println("2.Consultar Condutores e alugueres por NIF");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
        public static int menu_gestao_opAlugueres(){
        
        System.out.println("\n1.Registar Opção");
        System.out.println("2.Consultar todas as opções");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
        
        
        
         public static int menu_gestao_alugueres(){
        
        System.out.println("\n1.Registar Aluguer");
        System.out.println("2.Consultar alugueres por estado");
        System.out.println("3.Alterar datas e locais");
        System.out.println("4.Cancelar aluguer");
        System.out.println("5.Levantar veículo");
        System.out.println("6.Entregar veículo");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 6);
        return opcao;
  
    }
         
         public static int menu_estatisticas(){
        
        System.out.println("\n1.Percentagem de reservas canceladas");
        System.out.println("2.Total de veículos alugados no momento");
        System.out.println("3.Preço total em alugueres por ano");
        System.out.println("4.Numero total de alugueres registados por mês num determinado ano");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 4);
        return opcao;
  
    }
        public static void adicionarTipodeVeiculo () {
    
            String designacao; 
            String descricao; 
            double preco;
            int pos;
            

        do {
            designacao = Consola.lerString("Indique a designação do novo tipo de veículo : ");
            pos = gr.pesquisarTipodeVeiculo(designacao);
            if (pos != -1) {
                System.out.println("\n\tA designação que inseriu já consta na base de dados !");
            }
        } while (pos != -1);
        
        descricao=Consola.lerString("Indique a descrição do tipo de veículo : ");
        preco=Consola.lerDouble("Insique o preço do tipo veículo : ", 25, 500);        //verificar preços
        TipoVeiculo tipoveiculo = new TipoVeiculo(designacao, descricao, preco);
        gr.adicionarTipoVeiculo(tipoveiculo);
        
    }
        
                public static void adicionarVeiculo () {
                    
                int n_portas;
                int capacidade; 
                String matricula; 
                int nºpessoas; 
                //TipoVeiculo tipoveiculo; 
                String combustivel; 
                int n_quilometros; 

            int pos;
            char resposta;
            String designacao;
            
            
            matricula=Consola.lerString("Indique o numero da matricula no seguinte formato XX-00_00: "); //validar
            nºpessoas=Consola.lerInt("Indique o numero de pessoas possiveis de transportar: ", 1, 9);
                
            System.out.println("\n*Existem os seguintes tipos de veículo *" + gr.monstrarDesignacaoTipoVeiculos());    // Alterara o to string se necessario

                    do {
                        designacao = Consola.lerString("Indique um dos tipos de veículo acima : ");
                        pos = gr.pesquisarTipodeVeiculo(designacao);
                        if (pos == -1) {
                            System.out.println("Não existe tipo de veículo");
                            resposta = Consola.lerChar("Pretende adicionar um novo tipo de veículo?", "SsNn");
                            resposta = Character.toUpperCase(resposta);
                            if (resposta == 'S') {
                                System.out.println("\n*Foi redireccionado para a função adicionar tipo de veículo*");
                                adicionarTipodeVeiculo();
                                System.out.println("*Tipo de veículo adicionado com sucesso*");
                               pos = gr.numeroTiposVeiculo() - 1;   //devolve a posição do ultimo tipo de veículo inserido
                               /*
                                try {
                                    

                                } finally{
                                    pos = -1;
                                    System.err.println("Impossivel concluir a acção!");
                                }
                               */
                            }
                        }
                    } while (pos == -1);

            TipoVeiculo tipoveiculo = gr.obterTipoVeiculo(pos);
            combustivel=Consola.lerString("Indique o tipo de combustivel: ");     //depois verificar se existe o tipo
            n_quilometros=Consola.lerInt("Indique o numero de quilómetros do carro: ", 0, 9999999);            

            resposta= Consola.lerChar("O veículo é ligeiro?", "sSnN");
            resposta=Character.toUpperCase(resposta);
            if (resposta=='S'){
                n_portas=Consola.lerInt("Indique o número de portas do veículo: ", 1, 5);
                capacidade=Consola.lerInt("Indique a capacidade da bagageira: ", 0, 5);

                Veiculo veiculo = new VeiculoLigeiro(n_portas, capacidade, matricula, nºpessoas, tipoveiculo, combustivel, n_quilometros);
                gr.adicionarVeiculo(veiculo);
                tipoveiculo.adicionarVeiculo(veiculo);
            }
            else{
                
                Veiculo veiculo = new Veiculo(matricula, nºpessoas, tipoveiculo, combustivel, n_quilometros);
                gr.adicionarVeiculo(veiculo);
                tipoveiculo.adicionarVeiculo(veiculo);
            }
            
                }
                
    public static void consultarPorTipoVeiculo() {

        String designacao;
        int pos;

        System.out.println(gr.monstrarDesignacaoTipoVeiculos());
        do {
            designacao = Consola.lerString("Indique a designação do tipo de veículo : ");
            pos = gr.pesquisarTipodeVeiculo(designacao);
            if (pos == -1) {
                System.out.println("Não existe esse tipo de veículo");
            } 
        }while(pos == -1);

        TipoVeiculo tv = gr.obterTipoVeiculo(pos);
        
        if(tv.numeroVeiculos()>0){
            System.out.println("Estão listados os seguintes veiculos do tipo " + designacao + ":\n" + tv.monstrarVeiculos());
        }else
        {
            System.out.println("Ainda não existem veículos para esse tipo de veículo");
        }
        
        
        
                    
    }
    
    public static void adicionarPessoa(char pessoa) {

        int NIF;
        String nome;
        String morada;
        int telefone;
        boolean erro;
        String data;
        Calendar datavalCarta = new GregorianCalendar();
        Calendar dataAtual =new GregorianCalendar();
        long dias;
        int pos;

        
        do {
            NIF = Consola.lerInt("Introduza o nif :", 0, 999999999);
            pos = gr.pesquisarPessoaPorNIF(NIF);
            if (pos != -1) {    // Se já existe na base de dados
                System.out.println("Essa pessoa já consta na base de dados");

            }
        } while (pos != -1);    //se pos1 significa que não encontrou 

        nome = Consola.lerString("Introduza o nome da Pessoa : ");
        morada = Consola.lerString("Introduza a morada da Pessoa: ");
        telefone = Consola.lerInt("Introduza o numero de telefone: ", 0, 999999999);

        if (pessoa == FUNCIONARIO) {
            String funcao = Consola.lerString("Indique qual a função do funcionário: ");
            Pessoa p = new Funcionario(funcao, NIF, nome, morada, telefone);

            gr.adicionarFuncionario((Funcionario) (p));      //estará correto?

        } else {
            
            
             do {
            erro = false;

            try {
                data = Consola.lerString("Indique a data de validade da carta de condução: ");
                datavalCarta.setTime(formato.parse(data));
                
            } catch (ParseException e) {
                erro = true;
                System.err.println("Data de validade errada!");
            }
            
                  
            
        } while (erro);
             
                 dias =  gr.diferencaDias(dataAtual.getInstance(), datavalCarta);
                 if(dias<0){
                     System.out.println("Este condutor tem a carta de condução caducada!");       
                 }
            
            String n_carta = Consola.lerString("Insira o numero da carta de condução: ");

            Pessoa p = new Condutor(n_carta, datavalCarta, NIF, nome, morada, telefone);
            gr.adicionarCondutores((Condutor) (p));

        }

    }
    
    
    public static void consultarCondutor() {
    
        int NIF, pos;
        //verificar se é condutor
        do{
            NIF=Consola.lerInt("Insira o NIF do condutor", 0, 999999999);
            pos=gr.pesquisarCondutorPorNIF(NIF);
            if(pos==-1){
                System.out.println("Não existe esse nif na base de dados!");
            }
            
                   
        }while(pos==-1);
        
        Condutor c = gr.obterCondutor(pos);
        System.out.println(c);
        

}
    
    public static void adicionarOpAluguer (){
        
        String nome = Consola.lerString("Insira o nome da opção de aluguer: ");
        String descricao = Consola.lerString("Insira a descrição da opção de aluguer: ");
        double preco = Consola.lerDouble("Insira o preço da opção de aluguer: ", 0, 900000);
    
            Opcao op = new Opcao(nome, descricao, preco);
            
            gr.adicionarOpcao(op);

}
    public static void adicionarAluguer (){
        String data;
        boolean erro;
        Condutor condutor;
        Veiculo veiculo;
        int numPessoas; 
        String caracteristicas; 
        double preco=0;
        int pos;
        int NIF;
        char resposta;
        String matricula;
        long dias;
        //Adicionar/pesquisar condutor
        do{
                //será necessário?
            if(gr.numeroCondutores()> 0){
                System.out.println("*Lista de condutores na base de dados*\n\n" + gr.monstrarCondutores() + "\n");
            }
            NIF=Consola.lerInt("Indique o NIF do condutor: ", 0, 999999999);
            pos= gr.pesquisarCondutorPorNIF(NIF);
            if (pos==-1){
                System.out.println("O condutor que inseriu nao consta na base de dados. Deseja inseri-lo?");
                resposta= Consola.lerChar("SIM(S) ; Não, enganei-me a escrever o número(N): ", "SsNn");
                resposta=Character.toUpperCase(resposta);
                if (resposta == 'S' )
                {   
                    System.out.println("\n*Foi redreccionado para a função adicionar condutor*");
                    adicionarPessoa(CONDUTOR);
                    pos= gr.numeroCondutores()-1;
                    System.out.println("\n*Condutor adicionado com sucesso!*\n");
                }          
            }
        }while(pos==-1);
        
        numPessoas=Consola.lerInt("Indique o numero de pessoas: ", 0, 9);
        caracteristicas=Consola.lerString("Indique quais as caracteristicas do aluguer: ");
        Condutor c = gr.obterCondutor(pos);
        //Adicionar/pesquisar veículo
        do{
            System.out.println("\n*Existem os seguintes veículos*");// Depois mostar os veículos disponiveis para a data
            System.out.println(gr.monstrarVeiculos()+"\n");
            System.out.println("\n*Caso deseje pode inserir a matricula de um novo veículo na base de dados*\n");
            matricula= Consola.lerString("Insira a matricula do Veículo que pretende alugar: ");
            pos = gr.pesquisarVeiculoPorMatricula(matricula);
            if (pos==-1){
                System.out.println("O veículo que inseriu não consta na base de dados. Deseja inseri-lo?");
                resposta= Consola.lerChar("SIM(S) ; Não, enganei-me a escrever a matrícula(N) :", "SsNn");
                resposta=Character.toUpperCase(resposta);
                if (resposta == 'S' )
                {   
                    System.out.println("\n*Foi redireccionado para a função adicionar veículo*");
                    adicionarVeiculo();
                    pos= gr.numeroVeiculos()-1;
                    System.out.println("*Veículo adicionado com sucesso*");
                }
                System.out.println("Apanhei o erro2!!!");
            }
            System.out.println("Apanhei o erro1!!!");
            
            try{
                if(gr.obterVeiculo(pos).getNºpessoas()<numPessoas){
                System.out.println("O veículo de que escolheu apenas consegue transportar " + gr.obterVeiculo(pos).getNºpessoas() + " pessoas");
                pos=-1;
            }  
            }catch(IndexOutOfBoundsException exception){
                
                
            }
                      
        }while(pos==-1);
        System.out.println("Apanhei o erro!!!");
        preco+=gr.obterVeiculo(pos).getTipoveiculo().getPreco();
        Veiculo v = gr.obterVeiculo(pos);
        
        String localLevantamento=Consola.lerString("Indique o local de levantamento: ");
        String localEntrega=Consola.lerString("Indique o local de Entrega: ");
        Calendar dataHoraLevantamento = new GregorianCalendar();
        Calendar dataHoraEntrega = new GregorianCalendar();
        
        do {
            do {
                erro = false;

                try {
                    data = Consola.lerString("Indique a data e hora de levantamento: ");
                    dataHoraLevantamento.setTime(formatoHD.parse(data));

                } catch (ParseException e) {
                    erro = true;
                    System.err.println("Data de levantamento errada!");
                }
            } while (erro);

            do {
                erro = false;

                try {
                    data = Consola.lerString("Indique a data e hora de entrega: ");
                    dataHoraEntrega.setTime(formatoHD.parse(data));

                } catch (ParseException e) {
                    erro = true;
                    System.err.println("Data de entrega errada!");
                }
            } while (erro);
            

            dias = gr.diferencaDias(dataHoraLevantamento, dataHoraEntrega);
            if(dias <= 0){
                System.out.println("*Deve inserir uma data de levantamento superior à data de entrega!*");
            }
        } while (dias <= 0);
        
        Aluguer a = new Aluguer(localLevantamento, localEntrega, dataHoraLevantamento, dataHoraEntrega, c, v, numPessoas, caracteristicas, preco);

        resposta = Consola.lerChar("Pretende adicionar alguma opção extra? ", "SsNn");
        resposta = Character.toUpperCase(resposta);
        if (resposta == 'S') {
            System.out.println(gr.monstrarOpcoes());
            do {
                do {
                    String nome = Consola.lerString("Indique o nome da opção de aluguer: ");
                    pos = gr.pesquisarOpcaoPorNome(nome);
                    if (pos == -1) {
                        System.out.println("*A opção de aluguer que escolheu não existe!*\n");
                        resposta=Consola.lerChar("Pretende adicionar à base de dados uma nova opção de aluguer?\nSim (S), Não(N) ", "SsNn");
                        resposta=Character.toUpperCase(resposta);
                        if (resposta =='S'){
                            System.out.println("*Foi redireccionado para a função adicionar opção de aluguer*");
                            adicionarOpAluguer();
                            pos=gr.numeroDeOpcoes()-1;
                            System.out.println("*Opção adicionada com sucesso*");
                        }
                        
                    }
                } while (pos == -1);

                preco += gr.obterOpcao(pos).getPreco();

                System.out.println("Deseja adicionar mais opções de aluguer a este aluguer?");
                resposta = Consola.lerChar("sim(S) não(N): ", "SsNn");
                resposta = Character.toUpperCase(resposta);
                Opcao o = gr.obterOpcao(pos);
                a.adicionarOpcao(o);

            } while (resposta == 'S');
        }

        gr.adicionarAluguer(a);
        gr.adicionarAlugueresRes(a);
        c.adicionarAluguer(a);
        c.adicionarAlugueresRes(a);
        
        
        preco=preco*(double)dias;


        a.setPreco(preco);
        
        
        //o array começa a contar apartir de 2019(pos 0 = 2019)
      
        //int auxiliar =((dataHoraLevantamento.get(Calendar.YEAR))-2019) - gr.numeroAnoLucro();
        
        if(((dataHoraLevantamento.get(Calendar.YEAR))-2019) >= gr.numeroAnoLucro()){ 
            int n_pos= ((dataHoraLevantamento.get(Calendar.YEAR))-2019) - gr.numeroAnoLucro();
            Lucro l = new Lucro();
            for (int i = 0; i <= n_pos; i++) {
                gr.adicionarAnoLucro(l);
            }
            gr.adicionarLucro(dataHoraLevantamento.get(Calendar.YEAR), dataHoraLevantamento.get(Calendar.MONTH), preco);    
        }else{
            gr.adicionarLucro(dataHoraLevantamento.get(Calendar.YEAR), dataHoraLevantamento.get(Calendar.MONTH), preco);  
        }
        
        
        
        
    }
    
    
    public static void consultarAlugueresporEstado(){
        System.out.println("Indique qual o estado pela qual pretende pesquisar alugueres");
        int estado=Consola.lerInt("\n1-Reservado\n2-Iniciado\n3-cancelado\n4-Devolvido\nOpcão: ", 1, 4);
        
        switch(estado){
            case 1:
                if(gr.numeroAlugueresRes()>0){
                    System.out.println(gr.mostrarAlugueresRes());
                }else{
                    System.out.println("Não contam na base de dados alugueres no estado RESERVADO");
                }
                break;
            case 2:
                if(gr.numeroAlugueresIn()>0){
                    System.out.println(gr.mostrarAlugueresIn());
                }else{
                    System.out.println("Não contam na base de dados alugueres no estado INICIADO");
                }
                break;
            case 3:
                if(gr.numeroAlugueresCan()>0){
                    System.out.println(gr.mostrarAlugueresCan());
                }else{
                    System.out.println("Não contam na base de dados alugueres no estado CANCELADO");
                }
                break;
            case 4:
                if(gr.numeroAluguerester()>0){
                    System.out.println(gr.mostrarAlugueresTer());
                }else{
                    System.out.println("Não contam na base de dados alugueres no estado TERMINADO");
                }
                break;
            default:
                System.out.println("Erro ao introduzir dados");
                break;
                
        }
    }
    /*
    public static void calcular_dias(){
                String dateStart = "01/14/2012 09:29:58";
		String dateStop = "1/10/2012 10:31:48";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
        */
    
    public static void alterarDataseLocais() {
        int NIF;
        int pos;
        int resposta;
        boolean erro;
        String data;
        Calendar dataHoralevantamento = new GregorianCalendar();
        Calendar dataHoraentrega = new GregorianCalendar();
        String local;
        long dias;
        int numAluguer;
        double preco;
        System.out.println("*Constam na base de dados os seguintes Condutores*");
        System.out.println(gr.monstrarCondutores());
        do {
            NIF = Consola.lerInt("Introduza o nif do condutor: ", 0, 999999999);
            pos = gr.pesquisarCondutorPorNIF(NIF);
            if (pos == -1) {
                System.out.println("O Nif que inseriu não consta na base de dados, introduza um dos listados acima");
            }
        } while (pos == -1);
        Condutor c = gr.obterCondutor(pos);

        if (c.numeroAlugueresRes()> 0) {
            numAluguer = Consola.lerInt("Indique o numero do aluguer a que se refere: ", 1, c.numeroAlugueres());
            System.out.println(c.mostrarAlugueresRes());
            System.out.println("*Opções de alteração*\n1-Alterar data e hora de levantamento e entrega\n2-Alterar local de entrega e levantamento\n0-Voltar atras\n");
            resposta = Consola.lerInt("Indique a opção que pretende alterar: ", 0, 4);
            switch (resposta) {
                case 1:
                    do {
                        do {
                            erro = false;
                            try {
                                data = Consola.lerString("Indique a data e hora de levantamento: ");
                                dataHoralevantamento.setTime(formatoHD.parse(data));

                            } catch (ParseException e) {
                                erro = true;
                                System.err.println("Data de levantamento errada!");
                            }
                        } while (erro);

                        do {
                            erro = false;

                            try {
                                data = Consola.lerString("Indique a data e hora de entrega: ");
                                dataHoraentrega.setTime(formatoHD.parse(data));

                            } catch (ParseException e) {
                                erro = true;
                                System.err.println("Data de entrega errada!");
                            }
                        } while (erro);

                        dias = gr.diferencaDias(dataHoralevantamento, dataHoraentrega);
                        if (dias <= 0) {
                            System.out.println("Deve inserir uma data de levantamento inferior à data de entrega");
                        }
                    } while (dias <= 0);
                    c.obterAlugueres(numAluguer - 1).setDataHoraLevantamento(dataHoralevantamento);
                    c.obterAlugueres(numAluguer - 1).setDataHoraEntrega(dataHoraentrega);
                    preco=dias*((c.obterAlugueres(numAluguer - 1).getVeiculo().getTipoveiculo().getPreco())+(c.obterAlugueres(numAluguer - 1).precoOpcoes()));
                    c.obterAlugueres(numAluguer - 1).setPreco(preco);

                    break;
                case 2:
                    local = Consola.lerString("Indique o novo local de entrega");
                    c.obterAlugueres(numAluguer - 1).setLocalEntrega(local);
                    local = Consola.lerString("Indique o novo local de levantamento");
                    c.obterAlugueres(numAluguer - 1).setLocalLevantamento(local);

                    break;

                case 0:
                    break;
            }
        } else {
            System.out.println("*o condutor que inseriu não possui alugueres no estado Reservado*");
        }
    }
    
    public static void cancelarAluguer(){
        
        int NIF;
        int pos;
        int numAluguer;
        System.out.println("*Constam na base de dados os seguintes Condutores*");
        System.out.println(gr.monstrarCondutores());
        do {
            NIF = Consola.lerInt("Introduza o nif do condutor: ", 0, 999999999);
            pos = gr.pesquisarCondutorPorNIF(NIF);
            if (pos == -1) {
                System.out.println("O Nif que inseriu não consta na base de dados, introduza um dos listados acima");
            }
        } while (pos == -1);
        
        Condutor c = gr.obterCondutor(pos);

        if (c.numeroAlugueresRes()> 0) {
            System.out.println(c.mostrarAlugueresRes()); 
            do{

            numAluguer = Consola.lerInt("Indique o numero do aluguer a que se refere: ", 1, c.numeroAlugueres());
            pos=c.pesquisarAlugueresRes(numAluguer);
            if(pos==-1){
                System.out.println("*Indique um dos numeros de aluguer mostrado acima!*");
            }
            }while(pos==-1);
            Aluguer a = c.obterAlugueresRes(pos);
            
            c.adicionarAlugueresCan(a);
            gr.adicionarAlugueresCan(a);
            gr.RemoverAlugueresRes(a);
            c.RemoverAlugueresRes(a);
            
            
            
        }else{   
            System.out.println("O condutor escolhido não possui alugueres no estado reservado");
        }
    }
        public static void levantarVeiculo (){
            
        int NIF;
        int pos;
        int numAluguer;
        System.out.println("*Constam na base de dados os seguintes Condutores*");
        System.out.println(gr.monstrarCondutores());
        do {
            NIF = Consola.lerInt("Introduza o nif do condutor: ", 0, 999999999);
            pos = gr.pesquisarCondutorPorNIF(NIF);
            if (pos == -1) {
                System.out.println("O Nif que inseriu não consta na base de dados, introduza um dos listados acima");
            }
        } while (pos == -1);
        
        Condutor c = gr.obterCondutor(pos);

        if (c.numeroAlugueresRes()> 0) {
            System.out.println(c.mostrarAlugueresRes()); 
            do{

            numAluguer = Consola.lerInt("Indique o numero do aluguer a que se refere: ", 1, c.numeroAlugueres());
            pos=c.pesquisarAlugueresRes(numAluguer);
            if(pos==-1){
                System.out.println("*Indique um dos numeros de aluguer mostrado acima!*");
            }
            }while(pos==-1);
            Aluguer a = c.obterAlugueresRes(pos);
            
            c.adicionarAlugueresIn(a);
            gr.adicionarAlugueresIn(a);
            gr.RemoverAlugueresRes(a);
            c.RemoverAlugueresRes(a);

        }else{   
            System.out.println("O condutor escolhido não possui alugueres no estado reservado");
        }
            
        }
        
                
        public static void entregarVeiculo (){
            
        int NIF;
        int pos;
        int numAluguer;
        System.out.println("*Constam na base de dados os seguintes Condutores*");
        System.out.println(gr.monstrarCondutores());
        do {
            NIF = Consola.lerInt("Introduza o nif do condutor: ", 0, 999999999);
            pos = gr.pesquisarCondutorPorNIF(NIF);
            if (pos == -1) {
                System.out.println("O Nif que inseriu não consta na base de dados, introduza um dos listados acima");
            }
        } while (pos == -1);
        
        Condutor c = gr.obterCondutor(pos);

        if (c.numeroAlugueresRes()> 0) {
            System.out.println(c.mostrarAlugueresIn()); 
            do{

            numAluguer = Consola.lerInt("Indique o numero do aluguer a que se refere: ", 1, c.numeroAlugueres());
            pos=c.pesquisarAlugueresRes(numAluguer);
            if(pos==-1){
                System.out.println("*Indique um dos numeros de aluguer mostrado acima!*");
            }
            }while(pos==-1);
            Aluguer a = c.obterAlugueresIn(pos);
            
            c.adicionarAlugueresTer(a);
            gr.adicionarAlugueresTer(a);
            gr.removerAlugueresIn(a);
            c.removerAlugueresIn(a);

        }else{   
            System.out.println("O condutor escolhido não possui alugueres no estado Iniciado");
        }
            
        }
        


    
}
    
            
    
    
    



    
    
    

