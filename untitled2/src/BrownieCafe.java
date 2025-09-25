
public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor){
        super(nome,preco,sabor);
    }
    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Add um Brownie de Café no carrinho de compras");
    }

    public void adicionaCafe(){
        System.out.println(super.nome +"add cafe");
    }
    public void mostraInfo(){

        System.out.println(nome);
        super.mostraInfo();
    }
}
