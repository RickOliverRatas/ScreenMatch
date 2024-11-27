package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("está entre os preferidos");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("é muito bem avaliado no momento");
        } else {
            System.out.println("coloque na sua lista pra assistir depois");
        }
    }
}
