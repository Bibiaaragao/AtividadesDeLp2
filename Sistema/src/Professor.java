import java.util.ArrayList;

public class Professor {
    private String nome, sexo, cpf, rg, endereco;
    private int idade;
    private ArrayList<Dependente> dependentes;

    public Professor(String nome, String sexo, String cpf, String rg, String endereco, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.idade = idade;
        this.dependentes = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarDependente(Dependente dependente) {
        if (dependentes.size() < 5) {
            dependentes.add(dependente);
        } else {
            throw new IllegalArgumentException("O limite de dependentes é 5. Não é possível adicionar mais.");
        }
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public String toString() {
        return "\n--Professor-- " +
                "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nCPF: " + cpf + "\nRG: " + rg  + "\nEndereço: " + endereco + "\nDependentes: " + dependentes;

    }
}
