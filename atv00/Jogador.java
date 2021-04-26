package atv00;

import java.util.Calendar;

public class Jogador {
    private String nome;
    private String posicao;
    private String nacionalidade;
    private int ano_nascimento;
    private float altura;
    private float peso;

    public Jogador(String nome, String posicao, String nacionalidade, int ano_nascimento, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.ano_nascimento = ano_nascimento;
        this.altura = altura;
        this.peso = peso;
    }
    /**
     * Retorna dados do jogador
     * @return String
     */
    public String getDadosJogador() {
        return nome + " - " + posicao + " - " + nacionalidade + " - " + String.valueOf(ano_nascimento) + " - "
                + String.valueOf(altura) + " - " + String.valueOf(peso);
    }

    /**
     * Obtém a idade do jogador
     * @return int
     */
    public int getIdade(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - this.ano_nascimento;
    }

    /**
     * Obtém tempo para aposentar
     * @return int
     */
    public int getTempoParaAposentar(){
        int idade = this.getIdade();
        TempoAposentar tempo = new TempoAposentar();
        if(this.posicao=="atacante"){
            return tempo.atacante - idade;
        } else if(this.posicao=="meio"){
            return tempo.meio - idade;
        }
        return tempo.defesa - idade;
    }


}

class TempoAposentar {
    public int defesa = 40;
    public int meio = 38;
    public int atacante = 35;
}