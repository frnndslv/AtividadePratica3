public class Estagiario extends Funcionario {
    private String supervisor;

    public Estagiario() {
        ;
    }

    public Estagiario(String nome, String matricula, String supervisor) {
        super(nome, matricula);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    Sistema calcularSalario() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

    @Override
    Sistema equipeQatua() {

        throw new UnsupportedOperationException("Unimplemented method 'equipeQatua'");
    }

}
