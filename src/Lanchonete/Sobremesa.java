package Lanchonete;

public class Sobremesa implements IProduto {
    private String Tamanho;
    private String Descricao;
    private Double Preco;

    public Sobremesa(String tamanho, Double preco) {
        Tamanho = tamanho;
        Preco = preco;
    }

    public Sobremesa(String tamanho2, double preco2) {
        //TODO Auto-generated constructor stub
    }

    public String getTamanho() {
        return Tamanho;
    }
    public void setTamanho(String tamanho) {
        this.Tamanho = tamanho;
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
