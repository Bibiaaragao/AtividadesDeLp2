public class Prova extends Avaliacao{
    private double nota;

    public Prova(double nota, double peso) {
        super(peso);
        this.nota = nota;
    }

    public double getNotaFinal() {
        return nota;
    }
}
