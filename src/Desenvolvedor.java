public class Desenvolvedor extends Funcionario {
    private String tecQdomina;

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
    Sistema calcularSalario() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

}
