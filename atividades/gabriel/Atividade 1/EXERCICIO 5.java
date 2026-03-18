// Exercício 5
// Nome: Gabriel Pedrosa
// Período: 3º Período

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        
        if (salario >= 1412.0) {
            this.salario = salario;
        } else {
            System.out.println("Salario menor que o minimo");
            this.salario = 1412.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem) {
        if (porcentagem >= 0) {
            double valorAumento = salario * (porcentagem / 100);
            salario = salario + valorAumento;
            System.out.println("Salario aumentado");
            System.out.println("Novo salario: " + salario);
        } else {
            System.out.println("Aumento nao pode ser negativo");
        }
    }
    
    public void exibir() {
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario: " + salario);
    }
}

class Exercicio5 {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Pedro", 2000.0);
        f.exibir();
        
        Funcionario f2 = new Funcionario("Maria", 1000.0);
        f2.exibir();
        
        f.aumentarSalario(10.0);
        f.aumentarSalario(-5.0);
    }
}
