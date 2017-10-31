public class Password {
    public static String criptografar(String password){
        String palavraCripto = "";
        for (int i = 0; i < password.length(); i++) {
            palavraCripto += (char)((int)(password.charAt(i) + 1));
        }
        return palavraCripto;
    }

    public static String descriptografar(String password){
        String palavraDescripto = "";
        for (int i = 0; i < password.length(); i++) {
            palavraDescripto += (char)((int)(password.charAt(i) - 1));
        }
        return palavraDescripto;
    }
}
