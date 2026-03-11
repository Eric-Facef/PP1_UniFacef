public class TestaDrone {

    public static void main(String[] args) {

        Drone d = new Drone("DRN-001", 15);

        System.out.println("Estado inicial:");
        System.out.println(d);

        System.out.println("\nTentando decolar com bateria baixa:");
        d.decolar();

        d.setBateria(80);

        System.out.println("\nNova bateria definida.");
        System.out.println(d);

        System.out.println("\nTentando decolar novamente:");
        d.decolar();

        System.out.println("\nSubindo 30 metros:");
        d.subir(30);

        System.out.println("\nSubindo 50 metros:");
        d.subir(50);

        System.out.println("\nTentando subir 100 metros:");
        d.subir(100);

        System.out.println("\nDescendo 20 metros:");
        d.descer(20);

        System.out.println("\nTentando descer 200 metros:");
        d.descer(200);

        System.out.println("\nEstado final do drone:");
        System.out.println(d);
    }
}