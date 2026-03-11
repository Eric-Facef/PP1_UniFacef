public class TesteStreaming {

    public static void main(String[] args) {

        Streaming perfil1 = new Streaming("João", "Premium");

        System.out.println(perfil1);

        perfil1.assistirFilme("Vingadores");

        System.out.println("\nApós assistir:");
        System.out.println(perfil1);

        perfil1.cancelarAssinatura();

        perfil1.assistirFilme("Batman");

        System.out.println("\nStatus final:");
        System.out.println(perfil1);
    }
}