package Lanchonete;

public class Bebida implements IProduto {
    private int Ml;
    private String Descricao;
    private Double Preco;

    public Bebida(int ml, String descricao, Double preco) {
        Ml = ml;
        Descricao = descricao;
        Preco = preco;
    }

    public Bebida(int ml2, double preco2) {
        //TODO Auto-generated constructor stub
    }

    public int getMl() {
        return Ml;
    }
    public void setMl(int ml) {
        this.Ml = ml;
    }

    @Override
    public String getDescricao() {
        return Descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    @Override
    public Double getPreco() {
        return Preco;
    }

    @Override
    public void setPreco(Double preco) {
        this.Preco = preco;
    }

}
