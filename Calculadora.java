import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String linha = scan.nextLine();

        String[] valores = linha.split(" ");
        Soma soma = new Soma();
        int resultado = soma.somar(Integer.parseInt(valores[0]), Integer.parseInt(valores[2]));
        System.out.println(resultado);
    }
}
