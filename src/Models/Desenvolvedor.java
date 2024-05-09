package Models;

public class Desenvolvedor extends Funcionario {
    String tecQdomina;

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, String matricula, String tecQdomina) {
        super(nome, matricula);
        this.tecQdomina = tecQdomina;
    }

    public String getTecQdomina() {
        return tecQdomina;
    }

    public void setTecQdomina(String tecQdomina) {
        this.tecQdomina = tecQdomina;
    }

    @Override
    Array calcularSalario() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

}
