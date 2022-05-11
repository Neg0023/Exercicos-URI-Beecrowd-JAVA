import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
        // Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.
        //
        //Entrada
        //A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y)
        // que serão lidos em seguida.
        //
        //Saída
        //Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal,
        // ou “divisao impossivel” caso não seja possível efetuar o cálculo.
        //
        //Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro.
        // Utilize cast :)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            double resultado;
            System.out.println((y == 0) ? "divisao impossivel" : (resultado = (double) x / y));
        }
        sc.close();
    }
}
