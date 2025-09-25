public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome,preco,sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Add um Brownie de Doce de leite no carrinho de compras");
    }
    public void adicionaDoceDeLeite(){
        System.out.println(super.nome +"add doce de leite");
    }

}
