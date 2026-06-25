public class CheckOut {
    public static void main(String[] args){
        IPagamento seletor; // objeto do tipo interface

        seletor = new CartaoCredito("1111222233334444");
        seletor.autorizar(600); // polimorfismo
        seletor.exibirComprovante(); // polimorfismo

        seletor = new Pix("dfpires@gmail.com");
        seletor.autorizar(600); // polimorfismo
        seletor.exibirComprovante(); // polimorfismo


    }
}
