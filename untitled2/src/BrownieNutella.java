public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Add um Brownie de Nutella no carrinho de compras");
    }

    public void adicionaNutella(){
        System.out.println(super.nome +"add nutella");
    }

}
