import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
        // Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
        // Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
        // o segundo valor tem peso 3 e o terceiro valor tem peso 5.
        //
        //Entrada
        //O arquivo de entrada contém um valor inteiro N na primeira linha.
        // Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.
        //
        //Saída
        //Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
