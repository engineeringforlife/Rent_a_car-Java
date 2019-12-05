/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

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

        int op, op2;

        do {
            op = menu();
            switch (op) {
                case 1:
                    op2=menu_tipo_veiculos();
                    switch(op2){
                        case 1:
                            adicionarTipoVeiculo();
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 2:
                    menu_gestao_veiculos();
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

    public static int menu_tipo_veiculos() {

        System.out.println("\n1.Registar Tipo de Veículo");
        System.out.println("2.Consultar todos os tipos de Veículos");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;

    }

    public static int menu_gestao_veiculos() {

        System.out.println("\n1.Registar Veículo");
        System.out.println("2.Consultar Veículos por tipo");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;

    }

    public static int menu_gestao_funcionarios() {

        System.out.println("\n1.Registar Funcionário");
        System.out.println("2.Consultar veículos por tipo");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;

    }

    public static int menu_gestao_condutores() {

        System.out.println("\n1.Registar Condutor");
        System.out.println("2.Consultar por Condutores e alugueres por NIF");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;

    }

    public static int menu_gestao_opAlugueres() {

        System.out.println("\n1.registar Opção");
        System.out.println("2.Consultar todas as opções");
        System.out.println("0.Voltar atrás");
        int opcao = Consola.lerInt("Qual a opção: ", 0, 2);
        return opcao;

    }

    public static int menu_gestao_alugueres() {

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

    public static void adicionarTipoVeiculo() {
        String designacao;
        String descricao;
        double preco;
        int pos;

        do {
            designacao = Consola.lerString("Indique a designação do tipo de veiculo: ");
            pos = gr.pesquisarTipoVeiculoPorDesignacao(designacao);
            if (pos != -1) {
                System.out.println("Designacao ja existente");
            }
        } while (pos != -1);
            descricao = Consola.lerString("Indique a descricao do tipo de veiculo: ");
            preco = Consola.lerDouble("Indique o preço do tipo de veiculo: ", 1, 200);

        TipoVeiculo tv = new TipoVeiculo(designacao, descricao, preco);
        gr.adicionarTipoVeiculo(tv);

    }

}
