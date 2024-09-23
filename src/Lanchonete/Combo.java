package Lanchonete;


import java.util.ArrayList;
import java.util.List;

public class Combo {
    private List<IProduto> produtos;

    public Combo() {
        produtos = new ArrayList<>();
    }

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1: // Combo Master
                adicionarBurguer(250, 20.00);
                adicionarSobremesa("Grande", 7.00);
                adicionarBebida(500, 6.00);
                break;
            case 2: // Super Combo
                adicionarBurguer(300, 25.00);
                adicionarSobremesa("Média", 5.00);
                adicionarBebida(350, 4.00);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public void adicionarBurguer(int gramas, double preco) {
        produtos.add(new Burguer(gramas, preco));
    }

    public void adicionarSobremesa(String tamanho, double preco) {
        produtos.add(new Sobremesa(tamanho, preco));
    }

    public void adicionarBebida(int ml, double preco) {
        produtos.add(new Bebida(ml, preco));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Itens do Combo:\n");
        for (IProduto produto : produtos) {
            sb.append("- ").append(produto.getDescricao())
              .append(" (R$ ").append(produto.getPreco()).append(")\n");
        }
        sb.append("Preço total: R$ ").append(calcularPrecoTotal()).append("\n");
        return sb.toString();
    }

    private double calcularPrecoTotal() {
        double total = 0;
        for (IProduto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
