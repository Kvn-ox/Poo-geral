public class Main {
    public static void main(String[] args) {

        BrownieCafe bwCafe = new BrownieCafe("Brownie de Cafe",10,"Café");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella",70,"Nutella");

        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();
        bwCafe.adicionaCafe();

        bwCafe.mostraInfo();
        bwNutella.mostraInfo();

        Comprador comprador = new Comprador("Kevin",100);
        comprador.efetuarCompra(bwCafe);


    }
}

