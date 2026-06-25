public class TestaSmartTv {

    public static void main(String[] args){
        SmartTv obj1 = new SmartTv();
        System.out.println(obj1.toString());

        obj1.setVolume(120); // não vai dar certo
        obj1.setVolume(30); // vai dar certo
        obj1.abrirYouTube();

        System.out.println("Volume " + obj1.getVolume());
        SmartTv obj2 = new SmartTv("Samsung", "QLed 32", -30);
        System.out.println(obj2.toString());
        obj2.abrirYouTube();

        obj2.aumentaSom(80);
        obj2.diminuiSom(40);
        System.out.println(obj2.toString());




    }
}
