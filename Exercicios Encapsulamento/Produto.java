public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void setPreco(double preco){
        if(preco < 0){
            System.err.println("O preço não pode ser negativo");
        }
        else{
            this.preco = preco;
        }
    }

    public void setPreco(int qtd){
        if(preco < 0){
            System.err.println("A quantidade não pode ser negativa");
        }
        else{
            this.qtd = qtd;
        }
    }
    
        public double valorTotal() {
        return preco * qtd;
    }

    public class Estoque {
        private Produto[] produtos;
        

    }
}
