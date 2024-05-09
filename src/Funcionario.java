
public abstract class Funcionario implements Trabalhavel {
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String matricula, double salario) {
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

}

// nome e matricula, e método abstrato para
// calcular salário