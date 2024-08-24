public class Interdisciplinar extends Avaliacao{
    private double[] notas;

    public Interdisciplinar(double[] notas, double peso) {
        super(peso);
        this.notas = notas;
    }

    public double getNotaFinal() {
        double soma = 0.0;
        soma += notas[0]*2;
        soma += notas[1]*2;
        soma += notas[2]*2;
        soma += notas[3]*4;
        return soma/10;
    }
}
