import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Faça um Programa que peça dois números e imprima a soma.

        Scanner scanner = new Scanner(System.in);
 
        double primeiroNumeroInformado, segundoNumeroInformado, somaNumerosInformados;

        System.out.println("Informe o primeiro número: ");
        primeiroNumeroInformado = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        segundoNumeroInformado = scanner.nextDouble();

        somaNumerosInformados = primeiroNumeroInformado + segundoNumeroInformado;

        System.out.println("A soma dos números informados  é " + somaNumerosInformados);
    }
}
