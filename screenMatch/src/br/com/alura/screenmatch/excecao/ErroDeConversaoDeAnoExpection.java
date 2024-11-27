package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExpection extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExpection(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
