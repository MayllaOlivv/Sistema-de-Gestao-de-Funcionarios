import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public SistemaGestaoFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void atualizarFuncionario(int index, Funcionario funcionario) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.set(index, funcionario);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void excluirFuncionario(int index) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();

        Funcionario f1 = new Funcionario("João", "Assistente", 2000.00);
        Gerente g1 = new Gerente("Maria", 5000.00, "TI");
        Programador p1 = new Programador("Carlos", 3000.00, "Java");

        sistema.adicionarFuncionario(f1);
        sistema.adicionarFuncionario(g1);
        sistema.adicionarFuncionario(p1);

        System.out.println("Lista de funcionários:");
        sistema.listarFuncionarios();

        System.out.println("\nAtualizando salário de João:");
        f1.setSalario(2500.00);
        sistema.atualizarFuncionario(0, f1);
        sistema.listarFuncionarios();

        System.out.println("\nExcluindo Maria:");
        sistema.excluirFuncionario(1);
        sistema.listarFuncionarios();
    }
}
