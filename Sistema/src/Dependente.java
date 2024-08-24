public class Dependente {
    private String nome, sexo;
    private int idade;

    public Dependente(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String toString() {
        return "\n[Dependente]" +
                "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo;
    }
}
