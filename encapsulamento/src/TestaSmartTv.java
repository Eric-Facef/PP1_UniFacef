public class TestaSmartTv {
    public static void main(String[] args) {
        SmartTv obj1 = new SmartTv();
        System.out.println(obj1.toString());
        obj1.setVolume(120);
        obj1.setVolume(30);
        obj1.abrirYoutube();
        obj1.aumentarVolume(50);

        System.out.println("Volume: " + obj1.getVolume());
        SmartTv obj2 = new SmartTv("Samsung ", " Qled 32 ", 70);
        System.out.println(obj2.toString());
        obj2.abrirYoutube();
        obj2.aumentarVolume(5);
    }
}
