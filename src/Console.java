import java.util.Scanner;

public class Console {

    public static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static String lerString() {
        String valor = leitor.nextLine();
        return valor;
    }

    public static double lerDouble() {
        double valor = leitor.nextDouble();
        leitor.nextLine();
        return valor;
    }

}
