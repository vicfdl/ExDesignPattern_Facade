package Lanchonete;

    public class Burguer implements IProduto {
        private int Gramas;
        private String Descricao;
        private Double Preco;
        
        public Burguer(int gramas, Double preco) {
            Gramas = gramas;
            Preco = preco;
        }
    
        @Override
        public String getDescricao() {
            return Descricao;
        }
    
        @Override
        public void setDescricao(String descricao) {
            this.Descricao = descricao;
        }
    
        public int getGramas() {
            return Gramas;
        }
        public void setGramas(int gramas) {
            this.Gramas = gramas;
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
    
