/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.awt.desktop.QuitEvent;
import util.Consola;


/**
 *
 * @author 2181042
 */
public class Projeto_RentaCar {

    /**
     * @param args the command line arguments
     */
    
    public static GestaoRentacar gr = new GestaoRentacar();
    
    public static void main(String[] args) {
      
        
        int op;
        int op2;
        

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
                            } else {
                                System.out.println("\nAinda não foram inseridos tipos de veículo");
                            }
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
                case 3:
                        menu_gestao_funcionarios();
                    break;
                case 4:
                        menu_gestao_condutores();
                    break;
                case 5:
                        menu_gestao_opAlugueres();
                    break;
                case 6:
                        menu_gestao_alugueres();
                    break;
                case 7:
                    break;
                case 0:
                        System.out.println("\nA sair da aplicação");
                     break;
            }
        } while (op != 0);

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
        System.out.println("2.Consultar veículos por tipo");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
        public static int menu_gestao_condutores(){
        
        System.out.println("\n1.Registar Condutor");
        System.out.println("2.Consultar por Condutores e alugueres por NIF");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
        public static int menu_gestao_opAlugueres(){
        
        System.out.println("\n1.registar Opção");
        System.out.println("2.Consultar todas as opções");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;
  
    }
        
        
        
         public static int menu_gestao_alugueres(){
        
        System.out.println("\n1.Registar Condutor");
        System.out.println("2.Consultar alugueres por estado");
        System.out.println("3.Alterar datas e locais");
        System.out.println("4.Cancelar aluguer");
        System.out.println("5.Levantar veículo");
        System.out.println("6.Entregar veículo");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 6);
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
        
        descricao=Consola.lerString("\nIndique a descrição do tipo de veículo : ");
        preco=Consola.lerDouble("Insique o valor do preço do veículo : ", 100, 50000);        //verificar preços
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
            nºpessoas=Consola.lerInt("Indique o numero de pessoas possiveuis de transportar: ", 1, 9);
                
            System.out.println(gr.monstrarTipoVeiculos() );    // Alterara o to string se necessario
            
        do {
            designacao = Consola.lerString("Indique a designação do tipo de veículo : ");
            pos=gr.pesquisarTipodeVeiculo(designacao);
            if (pos == -1) {
                System.out.println("Não existe tipo de veículo");
            }
        } while (pos == -1);
        
            TipoVeiculo tipoveiculo = gr.obterTipoVeiculo(pos);
            combustivel=Consola.lerString("Indique o tipo de combustivel");     //depois verificar se existe o tipo
            n_quilometros=Consola.lerInt("Indique o numero de quilómetros do carro", 0, 9999999);            

            resposta= Consola.lerChar("O veículo é ligeiro?", "sSnN");
            resposta=Character.toUpperCase(resposta);
            if (resposta=='S'){
                n_portas=Consola.lerInt("Indique o número de portas do veículo: ", 1, 5);
                capacidade=Consola.lerInt("Indique a capacidade da bagageira: ", 0, 5);

                Veiculo veiculo = new VeiculoLigeiro(n_portas, capacidade, matricula, nºpessoas, tipoveiculo, combustivel, n_quilometros);
                gr.adicionarVeiculo(veiculo);
            }
            else{
                
                Veiculo veiculo = new Veiculo(matricula, nºpessoas, tipoveiculo, combustivel, n_quilometros);
                gr.adicionarVeiculo(veiculo);
                
                
            }
                }
          

    
    
    
}
