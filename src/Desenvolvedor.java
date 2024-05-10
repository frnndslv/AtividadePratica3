public class Desenvolvedor extends Funcionario {
    private String tecQdomina;

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, String matricula, String tecQdomina, double salario) {
        super(nome, matricula, salario);
        this.tecQdomina = tecQdomina;
    }

    public String getTecQdomina() {
        return tecQdomina;
    }

    public void setTecQdomina(String tecQdomina) {
        this.tecQdomina = tecQdomina;
    }

    @Override
    public String trabalhar() {

        return "Sou programador, " + this.getNome() + "trabalhei hoje";
    }

    @Override
    public String relatarProgresso() {

        return "Sou programador, " + this.getNome()
                + "relatando que hoje nao surtei fazendo a atividade em cima da hora,\n porque tive 2 entrevistas de estagio e 2 trabalhos pra entregar no mesmo dia";
    }

    @Override
    public double calcularSalario() {

        return this.getSalario();
    }

    @Override
    public String toString() {

        return "\n nome: " + getNome() + "\n matricula: " + getMatricula() + "\n Linguagem que domina:  "
                + getTecQdomina() + "\n salario: " + getSalario();
    }

}
