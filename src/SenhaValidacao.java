public class SenhaValidacao {

    public static String validarSenha(String senha) {

        if (senha.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres.";
        }

        if (!senha.matches(".*[A-Z].*")) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }

        return "Senha válida!";
    }



}
