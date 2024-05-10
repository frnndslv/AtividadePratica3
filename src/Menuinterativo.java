
public class Menuinterativo {
    /*
     * Desenvolva uma interface de usuário simples no console para interagir com o
     * sistema, permitindo ao usuário adicionar novos funcionários, remover
     * funcionários existentes, e exibir todos os funcionários.
     * • Funcionalidade de Busca:
     * • Implemente uma funcionalidade para buscar funcionários por nome ou
     * matricula, demonstrando o uso efetivo de loops e condicionais em ArrayList
     */

    public void exibirMenu() {
        int op;

        do {
            System.out.println("digite a opçao desejada: \n");
            System.out.println("1) adicionar funcionario: \n");
            System.out.println("2) remover funcionario: \n");
            System.out.println("3) escluir todos os funcionario: \n");
            System.out.println("4) buscar funcionario: \n");
            System.out.println("0) finalizar o programa \n");
            op = Console.lerInt();
            switch (op) {
                case 1:
                    addFuncionario();

                    break;

                default:
                    break;
            }
        } while (op != 0);

    }

    public void addFuncionario() {
        int op2;
        System.out.println("qual a funçao do funcionario: 1 gerente, 2 desenvolvedor 3 estagiario   \n");
        System.out.println(" Digite 5 para voltar ao menu principal  \n");
        op2 = Console.lerInt();

        switch (op2) {
            case 1:
                addGerente();
                break;
                addEstagiario();
                break;
            case 3:

                break;
            case 5:
                exibirMenu();

                break;

            default:
                break;
        }

    }

    public Gerente addGerente() {
        Gerente gerenteGenerico = new Gerente();
        System.out.println("digite nome: \n");
        gerenteGenerico.setNome(Console.lerString());
        System.out.println("digite a matricula \n");
        gerenteGenerico.setMatricula(Console.lerString());
        System.out.println("digite bonus anula: \n");
        gerenteGenerico.setBonusAnual(Console.lerDouble());
        System.out.println("digite a equipe que gerencia: \n");
        gerenteGenerico.setEqSobGerencia(Console.lerString());
        System.out.println("salario liquido sem bonus: \n");
        gerenteGenerico.setSalario(Console.lerDouble());
        System.out.println("digite a equipe que gerencia: \n");
        gerenteGenerico.setEqSobGerencia(Console.lerString());
        return gerenteGenerico;

    }

    public Estagiario addEstagiario() {
        Estagiario estagiariogenerico = new Estagiario();
        System.out.println("digite nome: \n");
        estagiariogenerico.setNome(Console.lerString());
        System.out.println("digite a matricula \n");
        estagiariogenerico.setMatricula(Console.lerString());
        System.out.println("digite supervisor: \n");
        estagiariogenerico.setSupervisor(Console.lerString());
        System.out.println("digite o salario: \n");
        estagiariogenerico.setSalario(Console.lerDouble());
        return estagiariogenerico;

    }

    public Desenvolvedor addDesenvolvedor() {
        Desenvolvedor desenvolvedorgenerico = new Desenvolvedor();
        System.out.println("digite nome: \n");
        desenvolvedorgenerico.setNome(Console.lerString());
        System.out.println("digite a matricula \n");
        desenvolvedorgenerico.setMatricula(Console.lerString());
        System.out.println("digite o salario: \n");
        desenvolvedorgenerico.setSalario(Console.lerDouble());
        return desenvolvedorgenerico;

    }
}
