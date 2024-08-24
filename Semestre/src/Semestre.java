public class Semestre {
    private Avaliacao[] avaliacoes;

    public Semestre(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public boolean PesoValido() {
        double somaPesos = 0.0;

        for (Avaliacao avaliacao : avaliacoes) {
            somaPesos += avaliacao.getPeso();
        }
        return somaPesos == 7.0;
    }

    public double calculoMedia() {
        double somaNotas = 0.0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaNotas += avaliacao.getQuantPontos();
        }
        return somaNotas/7;
    }

    public String getResultado() {
        double media = calculoMedia();
        return media >= 7 ? "Aluno aprovado" : "Aluno reprovado";
    }
}
