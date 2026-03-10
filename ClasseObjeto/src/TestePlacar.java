public class TestePlacar {

    public static void main(String[] args) {

        Placar jogo = new Placar("Franca", "Ribeirão");

        // 1º quarto
        jogo.registrarPonto("casa", 1);       // lance livre
        jogo.registrarPonto("casa", 2);       // cesta normal
        jogo.registrarPonto("visitante", 3);  // cesta de 3
        System.out.println(jogo);

        jogo.proximoQuarto();

        // 2º quarto
        jogo.registrarPonto("visitante", 2);
        jogo.registrarPonto("casa", 3);
        System.out.println(jogo);

        jogo.proximoQuarto();

        // 3º quarto
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 1);
        System.out.println(jogo);

        jogo.proximoQuarto();

        // 4º quarto
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("casa", 2);
        System.out.println(jogo);

        // tentar ir para um 5º quarto
        jogo.proximoQuarto();
    }
}