abstract public class Avaliacao {
    protected double peso;

    public Avaliacao(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double getNotaFinal();

    public double getQuantPontos() {
        return getNotaFinal() * peso;
    }
}
