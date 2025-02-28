import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao login da sua conta bancaria!");

        System.out.println("Digite seu nome completo: ");
        String name = scanner.nextLine();

        System.out.println("Escreva sua senha: ");
        String senha = scanner.nextLine();

        String resultado = SenhaValidacao.validarSenha(senha);

        System.out.println(resultado);

        if (resultado.equals("Senha válida!")) {
            System.out.println("Bem-vindo " + name + " ao nosso banco!");
        } else {
            System.out.println("Tente novamente");
        }


        scanner.close();
    }
}