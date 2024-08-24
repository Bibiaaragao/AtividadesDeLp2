import java.util.ArrayList;

public class SistemaAcademico {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Professor prof1 = new Professor("Miguel Santos", "Masculino", "67384923475", "274916702", "Rua Estrela, 144", 30);
        prof1.adicionarDependente(new Dependente("Alexandre Santos", 7, "Masculino"));
        sistema.incluirProfessor(prof1);

        Professor prof2 = new Professor("Mariana Santana", "Feminino", "17293046529", "947251783", "Rua Nova, 56", 34);
        prof2.adicionarDependente(new Dependente("Leandra Santana", 11, "Feminino"));
        prof2.adicionarDependente(new Dependente("Henrique Santana", 8, "Masculino"));
        sistema.incluirProfessor(prof2);

        sistema.excluirProfessor("67384923475");
        sistema.excluirProfessor("27763451228");

        Professor pesquisado = sistema.pesquisarProfessor("17293046529");
        if (pesquisado != null) {
            System.out.println(pesquisado);
        }

        ArrayList<String> registros = sistema.getRegistroExcecoes();
        if (!registros.isEmpty()) {
            System.out.println("\n--Registro de exceções:--");
            for (String registro : registros) {
                System.out.println(registro);
            }
        }
    }
}