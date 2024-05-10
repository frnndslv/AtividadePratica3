public class Estagiario extends Funcionario {
    private String supervisor;

    public Estagiario() {

    }

    public Estagiario(String nome, String matricula, String supervisor, double salario) {
        super(nome, matricula, salario);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String trabalhar() {

        return "Sou estagiario, " + this.getNome() + "trabalhei hoje";
    }

    @Override
    public String relatarProgresso() {

        return "Sou estagiario, " + this.getNome() + "relatando que hoje encerrei meu turno";
    }

    @Override
    public double calcularSalario() {

        return this.getSalario();
    }

    @Override
    public String toString() {

        return "\n nome: " + getNome() + "\n matricula: " + getMatricula() + "\n Supervisor: " + getSupervisor()
                + "\n salario; " + getSalario();
    }

}
