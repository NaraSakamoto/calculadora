import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String linha = scan.nextLine();

		String[] valores = linha.split(" ");

		if (valores[1].contains("+")) {
			Soma soma = new Soma();
			int resultado = soma.somar(Integer.parseInt(valores[0]), Integer.parseInt(valores[2]));
			System.out.println(resultado);
		}

		if (valores[1].contains("-")) {
			Subtracao subtracao = new Subtracao();
			int resultadoSubtracao = subtracao.subtrair(Integer.parseInt(valores[0]), Integer.parseInt(valores[2]));
			System.out.println(resultadoSubtracao);
		}
	}
}
