/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.util.ArrayList;

/**
 *
 * @author Adeor
 */
public class GestaoRentacar {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private ArrayList<TipoVeiculo> tiposdeveiculo = new ArrayList<>();

    public void adicionarTipoVeiculo(TipoVeiculo tipoveiculo) {
        tipoveiculo.setNumero(tiposdeveiculo.size() + 1);
        tiposdeveiculo.add(tipoveiculo);
    }

    public String mostrarTipoVeiculos() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < tiposdeveiculo.size(); i++) {
            str.append(tiposdeveiculo.get(i)).append("\n");

        }
        return str.toString();
    }

    public TipoVeiculo obterTipoVeiculo(int pos) {
        return tiposdeveiculo.get(pos);

    }

    public int getTotalTipoVeiculos() {
        return tiposdeveiculo.size();

    }

    public int pesquisarTipoVeiculoPornumero(int numero) {

        for (int pos = 0; pos < tiposdeveiculo.size(); pos++) {
            if (tiposdeveiculo.get(pos).getNumero() == numero) {
                return pos;
            }
        }
        return -1;
    }

    public int pesquisarTipoVeiculoPorDesignacao(String designacao) {

        for (int pos = 0; pos < tiposdeveiculo.size(); pos++) {
            if (tiposdeveiculo.get(pos).getDesignacao().equalsIgnoreCase(designacao)) {
                return pos;
            }
        }
        return -1;
    }
 public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
     
    }
}
