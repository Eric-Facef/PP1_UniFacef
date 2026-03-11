public class TestaAr {

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado("LG", "Dual Inverter", 24, true);

        System.out.println(ar);

        ar.setTemperatura(15);
        ar.setTemperatura(22);

        ar.ativarModoTurbo();

        System.out.println("\nApós ajustes:");
        System.out.println(ar);
    }
}