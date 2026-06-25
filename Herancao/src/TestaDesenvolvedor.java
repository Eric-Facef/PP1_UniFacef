import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){
        // polimorfismo
        camaleao.codar();
        // polimorfismo
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }
    public static void main(String[] args){
        // criar um júnior
        Junior jr1 =
        new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);
        // cria um pleno
        Pleno pl1 =
        new Pleno("Beltrano", "Java", 5000, 5);
        exibir(pl1);
        // cria um sênior
        Senior se1 =
        new Senior("Ciclano", "Java", 6000, 3000);
        exibir(se1);

        // cria vetor de Desenvolvedor
        ArrayList<Desenvolvedor> devs = new ArrayList<Desenvolvedor>();
        // adiciono os devs
        devs.add(jr1);
        devs.add(pl1);
        devs.add(se1);

        // percorre o vetor - para cada dev de devs
        for(Desenvolvedor dev: devs){
            exibir(dev); // chama exibir para cada dev
        }

    }
}
