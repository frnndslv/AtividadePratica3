public class Estagiario extends Funcionario {
    private String supervisor;

    public Estagiario() {
        ;
    }

    public Estagiario(String nome, String matricula, String supervisor) {
        super(nome, matricula);
        this.supervisor = supervisor;
    }

    @Override
    Sistema calcularSalario() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }
}
