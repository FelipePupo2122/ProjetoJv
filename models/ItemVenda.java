package models;
import java.util.ArrayList;

public class ItemVenda{

    private Produto produto;
    private int quantidade;
    private double preco;

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "ItemVenda [preco=" + preco + ", produto=" + produto + ", quantidade=" + quantidade + "]";
    }

 

}