import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao login da sua conta bancaria!");

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Escreva sua senha: ");
        String senha = scanner.nextLine();

        String resultado = SenhaValidacao.validarSenha(senha);

        System.out.println(resultado);
    }
}