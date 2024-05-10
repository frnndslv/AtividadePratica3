import java.util.ArrayList;

public class Sistema {
    ArrayList<Funcionario> funcionario1 = new ArrayList<Funcionario>();

    public void adcionarFuncionarios(Funcionario funcionario) {
        funcionario1.add(funcionario);

    }

    public void deletarFuncionario(String matricula) {
        int indice = -1;
        for (int i = 0; i < funcionario1.size(); i++) {
            if (funcionario1.get(i).getMatricula().equals(matricula)) {
                indice = i;
            }
        }
        if (indice != -1)
            funcionario1.remove(indice);
    }

    public void deletarFuncionarios() {

        funcionario1.clear();

    }

    public void listarFuncionarios() {

        for (int i = 0; i < funcionario1.size(); i++) {
            System.out.println(funcionario1.get(i).toString());
        }

    }

}
