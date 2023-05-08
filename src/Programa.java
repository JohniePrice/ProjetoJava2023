public class Programa {
    public static void main(String[] args) {


        BemTeVi bemTeVi = new BemTeVi();
        Papagaio papagaio = new Papagaio();
        Cachorro cachorro = new Cachorro();
        Vaca vaca = new Vaca();

        bemTeVi.setNome("jubileu");
        System.out.println("Nome do Bem te vi:"+ bemTeVi.getNome());
        bemTeVi.som();

        System.out.println("\n//////////////////////////////////////////////\n");

        papagaio.setNome("louro");
        System.out.println("Nome do Papagaio:"+papagaio.getNome());
        papagaio.som();

        System.out.println("\n//////////////////////////////////////////////\n");

        cachorro.setNome("paçoca");
        cachorro.setIdade(10);
        cachorro.setRaca("SRD");
        cachorro.Latir();

        System.out.println("Nome do cachorro:"+cachorro.getNome());
        System.out.println("idade do cachorro:"+cachorro.getIdade());
        System.out.println("Raca do cachorro:"+cachorro.getRaca());

        System.out.println("\n//////////////////////////////////////////////\n");

        vaca.setNome("mimosa");
        System.out.println("Nome da vaca:"+vaca.getNome());
        vaca.mugir();

        System.out.println("\n//////////////////////////////////////////////\n");






    }
}
