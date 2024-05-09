package Models;

public class Gerente extends Funcionario {
    float bonusAnual;
    String eqSobGerencia;

    public Gerente() {
    }

    public Gerente(String nome, String matricula, float bonusAnual, String eqSobGerencia) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.eqSobGerencia = eqSobGerencia;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEqSobGerencia() {
        return eqSobGerencia;
    }

    public void setEqSobGerencia(String eqSobGerencia) {
        this.eqSobGerencia = eqSobGerencia;
    }

    @Override
    Array calcularSalario() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

}
