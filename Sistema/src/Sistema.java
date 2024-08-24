import java.util.ArrayList;

public class Sistema {
    private ArrayList<Professor> professores;
    private ArrayList<String> registroExcecoes;

    public Sistema() {
        this.professores = new ArrayList<>();
        this.registroExcecoes = new ArrayList<>();
    }

    public void incluirProfessor(Professor professor) {
        try {
            if (professores.size() >= 5) {
                throw new Exception("O limite é de 5 professores");
            }
            for (Professor prof : professores) {
                if (prof.getCpf().equals(professor.getCpf())) {
                    throw new Exception("Esse CPF já está cadastrado.");
                }
            }
            professores.add(professor);
            System.out.println("Professor adicionado.");
        } catch (Exception e) {
            registroExcecoes.add(e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public void excluirProfessor(String cpf) {
        try {
            boolean excluido = false;
            for (Professor prof : professores) {
                if (prof.getCpf().equals(cpf)) {
                    professores.remove(prof);
                    excluido = true;
                    System.out.println("Professor excluído.");
                    break;
                }
            }
            if (!excluido) {
                throw new Exception("Não foi encontrado professor com o CPF informado.");
            }
        } catch (Exception e) {
            registroExcecoes.add(e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public Professor pesquisarProfessor(String cpf) {
        try {
            for (Professor prof : professores) {
                if (prof.getCpf().equals(cpf)) {
                    return prof;
                }
            }
            throw new Exception("Professor não encontrado.");
        } catch (Exception e) {
            registroExcecoes.add(e.getMessage());
            System.out.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<String> getRegistroExcecoes() {
        return registroExcecoes;
    }
}
