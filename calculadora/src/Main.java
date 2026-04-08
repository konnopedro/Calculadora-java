import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcao;

        do {
            System.out.println("\n=== CALCULADORA POO ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = sc.nextDouble();

                try {
                    double resultado = 0;

                    switch (opcao) {
                        case 1:
                            resultado = calc.somar(num1, num2);
                            break;
                        case 2:
                            resultado = calc.subtrair(num1, num2);
                            break;
                        case 3:
                            resultado = calc.multiplicar(num1, num2);
                            break;
                        case 4:
                            resultado = calc.dividir(num1, num2);
                            break;
                    }

                    System.out.println("Resultado: " + resultado);

                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
        System.out.println("Encerrando...");
    }
}