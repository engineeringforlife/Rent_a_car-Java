/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rentacar;

import java.util.Comparator;

/**
 * Classe auxiliar para ordenar por ordem decrescente os alugueres de um
 * determinado ano.
 *
 * @author 2181042/2172563
 */
public class OrdenaAlugueresMensal implements Comparator<AlugueresMensal> {

    @Override
    public int compare(AlugueresMensal o1, AlugueresMensal o2) {
        if (o1.getNumAlugueres() > o2.getNumAlugueres()) {
            return -1;
        }
        if (o1.getNumAlugueres() < o2.getNumAlugueres()) {
            return 1;
        }
        return 0;
    }

}
