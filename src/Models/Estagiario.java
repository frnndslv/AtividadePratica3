package Models;

public class Estagiario extends Funcionario {
    String supervisor;

    public Estagiario() {
        ;
    }

    public Estagiario(String nome, String matricula, String supervisor) {
        super(nome, matricula);
        this.supervisor = supervisor;
    }

    @Override
    Array calcularSalario() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }
}
