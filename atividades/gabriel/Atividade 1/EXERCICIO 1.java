// Exercício 1
// Nome: Gabriel Pedrosa
// Período: 3º Período

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço invalido");
            this.preco = 1.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço invalido");
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: " + preco);
    }
}

class Exercicio1 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 15.50);
        p1.exibirDados();
        
        Produto p2 = new Produto("Caneta", -2.0);
        p2.exibirDados();
        
        p1.setPreco(-5.0);
        p1.setPreco(20.0);
        p1.exibirDados();
    }
}
