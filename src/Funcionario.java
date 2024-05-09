
public abstract class Funcionario {
    protected String nome;
    protected String matricula;

    public Funcionario() {

    }

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    abstract Sistema calcularSalario();
}

// nome e matricula, e método abstrato para
// calcular salário