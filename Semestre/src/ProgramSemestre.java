public class ProgramSemestre {
    public static void main(String[] args) {
        Avaliacao prova1 = new Prova(8.3, 2);
        Avaliacao prova2 = new Prova(7.6, 2);

        double[] notasTrabalho = {9.0, 8.5, 6.0};
        Avaliacao trabalho = new Trabalho(notasTrabalho, 1);

        double[] notasInterdisciplinar = {6.5, 7.7, 7.5, 9.2};
        Avaliacao interdisciplinar = new Interdisciplinar(notasInterdisciplinar, 2);

        Avaliacao[] avaliacoes = {prova1, prova2, trabalho, interdisciplinar};
        Semestre s = new Semestre(avaliacoes);

        if (s.PesoValido()) {
            System.out.println("O peso das avaliações é válido.\nMédia: " + s.calculoMedia() + "\nResultado: " + s.getResultado());
        } else {
            System.out.println("O peso das avaliações não é válido!");
        }
    }
}