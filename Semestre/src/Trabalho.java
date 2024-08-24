public class Trabalho extends Avaliacao{
    private double[] notas;

    public Trabalho(double[] notas, double peso) {
        super(peso);
        this.notas = notas;
    }

    public double getNotaFinal() {
        double soma = 0.0;

        for(double nota : notas) {
            soma += nota;
        }
        return soma/notas.length;
    }
}
