class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: A quantidade não pode ser negativa.");
        }
    }

    public double valorTotal() {
        return this.preco * this.quantidade;
    }

    public void adicionar(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void remover(int qtd) {
        if (qtd > 0) {
            if (this.quantidade >= qtd) {
                this.quantidade -= qtd;
            } else {
                System.out.println("Não há estoque suficiente para remover " + qtd + " unidades.");
            }
        } else {
            System.out.println("A quantidade a ser removida deve ser positiva.");
        }
    }

    public String getInfo() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", valorTotal=" + valorTotal() + "]";
    }
}


class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        if (p == null) {
            System.out.println("Não é possível adicionar um produto nulo.");
            return;
        }
        if (buscarPorNome(p.getNome()) != null) {
            System.out.println("O produto" + p.getNome() + "' já existe no estoque.");
            return;
        }
        this.produtos.add(p);
        System.out.println("Produto '" + p.getNome() + "' adicionado com sucesso.");
    }

    public Produto buscarPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public double valorTotalEmEstoque() {
        double valorTotal = 0;
        for (Produto p : produtos) {
            valorTotal += p.valorTotal();
        }
        return valorTotal;
    }

    public boolean movimentar(String nome, int qtd, boolean entrada) {
        Produto produto = buscarPorNome(nome);
        if (produto == null) {
            System.out.println("Produto '" + nome + "' não encontrado no estoque.");
            return false;
        }
        if (entrada) {
            produto.adicionar(qtd);
        } else {
            produto.remover(qtd);
        }
        return true;
    }

    public Produto maiorValor() {
        if (produtos.size() == 0) {
            return null;
        }
        Produto maior = produtos.get(0);
        for (Produto p : produtos) {
            if (p.valorTotal() > maior.valorTotal()) {
                maior = p;
            }
        }
        return maior;
    }
}


public class LojaApp {
    public static void main(String[] args) {
        Produto p1 = new Produto("Laptop", 5500.00, 10);
        Produto p2 = new Produto("Mouse", 85.50, 50);
        Produto p3 = new Produto("Teclado", 150.00, 25);

        Estoque estoqueLoja = new Estoque();
        estoqueLoja.adicionarProduto(p1);
        estoqueLoja.adicionarProduto(p2);
        estoqueLoja.adicionarProduto(p3);
        System.out.println("\n--- Estado inicial do estoque ---");
        System.out.println("Valor total do estoque: R$ " + estoqueLoja.valorTotalEmEstoque());

        System.out.println("\n--- Movimentações ---");
        estoqueLoja.movimentar("Laptop", 5, true);
        estoqueLoja.movimentar("Mouse", 10, false);
        estoqueLoja.movimentar("Teclado", 30, false);
        estoqueLoja.movimentar("Monitor", 2, true);

        System.out.println("\n--- Estado final do estoque ---");
        System.out.println("Valor total do estoque: R$ " + estoqueLoja.valorTotalEmEstoque());

        System.out.println("\n--- Produto de maior valor em estoque ---");
        Produto maiorProduto = estoqueLoja.maiorValor();
        if (maiorProduto != null) {
            System.out.println(maiorProduto.getInfo());
        } else {
            System.out.println("Estoque vazio.");
        }
    }
}
