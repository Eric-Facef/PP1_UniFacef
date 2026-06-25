// classe Junior herda da classe Desenvolvedor
public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior(){
        super(); // chama construtor da superclasse
    }
    public Junior(String nome, String linguagem, float salarioBase, String mentor){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }
    @Override // anulação de método herdado
    public String toString(){
        return "Junior{ " +
                super.toString() +
                " mentor: " + this.mentor;
    }
    @Override
    public void codar(){
        System.out.println("Junior desenvolvendo código sob a mentoria de " + this.mentor);
    }
}
