public class Cachorro extends Mamifero{


    private String raca;
    private int idade;

    public void Latir(){
        System.out.println("Latido Cachorro:"+"auau");

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
