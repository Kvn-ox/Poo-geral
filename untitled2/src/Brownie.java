import java.sql.SQLOutput;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

   public void addCarrinhoDeCompras(){
        System.out.println("add ao carrinho de compras"+ nome);
    }

    public void calculaValorTotal(){

        System.out.println("Valor total:" + nome +""+preco);
    }

    public void mostraInfo(){

        System.out.println("sabor: "+ sabor);

    }

}
