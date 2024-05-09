
public class Gerente extends Funcionario {
    private double bonusAnual;
    private String eqSobGerencia;

    public Gerente() {
    }

    public Gerente(String nome, String matricula, double bonusAnual, String eqSobGerencia, double salario) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.eqSobGerencia = eqSobGerencia;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEqSobGerencia() {
        return eqSobGerencia;
    }

    public void setEqSobGerencia(String eqSobGerencia) {
        this.eqSobGerencia = eqSobGerencia;
    }

    @Override
    public String trabalhar() {

        return "Sou gerente, " + this.getNome() + "trabalhei hoje";
    }

    @Override
    public String relatarProgresso() {

        return "Sou gerente, " + this.getNome() + "relatando que hoje encerrei meu turno";
    }

    @Override
    public double calcularSalario() {

        return this.getSalario() + this.getBonusAnual();
    }

}
