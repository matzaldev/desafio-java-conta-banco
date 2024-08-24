import java.util.Locale; 
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //Criando um novo objeto Scanner e definindo a localização como US (United States)

        System.out.println("Por favor, digite o seu nome: "); // Aqui estou imprimindo perguntas ao usuario
        String nome = scanner.next(); // E aqui estou coletando as informações para imprimir no final do código.

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Informe seu saldo atual: ");
        double saldoAtual = scanner.nextDouble();

        //Abaixo fiz um diálogo final, informando as informações do cliente e imprimindo uma mensagem de boas-vindas.
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " Conta: " + numeroConta + "e seu saldo de: " + saldoAtual + " já está disponível para saque!");

    }
}

